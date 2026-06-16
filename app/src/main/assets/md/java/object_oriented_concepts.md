
---
# **🧩 OOP Concepts in Java**

---

## **🔹 What is OOP?**

Object-Oriented Programming (OOP) is a programming paradigm based on **objects** and **classes**. It helps organize complex programs by modeling real-world entities.

---

### **🔸 Four Main Principles of OOP**

1. **Encapsulation** 
2. **Inheritance**  
3. **Polymorphism** 
4. **Abstraction**  

---

### **🔹 1. Encapsulation**

- Achieved using **private variables** and **public getter/setter methods**.

```
public class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
```
---

### 🔹 **2. Inheritance**

- One class inherits from another using **extends**.

```
class Animal {
void eat() {
System.out.println("Eating");
}
}

class Dog extends Animal {
void bark() {
System.out.println("Barking");
}
}
```
---

### **🔹 3. Polymorphism**

- **Compile-time** Polymorphism (Method Overloading):

```
class Calculator {
int add(int a, int b) {
return a + b;
}

    double add(double a, double b) {
        return a + b;
    }
}


Runtime Polymorphism (Method Overriding):

class Animal {
void sound() {
System.out.println("Animal sound");
}
}

class Cat extends Animal {
@Override
void sound() {
System.out.println("Meow");
}
}
```
---

### **🔹 4. Abstraction**

- Hiding complexity using abstract classes and interfaces.

```
abstract class Shape {
abstract void draw();
}

class Circle extends Shape {
void draw() {
System.out.println("Drawing Circle");
}
}
```
---

## **🔹 Additional Concepts**

* **Class** - Blueprint for objects
* **Object** - Instance of a class
* **Constructor** - Special method to initialize objects
* **Method** - Behavior of objects
* **Interface** - Abstract type for multiple inheritance and abstraction

---
## **✅ Summary**

* OOP models real-world entities using classes and objects.
* Encapsulation protects data.
* Inheritance promotes code reuse.
* Polymorphism allows flexibility in method behavior.
* Abstraction hides implementation details.