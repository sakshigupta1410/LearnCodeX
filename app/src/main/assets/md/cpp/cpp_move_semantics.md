# Move Semantics in C++

In C++11, **move semantics** were introduced to optimize performance when working with temporary objects.  
Instead of copying data, move semantics **transfer ownership of resources** from one object to another.

---

## Why Move Semantics?

- Copying large objects is expensive (time & memory).
- Temporary objects don’t need deep copies.
- Move semantics **reuse existing resources** instead of duplicating them.

---

## Lvalues vs Rvalues

- **Lvalue**: Has an address (e.g., variables).
- **Rvalue**: Temporary values (e.g., literals, return values).

Example:
```cpp
int x = 10;       // x is lvalue
int y = x + 5;    // (x + 5) is rvalue
```

## **Move Constructor**

A **move** constructor transfers resources from a temporary object to a new object.

```
#include <iostream>
#include <utility>
using namespace std;

class MyClass {
    int* data;
public:
    MyClass(int val) {
        data = new int(val);
        cout << "Constructor: allocated " << *data << endl;
    }

    // Move constructor
    MyClass(MyClass&& other) noexcept {
        data = other.data;
        other.data = nullptr;
        cout << "Move Constructor: ownership transferred" << endl;
    }

    ~MyClass() {
        if (data)
            cout << "Destructor: deleting " << *data << endl;
        delete data;
    }
};

int main() {
    MyClass a(10);
    MyClass b = move(a);  // calls move constructor
    return 0;
}
```

## **Move Assignment Operator**

Transfers resources during assignment.

```
#include <iostream>
#include <utility>
using namespace std;

class MyClass {
    int* data;
public:
    MyClass(int val) : data(new int(val)) {}

    // Move assignment
    MyClass& operator=(MyClass&& other) noexcept {
        if (this != &other) {
            delete data;          // clean up existing resource
            data = other.data;    // steal the resource
            other.data = nullptr; // reset source
        }
        return *this;
    }

    ~MyClass() { delete data; }
};

int main() {
    MyClass a(5), b(10);
    b = move(a);   // calls move assignment
    return 0;
}
```

### **std::move**

A utility function that converts an **lvalue** into an **rvalue** reference.

Allows invoking move constructor/assignment explicitly.

```
#include <iostream>
#include <string>
using namespace std;

int main() {
    string str = "Hello";
    string newStr = move(str);   // moves instead of copies

    cout << "newStr = " << newStr << endl;
    cout << "str (moved-from) = " << str << endl;  // str may be empty
    return 0;
}
```

## **Benefits of Move Semantics**

**Efficiency** → avoids unnecessary deep copies.

**Performance** → faster handling of large objects.

**Resource Safety** → transfers ownership instead of duplicating.

## **Summary**

Move semantics optimize handling of temporary/rvalue objects.

Implemented using move constructor and move assignment operator.

**std::move** is used to explicitly enable moving.

Essential for modern C++ efficiency.