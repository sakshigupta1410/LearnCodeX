
---
# **Recursion Basics in C**

**Recursion** is a programming technique where a **function calls itself** to solve a problem.  
It is widely used in **mathematical computations, data structures, and algorithms**.

---

## **1. Key Concepts of Recursion**

1. **Base Case:**
    - Condition to **stop recursion**
    - Prevents infinite function calls

2. **Recursive Case:**
    - Part where function **calls itself** with modified parameters

3. **Stack Behavior:**
    - Each recursive call is **pushed onto the call stack**
    - After reaching base case, **functions are popped** in reverse order

---

## **2. Syntax of Recursive Function**<br>

```c
return_type function_name(parameters) {
    if(base_condition)
        return value;
    else
        return function_name(modified_parameters);
}
```

---

### **3. Example 1: Factorial of a Number**<br>

```
#include <stdio.h>

int factorial(int n) {
    if(n == 0)       
    // base case
        return 1;
    else
        return n * factorial(n - 1);  
        // recursive case
}

int main() {
    int num = 5;
    printf("Factorial of %d = %d\n", num, factorial(num));
    return 0;
}
```

Output:
**Factorial of 5 = 120**

---

### **4. Example 2: Fibonacci Series**<br>

```
#include <stdio.h>

int fibonacci(int n) {
    if(n == 0)
        return 0;
    else if(n == 1)
        return 1;
    else
        return fibonacci(n - 1) + fibonacci(n - 2);
}

int main() {
    int n = 10;
    for(int i = 0; i < n; i++)
        printf("%d ", fibonacci(i));
    return 0;
}
```
Output:
**0 1 1 2 3 5 8 13 21 34**

---

### **5. Example 3: Sum of N Natural Numbers**<br>

```
#include <stdio.h>

int sum(int n) {
    if(n == 0)
        return 0;
    else
        return n + sum(n - 1);
}

int main() {
    int n = 10;
    printf("Sum of first %d numbers = %d\n", n, sum(n));
    return 0;
}
```
Output:
**Sum of first 10 numbers = 55**

---

### **6. Example 4: Reverse a Number Using Recursion**<br>

```
#include <stdio.h>

void reverse(int n) {
    if(n == 0)
        return;
    else {
        printf("%d", n % 10);
        reverse(n / 10);
    }
}

int main() {
    int num = 12345;
    printf("Reverse: ");
    reverse(num);
    return 0;
}
```
Output:
**Reverse: 54321**

## **7. Tips for Writing Recursive Functions**

* Always define a base case to prevent infinite recursion
 
* Ensure that recursive calls progress toward the base case
 
* Be cautious with memory usage, deep recursion may cause stack overflow

* Recursion can often be replaced with loops if efficiency is critical

---

## **8. Advantages of Recursion**

- Simplifies complex problems like **tree traversal**, **factorial**, and **Fibonacci**

- Enhances code readability for problems that are naturally recursive

---

## **9. Disadvantages of Recursion**

- Higher memory usage due to call stack

- Slower execution compared to iterative solutions in some cases

---

## **10. Summary**

* **Recursion**: Function calls itself to solve a problem

* **Base case**: Stops recursion
 
* **Recursive case**: Calls itself with smaller problem
 
* **Common examples**: Factorial, Fibonacci, sum, reverse
 
* Use recursion for natural recursive problems and iterative loops for efficiency
 
* Recursion is a powerful tool in C for elegant solutions, but it should be used with care to avoid stack overflow and performance issues.