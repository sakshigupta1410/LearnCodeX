# **Loops in C**

Loops are used to **execute a block of code repeatedly** as long as a condition is true.  
They help **avoid code repetition** and make programs more efficient.

---

## **1. while Loop**

The `while` loop executes a block of code **as long as the condition is true**.  
The condition is checked **before** each iteration (pre-test loop).

**Syntax:**
```c
while (condition) {
    // code to execute repeatedly
}
```

**Example**:

```
#include <stdio.h>

int main() {
    int i = 1;

    while (i <= 5) {
        printf("%d\n", i);
        i++;  // increment to avoid infinite loop
    }

    return 0;
}
```
Output:
**1
2
3
4
5**

**Notes**:

If the condition is initially false, the loop never executes.

Make sure to update variables inside the loop to avoid infinite loops.

<br>

## **2. do-while Loop**

The **do-while** loop executes the block at least once and then checks the condition (post-test loop).

**Syntax**:

```
do {
    // code to execute
} while (condition);
```

**Example**:

```
#include <stdio.h>

int main() {
    int i = 1;

    do {
        printf("%d\n", i);
        i++;
    } while (i <= 5);

    return 0;
}
```

Output:
**1
2
3
4
5**

**Notes**:

Executes at least once even if the condition is false initially.

## **3. for Loop**

The **for loop** is used when the number of iterations is known.
It has initialization, condition, and increment/decrement in a single line.

**Syntax**:

```
for (initialization; condition; increment/decrement) {
    // code to execute repeatedly
}
```

**Example**:

```
#include <stdio.h>

int main() {
    int i;

    for (i = 1; i <= 5; i++) {
        printf("%d\n", i);
    }

    return 0;
}
```

Output:
**1
2
3
4
5**

**Notes**:

All three parts of the loop are optional, but **semicolons** are required.

Ideal for count-controlled loops.

<br>

## **4. Nested Loops**

A loop inside another loop is called a nested loop. Useful for multi-dimensional problems like matrices.

**Example (Printing a pattern):**

```
#include <stdio.h>

int main() {
    int i, j;

    for (i = 1; i <= 3; i++) {
        for (j = 1; j <= 3; j++) {
            printf("%d ", j);
        }
        printf("\n");
    }

    return 0;
}
```

Output:
**1 2 3
1 2 3
1 2 3**


## **5. Break Statement**

The break statement **exits** the loop immediately, even if the condition is still true.

**Example**:

```
#include <stdio.h>

int main() {
    int i;

    for (i = 1; i <= 10; i++) {
        if (i == 5) {
            break;  // exit loop
        }
        printf("%d\n", i);
    }

    return 0;
}
```
Output:
**1
2
3
4**

---

## **6. Continue Statement**

The continue statement skips the rest of the current iteration and jumps to the next iteration of the loop.

**Example**:

```
#include <stdio.h>

int main() {
    int i;

    for (i = 1; i <= 5; i++) {
        if (i == 3) {
            continue;  // skip printing 3
        }
        printf("%d\n", i);
    }

    return 0;
}
```

Output:
**1
2
4
5**

---

## **7. Infinite Loop**

A loop with a condition that never becomes false is called an infinite loop.
Useful in programs that need continuous execution like servers.

**Example using for loop:**

```
for (;;) {
    // infinite loop
}
```
<br>

**Example using while loop:**

```
while (1) {
    // infinite loop
}
```

**Notes**:

Always ensure there is a break condition inside infinite loops when needed.

---

## **8. Summary (LearnCodeX)**

* **while loop**: Pre-test, executes while condition is true

* **do-while loop**: Post-test, executes at least once

* **for loop**: Count-controlled, compact syntax

* **Nested loops:** Loops inside loops for multidimensional problems

* **break**: Exit loop immediately

* **continue**: Skip current iteration

* **Infinite loop**: Loops with no termination condition

* Loops are essential for _**automation**_, _repetition_, and **_efficient_** programming in C.

---