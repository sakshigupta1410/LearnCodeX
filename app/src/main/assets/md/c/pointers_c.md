# **Pointers in C**

A **pointer** is a variable that **stores the memory address of another variable**.  
Pointers are a powerful feature in C that allow **direct memory access, dynamic memory allocation, and efficient array manipulation**.

---

## **1. Why Use Pointers?**

- **Memory efficiency:** Directly access and modify memory
- **Dynamic memory allocation:** Allocate memory at runtime
- **Function arguments:** Pass large data structures efficiently
- **Data structures:** Essential for linked lists, trees, and graphs

---

## **2. Pointer Declaration**

**Syntax:**
```c
data_type *pointer_name;
```

**Examples**:

```
int *ptr;      
// pointer to int
float *fptr;   
// pointer to float
char *cptr;    
// pointer to char
```

'*' indicates that the variable is a pointer

Pointers store addresses of variables of the same data type

---

## **3. Address-of Operator &**

The address-of operator returns the memory address of a variable.

```
#include <stdio.h>

int main() {
    int a = 10;
    int *ptr;

    ptr = &a;  // store address of a in ptr
    printf("Address of a: %p\n", &a);
    printf("Value of ptr: %p\n", ptr);

    return 0;
}
```
Output Example:

**Address of a: 0x7ffee1a8c7ac<br>
Value of ptr: 0x7ffee1a8c7ac**

---

## **4. Dereference Operator**

The dereference operator allows access to the value stored at the address.

```
#include <stdio.h>

int main() {
    int a = 10;
    int *ptr = &a;

    printf("Value of a: %d\n", *ptr);  // access value using pointer

    *ptr = 20;  // modify value through pointer
    printf("Updated value of a: %d\n", a);

    return 0;
}
```

Output:

**Value of a: 10<br>
Updated value of a: 20**

---

## **5. Pointer Initialization**

Pointers should always be **initialized**.

**Uninitialized** pointers may point to _garbage_ memory (dangling pointer).

```
int a = 5;
int *ptr = &a;  
// safe
```

---

## **6. Pointers and Arrays**

The name of an array acts as a pointer to its first element.

Access elements using pointer arithmetic.

```
#include <stdio.h>

int main() {
    int arr[5] = {10, 20, 30, 40, 50};
    int *ptr = arr;  // same as &arr[0]
    
    for(int i = 0; i < 5; i++) {
        printf("%d ", *(ptr + i));  // pointer arithmetic
    }

    return 0;
}
```

Output:

**10 20 30 40 50**

---

## **7. Pointers and Functions**<br>

### **7.1. Pass by Address**<br>

Pointers allow functions to modify actual variables (call by reference).

```
#include <stdio.h>

void increment(int *p) {
    *p = *p + 1;
}

int main() {
    int a = 5;
    increment(&a);
    printf("a = %d\n", a);
    return 0;
}
```

Output:
**a = 6**

### **7.2. Returning Pointer from Function**

Functions can return **pointers**, but avoid returning pointers to local variables.

```
#include <stdio.h>
#include <stdlib.h>

int* createArray(int size) {
    int *arr = (int*)malloc(size * sizeof(int));  // dynamic memory
    return arr;
}

int main() {
    int *arr = createArray(5);
    arr[0] = 10;
    printf("%d\n", arr[0]);
    free(arr);  // free memory
    return 0;
}
```

---

## **8. Null Pointer**

A null pointer points to nothing and is used for safety.

```
int *ptr = NULL;
if(ptr != NULL) {
    // safe to dereference
}
```

---

## **9. Pointer to Pointer**

A pointer can store the address of another pointer.

```
#include <stdio.h>

int main() {
    int a = 10;
    int *ptr = &a;
    int **pptr = &ptr;

    printf("Value of a: %d\n", **pptr);
    return 0;
}
```

Output:
**Value of a: 10**

---

## **10. Pointers and Strings**

Strings in C are character arrays, so a char* pointer can point to a string.

```
#include <stdio.h>

int main() {
    char *str = "LearnCodeX";
    printf("%s\n", str);        
    // print string
    printf("%c\n", str[0]);     
    // print first character
    return 0;
}
```

---

## **11. Summary**

**Pointer**: Stores the memory address of a variable

**Operators**:

1. **&** → address-of

2. **"*"** → dereference (value at address)

3. **Pointers and arrays**: Array name = pointer to first element

4. **Pointers in functions**: Pass by reference, return dynamically allocated arrays

5. **Pointer safety**: Initialize pointers, use NULL for empty pointers

6. **Advanced**: Pointer to pointer, pointer arithmetic, strings

7. Pointers are a core feature in C that allow direct memory manipulation, efficient programming, and implementation of dynamic data structures.