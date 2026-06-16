
---
# **Strings in C**

A **string** in C is a **sequence of characters** stored in **contiguous memory locations**.  
Strings are represented as **arrays of characters** ending with a **null character `\0`**.

---

## **1. Declaring Strings**<br>

### **Method 1: Character Array**<br>


```c
char name[20];  
// array to hold 20 characters
```
<br>

### **Method 2: Initialization**
<br>

```
char name[] = "LearnCodeX";  
// compiler adds '\0' automatically
```

### **Method 3: Individual Characters**<br>

```
char name[6] = {'H', 'e', 'l', 'l', 'o', '\0'};
```

**Notes**:

Always end strings with **\0**

Size should accommodate all characters **plus 1** for null character

---

## **2. Input and Output**
<br>

Input using `scanf`

```
#include <stdio.h>

int main() {
    char name[50];
    printf("Enter your name: ");
    scanf("%s", name);  // stops at space
    printf("Hello, %s!\n", name);
    return 0;
}
```

Input using `gets` (unsafe, not recommended)

```
#include <stdio.h>

int main() {
    char name[50];
    gets(name);  // reads until newline
    printf("Hello, %s!\n", name);
    return 0;
}
```

Input using fgets (safe)

```
#include <stdio.h>

int main() {
    char name[50];
    fgets(name, sizeof(name), stdin);
    printf("Hello, %s", name);
    return 0;
}
```

Output Example:
**Enter your name: LearnCodeX
Hello, LearnCodeX**

---

## **3. String Library Functions (<string.h>)**<br>

C provides predefined functions to manipulate strings:

### **3.1. `strlen()`**

Returns the **length** of the string (excluding \0)

```
#include <stdio.h>
#include <string.h>

int main() {
    char str[] = "LearnCodeX";
    printf("Length: %lu\n", strlen(str));
    return 0;
}
```
<br>

### **3.2. `strcpy()`**

Copies source string into destination

```
#include <stdio.h>
#include <string.h>

int main() {
    char src[] = "Hello";
    char dest[20];
    strcpy(dest, src);
    printf("Copied string: %s\n", dest);
    return 0;
}
```
<br>

### **3.3. `strcat()`**

Concatenates (joins) two strings

```
char str1[20] = "Hello";
char str2[] = " World";
strcat(str1, str2);  
// str1 = "Hello World"
```
<br>

### **3.4. `strcmp()`**

Compares two strings:

Returns **0** if equal

Returns **<0** if first string is less

Returns **>0** if first string is greater

```
strcmp("abc", "abd");  
// -1
strcmp("abc", "abc");  
// 0
```

<br>

### **3.5. strchr() and strstr()**

`strchr`(str, char) → finds first occurrence of char

`strstr`(str, "sub") → finds substring

```
char str[] = "LearnCodeX";
printf("%s\n", strchr(str, 'C'));  
// "CodeX"
printf("%s\n", strstr(str, "Code")); 
// "CodeX"
```

---

## **4. Looping Through Strings**

Strings can be treated as character arrays:

```
#include <stdio.h>

int main() {
    char str[] = "LearnCodeX";
    int i = 0;

    while (str[i] != '\0') {
        printf("%c ", str[i]);
        i++;
    }

    return 0;
}
```
Output:
**L e a r n C o d e X**

---

## **5. String Operations Without `string.h`**<br>


### **5.1. Find Length Manually**<br>

```
int length = 0;
while(str[length] != '\0') length++;
```
<br>

### **5.2. Copy String Manually**<br>

```
for(i=0; src[i]!='\0'; i++)
    dest[i] = src[i];
dest[i] = '\0';
```
<br>

### **5.3. Compare Strings Manually**<br>

```
int i = 0, flag = 0;
while(str1[i]!='\0' && str2[i]!='\0') {
    if(str1[i] != str2[i]) {
        flag = 1;
        break;
    }
    i++;
}
if(flag == 0) printf("Strings are equal");
```

---

## **6. Common Mistakes**

* Forgetting the null character \0

* Using scanf("%s") for strings with spaces
 
* Not allocating enough space for concatenation

---

## **7. Summary**

* Strings are arrays of characters ending with **\0**

* Declared as char str[SIZE] or char str[] = "**text**"
 
* Input: `scanf`, `fgets` (safe)
 
* Output: **printf("%s", str)**
 
* Library functions: `strlen`, `strcpy`, `strcat`, `strcmp`, `strchr`, `strstr`
 
* Can loop through strings like arrays
 
* Careful with memory allocation and null character
 
* Strings are fundamental for **text processing**, **user input**, and **data manipulation** in C.

---