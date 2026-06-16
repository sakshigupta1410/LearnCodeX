# **Function Pointers in C**
<br>

## **Introduction**
In C, **function pointers** are pointers that point to the address of a function.

They allow us to:
- Call functions dynamically at runtime.
- Pass functions as arguments to other functions.
- Implement callback mechanisms.
- Create flexible and modular code (e.g., menu-driven programs, event handling, etc.).

---

## **Declaration of Function Pointers**
**Syntax:**
```c
return_type (*pointer_name)(parameter_list);
```
<br>

**Example**:

```
int (*fp)(int, int);
```
<br>

Here, **fp** is a pointer to a function that takes two integers as arguments and returns an integer.

## **Assigning Function Address to Pointer**
<br>

```
int add(int a, int b) {
    return a + b;
}

int main() {
    int (*fp)(int, int);   // Declare function pointer
    fp = add;              // Assign address of add function
    printf("Result: %d\n", fp(10, 20)); // Call using pointer
    return 0;
}
```
<br>

**Output**:

Result: 30
<br>

## **Calling Functions Using Function Pointers**

Two equivalent ways:

```
fp(10, 20);      // Direct call via pointer
(*fp)(10, 20);   // Explicit dereference
```
<br>

## **Passing Function Pointer as Argument**
<br>

```
#include <stdio.h>

void greetMorning() {
    printf("Good Morning!\n");
}

void greetEvening() {
    printf("Good Evening!\n");
}

void execute(void (*fp)()) {
    fp();   // Call the passed function
}

int main() {
    execute(greetMorning);
    execute(greetEvening);
    return 0;
}
```
<br>

**Output**:

Good Morning!
Good Evening!
<br>

## **Array of Function Pointers**

We can store multiple function pointers in an array for menu-driven programs.

```
#include <stdio.h>

void add() { printf("Addition\n"); }
void sub() { printf("Subtraction\n"); }
void mul() { printf("Multiplication\n"); }

int main() {
    void (*operations[3])() = { add, sub, mul };

    for(int i = 0; i < 3; i++) {
        operations[i]();
    }
    return 0;
}
```
<br>

**Output**:

Addition
Subtraction
Multiplication

## **Use Cases of Function Pointers**

-Callbacks (e.g., passing a comparison function to qsort).

-Menu-driven programs (choose operation at runtime).

-Event handling.

-Dynamic function calling.

**Example**: Using Function Pointers with qsort

```
#include <stdio.h>
#include <stdlib.h>

int compare(const void* a, const void* b) {
    return (*(int*)a - *(int*)b);
}

int main() {
    int arr[] = {42, 8, 23, 16, 4};
    int n = sizeof(arr) / sizeof(arr[0]);

    qsort(arr, n, sizeof(int), compare);

    printf("Sorted array: ");
    for(int i = 0; i < n; i++)
        printf("%d ", arr[i]);
    
    return 0;
}
```

**Output**:

Sorted array: 4 8 16 23 42
<br>


## **Summary**

-Function pointers store the address of functions.

-They allow dynamic and flexible function calls.

-Useful for callbacks, libraries, and frameworks.

-Key for implementing runtime polymorphism in C.
