# **C++ Data Types and Variables**

Variables are **containers to store data** in memory.  
Data types specify the **type and size** of data a variable can hold.

---

## **1. Basic Data Types**

1. **int**
    - Stores whole numbers
    - Example: `int age = 21;`

2. **float**
    - Stores decimal numbers (single precision)
    - Example: `float pi = 3.14;`

3. **double**
    - Stores decimal numbers with higher precision
    - Example: `double gravity = 9.80665;`

4. **char**
    - Stores a single character
    - Example: `char grade = 'A';`

5. **bool**
    - Stores **true** or **false**
    - Example: `bool isStudent = true;`

---

## **2. Modified Data Types**

C++ allows modifying basic types using:

- **signed / unsigned** → determines whether the number can be negative
- **short / long** → changes the storage size

**Examples:**
```cpp
unsigned int u = 100;    // Only positive integers
long int l = 1000000;    // Large integers
short int s = 100;       // Small integers
```

---

## **3. Variable Declaration and Initialization**

**Declaration**

```
int age;
float pi;
char grade;
```

**Initialization**

```
int age = 21;
float pi = 3.14;
char grade = 'A';
```

**Multiple Variables**

```
int x = 10, y = 20, z = 30;
```

---

## **4. Constants**

Constants are values that do not change during execution.

Using **const** keyword

```
const float PI = 3.14159;
```

Using **#define** macro

```
#define MAX 100
```

---

## **5. Type Casting**

Type casting is converting one data type into another.

**Implicit Type Casting**

```
int a = 10;
double b = a;  // int automatically converted to double
```
<br>

**Explicit Type Casting**

```
double pi = 3.14159;
int intPi = (int)pi;  // double explicitly converted to int
```

---

## **6. Input and Output**
<br>

```
#include <iostream>
using namespace std;

int main() {
    int age;
    float height;
    char grade;

    cout << "Enter age, height and grade: ";
    cin >> age >> height >> grade;

    cout << "Age: " << age << endl;
    cout << "Height: " << height << endl;
    cout << "Grade: " << grade << endl;

    return 0;
}
```

---

## **7. Variable Scope**

**Local Variables**

-Declared inside a function or block

-Accessible only within that block

**Global Variables**

-Declared outside all functions

-Accessible throughout the program

**Static Variables**

-Retain their value between function calls

-Declared with static keyword

**Example of Static Variable:**

```
#include <iostream>
using namespace std;

void counter() {
    static int count = 0;
    count++;
    cout << count << endl;
}

int main() {
    counter();  // 1
    counter();  // 2
    counter();  // 3
    return 0;
}
```

---

## **8. Summary**

* Variables store data in memory and must have a data type
 
* **Basic types:** int, float, double, char, bool

* **Modified types:** signed, unsigned, short, long
 
* Constants are values that do not change (const or #define)
 
* Type casting converts data from one type to another
 
* Variable scope determines where a variable can be accessed: local, global, static

* Understanding data types and variables is fundamental to writing correct and efficient C++ programs.