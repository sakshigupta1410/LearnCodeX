
---
# **Preprocessor Directives and Macros**

Preprocessor directives are **instructions to the compiler** that are executed **before the actual compilation** of the code.  
They are used for **including files, defining constants, and conditional compilation**.

---

## **1. Preprocessor Directives**

- Start with the **`#`** symbol
- Processed **before compilation**
- Not part of the executable code

Common preprocessor directives:

1. **#include** → Include header files
2. **#define** → Define constants or macros
3. **#undef** → Undefine a macro
4. **#ifdef / #ifndef / #endif** → Conditional compilation
5. **#if / #elif / #else / #endif** → Compile based on conditions
6. **#error** → Generate compilation error
7. **#pragma** → Compiler-specific instructions

---

## **2. `#include`**

Includes **header files** containing function declarations or macros.

### **2.1. Standard Header Files**<br>

```c
#include <stdio.h>    // standard library
#include <stdlib.h>
```

### **2.2. User-Defined Header Files**<br>

```
#include "myheader.h"
```

**Notes**:

* `< >` → Compiler searches standard directories
 
* `" "` → Compiler searches current directory first

---

## **3. `#define` (Macros and Constants)**

Defines **constants** or **macros**.

### **3.1. Define Constant**<br>

```
#define PI 3.14159
#define SIZE 100
```
Replaces PI with 3.14159 during preprocessing

### **3.2. Function-Like Macros**<br>

```
#define SQUARE(x) ((x) * (x))
```

**Example**:

```
#include <stdio.h>
#define SQUARE(x) ((x)*(x))

int main() {
    int num = 5;
    printf("Square: %d\n", SQUARE(num));
    return 0;
}

Output:
Square: 25
```

---

### **4. `#undef`**

Undefine a macro.

```
#define PI 3.14
#undef PI
```

After #undef PI, the macro PI _no longer_ exists.

## **5. Conditional Compilation**

Conditional compilation allows compiling code based on certain conditions.

### **5.1. `#ifdef` / `#ifndef` / `#endif`**<br>

```
#define DEBUG

#ifdef DEBUG
    printf("Debug mode ON\n");
#endif
```

```
#ifndef VERSION
    #define VERSION 1.0
#endif
```

`#ifdef` → Compiles if macro is defined

`#ifndef` → Compiles if macro is not defined

### **5.2. `#if` / `#elif` / `#else` / `#endif`**<br>

```
#define LEVEL 2

#if LEVEL == 1
    printf("Level 1\n");
#elif LEVEL == 2
    printf("Level 2\n");
#else
    printf("Other Level\n");
#endif
```

---

## **6. `#error`**

Generate compile-time error for invalid conditions.

```
#ifndef CONFIG
#error "CONFIG not defined"
#endif
```
Useful for mandatory configuration checks

## **7. `#pragma`**

Provides special instructions to the compiler

Compiler-specific, not standardized

**Example**:

```
#pragma pack(1)  // pack structure members without padding
```

---

## **8. Best Practices**

* Use #define for constants instead of magic numbers

* Prefer uppercase for macros (PI, MAX_SIZE)
 
* Avoid complex function-like macros → use inline functions if possible
 
* Use conditional compilation for debugging and platform-specific code

---

## **9. Summary** 

* Preprocessor directives are executed _before_ compilation

* `#include` → include header files
 
* `#define` → define constants or macros
 
* `#undef` → remove macro
 
* `#ifdef` / `#ifndef` / `#endif` → conditional compilation
 
* `#if` / `#elif` / `#else` / `#endif` → compile based on conditions
 
* `#error` → trigger compilation error
 
* `#pragma` → compiler-specific instructions
 
* Preprocessor directives are essential for **modular**, **maintainable**, and **platform-independent** C programs.