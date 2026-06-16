# **File Handling in C**

File handling allows a program to **store and retrieve data** from external files.  
C provides **standard library functions** to create, read, write, and manage files.

---

## **1. Types of Files**

1. **Text files** → Store data in **human-readable form** (`.txt`)
2. **Binary files** → Store data in **machine-readable form** (`.bin`)

---

## **2. File Handling Functions (`<stdio.h>`)**
<br>

C uses **`FILE` pointer** to represent a file.

```c
FILE *filePointer;
```

Common file handling functions:

**fopen()** → Open a file

**fclose()** → Close a file

**fprintf()** → Write formatted output to a file

**fscanf()** → Read formatted input from a file

**fgets()** → Read a line from a file

**fputs()** → Write a string to a file

**fread()** → Read binary data

**fwrite()** → Write binary data

**feof()** → Check end-of-file

---

## **3. Opening a File**

**Syntax**:

```
FILE *fp = fopen("filename", "mode");
```

Modes:

"**r**" → Read (file must exist)

"**w**" → Write (creates new file, overwrites if exists)

"**a**" → Append (write at the end)

"**r+**" → Read and write (file must exist)

"**w+**" → Read and write (creates file)

"**a+**" → Read and append

**Example**:

```
FILE *fp = fopen("example.txt", "w");
if(fp == NULL) {
    printf("Error opening file\n");
    return 1;
}
```

## **4. Writing to a File**<br>

### **4.1. Using fprintf()**<br>

```
#include <stdio.h>

int main() {
    FILE *fp = fopen("data.txt", "w");
    if(fp == NULL) return 1;

    fprintf(fp, "Hello LearnCodeX\n");
    fprintf(fp, "Roll No: %d\n", 101);

    fclose(fp);
    return 0;
}
```
<br>

### **4.2. Using fputs()**
<br>

```
fputs("Hello LearnCodeX\n", fp);
```

---

## **5. Reading from a File**<br>

### **5.1. Using fscanf()**
<br>

```
#include <stdio.h>

int main() {
    FILE *fp = fopen("data.txt", "r");
    if(fp == NULL) return 1;

    char str[50];
    int roll;

    fscanf(fp, "%s %d", str, &roll);
    printf("Name: %s, Roll No: %d\n", str, roll);

    fclose(fp);
    return 0;
}
```

### **5.2. Using fgets()**
<br>

```
char line[100];
while(fgets(line, sizeof(line), fp)) {
    printf("%s", line);
}
```

---

## **6. Closing a File**<br>

Always close a file to save changes and free resources:

```
fclose(fp);
```

---

## **7. Appending to a File**
<br>

```
FILE *fp = fopen("data.txt", "a");
if(fp == NULL) return 1;

fprintf(fp, "New line added\n");
fclose(fp);
```

"**a**" mode adds data at the end without deleting existing content

---

## **8. Binary File Operations**<br>

### **8.1. Writing Binary Data**<br>

```
#include <stdio.h>

struct Student {
    int roll;
    char name[50];
};

int main() {
    struct Student s = {101, "LearnCodeX"};
    FILE *fp = fopen("student.bin", "wb");  // write binary

    fwrite(&s, sizeof(s), 1, fp);
    fclose(fp);
    return 0;
}
```
<br>

### **8.2. Reading Binary Data**
<br>

```
struct Student s1;
FILE *fp = fopen("student.bin", "rb");  // read binary
fread(&s1, sizeof(s1), 1, fp);
printf("Roll: %d, Name: %s\n", s1.roll, s1.name);
fclose(fp);
```

---

## **9. Checking End of File**

**feof()** returns non-zero when end of file is reached.

```
while(!feof(fp)) {
    fgets(line, sizeof(line), fp);
    printf("%s", line);
}
```

---

## **10. Error Handling**

-Always check if file is opened successfully

-fp == NULL indicates failure to open file

-Avoid reading/writing after closing the file

---

## **11. Summary (LearnCodeX)**

* File pointer _**(FILE *)**_ is used for file operations

* Modes: "**r**", "**w**", "**a**", "**r+**", "**w+**", "**a+**"
 
* Functions for text: **fprintf**, **fscanf**, **fgets**, **fputs**
 
* Functions for binary: **fwrite**, **fread**
 
* Always close files using **fclose()**
 
* Check for **NULL** and handle **EOF**
 
* File handling allows persistent storage, efficient data retrieval, and is essential for real-world applications.