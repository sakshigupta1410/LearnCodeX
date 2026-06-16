# **C++ Control Flow**

Control flow statements allow you to **control the execution order** of statements in a program.  
They are essential for **decision-making, repetition, and branching** in programs.

---

## **1. Conditional Statements**
<br>

### **1.1. if Statement**

Executes a block of code if a **condition is true**.

```cpp
#include <iostream>
using namespace std;

int main() {
    int num = 10;
    if (num > 0) {
        cout << "Positive number" << endl;
    }
    return 0;
}
```

### **1.2. if-else Statement**<br>

Executes one block if condition is true, another if false.

```
int num = -5;
if (num >= 0) {
    cout << "Non-negative" << endl;
} else {
    cout << "Negative" << endl;
}
```

### **1.3. if-else if-else Statement**<br>

Handles multiple conditions.

```
int marks = 85;
if (marks >= 90) {
    cout << "Grade A" << endl;
} else if (marks >= 75) {
    cout << "Grade B" << endl;
} else if (marks >= 50) {
    cout << "Grade C" << endl;
} else {
    cout << "Fail" << endl;
}
```

### **1.4. switch Statement**<br>

Used for multiple discrete values of a variable.

```
char grade = 'B';
switch(grade) {
    case 'A':
        cout << "Excellent" << endl;
        break;
    case 'B':
        cout << "Good" << endl;
        break;
    case 'C':
        cout << "Average" << endl;
        break;
    default:
        cout << "Invalid grade" << endl;
}
```

**Notes**:

break prevents fall-through

default executes if no case matches

---

## **2. Loops**

Loops execute a block of code repeatedly until a condition is met.

### **2.1. for Loop**

Repeats a block a known number of times.

```
for(int i = 1; i <= 5; i++) {
    cout << i << " ";
}
// Output: 1 2 3 4 5
```

**Syntax**:

```
for(initialization; condition; increment/decrement) {
    // statements
}
```

### **2.2. while Loop**

Repeats a block while a condition is true.

```
int i = 1;
while(i <= 5) {
    cout << i << " ";
    i++;
}
```

### **2.3. do-while Loop**

Executes block at least once, then checks the condition.

```
int i = 1;
do {
    cout << i << " ";
    i++;
} while(i <= 5);
```

### **2.4. Nested Loops**

Loops can be placed inside another loop.

```
for(int i = 1; i <= 3; i++) {
    for(int j = 1; j <= 3; j++) {
        cout << "(" << i << "," << j << ") ";
    }
    cout << endl;
}
```

### **2.5. Loop Control Statements**

**break** → Exits the loop immediately

```
for(int i = 1; i <= 5; i++) {
    if(i == 3) break;
    cout << i << " ";  // Output: 1 2
}
```

**continue** → Skips current iteration

```
for(int i = 1; i <= 5; i++) {
    if(i == 3) continue;
    cout << i << " ";  // Output: 1 2 4 5
}
```

**goto** → Jumps to a labeled statement (use sparingly)

```
int num = 1;
if(num == 1) goto label;
cout << "This will be skipped";
```

**label**:

```
cout << "Jumped here" << endl;
```

## **3. Summary (LearnCodeX)**

* Conditional statements control program decisions: if, if-else, if-else if-else, switch

* Loops repeat code blocks: for, while, do-while
 
* Nested loops handle multiple levels of iteration
 
* Loop control statements: break, continue, goto
 
* Proper use of control flow ensures efficient and logical execution of programs
 
* Control flow is the backbone of C++ programs, allowing dynamic decision-making and repeated execution.