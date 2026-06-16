# **C++ Pointers and References**

Pointers and references allow you to **directly access and manipulate memory**.  
They are powerful features of C++ for **dynamic memory, function arguments, and efficiency**.

---

## **1. Pointers in C++**
<br>

### 1.1. Definition

- A **pointer** is a variable that **stores the memory address** of another variable.
- Declared using the `*` symbol.

```cpp
int* ptr;    // Pointer to integer
int num = 10;
ptr = &num;  // & gives the address of num
```

### **1.2. Accessing Values Using Pointers**

Dereferencing using * accesses the value stored at the pointer’s address.

```
cout << "Address of num: " << ptr << endl;
cout << "Value of num: " << *ptr << endl; // Dereference
```

### **1.3. Pointer Initialization**
<br>

```
int a = 5;
int* p = &a;          // Pointer to a
double b = 3.14;
double* dp = &b;      // Pointer to b
```

### **1.4. Pointer Arithmetic**

Pointers can be incremented or decremented to traverse memory.

```
int arr[3] = {10, 20, 30};
int* p = arr;          // Points to arr[0]

cout << *p << endl;    // 10
p++;
cout << *p << endl;    // 20
```

### **1.5. Null Pointer**

A pointer can point to nothing using nullptr.

```
int* p = nullptr;
```

### **1.6. Pointers and Functions**

Pointers can be passed to functions to modify variables outside the function.

```
void increment(int* p) {
    (*p)++;
}

int main() {
    int num = 5;
    increment(&num);
    cout << num << endl;  // 6
    return 0;
}
```

### **1.7. Pointer to Pointer**

A pointer can store the address of another pointer.

```
int num = 10;
int* ptr = &num;
int** pptr = &ptr;

cout << **pptr << endl; // 10
```

---

## **2. References in C++**<br>

### **2.1. Definition**<br>

A reference is an alias for an existing variable.

Declared using the & symbol after the type.

```
int a = 10;
int& ref = a;  // ref is a reference to a
```

### **2.2. Key Points**

References must be initialized when declared

Cannot be reassigned to another variable

Useful for function arguments to avoid copying

```
ref = 20;       // Changes value of a
cout << a;      // Output: 20
```

### **2.3. References and Functions**

Pass by reference allows functions to modify the original variable.

```
void increment(int& x) {
    x++;
}

int main() {
    int num = 5;
    increment(num);
    cout << num << endl;  // 6
    return 0;
}
```

Return by reference allows a function to return a variable without copying.

```
int& getValue(int& x) {
    return x;
}

int main() {
    int a = 10;
    getValue(a) = 20; // Modifies a directly
    cout << a << endl; // 20
}
```

---

## **3. Differences Between Pointers and References**<br>

1. Pointers can be reassigned; references cannot

2. Pointers can point to nullptr; references must refer to an existing variable

3. **Syntax**: Pointers use * and &; references use & only for declaration

4. **Memory**: References are safer and often simpler to use

---

## **4. Summary (LearnCodeX)**

* Pointers store memory addresses; use * to access value, & to get address
* 
* Pointer arithmetic allows array traversal
* 
* References are aliases; used to modify variables without copying
* 
* Both are powerful tools for dynamic memory, efficiency, and function argument manipulation
* 
* Understanding pointers and references is essential for advanced C++ programming and memory management.