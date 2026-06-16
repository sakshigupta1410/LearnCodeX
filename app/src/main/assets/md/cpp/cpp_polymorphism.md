# C++ Polymorphism

Polymorphism is a core concept of **Object-Oriented Programming (OOP)** that allows objects to **take many forms**.  
It enables **functions or operators** to behave differently based on **context** or **type of data**.

---

## 1. Types of Polymorphism

1. **Compile-time Polymorphism (Static)**
    - Resolved during **compile time**
    - Achieved using:
        - **Function Overloading**
        - **Operator Overloading**

2. **Runtime Polymorphism (Dynamic)**
    - Resolved during **program execution**
    - Achieved using:
        - **Virtual Functions**
        - **Pointers/References to Base Class**

---

## 2. Compile-time Polymorphism<br>

### 2.1. Function Overloading<br>

- Same function name, **different parameters**

```cpp
#include <iostream>
using namespace std;

class Math {
public:
    int add(int a, int b) { return a + b; }
    double add(double a, double b) { return a + b; }
};

int main() {
    Math m;
    cout << m.add(5, 10) << endl;     // Calls int version
    cout << m.add(2.5, 3.5) << endl;  // Calls double version
    return 0;
}
```

### **2.2. Operator Overloading**

Customize operator behavior for user-defined types

```
#include <iostream>
using namespace std;

class Complex {
public:
    int real, imag;
    Complex(int r = 0, int i = 0) { real = r; imag = i; }

    Complex operator + (Complex const &c) {
        return Complex(real + c.real, imag + c.imag);
    }

    void display() { cout << real << " + " << imag << "i" << endl; }
};

int main() {
    Complex c1(2, 3), c2(3, 4);
    Complex c3 = c1 + c2;
    c3.display();  // 5 + 7i
}
```

---

## **3. Runtime Polymorphism**<br>

### **3.1. Virtual Functions**<br>

Declared in base class using virtual keyword

Allows derived class function to be called via base class pointer/reference

```
#include <iostream>
using namespace std;

class Base {
public:
    virtual void show() { cout << "Base class function" << endl; }
};

class Derived : public Base {
public:
    void show() override { cout << "Derived class function" << endl; }
};

int main() {
    Base* b;
    Derived d;
    b = &d;
    b->show();  // Calls Derived class function
    return 0;
}
```

### **3.2. Key Points of Virtual Functions**<br>

Supports runtime method overriding

Base class pointer/reference can call derived class function

Enables dynamic dispatch


### **3.3. Pure Virtual Functions and Abstract Classes**<br>

A pure virtual function is a function with = 0

Makes the class abstract (cannot create objects)

```
class Shape {
public:
    virtual void draw() = 0;  // Pure virtual function
};

class Circle : public Shape {
public:
    void draw() override { cout << "Drawing Circle" << endl; }
};

int main() {
    Circle c;
    c.draw();  // Drawing Circle
}
```

---

## **4. Summary (LearnCodeX)**

Polymorphism allows objects or functions to behave differently in different contexts

Compile-time polymorphism: Function overloading, Operator overloading

Runtime polymorphism: Virtual functions, Abstract classes, Base class pointers/references

Virtual functions enable dynamic dispatch

Abstract classes enforce derived classes to implement specific behavior

Polymorphism is essential for flexible, maintainable, and extensible C++ code, allowing one interface to work with multiple types.