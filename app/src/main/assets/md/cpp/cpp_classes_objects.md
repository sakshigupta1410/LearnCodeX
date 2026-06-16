# **C++ Classes and Objects**

C++ supports **Object-Oriented Programming (OOP)**, which allows **modeling real-world entities** in code using classes and objects.

---

## **1. Classes**
<br>

### **1.1. Definition**

- A **class** is a blueprint or template that defines the **properties (data members)** and **behaviors (member functions)** of an object.

```cpp
class Car {
public:               // Access specifier
    string brand;     // Data member
    string model;
    int year;

    void display() {  // Member function
        cout << brand << " " << model << " (" << year << ")" << endl;
    }
};
```

**Notes**:

**Access specifiers:** public, private, protected

public members can be accessed outside the class

private members can only be accessed inside the class

---

## **2. Objects**

An object is an instance of a class.

```
int main() {
    Car car1;              // Create object
    car1.brand = "Toyota";
    car1.model = "Corolla";
    car1.year = 2022;
    car1.display();        // Output: Toyota Corolla (2022)
    return 0;
}
```

Multiple objects can be created from the same class, each with its own data.

## **3. Member Functions**

Define behaviors of a class.

Can be defined inside or outside the class using scope resolution ::.

```
class Car {
public:
    string brand;
    void display();  // Declaration
};

void Car::display() {    // Definition outside
    cout << brand << endl;
}
```

---

## **4. Constructors**

Special functions called automatically when an object is created.

Used to initialize objects.

```
class Car {
public:
    string brand;
    int year;

    Car(string b, int y) {  // Constructor
        brand = b;
        year = y;
    }

    void display() {
        cout << brand << " (" << year << ")" << endl;
    }
};

int main() {
    Car car1("Honda", 2023);
    car1.display();  // Honda (2023)
    return 0;
}
```

Default constructor: **No parameters**

Parameterized constructor: **With parameters**

Copy constructor: Initializes object using **another object**

---

## **5. Destructor**

Special function called when an object is destroyed.

Used to release resources.

```
class Car {
public:
    Car() { cout << "Constructor called" << endl; }
    ~Car() { cout << "Destructor called" << endl; }
};

int main() {
    Car car1;
    return 0;
}
// Destructor is automatically called at the end of scope
```

---

## **6. Access Specifiers**

**public** → Accessible from anywhere

**private** → Accessible only within the class

**protected** → Accessible in class and derived classes

## **7. Example: Complete Class**
<br>

```
#include <iostream>
using namespace std;

class Student {
private:
    string name;
    int age;

public:
    Student(string n, int a) {  // Constructor
        name = n;
        age = a;
    }

    void display() {             // Member function
        cout << "Name: " << name << ", Age: " << age << endl;
    }
};

int main() {
    Student s1("LearnCodeX", 21);
    s1.display();                // Name: LearnCodeX, Age: 21
    return 0;
}
```

---

## **8. Summary**

- Class = blueprint; Object = instance of class

- Members: data members (properties) + member functions (methods)

- Constructors initialize objects automatically

- Destructors clean up resources when objects are destroyed

- Access specifiers control visibility: public, private, protected

- Classes and objects are the foundation of OOP in C++, enabling modular, reusable, and real-world modeling of programs.