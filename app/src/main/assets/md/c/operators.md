# **Operators in C**

Operators are **special symbols** used to perform operations on **variables and values**.  
C supports many operators: arithmetic, relational, logical, bitwise, assignment, and miscellaneous.

---

## **1. Arithmetic Operators**

Used to perform **mathematical operations**:

| Operator | Name         | Example       |
|----------|--------------|---------------|
| `+`      | Addition     | `a + b`       |
| `-`      | Subtraction  | `a - b`       |
| `*`      | Multiplication | `a * b`     |
| `/`      | Division     | `a / b`       |
| `%`      | Modulus (remainder) | `a % b` |
| `++`     | Increment    | `a++` or `++a`|
| `--`     | Decrement    | `a--` or `--a`|


**Example:**
```c
#include <stdio.h>

int main() {
    int a = 10, b = 3;

    printf("a + b = %d\n", a + b);
    printf("a - b = %d\n", a - b);
    printf("a * b = %d\n", a * b);
    printf("a / b = %d\n", a / b);
    printf("a %% b = %d\n", a % b);

    a++;
    printf("After increment, a = %d\n", a);

    b--;
    printf("After decrement, b = %d\n", b);

    return 0;
}
```
<br>

## **2. Relational Operators**

Used to compare two values, returns 1 (true) or 0 (false):

| Operator | Meaning                   | Example     |
|----------|---------------------------|-------------|
| `==`     | Equal to                  | `a == b`    |
| `!=`     | Not equal to              | `a != b`    |
| `>`      | Greater than              | `a > b`     |
| `<`      | Less than                 | `a < b`     |
| `>=`     | Greater than or equal to  | `a >= b`    |
| `<=`     | Less than or equal to     | `a <= b`    |


**Example**:

```
int a = 5, b = 10;
printf("a == b: %d\n", a == b);  
// 0 (false)
printf("a != b: %d\n", a != b);  
// 1 (true)
```

<br>

## **3. Logical Operators**

Used to combine multiple conditions:

**&&** : Logical AND → (a > 0 && b > 0)

**||** : Logical OR → (a > 0 || b < 0)

**!** : Logical NOT → !(a > b)

**Example**:

```
int a = 5, b = 10;
printf("%d\n", a > 0 && b > 0); // 1
printf("%d\n", a > 0 || b < 0); // 1
printf("%d\n", !(a > b));       // 1
```
<br>

## **4. Assignment Operators**<br>

Used to assign values to variables:

| Operator | Meaning              | Example    |
|----------|----------------------|------------|
| `=`      | Assign               | `a = 5`    |
| `+=`     | Add and assign       | `a += 3`   |
| `-=`     | Subtract and assign  | `a -= 2`   |
| `*=`     | Multiply and assign  | `a *= 4`   |
| `/=`     | Divide and assign    | `a /= 2`   |
| `%=`     | Modulus and assign   | `a %= 3`   |


**Example**:

```
int a = 10;
a += 5;  // a = 15
a *= 2;  // a = 30
a %= 7;  // a = 2
```
<br>

## **5. Bitwise Operators**<br>

Used to perform operations on individual bits:

| Operator | Name          | Example   |
|----------|---------------|-----------|
| `&`      | Bitwise AND   | `a & b`   |
| `\|`     | Bitwise OR    | `a \| b`  |
| `^`      | Bitwise XOR   | `a ^ b`   |
| `~`      | Bitwise NOT   | `~a`      |
| `<<`     | Left shift    | `a << 1`  |


**Example**:

```
int a = 5;  // 0101 in binary
int b = 3;  // 0011 in binary
printf("%d\n", a & b);  // 1
printf("%d\n", a | b);  // 7
printf("%d\n", a ^ b);  // 6
printf("%d\n", ~a);     // -6
printf("%d\n", a << 1); // 10
printf("%d\n", a >> 1); // 2
```

<br>

## 6. Miscellaneous Operators<br>

| Operator     | Name/Description                     | Example                      |
|--------------|--------------------------------------|------------------------------|
| `sizeof`     | Returns the size of a variable or data type | `sizeof(int)`          |
| `,`          | Comma operator (evaluates expressions left to right) | `a = (b = 3, b + 2)` |
| `? :`        | Ternary conditional operator         | `(a > b) ? a : b`            |
| `&`          | Address-of operator                  | `&a`                         |
| `*`          | Pointer dereference                  | `*ptr`                       |


**Example:**

```
int a = 10, b;
b = (a > 5) ? 100 : 50;
printf("b = %d\n", b);
printf("Size of a = %lu bytes\n", sizeof(a));
```
<br>

## **7. Operator Precedence**<br>

Determines order of evaluation:

| Operators           | Category           |
|---------------------|--------------------|
| `()`                | Parentheses        |
| `++`, `--`          | Unary operators    |
| `*`, `/`, `%`       | Multiplicative     |
| `+`, `-`            | Additive           |
| `<`, `<=`, `>`, `>=`| Relational         |
| `==`, `!=`          | Equality           |
| `&&`                | Logical AND        |
| `||`                | Logical OR         |
| `=`                 | Assignment         |


**Example**:

```
int a = 5, b = 10, c;
c = a + b * 2; // Multiplication happens first
printf("%d\n", c); // 25
```
<br>

## **8. Summary**

**Arithmetic Operators**: + - * / % ++ --

**Relational Operators**: == != < > <= >=

**Logical Operators**: && || !

**Assignment Operators**: = += -= *= /= %=

**Bitwise Operators**: & | ^ ~ << >>

**Miscellaneous Operators**: sizeof, ,, ?:, &, *

Operator Precedence affects how expressions are evaluated.

Mastery of operators is essential for building C programs, from basic calculations to complex expressions.

---