# **C++ Operators**

Operators are **symbols used to perform operations** on variables and values.  
C++ provides a variety of operators for **arithmetic, logical, relational, bitwise, assignment, and more**.

---

## **1. Arithmetic Operators**

Used for **mathematical calculations**.

- `+` → Addition
- `-` → Subtraction
- `*` → Multiplication
- `/` → Division
- `%` → Modulus (remainder after division)
- `++` → Increment by 1
- `--` → Decrement by 1

**Example:**
```cpp
#include <iostream>
using namespace std;

int main() {
    int a = 10, b = 3;
    cout << "a + b = " << a + b << endl;
    cout << "a - b = " << a - b << endl;
    cout << "a * b = " << a * b << endl;
    cout << "a / b = " << a / b << endl;
    cout << "a % b = " << a % b << endl;

    a++;
    b--;
    cout << "a++ = " << a << ", b-- = " << b << endl;
    return 0;
}
```

---

## **2. Relational Operators**

Used to compare values. Return true (1) or false (0).

== → Equal to

!= → Not equal to

> → Greater than

< → Less than

>= → Greater than or equal to

<= → Less than or equal to

**Example**:

```
int a = 5, b = 10;
cout << (a == b) << endl;  // 0
cout << (a != b) << endl;  // 1
cout << (a < b) << endl;   // 1
```

---

## **3. Logical Operators**

Used to combine boolean expressions.

&& → Logical AND

|| → Logical OR

! → Logical NOT

**Example**:

```
bool x = true, y = false;
cout << (x && y) << endl;  // 0
cout << (x || y) << endl;  // 1
cout << (!x) << endl;      // 0
```

---

## **4. Bitwise Operators**

Operate on individual bits of integers.

& → Bitwise AND

| → Bitwise OR

^ → Bitwise XOR

~ → Bitwise NOT (complement)

<< → Left shift

>> → Right shift

**Example**:

```
int a = 5;  // 0101
int b = 3;  // 0011
cout << (a & b) << endl;  // 1
cout << (a | b) << endl;  // 7
cout << (a ^ b) << endl;  // 6
cout << (~a) << endl;     // -6
cout << (a << 1) << endl; // 10
cout << (a >> 1) << endl; // 2
```

---

## **5. Assignment Operators**

Used to assign values to variables.

= → Simple assignment

+= → Add and assign

-= → Subtract and assign

*= → Multiply and assign

/= → Divide and assign

%= → Modulus and assign

**Example**:

```
int a = 10;
a += 5;  // a = a + 5 → 15
a *= 2;  // a = a * 2 → 30
cout << a << endl;
```

---

## **6. Conditional (Ternary) Operator**

**Syntax**: condition ? expression1 : expression2

Returns expression1 if condition is true, otherwise expression2

**Example**:

```
int a = 10, b = 20;
int max = (a > b) ? a : b;
cout << "Maximum: " << max << endl;  // 20
```

---

## **7. Miscellaneous Operators**

Comma , → Separates multiple expressions

sizeof() → Returns size of data type or variable

Pointer operators * and & → Used with pointers

Type cast operators → Convert one type to another (int), (float)

**Example**:

```
int a = 5, b = 10;
int c = (a++, b++);  // comma operator, c = b++
cout << c << endl;   // 10
cout << sizeof(a) << endl; // size of int
```

---

## **8. Summary (LearnCodeX)**

Arithmetic operators: +, -, *, /, %, ++, --

Relational operators: ==, !=, >, <, >=, <=

Logical operators: &&, ||, !

Bitwise operators: &, |, ^, ~, <<, >>

Assignment operators: =, +=, -=, *=, /=, %=

Conditional operator: ? :

Miscellaneous: comma, sizeof, pointer operators, type casting

Operators are the building blocks of all C++ programs, enabling calculations, comparisons, logical operations, and memory manipulation.