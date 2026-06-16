# **Command-Line Arguments in C** <br>

Command-line arguments allow **passing information to a program when it is executed**.  
They provide **flexibility** to run the same program with different inputs without modifying the source code.

---

## **1. Syntax of `main()` for Command-Line Arguments**
<br>

```c
int main(int argc, char *argv[])
```
<br>

**argc** → Argument Count

Total number of arguments passed, including program name

**argv** → Argument Vector

Array of strings (character pointers) containing arguments

**argv[0]** → Program name

**argv[1]** to argv[argc-1] → Command-line arguments

**Alternate form:**

```
int main(int argc, char **argv)
```

---

## **2. Example: Print All Command-Line Arguments**
<br>

```
#include <stdio.h>

int main(int argc, char *argv[]) {
    printf("Number of arguments: %d\n", argc);
    for(int i = 0; i < argc; i++) {
        printf("Argument %d: %s\n", i, argv[i]);
    }
    return 0;
}
```
<br>

**Example Execution:**

```
$ ./program LearnCodeX 123
```
<br>

**Number of arguments: 3
Argument 0: ./program
Argument 1: LearnCodeX
Argument 2: 123**

---

## **3. Converting Command-Line Arguments**
<br>

Command-line arguments are strings.
Use conversion functions to convert to other data types:

**atoi()** → string to integer

**atof()** → string to float

**atol()** → string to long

**Example**: Sum of Two Numbers from Command Line

```
#include <stdio.h>
#include <stdlib.h>

int main(int argc, char *argv[]) {
    if(argc != 3) {
        printf("Usage: %s num1 num2\n", argv[0]);
        return 1;
    }

    int a = atoi(argv[1]);
    int b = atoi(argv[2]);

    printf("Sum: %d\n", a + b);
    return 0;
}
```
<br>

**Execution**:

```
$ ./program 10 20
```
<br>

**Sum: 30**

---

## **4. Example: <br> Simple Calculator**

<br>

```
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(int argc, char *argv[]) {
    if(argc != 4) {
        printf("Usage: %s num1 operator num2\n", argv[0]);
        return 1;
    }

    int a = atoi(argv[1]);
    int b = atoi(argv[3]);
    char op = argv[2][0];

    switch(op) {
        case '+': printf("Result: %d\n", a + b); break;
        case '-': printf("Result: %d\n", a - b); break;
        case '*': printf("Result: %d\n", a * b); break;
        case '/': 
            if(b != 0) printf("Result: %d\n", a / b);
            else printf("Division by zero error\n");
            break;
        default: printf("Invalid operator\n");
    }

    return 0;
}
```
<br>

**Example Execution:**

```
$ ./calc 10 + 5
```
<br>

**Result: 15**

---

## **5. Important Notes**

* **argc** >= 1, because argv[0] is always the program name
 
* Always check argc to prevent out-of-bounds errors
 
* All arguments are strings, convert as needed

* Useful for scripts, batch processing, and utilities

---

## **6. Summary (LearnCodeX)**

* Command-line arguments allow passing input without modifying code
 
* int main(int argc, char *argv[]) → standard syntax
 
* **argc** → number of arguments
 
* **argv** → array of argument strings
 
* Convert strings to numbers using **atoi**, **atof**, **atol**
 
* Commonly used for dynamic input, automation, and flexible programs

* Command-line arguments make C programs versatile, reusable, and user-friendly for real-world applications.