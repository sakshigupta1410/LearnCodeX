# **Multi-Dimensional Arrays in C**
<br>

## **Introduction**
In C, arrays can have more than one dimension.  
A **multi-dimensional array** is simply an array of arrays.

- A **two-dimensional array** is often used to represent matrices or tables.
- Higher dimensional arrays are also possible (3D, 4D, ...), but less common.

---

## **Declaration**
**Syntax:**
```c
data_type array_name[size1][size2]...[sizeN];
```

<br>

**Example**:

```
int matrix[3][4];   // 2D array with 3 rows and 4 columns
```

**Initialization**

```
int matrix[2][3] = {
    {1, 2, 3},
    {4, 5, 6}
};
```

This creates a 2D array:

0	1	2 <br>

0	1	2	3<br>

1	4	5	6<br>


## **Accessing Elements**

Elements are accessed using row and column indices:

```
matrix[0][2];   // 3rd element of 1st row → 3
matrix[1][0];   // 1st element of 2nd row → 4
```

**Example**: <br>
2D Array Input/Output

```
#include <stdio.h>

int main() {
    int matrix[2][2];

    // Input
    printf("Enter elements of 2x2 matrix:\n");
    for(int i=0; i<2; i++) {
        for(int j=0; j<2; j++) {
            scanf("%d", &matrix[i][j]);
        }
    }

    // Output
    printf("Matrix:\n");
    for(int i=0; i<2; i++) {
        for(int j=0; j<2; j++) {
            printf("%d ", matrix[i][j]);
        }
        printf("\n");
    }

    return 0;
}
```

**Sample Input:**

1 2
3 4

**Output:**

Matrix:
1 2 
3 4


## **3D Arrays**

A 3D array can be declared like this:

```
int cube[3][3][3];   // 3D array of size 3x3x3
```

**Initialization example:**

```
int cube[2][2][2] = {
    {
        {1, 2}, {3, 4}
    },
    {
        {5, 6}, {7, 8}
    }
};
```

**Accessing element:**

```
cube[1][0][1];   // → 6
```

**Example**: <br>
Summing Elements of 2D Array

```
#include <stdio.h>

int main() {
    int arr[2][3] = { {1,2,3}, {4,5,6} };
    int sum = 0;

    for(int i=0; i<2; i++) {
        for(int j=0; j<3; j++) {
            sum += arr[i][j];
        }
    }

    printf("Sum = %d\n", sum);
    return 0;
}
```

**Output**:
Sum = 21

## **Summary**

- Multi-dimensional arrays are arrays of arrays.

- Commonly used 2D arrays represent matrices/tables.

- Elements are accessed with multiple indices [i][j][k]....

- Can be used for mathematical operations, data tables, and 3D structures.