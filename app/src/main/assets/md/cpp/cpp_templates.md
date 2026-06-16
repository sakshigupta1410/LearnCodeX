# C++ Templates

Templates in C++ allow you to write **generic and reusable code** that works with **any data type**.  
They are widely used in **functions and classes** to reduce redundancy.

---

## 1. Function Templates

- Function templates allow a **single function definition** to work with **different data types**.

### Syntax

```cpp
template <typename T>
T functionName(T a, T b) {
    // function body
}
```

**Example**

```
#include <iostream>
using namespace std;

template <typename T>
T add(T a, T b) {
    return a + b;
}

int main() {
    cout << add(5, 10) << endl;       // int
    cout << add(2.5, 3.5) << endl;    // double
    return 0;
}
```

**Notes**:

T is a placeholder type

Templates are resolved at compile time based on the data type of arguments

---

## **2. Class Templates**

Class templates allow a single class definition to handle multiple data types.

**Syntax**

```
template <class T>
class ClassName {
    T data;
public:
    ClassName(T d) { data = d; }
    void display() { cout << data << endl; }
};
```

**Example**

```
#include <iostream>
using namespace std;

template <class T>
class Box {
    T content;
public:
    Box(T c) { content = c; }
    void show() { cout << "Content: " << content << endl; }
};

int main() {
    Box<int> intBox(123);
    Box<string> strBox("LearnCodeX");

    intBox.show();  // Content: 123
    strBox.show();  // Content: LearnCodeX
    return 0;
}
```

---

## **3. Template Specialization**

Allows **customizing** a template for a specific data type.

```
#include <iostream>
using namespace std;

template <class T>
class Printer {
public:
    void print(T value) {
        cout << "Generic: " << value << endl;
    }
};

// Specialization for char*
template <>
class Printer<char*> {
public:
    void print(char* value) {
        cout << "String: " << value << endl;
    }
};

int main() {
    Printer<int> p1;
    p1.print(100);       // Generic: 100

    Printer<char*> p2;
    p2.print("Hello");   // String: Hello
    return 0;
}
```

---

## **4. Multiple Template Parameters**

Templates can have more than one type.

```
template <class T1, class T2>
class Pair {
    T1 first;
    T2 second;
public:
    Pair(T1 a, T2 b) : first(a), second(b) {}
    void show() { cout << first << ", " << second << endl; }
};

int main() {
    Pair<int, string> p(1, "LearnCodeX");
    p.show();  // Output: 1, LearnCodeX
    return 0;
}
```

---

## **5. Advantages of Templates**

**Code reusability:** One template works with multiple data types

**Type safety:** Compiler checks types during compilation

**Maintainability**: Reduces duplicate code

---

## **6. Summary (LearnCodeX)**

* Function templates allow generic functions
 
* Class templates allow generic classes
 
* Template specialization customizes behavior for specific types
 
* Multiple template parameters increase flexibility
 
* Templates are resolved at compile-time for type safety and efficiency
 
* Templates are essential for writing generic, reusable, and type-safe code in modern C++.