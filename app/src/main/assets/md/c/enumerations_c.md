# **📋 Enumerations in C**

---

## **🔍 What is an Enumeration (`enum`)?**

An **enumeration** in C is a user-defined data type consisting of a set of named integer constants. It helps make your code more readable by giving names to sets of related values.

---

## **⚙️ Syntax of `enum`**
<br>

```c
enum EnumName {
    CONSTANT1,
    CONSTANT2,
    CONSTANT3,
    // ...
};
```

By default, the first constant is assigned the value 0, the second 1, and so on.

📝 **Example**: 
Basic Enumeration

```
#include <stdio.h>

enum Day {
Sunday,
Monday,
Tuesday,
Wednesday,
Thursday,
Friday,
Saturday
};

int main() {
enum Day today;
today = Wednesday;

    printf("Value of Wednesday is %d\n", today);
    return 0;
}
```

<br>

**Output**:

Value of Wednesday is 3

<br>

## **⚙️ Assigning Custom Values**

You can assign specific integer values to enumeration constants:

```
enum Status {
SUCCESS = 1,
FAILURE = 0,
PENDING = 2
};
```


## ✅ **_Why Use Enumerations?_**

* Improves code readability by using descriptive names instead of numbers

* Helps group related constants

* Easier to maintain and understand

## 🧪 **Practice Challenge**

* Create an enum called TrafficLight with values RED, YELLOW, and GREEN.

* Write a program that assigns a value to a variable of type TrafficLight and prints its integer value.