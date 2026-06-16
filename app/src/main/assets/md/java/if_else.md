
---
# **Conditions and If Statements**

* Conditions and if statements let you control the flow of your program - deciding which code runs, and which code is skipped.
 
* **Think of it like real life:** If it rains, take an umbrella. Otherwise, do nothing.
 
* Every if statement needs a condition that results in true or false.
 
* This means if statements work hand-in-hand with boolean values:

**Example**

```
boolean isRaining = true;

if (isRaining) {
System.out.println("Bring an umbrella!");
}
```

Most often, conditions are created using **comparison operators**, like the ones below:

* Less than: **a < b**
* Less than or equal to: **a <= b**
* Greater than: **a > b**
* Greater than or equal to: **a >= b**
* Equal to: **a == b**
* Not equal to: **a != b**

You can use these conditions to perform different actions for different decisions.

Java has the following conditional statements:

* Use **if** to specify a block of code to be executed, if a specified condition is true
* Use **else** to specify a block of code to be executed, if the same condition is false
* Use **else if** to specify a new condition to test, if the first condition is false
* Use **switch** to specify many alternative blocks of code to be executed

---

## **The if Statement**

Use the if statement to specify a block of Java _code to be executed if a condition is true_.

**Syntax**

```
if (condition) {
// block of code to be executed if the condition is true
}
```


The condition inside the if statement must result in a boolean value - it can be either a boolean expression (like x > y) or a boolean variable (like isLightOn).

Also note that if is in _lowercase_ letters. Uppercase letters (If or IF) will generate an error.

In the example below, we test two values to find out if 20 is greater than 18. If the condition is true, print some text:

**Example**

```
if (20 > 18) {
System.out.println("20 is greater than 18");
}
```

We can also test variables:

**Example**

```
int x = 20;
int y = 18;
if (x > y) {
System.out.println("x is greater than y");
}
```

**Example explained**

In the example above we use two variables, **x** and **y**, to test whether x is greater than y (using the > operator). As x is 20, and y is 18, and we know that 20 is greater than 18, we print to the screen that "x is greater than y".

Comparison is also often used to check if two values are equal, using the **==** operator:

**Example**

```
int x = 20;
int y = 20;
if (x == y) {
System.out.println("x is equal to y");
}
```

Here the condition **x == y** is true, because both x and y are 20, so the message "**x is equal to y**" is printed.

---

## **Using Boolean Variables**

You can also test boolean variables directly in an if statement:

**Example**

```
boolean isLightOn = true;

if (isLightOn) {
System.out.println("The light is on.");
}
```


**Note**: Writing if (isLightOn) is the same as writing if (isLightOn == true), but shorter and easier to read.

Here is the same example with the value false to see that the program continues even when the code block does not run:

**Example**


```
boolean isLightOn = false;

if (isLightOn) {
System.out.println("The light is on.");  // This will not be printed
}

System.out.println("This line always runs.");
```

---

## **The else Statement**

The else statement lets you run a block of code when the **condition** in the if statement is **false**.

**Syntax**

```
if (condition) {
// block of code to be executed if the condition is true
} else {
// block of code to be executed if the condition is false
}
```

Think of it like real life: If it rains, bring an umbrella. Otherwise (else), go outside without one:

**Example**

```
boolean isRaining = false;

if (isRaining) {
System.out.println("Bring an umbrella!");
} else {
System.out.println("No rain today, no need for an umbrella!");
}
```

Since _isRaining is false_, the condition inside the if statement is not met. 
That means the if block is skipped, and the else block runs instead, printing "**No rain today, no need for an umbrella!**".

**Another Example**

```
int time = 20;

if (time < 18) {
System.out.println("Good day.");
} else {
System.out.println("Good evening.");
}
// Outputs "Good evening."
```


**Example explained**

In the example above, time (20) is greater than 18, so the condition is false. Because of this, we move on to the else condition and print to the screen "**Good evening**". If the time was less than 18, the program would print "**Good day**".

