# **C++ Inheritance**

Inheritance is a fundamental concept of **Object-Oriented Programming (OOP)** that allows a class to **acquire properties and behaviors of another class**.  
It promotes **code reusability** and **hierarchical classification**.

---

## **1. Basics of Inheritance**

- The class that **inherits** is called the **derived class**.
- The class being **inherited from** is called the **base class**.

```cpp
class Base {
public:
    void displayBase() {
        cout << "This is the Base class" << endl;
    }
};

class Derived : public Base {  // Derived inherits from Base
public:
    void displayDerived() {
        cout << "This is the Derived class" << endl;
    }
};

int main() {
    Derived obj;
    obj.displayBase();     // Inherited function
    obj.displayDerived();  // Derived class function
    return 0;
}
```

---

## **2. Types of Inheritance**<br>

### **Single Inheritance**<br>

A derived class inherits from one base class.

```
class A {};
class B : public A {};
```

### **Multiple Inheritance**

A derived class inherits from more than one base class.

```
class A {};
class B {};
class C : public A, public B {};
```

### **Multilevel Inheritance**

A class is derived from a class which is itself derived from another class.

```
class A {};
class B : public A {};
class C : public B {};
```

### **Hierarchical Inheritance**

Multiple derived classes inherit from a single base class.

```
class A {};
class B : public A {};
class C : public A {};
```

### **Hybrid Inheritance**

Combination of two or more types of inheritance.

---

## **3. Access Specifiers and Inheritance**<br>

### **public inheritance:**

public → public

protected → protected

private → inaccessible

### **protected inheritance:**

public → protected

protected → protected

private → inaccessible

### **private inheritance:**

public → private

protected → private

private → inaccessible

---

## **4. Constructor and Destructor in Inheritance**

Base class constructor is called before derived class constructor.

Destructors are called in reverse order.

```
class Base {
public:
    Base() { cout << "Base Constructor" << endl; }
    ~Base() { cout << "Base Destructor" << endl; }
};

class Derived : public Base {
public:
    Derived() { cout << "Derived Constructor" << endl; }
    ~Derived() { cout << "Derived Destructor" << endl; }
};

int main() {
    Derived obj;
    return 0;
}

// Output:
// Base Constructor
// Derived Constructor
// Derived Destructor
// Base Destructor
```

---

## **5. Overriding Functions**

Derived class can override a function of base class using the same name.

```
class Base {
public:
    void show() {
        cout << "Base class function" << endl;
    }
};

class Derived : public Base {
public:
    void show() {
        cout << "Derived class function" << endl;
    }
};

int main() {
    Derived obj;
    obj.show();  // Calls derived class function
}
```

Virtual functions are used for runtime polymorphism (covered in Polymorphism).

---

## **6. Summary**

* Inheritance allows one class to acquire properties and methods of another class

* Base class: Class being inherited
 
* Derived class: Class inheriting from base
 
* Types: Single, Multiple, Multilevel, Hierarchical, Hybrid
 
* Access specifiers control visibility of inherited members
 
* Constructors of base class execute first, destructors execute last
 
* Function overriding allows derived class to customize behavior
 
* Inheritance enables modular, reusable, and maintainable code by establishing relationships between classes.