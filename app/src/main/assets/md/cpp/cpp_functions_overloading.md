# **C++ Functions and Function Overloading**

Functions in C++ allow you to **group a set of statements together** to perform a specific task.  
Function overloading allows **multiple functions with the same name** but different parameters.

---

## **1. Basics of Functions**
<br>

### **1.1. Function Declaration (Prototype)**

- Declares a function before its usage
```cpp
return_type function_name(parameter_list);
```

**Example**:

```
int add(int a, int b); // Function declaration
```

### **1.2. Function Definition**

Contains the actual code of the function

```
int add(int a, int b) {
    return a + b;
}
```

### **1.3. Function Call**

Executes the function with arguments

```
int main() {
    int sum = add(5, 10);  // Function call
    cout << "Sum: " << sum << endl;
    return 0;
}
```

---

## **2. Function Types in C++**<br>

**No parameter, no return type**

```
void greet() {
    cout << "Hello LearnCodeX!" << endl;
}
```

**Parameter, no return type**

```
void printSquare(int n) {
    cout << "Square: " << n * n << endl;
}
```

**No parameter, return type**

```
int getNumber() {
    return 42;
}
```

**Parameter and return type**

```
int multiply(int a, int b) {
    return a * b;
}
```

---

## **3. Function Overloading**<br>

**Definition**: Multiple functions can have the same name with different parameter types or counts.

**Purpose**: Improves code readability and usability.

**Example**:

```
#include <iostream>
using namespace std;

// Function to add two integers
int add(int a, int b) {
    return a + b;
}

// Function to add three integers
int add(int a, int b, int c) {
    return a + b + c;
}

// Function to add two doubles
double add(double a, double b) {
    return a + b;
}

int main() {
    cout << add(5, 10) << endl;       // Calls first function → 15
    cout << add(5, 10, 15) << endl;   // Calls second function → 30
    cout << add(2.5, 3.5) << endl;    // Calls third function → 6.0
    return 0;
}
```

**Notes**:

Return type alone cannot distinguish overloaded functions

Functions must differ by parameter type or count

---

## **4. Inline Functions**

Small functions can be declared as inline to reduce function call overhead.

```
inline int square(int x) {
    return x * x;
}

int main() {
    cout << square(5) << endl; // 25
    return 0;
}
```

---

## **5. Default Arguments**<br>

Functions can have default parameter values.

```
#include <iostream>
using namespace std;

int multiply(int a, int b = 2) { // b defaults to 2
    return a * b;
}

int main() {
    cout << multiply(5) << endl;    // 10 (5*2)
    cout << multiply(5, 3) << endl; // 15
    return 0;
}
```

---

## **6. Recursion (Function Calling Itself)**<br>

Functions can call themselves to solve problems.

```
int factorial(int n) {
    if(n == 0) return 1;     // Base case
    return n * factorial(n-1);
}

int main() {
    cout << factorial(5) << endl; // 120
    return 0;
}
```

## **7. Summary (LearnCodeX)**

* Functions modularize code, making it readable and reusable

* Function overloading allows the same name for multiple functions with different parameters
 
* Inline functions reduce call overhead
 
* Default arguments make functions flexible
 
* Recursive functions solve problems by self-calling
 
* Functions and overloading are essential for clean, efficient, and maintainable C++ code.