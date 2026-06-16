
---
# **Java Data Types**

**Example**

```
int myNum = 5;               
float myFloatNum = 5.99f;    
char myLetter = 'D';         
boolean myBool = true;       
String myText = "Hello";     
```

Data types are divided into two groups:

* **`Primitive data types`** - includes byte, short, int, long, float, double, boolean and char
* **`Non-primitive data types`** - such as String, Arrays and Classes (you will learn more about these in a later chapter)
* **`Primitive Data Types`** - A primitive data type specifies the type of a variable and the kind of values it can hold.

There are eight primitive data types in Java:

| Data Type | Description |
|-----------|-------------|
| **byte**    | Stores whole numbers from _-128 to 127_ |
| **short**   | Stores whole numbers from _-32,768 to 32,767_ |
| **int**     | Stores whole numbers from _-2,147,483,648 to 2,147,483,647_ |
| **long**    | Stores whole numbers from _-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807_ |
| **float**   | Stores fractional numbers. Sufficient for storing _6 to 7_ decimal digits |
| **double**  | Stores fractional numbers. Sufficient for storing _15 to 16_ decimal digits |
| **boolean** | Stores _true or false_ values |
| **char**    | Stores a _single character/letter_ or ASCII values |


---
## **Java Numbers**


Primitive number types are divided into **two** groups:

### **Integer types**
* Stores **whole numbers**, **positive** or **negative** (such as 123 or -456), without decimals. 
* Valid types are **byte**, **short**, **int** and **long**. 
* Which type you should use, depends on the **numeric** value.

### **Floating point types** 
- represents numbers with a **fractional** part, containing one or more decimals. 
- There are two types: **float** and **double**.

Even though there are many numeric types in Java, the most used for numbers are **int** (for whole numbers) and **double** (for floating point numbers). 
However, we will describe them all as you continue to read.

## **Integer Types**

Now, we will understand the differrent types of integers.

### **Byte**

The byte data type can store whole numbers from **-128 to 127**. This can be used instead of int or other integer types to save memory when you are certain that the value will be within -128 and 127:

**Example**
```
byte myNum = 100;
System.out.println(myNum);
```

---
### **Short**

The **short** data type can store whole numbers from `-32768 to 32767`

**Example**
```
short myNum = 5000;
System.out.println(myNum);
```

---
### **Int**

The **int** data type can store whole numbers from `-2147483648 to 2147483647`. 
In general, and in our tutorial, the int data type is the preferred data type when we create variables with a numeric value.

**Example**
```
int myNum = 100000;
System.out.println(myNum);
```

---
### **Long**

The **long** data type can store whole numbers from `-9223372036854775808 to 9223372036854775807`. This is used when int is not large enough to store the value. Note that you should end the value with an "L":

**Example**
```
long myNum = 15000000000L;
System.out.println(myNum);
```

---
### **Floating Point Types**

You should use a floating point type whenever you need a number with a decimal, such as `9.99 or 3.14515.`

The float and double data types can store **fractional** numbers. 
Note that you should end the value with an "**f**" for floats and "**d**" for doubles:

### **Float Example**
<br>

```
float myNum = 5.75f;
System.out.println(myNum);
```

### **Double Example**
<br>

```
double myNum = 19.99d;
System.out.println(myNum);
```

---
_**Use float or double?**_

The precision of a floating point value indicates how many digits the value can have after the decimal point. The precision of float is only six or seven decimal digits, while double variables have a precision of about 16 digits. Therefore it is safer to use double for most calculations.

### **Scientific Numbers**

A floating point number can also be a scientific number with an "**e**" to indicate the power of 10:

**Example**

```
float f1 = 35e3f;
double d1 = 12E4d;
System.out.println(f1);
System.out.println(d1);
```


---

### **Boolean Types**

Very often in programming, you will need a data type that can only have one of **two** values, like:

* YES / NO
* ON / OFF
* TRUE / FALSE_

For this, Java has a boolean data type, which can only take the values true or false:

**Example**

```
boolean isJavaFun = true;
boolean isFishTasty = false;
System.out.println(isJavaFun);     // Outputs true
System.out.println(isFishTasty);   // Outputs false
```



### **Characters**

The **char** data type is used to store a **single** character. 
The character must be surrounded by single quotes, like 'A' or 'c':

**Example**

```
char myGrade = 'B';
System.out.println(myGrade);
```

Alternatively, if you are familiar with ASCII values, you can use those to display certain characters:

**Example**

```
char myVar1 = 65, myVar2 = 66, myVar3 = 67;
System.out.println(myVar1);
System.out.println(myVar2);
System.out.println(myVar3);
```


**Tip**: A list of all **ASCII** values can be found in our ASCII Table Reference.

### **Strings**

The **String** data type is used to store a sequence of characters (text). 
String values must be surrounded by **double** quotes:

**Example**

```
String greeting = "Hello World";
System.out.println(greeting);
```

---
## **Real-Life Example**

Here's a real-life example of using different data types, to calculate and output the total cost of a number of items:

**Example**

```
// Create variables of different data types
int items = 50;
float costPerItem = 9.99f;
float totalCost = items * costPerItem;
char currency = '$';

// Print variables
System.out.println("Number of items: " + items);
System.out.println("Cost per item: " + costPerItem + currency);
System.out.println("Total cost = " + totalCost + currency);
```

