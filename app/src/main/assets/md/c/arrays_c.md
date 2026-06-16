# **Arrays in C**

An **array** is a collection of **elements of the same data type** stored in **contiguous memory locations**.  
Arrays allow you to **store multiple values under a single variable name**.

---

## **1. Why Use Arrays?**

- Store multiple values without declaring multiple variables
- Access elements using **indices**
- Useful in **loops and functions**
- Makes programs more **efficient and organized**

---

## **2. Array Declaration**

**Syntax:**
```c
data_type array_name[size];
```

**Example**:

```
int numbers[5];       // array of 5 integers
float prices[10];     // array of 10 floats
char letters[26];     // array of 26 characters
```

**Notes**:

size must be a constant integer

Array indices start from 0

The last index is size - 1

---

## **3. Array Initialization**

Arrays can be initialized during declaration:

```
int numbers[5] = {1, 2, 3, 4, 5};
char vowels[5] = {'a', 'e', 'i', 'o', 'u'};
float scores[3] = {9.5, 8.0, 7.5};
```
<br>

If fewer values are provided than the size, remaining elements are 0 (for numbers).

You can also let the compiler determine the size:

```
int numbers[] = {1, 2, 3, 4, 5};  
// size automatically 5
```

---

## **4. Accessing Array Elements**

Use the index to access elements:

```
#include <stdio.h>

int main() {
    int numbers[5] = {10, 20, 30, 40, 50};
    printf("First element: %d\n", numbers[0]);
    printf("Third element: %d\n", numbers[2]);

    numbers[1] = 25;  // modifying element
    printf("Updated second element: %d\n", numbers[1]);

    return 0;
}
```
Output:
**First element: 10
Third element: 30
Updated second element: 25**

---

## **5. Looping Through Arrays**

Use loops to process multiple elements:

```
#include <stdio.h>

int main() {
    int numbers[5] = {1, 2, 3, 4, 5};
    int i;

    for(i = 0; i < 5; i++) {
        printf("%d ", numbers[i]);
    }

    return 0;
}
```
Output:
**1 2 3 4 5**

---

## **6. Multi-Dimensional Arrays**<br>

### **6.1. Two-Dimensional Arrays**<br>

Arrays with rows and columns

Useful for matrices, tables, or grids

**Declaration**:

```
data_type array_name[rows][columns];
```

**Example**:

```
#include <stdio.h>

int main() {
    int matrix[2][3] = {
        {1, 2, 3},
        {4, 5, 6}
    };

    printf("%d\n", matrix[0][1]);  // 2
    printf("%d\n", matrix[1][2]);  // 6

    return 0;
}
```

**Notes**:

matrix[row][column] starts from index 0

Nested loops are often used to iterate over multi-dimensional arrays

### **6.2. Iterating 2D Array**<br>

```
#include <stdio.h>

int main() {
    int matrix[2][3] = {{1,2,3}, {4,5,6}};
    int i, j;

    for(i = 0; i < 2; i++) {
        for(j = 0; j < 3; j++) {
            printf("%d ", matrix[i][j]);
        }
        printf("\n");
    }

    return 0;
}
```
Output:
**1 2 3
4 5 6**

---

## **7. Important Notes About Arrays**

* Size is fixed: Cannot change once declared

* Index out of bounds leads to undefined behavior
 
* Memory is contiguous, which makes arrays fast for access
 
* Can be passed to functions (as pointers) for processing
 
* Can use loops for initialization, searching, and sorting

---

## **8. Common Array Operations**

Sum of elements

```
int sum = 0;
for(i = 0; i < 5; i++) sum += numbers[i];
```
<br>

Finding maximum/minimum

```
int max = numbers[0];
for(i = 1; i < 5; i++) {
    if(numbers[i] > max) max = numbers[i];
}
```
<br>

Copying arrays

```
for(i = 0; i < 5; i++) arr2[i] = arr1[i];
```
<br>

Searching an element

```
for(i = 0; i < 5; i++) {
    if(numbers[i] == 3) printf("Found at index %d", i);
}
```

---

## **9. Summary**

**Array**: Collection of same type elements stored contiguously

**Declaration & Initialization**: int arr[5] = {1,2,3,4,5};

**Access**: Using indices starting from 0

**Loops**: Efficiently iterate through arrays

**Multi-Dimensional Arrays**: Rows and columns (matrix[2][3])

**Operations**: Sum, search, max/min, copy

Arrays are fundamental for storing and processing multiple data efficiently.