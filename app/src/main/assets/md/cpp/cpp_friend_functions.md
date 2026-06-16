# Friend Functions in C++

A **friend function** is a function that is **not a member** of a class but has access to its **private and protected members**.  
It is declared using the keyword `friend` inside the class.

---

## Key Points

- Declared inside a class with the keyword `friend`.
- Defined outside the class like a normal function (not with `::`).
- Can access private and protected members of the class.
- Not called using object → instead, called like a normal function.

---

## Syntax

```cpp
class ClassName {
    friend return_type function_name(arguments);
};
```

Example: **Friend Function**

```
#include <iostream>
using namespace std;

class Box {
    int width;

public:
    Box(int w) : width(w) {}

    // friend function declaration
    friend void showWidth(Box b);
};

// friend function definition
void showWidth(Box b) {
    cout << "Width: " << b.width << endl;  // can access private member
}

int main() {
    Box b1(10);
    showWidth(b1);   // Output: Width: 10
    return 0;
}
```

Example: <br>
**Adding Two Objects Using Friend Function**

```
#include <iostream>
using namespace std;

class Complex {
    int real, imag;

public:
    Complex(int r = 0, int i = 0) : real(r), imag(i) {}

    // friend function declaration
    friend Complex add(Complex c1, Complex c2);
};

// friend function definition
Complex add(Complex c1, Complex c2) {
    return Complex(c1.real + c2.real, c1.imag + c2.imag);
}

int main() {
    Complex c1(2, 3), c2(4, 5);
    Complex c3 = add(c1, c2);
    cout << "Sum = " << c3.real << " + " << c3.imag << "i" << endl;
    return 0;
}
```

<br>

### **Friend Class**

A whole class can also be declared as a friend.

All member functions of the friend class get access to **private/protected** members.

```
#include <iostream>
using namespace std;

class B;  // forward declaration

class A {
    int x;
public:
    A(int val) : x(val) {}
    friend class B;   // declare class B as friend
};

class B {
public:
    void showA(A a) {
        cout << "Value of A.x = " << a.x << endl;
    }
};

int main() {
    A obj(42);
    B b;
    b.showA(obj);
    return 0;
}
```

**_When to Use Friend Functions?_**

✅ When non-member functions need direct access to private data.
✅ For operator overloading (e.g., operator<<, operator>>).
✅ To increase flexibility in function design.

❌ Should not be **overused** (may break encapsulation).

## **Summary**

**friend** keyword allows access to private/protected members.

Can be a function or a class.

Useful for operator overloading and helper functions.

Use carefully to avoid breaking encapsulation.