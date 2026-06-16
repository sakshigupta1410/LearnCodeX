
---
Inheritance is a fundamental concept in **Object-Oriented Programming (OOP)** that allows a new class to acquire the properties and behaviors (fields and methods) of an existing class.

---

## **What is Inheritance?**

- Inheritance enables **code reusability**.
- It helps create a **hierarchical classification**.
- The class that inherits is called the **subclass** (or derived class).
- The class being inherited from is called the **superclass** (or base class).

---

**Syntax**

```
class Superclass {
    // fields and methods
}

class Subclass extends Superclass {
    // additional fields and methods
}
```


**Example**

```
// Superclass
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Subclass
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();   // Inherited method
        dog.bark();  // Subclass method
    }
}
```
Output:

**This animal eats food.
The dog barks.**


## **Types of Inheritance**

* **Single Inheritance** -> Subclass inherits from one superclass
* **Multilevel Inheritance** -> Chain of inheritance, e.g., Class C inherits B, which inherits A
* **Hierarchical Inheritance** -> Multiple subclasses inherit from one superclass

**Note**: Java does **not** support **multiple** inheritance with classes (to avoid ambiguity). Instead, interfaces are used.

---

## **The super Keyword**

Used to refer to the immediate parent class object.

Can be used to access parent class methods and constructors.

**Example using super**

```
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        super.sound();  // Call parent class method
        System.out.println("Dog barks");
    }
}
```

---

## **Constructor and Inheritance**

When a subclass object is created, the superclass constructor is called **first**.

You can explicitly call the superclass constructor using **super()**.

**Example**:

```
class Animal {
    Animal() {
        System.out.println("Animal constructor called");
    }
}

class Dog extends Animal {
    Dog() {
        super(); // calls Animal constructor
        System.out.println("Dog constructor called");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
    }
}
```
Output:

**Animal constructor called
Dog constructor called**


---

## **Method Overriding**

A subclass can override a method from the superclass to provide a specific implementation.

The method signature must be the same.

**Example**:

```
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
```

---

## **Advantages of Inheritance**

* Reusability of code.
 
* Method overriding allows runtime polymorphism.
 
* Helps in organizing and structuring software.

---
