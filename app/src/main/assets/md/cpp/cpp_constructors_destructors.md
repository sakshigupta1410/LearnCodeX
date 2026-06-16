# **C++ Constructors and Destructors**

Constructors and destructors are **special member functions** in C++ that manage **object initialization and cleanup**.

---

## **1. Constructors**
<br>

### **1.1. Definition**

- A **constructor** is a **special member function** automatically called when an object is created.
- It is used to **initialize data members**.
- **No return type**, not even `void`.

```cpp
class Car {
public:
    string brand;
    int year;

    Car(string b, int y) {  // Constructor
        brand = b;
        year = y;
    }
};
```

---

### **1.2. Types of Constructors**

**Default Constructor**

Takes no arguments.

Initializes objects with default values.

```
class Car {
public:
    string brand;
    int year;

    Car() {        // Default constructor
        brand = "Unknown";
        year = 0;
    }
};
```

**Parameterized Constructor**

Takes arguments to initialize objects.

```
Car(string b, int y) {
    brand = b;
    year = y;
}
```

**Copy Constructor**

Initializes an object using another object of the same class.

```
Car(const Car &c) {
    brand = c.brand;
    year = c.year;
}
```

### 1.3. Constructor Example
<br>

```
#include <iostream>
using namespace std;

class Student {
public:
    string name;
    int age;

    Student(string n, int a) {   // Parameterized constructor
        name = n;
        age = a;
    }

    void display() {
        cout << "Name: " << name << ", Age: " << age << endl;
    }
};

int main() {
    Student s1("LearnCodeX", 21);
    s1.display();  // Output: Name: LearnCodeX, Age: 21
    return 0;
}
```

### **1.4. Constructor Features**

-Automatically called when object is created

-Can be overloaded with multiple constructors

-Can be used to initialize constants and reference members

---

## **2. Destructors**<br>
<br>

### **2.1. Definition**<br>

A destructor is a special member function automatically called when an object is destroyed.

Used to release resources, such as memory or file handles.

No arguments and no return type.

Denoted by **~** before class name.

```
class Car {
public:
    Car() { cout << "Constructor called" << endl; }
    ~Car() { cout << "Destructor called" << endl; }
};
```

### **2.2. Destructor Example**<br>

```
#include <iostream>
using namespace std;

class Car {
public:
    Car() { cout << "Car object created" << endl; }
    ~Car() { cout << "Car object destroyed" << endl; }
};

int main() {
    Car car1;   // Constructor called
    Car car2;   // Constructor called
    // Destructors automatically called at end of scope
    return 0;
}
```
Output:
**Car object created
Car object created
Car object destroyed
Car object destroyed**

### **2.3. Destructor Features**

Called automatically at the end of object's lifetime

Only one destructor per class (cannot be overloaded)

Used to clean up dynamic memory or close resources

---

## **3. Summary**

- **Constructor**: Initializes objects, called automatically on creation

- Types of constructors: Default, Parameterized, Copy

- **Destructor**: Cleans up resources, called automatically on destruction

- Constructors can be **overloaded**, **destructors** cannot

- Essential for resource management and object lifecycle in C++

- Proper use of constructors and destructors ensures efficient and safe object management in C++ programs.