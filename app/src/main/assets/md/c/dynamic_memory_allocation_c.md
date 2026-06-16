# **Dynamic Memory Allocation in C**

Dynamic Memory Allocation allows **allocating memory at runtime**.  
Unlike static memory (fixed size), dynamic memory is **flexible** and can be allocated as needed using **pointers**.

---

## **1. Why Use Dynamic Memory Allocation?**

- Allocate memory **during program execution**
- Useful when **size of data is unknown** beforehand
- Helps **efficiently use memory** and avoid wastage
- Essential for **dynamic data structures** like linked lists, trees, and graphs

---

## **2. Memory Management Functions (`<stdlib.h>`)**

C provides **four functions** for dynamic memory management:

1. `malloc()` → Allocates memory **without initializing**
2. `calloc()` → Allocates memory **and initializes to zero**
3. `realloc()` → **Changes the size** of previously allocated memory
4. `free()` → **Frees allocated memory**

---

## **3. malloc()**

**Syntax:**
```c
ptr = (castType*) malloc(size_in_bytes);
```
<br>

**Example**:

```
#include <stdio.h>
#include <stdlib.h>

int main() {
    int *ptr;
    int n = 5;

    ptr = (int*) malloc(n * sizeof(int));  // allocate memory for 5 integers

    if(ptr == NULL) {
        printf("Memory allocation failed\n");
        return 1;
    }

    for(int i = 0; i < n; i++) {
        ptr[i] = i + 1;
        printf("%d ", ptr[i]);
    }

    free(ptr);  // free memory
    return 0;
}
```

Output:
**1 2 3 4 5**

**Notes**:

- Memory is uninitialized

- Always check if malloc returns NULL

---

## **4. calloc()**

**Syntax**:

```
ptr = (castType*) calloc(number_of_elements, size_of_each_element);
```

**Example**:
<br>

```
#include <stdio.h>
#include <stdlib.h>

int main() {
    int *ptr;
    int n = 5;

    ptr = (int*) calloc(n, sizeof(int));  // memory initialized to 0

    for(int i = 0; i < n; i++) {
        printf("%d ", ptr[i]);  // prints 0 0 0 0 0
    }

    free(ptr);
    return 0;
}
```
<br>

**Notes**:

calloc allocates memory and sets all bits to zero

Useful when memory needs initialization

---

## **5. realloc()**

**Syntax**:

```
ptr = (castType*) realloc(ptr, new_size_in_bytes);
```
<br>

**Example**:

```
#include <stdio.h>
#include <stdlib.h>

int main() {
    int *ptr;
    int n = 5;

    ptr = (int*) malloc(n * sizeof(int));
    for(int i = 0; i < n; i++) ptr[i] = i + 1;

    n = 8;  // new size
    ptr = (int*) realloc(ptr, n * sizeof(int));  // resize memory

    for(int i = 0; i < n; i++) {
        printf("%d ", ptr[i]);  // first 5 preserved, rest uninitialized
    }

    free(ptr);
    return 0;
}
```

**Notes**:

- Preserves old data

- New memory may contain garbage values

---

## **6. free()**

**Syntax**:

```
free(ptr);
```
<br>

**Purpose**:

Releases memory previously allocated by malloc, calloc, or realloc

Prevents memory leaks

---

## **7. Example: Dynamic Array Input**
<br>

```
#include <stdio.h>
#include <stdlib.h>

int main() {
    int n;
    printf("Enter number of elements: ");
    scanf("%d", &n);

    int *arr = (int*) malloc(n * sizeof(int));

    if(arr == NULL) {
        printf("Memory allocation failed\n");
        return 1;
    }

    printf("Enter %d elements:\n", n);
    for(int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }

    printf("Elements are:\n");
    for(int i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }

    free(arr);  // free memory
    return 0;
}
```

---

## **8. Important Notes**

* Always use **free()** after dynamic memory is no longer needed
 
* Dereferencing uninitialized or freed pointer leads to undefined behavior
 
* Check for NULL after allocation to avoid runtime errors
 
* Use pointers carefully to avoid memory leaks and segmentation faults

---

## **9. Summary**

* **Dynamic memory allocation:** allocate memory at runtime
 
* **Functions**: malloc, calloc, realloc, free
 
* **malloc** → uninitialized memory
 
* **calloc** → memory initialized to 0
 
* **realloc** → resize memory
 
* **free** → release memory

* Essential for flexible **_arrays_**, _**linked lists**_, and complex data structures

* Dynamic memory allocation provides **flexibility**, **efficiency**, and control over memory in C programs.