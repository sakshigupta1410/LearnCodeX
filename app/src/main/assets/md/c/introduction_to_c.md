
---

# **Introduction to C**

C is a **general-purpose, high-level programming language** developed by **Dennis Ritchie** at Bell Labs in 1972.  
It is widely used for system programming, embedded systems, and developing operating systems.

---

## **1. Features of C**

- **Simple:** Easy to learn and understand
- **Structured Language:** Supports structured programming with functions
- **Portable:** Programs can run on different machines
- **Efficient:** Executes programs faster than many high-level languages
- **Low-level manipulation:** Can handle memory efficiently using pointers
- **Rich library:** Offers a wide range of built-in functions

---

## **2. Structure of a C Program**

A basic C program consists of:

1. Preprocessor commands
2. Main function
3. Variable declarations
4. Statements / instructions
5. Return statement

**Example: Hello World Program**

```c
#include <stdio.h>  // Preprocessor directive

int main() {
    printf("Hello, LearnCodeX!\n");  // Print statement
    return 0;                        // Exit status
}
```
Output:
**Hello, LearnCodeX!**

---

## **3. Basic Syntax**

**Case sensitive**: int and Int are different

Statements end with a semicolon **;**

Curly braces **{ }** define a block of code

**Comments**:

**Single line**: // Comment here

**Multi-line**: /* Comment here */

---

## **4. Data Types in C**<br>


C provides several built-in data types:

**Basic types**: int, float, char, double

**Derived types**: array, pointer, structure

**Enumeration**: enum

**Void**: void (no value)

**Example**:

```
int age = 21;
float height = 5.5;
char grade = 'A';
```
<br>

## **5. Variables**

Variables store data in memory

Must be declared before use

Can be initialized at the time of declaration

**Example**:

```
int x = 10;
float y = 3.14;
char initial = 'L';
```

---

## **6. Constants**

Constants are fixed values that cannot be changed during execution.

```
#define PI 3.14159   
// Preprocessor constant

const int DAYS = 7; 
// Constant variable
```

---

## **7. Operators in C**

C supports various operators:

**Arithmetic**: +, -, *, /, %

**Relational**: ==, !=, >, <, >=, <=

**Logical**: &&, ||, !

**Assignment**: =, +=, -=, *=, /=

**Increment/Decrement:** ++, --

**Bitwise**: &, |, ^, ~, <<, >>

---

## **8. Input and Output**

**printf()** → Display output

**scanf()** → Read input

**Example**:

```
#include <stdio.h>

int main() {
    int age;
    printf("Enter your age: ");
    scanf("%d", &age);
    printf("You are %d years old\n", age);
    return 0;
}
```

---

## **9. Summary (LearnCodeX)**

* C is a high-level, structured programming language

* Programs consist of functions, statements, variables, and preprocessor commands
 
* Supports arithmetic, logical, relational, and bitwise operations
 
* Input/output is handled via printf() and scanf()
 
* Constants and variables are used to store fixed and changeable data
 
* C is the foundation for many modern programming languages like C++, Java, and Python.

---