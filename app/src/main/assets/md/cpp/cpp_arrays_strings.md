# **C++ Arrays and Strings**

Arrays and strings allow you to **store multiple values** in a single variable.  
They are widely used for **data storage, processing, and manipulation**.

---

## **1. Arrays in C++**
<br>

### **1.1. Definition**

- An **array** is a collection of elements of the **same data type** stored in **contiguous memory locations**.

```cpp
data_type array_name[size];
```

**Example**:

```
int numbers[5];          // Integer array of size 5
float prices[3];         // Float array of size 3
```

### **1.2. Array Initialization**<br>

At the time of declaration

```
int numbers[5] = {1, 2, 3, 4, 5};
```

Partial initialization (rest initialized to 0)

```
int numbers[5] = {1, 2};
```

Implicit size

```
int numbers[] = {1, 2, 3, 4, 5}; // Compiler determines size
```

### **1.3. Accessing Array Elements**<br>

Access elements using index (starting from 0)

```
cout << numbers[0];  // First element
numbers[2] = 10;     // Modify third element
```

### **1.4. Looping Through Arrays**<br>

```
for(int i = 0; i < 5; i++) {
    cout << numbers[i] << " ";
}
```

### **1.5. Multidimensional Arrays**<br>

Arrays with more than one dimension (e.g., matrices)

```
int matrix[2][3] = {
    {1, 2, 3},
    {4, 5, 6}
};

cout << matrix[1][2]; // Output: 6
```

---

## **2. Strings in C++**<br>

### **2.1. Using Character Arrays**

Strings can be stored as arrays of characters ending with \0 (null character)

```
char name[6] = {'L','e','a','r','n','\0'};
cout << name << endl; // Output: Learn
```

Simpler declaration:

```
char name[] = "LearnCodeX";
```

### **2.2. C++ string Class**

Provided by <string> library

Easier and safer than character arrays

```
#include <iostream>
#include <string>
using namespace std;

int main() {
    string name = "LearnCodeX";
    cout << "Name: " << name << endl;

    name += " Rocks";       // Concatenation
    cout << name << endl;   // Output: LearnCodeX Rocks

    cout << "Length: " << name.length() << endl; // String length
    return 0;
}
```

### **2.3. Accessing and Modifying Strings**<br>

```
string str = "Learn";
cout << str[0] << endl;  // 'L'

str[0] = 'l';            // Change first character
cout << str << endl;      // "learn"
```

### **2.4. Input Strings**<br>

**Single word**

```
string name;
cin >> name;  // Stops at whitespace
```

**Multiple words**

```
string fullName;
getline(cin, fullName);
```

### **2.5. Common String Operations**<br>

**Concatenation**: + or +=

**Length**: str.length() or str.size()

**Substring**: str.substr(start, length)

**Find**: str.find("CodeX")

**Erase**: str.erase(start, length)

**Replace**: str.replace(start, length, "NewText")

**Example**:

```
string text = "LearnCodeX";
text += " Tutorials";
cout << text.substr(5, 5) << endl;  // Output: CodeX
```

---

## **3. Summary (LearnCodeX)**

- Arrays store multiple elements of the same type in contiguous memory

- Access elements using zero-based index

- Multidimensional arrays allow storing tables or matrices

- C-style strings are character arrays ending with \0

- C++ string class simplifies string handling

- Strings support concatenation, length, substring, find, erase, replace

- Loops are commonly used to process arrays and strings

- Arrays and strings are fundamental for handling multiple pieces of data efficiently in C++ programs.