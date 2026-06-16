# **Modular Programming in C**
<br>

## **Introduction**

<br>

**Modular Programming** is a software design technique where a program is divided into independent, reusable modules.  
Each module performs a specific task and can be compiled separately.

**Advantages**:
- Improves code readability and maintainability.
- Encourages code reusability.
- Allows team collaboration (different modules can be developed independently).
- Easier debugging and testing.

---

## **Structure of Modular Program**

<br>

In C, modular programming is implemented using:
1. **Header files (`.h`)** → contain function declarations, macros, constants.
2. **Source files (`.c`)** → contain function definitions and logic.
3. **Main file (`main.c`)** → contains the `main()` function and uses other modules.

---

## **Example: Modular Program**
<br>

### File: `mathutils.h`
<br>

```c
#ifndef MATHUTILS_H
#define MATHUTILS_H

int add(int a, int b);
int sub(int a, int b);
int mul(int a, int b);
int divide(int a, int b);
```

File:` mathutils.c`
```
#include "mathutils.h"

int add(int a, int b) {
    return a + b;
}

int sub(int a, int b) {
    return a - b;
}

int mul(int a, int b) {
    return a * b;
}

int divide(int a, int b) {
    if(b == 0) return 0; // simple error handling
    return a / b;
}
```

File: `main.c`

```
#include <stdio.h>
#include "mathutils.h"

int main() {
    int x = 10, y = 5;

    printf("Add: %d\n", add(x, y));
    printf("Subtract: %d\n", sub(x, y));
    printf("Multiply: %d\n", mul(x, y));
    printf("Divide: %d\n", divide(x, y));

    return 0;
}
```

## **Compiling Modular Code**

Compile all **.c** files together:

`gcc main.c mathutils.c -o program`

Run:

`./program`

<br>

Output:

Add: 15
Subtract: 5
Multiply: 50
Divide: 2


## **Benefits of Modular Programming**

**Separation of concerns** → each module has a clear purpose.

**Independent compilation** → compile modules separately and link them later.

**Reusability** → same module can be reused in multiple projects.

**Scalability** → large programs can be managed easily.

---

## **Summary**

-Modular programming divides a program into smaller, manageable modules.

-In C, it is implemented using header files **(.h)** and source files **(.c)**.

-It improves **maintainability**, **reusability**, and **teamwork**.

---
