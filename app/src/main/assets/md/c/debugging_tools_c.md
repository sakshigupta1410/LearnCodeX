# **Debugging Tools in C**

## **Introduction**
**Debugging** is the process of finding and fixing errors (bugs) in a program.  
C provides several debugging techniques and external tools to help developers analyze and correct their code.

---

## **Common Errors in C**
1. **Syntax errors** – due to invalid statements (caught by compiler).
2. **Logical errors** – program runs but gives wrong results.
3. **Runtime errors** – occur while program is running (e.g., divide by zero, segmentation fault).
4. **Compilation warnings** – not errors, but indicate possible issues.

---

## **Debugging Techniques**
- **Print Debugging** – inserting `printf()` statements to check values.
- **Assertions** – using `assert()` to validate conditions during runtime.
- **Error Codes** – using return values and `errno` for error handling.
- **Code Reviews** – peer checking helps detect logical errors.

---

## **Debugging Tools**

### **1. GCC Compiler Warnings**
Use flags while compiling:
```bash
gcc -Wall -Wextra program.c -o program
```
<br>

-**Wall** → enables common warnings.

-**Wextra** → enables additional warnings.

### **2. assert() Macro**

Defined in `<assert.h>`
It checks conditions during execution and stops the program if false.

```
#include <stdio.h>
#include <assert.h>

int main() {
    int x = 5;
    assert(x > 0);  // OK
    assert(x < 0);  // Fails here
    printf("End of program\n");
    return 0;
}
```
<br>

**Output**:

Assertion failed: x < 0, file program.c, line 8
<br>

### **3. gdb (GNU Debugger)**

A powerful debugger for C programs.

**Steps**:

Compile with -g option:

```
gcc -g program.c -o program
```
<br>

Start gdb:

```
gdb ./program
```
<br>

Useful commands inside gdb:

**run** → run the program.

**break main** → set a breakpoint at main.

**next** → execute next line.

**print var** → print value of variable.

**backtrace** → show function call stack.

**quit** → exit gdb.

### **4. Valgrind (Memory Debugging)**

Used to detect memory leaks and invalid memory accesses.

Run program with Valgrind:

```
valgrind ./program
```
<br>

**Common reports:**

Invalid reads/writes.

Memory leaks (unfreed memory).

Uninitialized variable usage.

### **5. Integrated Debuggers (IDEs)**

Many IDEs (like Code::Blocks, CLion, Visual Studio Code, Eclipse) provide:

* Breakpoints.
* Step execution.
* Variable watch windows.
* Call stack visualization.

**Example**: Debugging Segmentation Fault

```
#include <stdio.h>

int main() {
    int *ptr = NULL;
    *ptr = 10; // segmentation fault
    return 0;
}
```
<br>

**Fix**: Always check pointer before dereferencing.

```
if(ptr != NULL) {
    *ptr = 10;
}
```
<br>

**Summary**

* Debugging is essential for error-free C programs.

* Techniques include printf(), assert(), error codes, and reviews.
 
* Tools include:
 
* GCC warnings (-Wall, -Wextra).
 
* gdb (GNU Debugger).
 
* Valgrind (memory debugging).
 
* IDE integrated debuggers.
 
* Proper debugging improves reliability and maintainability of code.