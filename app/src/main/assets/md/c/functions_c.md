
---

# **Functions in C**

A **function** is a block of code that performs a specific task.  
Functions **help in modular programming**, making code reusable and easier to maintain.

---

## **1. Benefits of Using Functions**<br>

- **Modularity:** Breaks a program into smaller, manageable parts
- **Reusability:** Write once, use multiple times
- **Ease of maintenance:** Easier to debug and update code
- **Readability:** Makes code cleaner and structured

---
<br>

## **2. Structure of a Function**

A function in C typically has:

1. **Return type** → Type of value the function returns (`int`, `float`, `void`, etc.)
2. **Function name** → Identifier used to call the function
3. **Parameters (optional)** → Input values to the function
4. **Function body** → Block of code enclosed in `{}`

**Syntax:**
```c
return_type function_name(parameter_list) {
    // code to execute
    return value;  // optional if return type is not void
}
```

---

## **3. Function Declaration (Prototype)**<br>

A function declaration tells the compiler about the function name, return type, and parameters.
It is usually placed before **main()**.

**Example**:

```
int add(int a, int b);  
// function declaration
```

---

## **4. Function Definition**

A function definition contains the actual code of the function.

Example:

```
int add(int a, int b) {
    return a + b;
}
```

---

## **5. Function Call**

A function call is used to execute the function.
You can call a function from main() or from another function.

**Example**:

```
#include <stdio.h>

int add(int a, int b) {
    return a + b;
}

int main() {
    int result;
    result = add(5, 10);  // function call
    printf("Sum = %d\n", result);
    return 0;
}
```
Output:
**Sum = 15**

---

## **6. Types of Functions**<br>

### **6.1. Functions with No Arguments and No Return Value**<br>

```
#include <stdio.h>

void greet() {
    printf("Hello, LearnCodeX!\n");
}

int main() {
    greet();  // function call
    return 0;
}
```

Output:
**Hello, LearnCodeX!**


### **6.2. Functions with Arguments but No Return Value**<br>

```
#include <stdio.h>

void greetUser(char name[]) {
    printf("Hello, %s!\n", name);
}

int main() {
    greetUser("LearnCodeX");
    return 0;
}
```
Output:
**Hello, LearnCodeX!**

### **6.3. Functions with No Arguments but Return Value**<br>

```
#include <stdio.h>

int getNumber() {
    return 42;
}

int main() {
    int num = getNumber();
    printf("Number = %d\n", num);
    return 0;
}
```

Output:
**Number = 42**

### **6.4. Functions with Arguments and Return Value**<br>

```
#include <stdio.h>

int multiply(int a, int b) {
    return a * b;
}

int main() {
    int result = multiply(5, 4);
    printf("Product = %d\n", result);
    return 0;
}
```

Output:
**Product = 20**

---

## **7. Recursion**

A function that calls itself is called a **recursive** function.
Useful for problems like factorials, Fibonacci series, and tree traversal.

**Example**: 
Factorial using recursion

```
#include <stdio.h>

int factorial(int n) {
    if (n == 0)
        return 1;
    else
        return n * factorial(n - 1);
}

int main() {
    int num = 5;
    printf("Factorial of %d = %d\n", num, factorial(num));
    return 0;
}
```
Output:
**Factorial of 5 = 120**

**Notes**:

Always include a base condition to avoid infinite recursion.

---

## **8. Scope and Lifetime of Variables in Functions**<br>

**Local Variables**: Declared inside a function, accessible only within that function. Lifetime ends when function exits.

**Global Variables**: Declared outside all functions, accessible from any function in the program. Lifetime lasts for the entire program execution.

**Example**:

```
#include <stdio.h>

int globalVar = 100;  // global variable

void demo() {
    int localVar = 50;  // local variable
    printf("Local = %d, Global = %d\n", localVar, globalVar);
}

int main() {
    demo();
    printf("Global in main = %d\n", globalVar);
    return 0;
}
```
Output:
**Local = 50, Global = 100
Global in main = 100**

---

## **9. Summary**

Functions break a program into modular, reusable blocks

**Components**: Return type, Name, Parameters, Body

Declaration (prototype) informs compiler, definition contains code, call executes function

**Types of functions:**

* **No arguments, no return**

* **With arguments, no return**
 
* **No arguments, with return**
 
* **With arguments and return**
 
* **Recursion**: Function calling itself with a base case
 
* **Scope of variables**: Local vs Global
 
* Functions are the building blocks of modular programming and make programs easier to understand, maintain, and reuse.

---