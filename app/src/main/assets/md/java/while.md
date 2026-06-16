
---

## **Loops**

Loops can execute a _block of code as long as a specified condition is reached_.

Loops are handy because they **save time**, **reduce errors**, and they make **code more readable**

## **Java While Loop**

The while loop **loops through a block of code** as long as a specified condition is **true**:

**Syntax**

```
while (condition) {
// code block to be executed
}
```

In the example below, the code in the loop will **run**, **_over and over again_**, as long as a variable (i) is less than 5:

**Example**

```
int i = 0;
while (i < 5) {
System.out.println(i);
i++;
}
```

**Note**: Do not forget to increase the variable used in the condition **(i++)**, otherwise the loop will never end!

Do you wonder why we used the letter i in the example above? It's a **counter variable** and a common choice in simple loops because it's short, traditional, and stands for '**_index_**' or '**_iterator_**'.

## **Countdown Example**

This example counts down from 3 to 1 and then displays "`Happy New Year!!`" at the end:

**Example**

```
int countdown = 3;

while (countdown > 0) {
System.out.println(countdown);
countdown--;
}

System.out.println("Happy New Year!!");
```
---

## **Java Do/While Loop**

The **do/while** loop is a variant of the while loop. This loop will execute the code block once, before checking if the condition is **true**. Then it will repeat the loop as long as the condition is **true**.

**Syntax**

```
do {
// code block to be executed
}
while (condition);
```

**Note**: The semicolon **;** after the while condition is required!

### **Do/While Example**

The example below uses a do/while loop. The loop will always be executed at least once, even if the condition is false, because the code block is executed before the condition is tested:

**Example**

```
int i = 0;
do {
System.out.println(i);
i++;
}
while (i < 5);
```

Do not forget to increase the variable used in the condition **(i++)**, otherwise the loop will never **_end_**!

Condition is False from the Start
In the example above, the condition **i < 5** was true at the beginning, so the loop executed multiple times. But what if the condition is false right from the start?

In the example below, the variable i starts at 10, so the condition **i < 5** is false immediately - yet the do/while loop still runs once:

**Example**

```
int i = 10;
do {
System.out.println("i is " + i);
i++;
} while (i < 5);
```
---

**Summary**: The do/while loop always runs at least once, even if the condition is **already false**. This is different from a regular while loop, which would skip the loop entirely if the condition is false at the start.

This behavior makes do/while useful when you want to ensure something happens at least once, like showing a message or asking for user input.

### **While Loop Real-Life Examples**

To demonstrate a practical example of the while loop, we have created a simple "**countdown**" program:

**Example**

```
int countdown = 3;

while (countdown > 0) {
System.out.println(countdown);
countdown--;
}

System.out.println("Happy New Year!!");
```

To demonstrate a practical example of the while loop combined with an if else statement, let's say we play a game of Yatzy:

**Example**

Print "Yatzy!" If the dice number is 6:

```
int dice = 1;

while (dice <= 6) {
if (dice < 6) {
System.out.println("No Yatzy.");
} else {
System.out.println("Yatzy!");
}
dice = dice + 1;
}
```

If the loop passes the values ranging from **1 to 5**, it prints "_**No Yatzy**_". Whenever it passes the value 6, it prints "Yatzy!".
