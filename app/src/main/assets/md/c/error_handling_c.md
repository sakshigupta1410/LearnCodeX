# **Error Handling in C**
<br>

## **Introduction**
C language does not provide direct support for **exception handling** like C++ or Java.  
Instead, C uses:
- **Return values** (success or failure codes).
- **`errno`** variable (error codes from library functions).
- **Error-handling functions** like `perror()` and `strerror()`.

---

## **The `errno` Variable**
- Defined in **`<errno.h>`**.
- Set by system calls and some library functions when an error occurs.
- Remains unchanged if no error occurs.

**Common values of `errno`:**
- `EDOM` – Domain error (e.g., invalid argument for math function).
- `ERANGE` – Range error (result out of range).
- `EINVAL` – Invalid argument.
- `ENOENT` – No such file or directory.

---

## **Using `errno` with `perror()`**
`perror()` prints a human-readable error message.

```c
#include <stdio.h>
#include <errno.h>

int main() {
    FILE *fp = fopen("nonexistent.txt", "r");

    if(fp == NULL) {
        perror("Error opening file");
    }

    return 0;
}
```

**Output**:

Error opening file: No such file or directory

## **Using errno with strerror()**

strerror(errno) returns the error message as a string.

```
#include <stdio.h>
#include <errno.h>
#include <string.h>

int main() {
    FILE *fp = fopen("test.txt", "r");

    if(fp == NULL) {
        printf("Error: %s\n", strerror(errno));
    }

    return 0;
}
```

**Output**:

Error: No such file or directory
<br>

**Example**: Math Function Error

```
#include <stdio.h>
#include <errno.h>
#include <math.h>

int main() {
    double val = -1.0;
    errno = 0;

    double result = sqrt(val);

    if(errno != 0) {
        perror("Math error");
    } else {
        printf("Result = %f\n", result);
    }

    return 0;
}
```
<br>

**Output**:

Math error: Numerical argument out of domain
<br>

## **Custom Error Handling (Return Codes)**

Programmers often define their own error codes.

```
#include <stdio.h>

#define SUCCESS 0
#define ERROR_DIVIDE_BY_ZERO 1

int divide(int a, int b, int *result) {
    if(b == 0) return ERROR_DIVIDE_BY_ZERO;
    *result = a / b;
    return SUCCESS;
}

int main() {
    int result, status;

    status = divide(10, 0, &result);

    if(status == ERROR_DIVIDE_BY_ZERO) {
        printf("Error: Division by zero!\n");
    } else {
        printf("Result = %d\n", result);
    }

    return 0;
}
```
<br>

**Output**:

Error: Division by zero!

## **Summary**

* C does not support exceptions directly.

* Errors are handled using:
 
* Return values (0 for success, non-zero for error).
 
* errno variable to store error codes.
 
* **perror()** and **strerror()** for error messages.
 
* Custom error codes can also be created for user-defined functions.