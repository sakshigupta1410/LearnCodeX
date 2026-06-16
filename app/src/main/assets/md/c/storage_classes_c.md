# **Storage Classes in C**

---

In C, **storage classes** define the **scope**, **lifetime**, and **visibility** of variables and functions. There are four main storage classes:

1. **auto**
2. **register**
3. **static**
4. **extern**

---

### **1. auto**

- Default storage class for local variables.
- Variables are created when the block is entered and destroyed when exited.
- Usually not written explicitly (implicit).

Example:

```c
void func() {
    auto int x = 10;  // 'auto' is optional
    printf("%d\n", x);
}
```

### **2. register**

* Suggests to the compiler to store the variable in a CPU register for faster access.

* Only for local variables.

* You cannot get the address of a register variable.

**Example**:

```
void func() {
register int count = 5;
printf("%d\n", count);
}
```

### **3. static**

* **For local variables:** preserves the variable value between function calls.

* **For global variables/functions:** limits their scope to the file (internal linkage).

**Example** - static local variable:

```
void func() {
static int count = 0;
count++;
printf("%d\n", count);
}

int main() {
func(); // prints 1
func(); // prints 2
func(); // prints 3
return 0;
}
```


**Example** - static global variable:

```
static int number = 5;  // only accessible within this file
```


### **4. extern**

* Used to declare a global variable or function that is defined in another file.

* Provides external linkage.

**Example**:

```
// File1.c
int count = 10;

// File2.c
extern int count;

void printCount() {
printf("%d\n", count);
}
```