---
## **Non-Primitive Data Types**

Non-primitive data types are called **reference types** because they refer to _objects_.

The main differences between primitive and non-primitive data types are:

* Primitive types in Java are _predefined_ and built into the language, while non-primitive types are _created_ by the programmer (except for String).
* Non-primitive types can be used to _call_ methods to perform certain operations, whereas primitive types _cannot_.
* Primitive types start with a _lowercase_ letter (like int), while non-primitive types typically starts with an _uppercase_ letter (like String).
* Primitive types always _hold_ a value, whereas non-primitive types can be _null_.
Examples of non-primitive types are **Strings**, **Arrays**, **Classes** etc. You will learn more about these in a later chapter.


---
# **Java Variables**

Variables are containers for **storing** data values.

In Java, there are different types of variables, for example:

**String** - stores text, such as "Hello". String values are surrounded by double quotes

**int** - stores integers (whole numbers), without decimals, such as 123 or -123

**float** - stores floating point numbers, with decimals, such as 19.99 or -19.99

**char** - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes

**boolean** - stores values with two states: true or false


## **Declaring Variables**

To create a variable in Java, you need to:

* Choose a type (like int or String)
* Give the variable a name (like x, age, or name)
* Optionally assign it a value using =
Here's the basic syntax:

**Syntax**
```
type variableName = value;
```


For example, if you want to store some text, you can use a String:

**Example**
Create a variable called **name** of type String and assign it the value **_"John"_**.
Then we use **println()** to print the name variable:

```
String name = "John";
System.out.println(name);
```

To create a variable that should store a number, you can use int:


**Example**
Create a variable called **myNum** of type int and assign it the value 15:


```
int myNum = 15;
System.out.println(myNum);
```


You can also declare a variable without assigning the value, and assign the value later:

**Example**

```
int myNum;
myNum = 15;
System.out.println(myNum);
```

Note that if you assign a new value to an existing variable, it will overwrite the previous value:

**Example**
Change the value of myNum from _15 to 20_:

```
int myNum = 15;
myNum = 20;  // myNum is now 20
System.out.println(myNum);
```


---
## **Final Variables**

If you don't want others (or yourself) to overwrite existing values, use the final keyword (this will declare the variable as "final" or "constant", which means unchangeable and read-only):

**Example**

```
final int myNum = 15;
myNum = 20;  // will generate an error: cannot assign a value to a final variable
```

**Other Types**
A demonstration of how to declare variables of other types:

**Example**

```
int myNum = 5;
float myFloatNum = 5.99f;
char myLetter = 'D';
boolean myBool = true;
String myText = "Hello";
```


---


### **Display Variables**

The **println()** method is often used to _display variables_.

To combine both text and a variable, use the + character:

**Example**

```
String name = "John";
System.out.println("Hello " + name);
```


You can also use the **+** character to add a variable to another variable:

**Example**

```
String firstName = "John ";
String lastName = "Doe";
String fullName = firstName + lastName;
System.out.println(fullName);
```


For numeric values, the **+** character works as a mathematical operator (notice that we use int (integer) variables here):

**Example**

```
int x = 5;
int y = 6;
System.out.println(x + y); // Print the value of x + y
```

From the example above, you can expect:

**x** stores the value 5
**y** stores the value 6
Then we use the **println()** method to display the value of **x + y**, which is **11**



### Declare Many Variables

To declare more than one variable of the same type, you can use a **comma-separated** list:

**Example**
Instead of writing:

```
int x = 5;
int y = 6;
int z = 50;
System.out.println(x + y + z);
```


You can simply write:

```
int x = 5, y = 6, z = 50;
System.out.println(x + y + z);
```


### **One Value to Multiple Variables**


You can also assign the same value to multiple variables in one line:

**Example**

```
int x, y, z;
x = y = z = 50;
System.out.println(x + y + z);
```


---

## **Identifiers**

All Java variables must be identified with unique names.

These unique names are called `identifiers`.

`Identifiers` can be short names (like x and y) or more descriptive names (age, sum, totalVolume).

**Note**: It is recommended to use descriptive names in order to create understandable and maintainable code:

**Example**

```
// Good
int minutesPerHour = 60;

// OK, but not so easy to understand what m actually is
int m = 60;
```


The general rules for naming variables are:

* Names can contain **letters**, **digits**, **underscores**, and **dollar** signs
* Names must begin with a _letter_
* Names should start with a **lowercase** letter, and **cannot** contain whitespace
* Names can also begin with **$** and **_**
* Names are **case-sensitive** ("**myVar**" and "**myvar**" are different variables)
* Reserved words (like Java keywords, such as int or boolean) _cannot_ be used as names

## **Constants (final)**

When you do not want a variable's value to change, use the _**final**_ keyword.

A variable declared with final becomes a constant, which means unchangeable and read-only:

**Example**

```
final int myNum = 15;
myNum = 20;  // Error: cannot assign a value to final variable 'myNum'
```


_**When to Use final?**_
You should declare variables as final when their values should never change. For example, the number of minutes in an hour will always be 60, and your birth year will never change:

**Example**

```
final int MINUTES_PER_HOUR = 60;
final int BIRTHYEAR = 1980;
```