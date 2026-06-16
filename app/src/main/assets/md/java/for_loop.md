
---
# **Java For Loop**

When you know exactly how many times you want to loop through a block of code, use the **for loop** instead of a while loop:

**Syntax**

```
for (statement 1; statement 2; statement 3) {
    // code block to be executed
}
```


* **Statement 1** is executed _(one time)_ before the execution of the code block.

* **Statement 2** _defines the condition_ for executing the code block.

* **Statement 3** is executed _(every time)_ after the code block has been executed.

---

## **Print Numbers**

The example below will print the numbers 0 to 4:

```
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}
```

**Example Explained**
1. Statement 1 sets a variable before the loop starts: **int i = 0**

2. Statement 2 defines the condition for the loop to run: **i < 5**. If true, the loop runs again; if false, it ends.

3. Statement 3 increases a value each time the code block has run: **i++**

---

### **Print Even Numbers**


This example prints even values between **0 and 10**:

```
for (int i = 0; i <= 10; i = i + 2) {
    System.out.println(i);
}
```

This example calculates the sum of numbers from 1 to 5:

```
int sum = 0;
for (int i = 1; i <= 5; i++) {
    sum = sum + i;
}
System.out.println("Sum is " + sum);
```

This example prints a countdown from 5 to 1:

```
for (int i = 5; i > 0; i--) {
    System.out.println(i);
}
```

---

## **Nested Loops**

It is possible to place a **loop inside another loop**. This is called a _**nested**_ loop.

The "**inner loop**" will be executed one time for each iteration of the "**outer loop**":

```
// Outer loop
for (int i = 1; i <= 2; i++) {
    System.out.println("Outer: " + i); // Executes 2 times

    // Inner loop
    for (int j = 1; j <= 3; j++) {
        System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
    }
}
```

---

## **Multiplication Table Example**

This example uses **nested** loops to print a simple multiplication table (1 to 3):

```
for (int i = 1; i <= 3; i++) {
    for (int j = 1; j <= 3; j++) {
        System.out.print(i * j + " ");
    }
    System.out.println();
}
Output:

Copy code
1 2 3
2 4 6
3 6 9

```


Nested loops are useful when working with **tables**, **matrices**, or **multi-dimensional data structures**.

---


## **The for-each Loop**

There is also a **for-each** loop, which is used exclusively to loop through elements in an array (or other data structures):

```
for (type variableName : arrayName) {
    // code block to be executed
}

```

The following example outputs all elements in the cars array, using a for-each loop:

```
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
for (String i : cars) {
    System.out.println(i);
}

```

---

## **Real-Life Examples**

**Count to 100 by tens**


```
for (int i = 0; i <= 100; i += 10) {
    System.out.println(i);
}

```
<br>

**Print even values between 0 and 10**

```
for (int i = 0; i <= 10; i = i + 2) {
    System.out.println(i);
}

```
<br>

**Multiplication Table for a specified number**

```
int number = 2;

// Print the multiplication table for the number 2
for (int i = 1; i <= 10; i++) {
    System.out.println(number + " x " + i + " = " + (number * i));
}

```

---
