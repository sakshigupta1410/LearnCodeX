
---

# **Switch Statements**

Instead of writing many **if..else statements**, you can use the **_switch_** statement.

Think of it like ordering food in a restaurant: If you choose number 1, you get Pizza. If you choose 2, you get a Burger. If you choose 3, you get Pasta. Otherwise, you get nothing.

The **switch** statement selects one of many code blocks to be executed:

**Syntax**

```
switch(expression) {
case x:
// code block
break;
case y:
// code block
break;
default:
// code block
}
```
---
This is how it works:

1. The switch expression is evaluated once.
2. The result is compared with each case value.
3. If there is a match, the matching block of code runs.
4. The break statement stops the switch after the matching case has run.
5. The default statement runs if there is no match.
6. The example below uses the weekday number to calculate the weekday name:

**Example**

```
int day = 4;
switch (day) {
case 1:
System.out.println("Monday");
break;
case 2:
System.out.println("Tuesday");
break;
case 3:
System.out.println("Wednesday");
break;
case 4:
System.out.println("Thursday");
break;
case 5:
System.out.println("Friday");
break;
case 6:
System.out.println("Saturday");
break;
case 7:
System.out.println("Sunday");
break;
}
// Outputs "Thursday" (day 4)
```

### **The break Keyword**

When Java reaches a **break** keyword, it breaks out of the _switch_ block.

This will **stop the execution** of more code and case testing inside the block.

When a match is found, and the job is done, it's time for a break. There is no need for more testing.

A break can save a lot of execution time because it "**ignores**" the execution of all the rest of the code in the switch block.

---

### **The default Keyword**

The default keyword specifies some code to run **if there is no case match**:

**Example**

```
int day = 4;
switch (day) {
case 6:
System.out.println("Today is Saturday");
break;
case 7:
System.out.println("Today is Sunday");
break;
default:
System.out.println("Looking forward to the Weekend");
}
// Outputs "Looking forward to the Weekend"
```
<br>


Note that if the default statement is used as the last statement in a switch block, it does not need a _break_.