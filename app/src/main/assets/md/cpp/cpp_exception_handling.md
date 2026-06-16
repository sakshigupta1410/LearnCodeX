# **C++ Exception Handling**

Exception handling in C++ allows you to **handle runtime errors** gracefully and **maintain program stability**.  
It helps prevent program crashes due to **unexpected conditions**.

---

## **1. Basics**

- **Exception:** An event that occurs during program execution that **disrupts normal flow**
- Handled using **`try`, `catch`, and `throw`** blocks

---

## **2. Syntax**
<br>

```cpp
try {
    // Code that may throw an exception
} 
catch (exception_type variable) {
    // Code to handle the exception
}
```

**throw** is used to signal an exception

```
throw value;  
// Can be int, char, string, etc.
```

---

## **3. Example: Basic Exception Handling**<br>

```
#include <iostream>
using namespace std;

int main() {
    try {
        int a = 10, b = 0;
        if (b == 0) {
            throw "Division by zero error";  // Throw exception
        }
        cout << a / b << endl;
    } 
    catch (const char* e) {
        cout << "Exception: " << e << endl;  // Catch exception
    }
    return 0;
}
```
Output:
**Exception: Division by zero error**

---

## **4. Multiple catch Blocks**

Handle different types of exceptions separately

```
try {
    throw 10;
} 
catch (int e) {
    cout << "Integer exception: " << e << endl;
} 
catch (char const* e) {
    cout << "String exception: " << e << endl;
}
```

---

## **5. Catch All Exceptions**

Use ellipsis (...) to catch any type of exception

```
try {
    throw 3.14;
} 
catch (...) {
    cout << "Unknown exception caught" << endl;
}
```

---

## **6. Rethrowing Exceptions**

A caught **exception** can be rethrown to be handled at a higher level

```
try {
    try {
        throw 20;
    } 
    catch (int e) {
        cout << "Caught inside: " << e << endl;
        throw;  // Rethrow
    }
} 
catch (int e) {
    cout << "Caught outside: " << e << endl;
}
```
Output:
**Caught inside: 20
Caught outside: 20**

---

## **7. Exception Handling with Functions**<br>

Exceptions can be thrown inside functions and caught in the calling function

```
#include <iostream>
using namespace std;

void divide(int a, int b) {
    if (b == 0) throw "Division by zero!";
    cout << a / b << endl;
}

int main() {
    try {
        divide(10, 0);
    } 
    catch (const char* e) {
        cout << "Exception: " << e << endl;
    }
    return 0;
}
```

---

## **8. Standard Exceptions (<exception>)**<br>

C++ provides a standard exception hierarchy:

`std::exception` – Base class

`std::runtime_error` – Runtime errors

`std::logic_error` – Logical errors

`std::out_of_range, std::overflow_error, std::underflow_error`

```
#include <iostream>
#include <stdexcept>
using namespace std;

int main() {
    try {
        throw out_of_range("Index out of range!");
    } 
    catch (const exception& e) {
        cout << "Standard exception: " << e.what() << endl;
    }
    return 0;
}
```

## **9. Summary (LearnCodeX)**

* Exception handling improves program robustness

* Use try to wrap risky code, throw to signal errors, catch to handle them
 
* Multiple catch blocks allow handling different types
 
* Ellipsis (...) can catch any unknown exception
 
* Standard exceptions provide common error types for safe programming
 
* Proper exception handling is essential for safe, reliable, and maintainable C++ applications.