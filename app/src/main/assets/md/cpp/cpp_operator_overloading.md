# Operator Overloading in C++

**Operator Overloading** allows us to redefine the way operators work for user-defined types (like classes and structs).  
It increases code readability and makes objects behave more like built-in types.

---

## Syntax
<br>

```cpp
return_type operator symbol (arguments) {
    // operator definition
}
```

**operator** is a keyword.

symbol is the operator to be overloaded (+, -, *, ==, etc.).

At least one operand must be a user-defined type.

Example: **Overloading + Operator**

```
#include <iostream>
using namespace std;

class Complex {
    int real, imag;

public:
    Complex(int r = 0, int i = 0) : real(r), imag(i) {}

    // Overload + operator
    Complex operator + (const Complex &obj) {
        return Complex(real + obj.real, imag + obj.imag);
    }

    void display() {
        cout << real << " + " << imag << "i" << endl;
    }
};

int main() {
    Complex c1(3, 2), c2(1, 7);
    Complex c3 = c1 + c2;   // calls operator+
    c3.display();           // Output: 4 + 9i
    return 0;
}
```

Example: **Overloading == Operator**

```
#include <iostream>
using namespace std;

class Point {
    int x, y;

public:
    Point(int x1, int y1) : x(x1), y(y1) {}

    bool operator==(const Point &p) {
        return (x == p.x && y == p.y);
    }
};

int main() {
    Point p1(2, 3), p2(2, 3), p3(4, 5);

    if (p1 == p2)
        cout << "p1 and p2 are equal" << endl;
    else
        cout << "p1 and p2 are not equal" << endl;

    if (p1 == p3)
        cout << "p1 and p3 are equal" << endl;
    else
        cout << "p1 and p3 are not equal" << endl;

    return 0;
}
```

Operators That Can Be Overloaded

<br>

**Arithmetic**: +, -, *, /, %

**Relational**: ==, !=, <, >, <=, >=

**Logical**: &&, ||, !

**Increment/Decrement**: ++, --

**Assignment**: =

**Subscript**: []

**Function Call**: ()

**Member Access**: ->

### **Operators That Cannot Be Overloaded**

:: (scope resolution)

. (member access)

.* (pointer-to-member access)

sizeof

typeid

?: (ternary)

## **Best Practices**

Overload operators only when it makes logical sense.

Ensure operator meaning is intuitive (e.g., + should represent addition).

Use friend functions if left operand needs to be non-class type.

## **Summary**

Operator overloading provides syntactic sugar for user-defined types.

Not all operators can be overloaded.

Should be used carefully to keep code readable and intuitive.