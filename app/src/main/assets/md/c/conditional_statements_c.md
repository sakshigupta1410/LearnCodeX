# **Conditional Statements in C**
<br>

Conditional statements are used to **perform different actions based on different conditions**.  
They allow a program to **make decisions**.

---

## **1. if Statement**
<br>

The simplest form of decision-making. Executes a block of code **if the condition is true**.

**Syntax:**
```c
if (condition) {
    // code to execute if condition is true
}
```

**Example**:

```
#include <stdio.h>

int main() {
    int age = 20;

    if (age >= 18) {
        printf("You are an adult.\n");
    }

    return 0;
}
```
Output:
**You are an adult.**

---

## **2. if-else Statement**
<br>


Provides an alternative block of code if the condition is false.

**Syntax**:

```
if (condition) {
    // code if true
} else {
    // code if false
}
```

**Example**:

```
int marks = 75;

if (marks >= 50) {
    printf("You passed the exam.\n");
} else {
    printf("You failed the exam.\n");
}
```

Output:
**You passed the exam.**

---

## **3. if-else if-else Statement**
<br>

Used when multiple conditions need to be checked sequentially.

**Syntax**:

```
if (condition1) {
    // code if condition1 is true
} else if (condition2) {
    // code if condition2 is true
} else {
    // code if all conditions are false
}
```

**Example**:

```
int marks = 85;

if (marks >= 90) {
    printf("Grade: A\n");
} else if (marks >= 75) {
    printf("Grade: B\n");
} else if (marks >= 50) {
    printf("Grade: C\n");
} else {
    printf("Grade: F\n");
}
```

**Output**:
**Grade: B**

---

## **4. Nested if Statement**
<br>

You can use an if or if-else inside another if or if-else to check more complex conditions.

**Example**:

```
int age = 20;
int hasID = 1; // 1 = yes, 0 = no

if (age >= 18) {
    if (hasID) {
        printf("Entry allowed.\n");
    } else {
        printf("ID required.\n");
    }
} else {
    printf("Entry denied.\n");
}
```
Output:
**Entry allowed.**

---

## **5. switch Statement**
<br>


Used to execute one block of code among many options. Works well with integer or character values.

**Syntax**:

```
switch(expression) {
    case value1:
        // code
        break;
    case value2:
        // code
        break;
    ...
    default:
        // code if no case matches
}
```

**Example**:

```
char grade = 'B';

switch(grade) {
    case 'A':
        printf("Excellent\n");
        break;
    case 'B':
        printf("Good\n");
        break;
    case 'C':
        printf("Average\n");
        break;
    default:
        printf("Invalid grade\n");
}
```

Output:
**Good**

**Notes**:

break prevents fall-through to the next case.

default executes if no case matches.

---

## **6. Ternary Operator (?:)**

A short-hand for if-else. Returns a value based on a condition.

**Syntax**:

```
variable = (condition) ? value_if_true : value_if_false;
```

**Example**:

```
int num = 10;
char* result;

result = (num % 2 == 0) ? "Even" : "Odd";
printf("%s\n", result);
```

Output:
**Even**

**Notes**:

Can be nested, but readability may decrease.

Ideal for simple conditions.

---

## **7. Summary**

**if** → Executes code if condition is true

**if-else** → Executes one block if true, another if false

**if-else if-else** → Handles multiple sequential conditions

**Nested if** → Check complex, multi-level conditions

switch → Handles multiple options cleanly

**Ternary ?:** → Short-hand for simple if-else expressions

Conditional statements are fundamental for controlling program flow and making decisions in C programs.