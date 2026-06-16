# **Data Types and Variables in C**

C is a **statically typed language**, which means the **data type of a variable must be declared before using it**.  
Variables store data in memory, and each variable has a **specific data type**.

---

## **1. Basic Data Types**

| Data Type | Description                         | Size (typical) | Example       |
|-----------|-------------------------------------|----------------|--------------|
| `int`     | Integer numbers                     | 2–4 bytes      | int age = 21;|
| `float`   | Floating-point numbers (decimal)    | 4 bytes        | float price = 3.14;|
| `double`  | Double-precision floating-point     | 8 bytes        | double pi = 3.14159;|
| `char`    | Single character                    | 1 byte         | char grade = 'A';|

---

## **2. Variable Declaration**

Variables must be declared **before use**.

```c
int age;
float height;
char grade;
```

Variables can also be initialized during declaration:

```
int age = 21;
float height = 5.5;
char grade = 'L';
```

---

## **3. Constants**

Constants are fixed values that cannot change during program execution.

**Using const**

```
const int DAYS_IN_WEEK = 7;
```
<br>

**Using #define Preprocessor**

```
#define PI 3.14159
```

---

## **4. Modifiers**

C provides type modifiers to change the size and range of basic types:

**short** → Smaller integer

**long** → Larger integer

**signed** → Can store negative values (default)

**unsigned** → Only positive values

**Example**:

```
unsigned int age = 21;
long int distance = 1000000;
short int smallNumber = 10;
```

---

## **5. Rules for Variable Names**

Must start with a letter or underscore **_**

Can contain **_letters_**, _digits_, and **_underscores_**

**Case-sensitive:** age and Age are different

Cannot use keywords as variable names

**Valid Examples:**

```
int age;
float _height;
char grade1;
```
<br>

**Invalid Examples:**

```
int 1age;    // starts with a number
float float; // keyword
```

---

## **6. Summary**

* Variables are named storage locations in memory

* **C** is statically typed, so the data type must be declared
 
* Basic data types: **int, float, double, char**
 
* Constants: Use **const** or **#define**
 
* Modifiers: **short, long, signed, unsigned**
 
* **Naming rules:** letters/underscore, case-sensitive, no keywords
 
* Understanding variables and data types is fundamental for writing efficient and error-free C programs.