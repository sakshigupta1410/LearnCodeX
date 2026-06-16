# **Introduction to C++**

C++ is a **general-purpose, high-level programming language** developed by **Bjarne Stroustrup** in 1983.  

It is an **extension of C** with **object-oriented programming (OOP) features**.

---

## **Key Features of C++**

- **Object-Oriented Programming (OOP):** Supports classes, objects, inheritance, polymorphism, encapsulation, and abstraction.
- **Low-Level Manipulation:** Can directly manipulate memory and hardware resources.
- **Rich Standard Library:** Provides STL (Standard Template Library) for data structures and algorithms.
- **Platform Independence:** Can run on different operating systems with a compatible compiler.
- **High Performance:** Efficient memory management and fast execution.

---

## **C++ vs C**

- **Paradigm:** C → Procedural; C++ → Procedural + OOP
- **Data Hiding:** C → No; C++ → Yes (using classes)
- **Function Overloading:** C → No; C++ → Yes
- **Classes & Objects:** C → No; C++ → Yes
- **Standard Library:** C → Limited; C++ → Rich (STL, I/O streams)

---

## Structure of a C++ Program
<br>

```cpp
#include <iostream>  // Include library
using namespace std; // Use standard namespace

int main() {
    cout << "Hello LearnCodeX!" << endl;  // Output
    return 0;                             // Exit program
}
```

**Explanation**:

**#include <iostream>** → Includes standard input-output library

**using namespace std;** → Avoids writing std:: before cout and cin

**cout** → Prints output to console

**endl** → Ends the line

### **C++ Keywords**

* Data types: int, float, double, char, bool
 
* Control statements: if, else, switch, case, for, while, do
 
* OOP: class, private, public, protected, virtual

* Other: return, break, continue, const, static

### **Comments in C++**

**Single-line comment:** // This is a comment

**Multi-line comment:**

```
/*
   This is a
   multi-line comment
*/
```
<br>

**Input and Output**

```
#include <iostream>
using namespace std;

int main() {
    int age;
    cout << "Enter your age: ";
    cin >> age;                 // Input from user
    cout << "Your age is " << age << endl;
    return 0;
}
```

### **Basic Data Types**

* int: Whole numbers (int a = 10;)

* float: Decimal numbers (float b = 3.14;)
 
* double: Double precision decimal (double c = 3.14159;)
 
* char: Single character (char ch = 'A';)
 
* bool: True or False (bool flag = true;)

## **Advantages of C++**

* Supports OOP for code reuse and modularity
 
* Allows both high-level and low-level programming

* Offers rich library support
 
* Efficient and fast execution

## **Summary (LearnCodeX)**

* **C++** = C + Object-Oriented Programming
 
* Supports procedural and OOP paradigms
 
* **Key features**: classes, objects, inheritance, polymorphism

* Standard libraries and STL make programming easier
 
* Used in software **development, game programming, system programming, and competitive coding**
 
* C++ is a powerful, flexible language that combines efficiency with modern programming techniques.