**Notes:**
* **else** does not have a condition - it runs when the if condition is false.

* Do not put a **semicolon** right after if (condition). That would end the statement early and make else behave unexpectedly.

---

## **The else if Statement**

Use the **else if statement** to specify a new condition if the first condition is false.

**Syntax**

```
if (condition1) {
// block of code to be executed if condition1 is true
} else if (condition2) {
// block of code to be executed if the condition1 is false and condition2 is true
} else {
// block of code to be executed if the condition1 is false and condition2 is false
}
```

Think of it like real life: If it rains, bring an umbrella. Else if it's sunny, wear sunglasses. Else, just go outside normally.

**Example**

```
int weather = 2; // 1 = raining, 2 = sunny, 3 = cloudy

if (weather == 1) {
System.out.println("Bring an umbrella.");
} else if (weather == 2) {
System.out.println("Wear sunglasses.");
} else {
System.out.println("Just go outside normally.");
}
// Outputs "Wear sunglasses."
```


Since weather is 2, the first condition (weather == 1) is not met, so the if block is skipped. The program then checks the else if condition (weather == 2), which is true. That means the else if block runs and prints "Wear sunglasses.".

**Another Example**

```
int time = 22;
if (time < 10) {
System.out.println("Good morning.");
} else if (time < 18) {
System.out.println("Good day.");
} else {
System.out.println("Good evening.");
}
// Outputs "Good evening."
```

**Example explained**
In the example above, time (22) is greater than 10, so the _first condition is false_. 

The next condition, in the **else if** statement, is also false, so we move on to the else condition since condition1 and condition2 is both false - and print to the screen "Good evening".

However, if the time was 14, our program would print "**Good day.**":

**Example**

```
int time = 14;
if (time < 10) {
System.out.println("Good morning.");
} else if (time < 18) {
System.out.println("Good day.");
} else {
System.out.println("Good evening.");
}
// Outputs "Good day." 
```

---

## **Short Hand if...else**

There is also a **short-hand** if else, which is known as the **`ternary`** operator because it consists of **three** operands.

It can be used to **replace** multiple lines of code with a single line, and is most often used to replace simple if else statements:

**Syntax**

```
variable = (condition) ? expressionTrue :  expressionFalse;
Instead of writing:
```


**Example**

```
int time = 20;
if (time < 18) {
System.out.println("Good day.");
} else {
System.out.println("Good evening.");
}
```

You can simply write:

**Example**

```
int time = 20;
String result = (time < 18) ? "Good day." : "Good evening.";
System.out.println(result);
```

---

## **Real-Life Examples**

This example shows how you can use **if..else** to "`open a door`" if the user enters the correct code:

**Example**

```
int doorCode = 1337;

if (doorCode == 1337) {
System.out.println("Correct code. The door is now open.");
} else {
System.out.println("Wrong code. The door remains closed.");
}
```


This example shows how you can use **if..else** to find out if a number is _positive or negative_:

**Example**

```
int myNum = 10; // Is this a positive or negative number?

if (myNum > 0) {
System.out.println("The value is a positive number.");
} else if (myNum < 0) {
System.out.println("The value is a negative number.");
} else {
System.out.println("The value is 0.");
}
```

---

**Find out if a person is old enough to vote:**

**Example**

```
int myAge = 25;
int votingAge = 18;

if (myAge >= votingAge) {
System.out.println("Old enough to vote!");
} else {
System.out.println("Not old enough to vote.");
}
```

---

**Find out if a number is even or odd:**

**Example**

```
int myNum = 5;

if (myNum % 2 == 0) {
System.out.println(myNum + " is even");
} else {
System.out.println(myNum + " is odd");
}
```

---

**Check temperature:**

**Example**

```
int temperature = 30;

if (temperature < 0) {
System.out.println("It's freezing!");
} else if (temperature < 20) {
System.out.println("It's cool.");
} else {
System.out.println("It's warm.");
} 
```

---
