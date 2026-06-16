# **Object-Oriented Programming (OOP)**

Python is an object-oriented programming language.  
OOP allows you to structure your code using **classes** and **objects**.

---

## **1. Classes and Objects**

- **Class** → A blueprint for creating objects.
- **Object** → An instance of a class.

```python
class MyClass:
    x = 10

p1 = MyClass()    # Creating an object
print(p1.x)
```
---

## **2. The __init__ Method (Constructor)**

The __init__ method runs as soon as an object is created. It is used to initialize object attributes.

```
class Person:
    def __init__(self, name, age):
        self.name = name
        self.age = age

Person("LearnCodeX", 21)
print(p1.name)
print(p1.age)
```
---

## **3. Instance Methods**

Functions defined inside a class that operate on an object.

```
class Person:
    def __init__(self, name, age):
        self.name = name
        self.age = age

    def greet(self):
        print("Hello, my name is " + self.name)

p1 = Person("LearnCodeX", 21)
p1.greet()
```
---

## **4. The self Keyword**

self represents the instance of the class.

Used to access variables and methods belonging to the object.

```
class Person:
    def __init__(self, name):
        self.name = name

    def print_name(self):
        print(self.name)
```
---

## **5. Inheritance**

Inheritance allows a class to inherit properties and methods from another class.

```
class Parent:
    def func1(self):
        print("This is the parent class")

class Child(Parent):
    def func2(self):
        print("This is the child class")

c = Child()
c.func1()
c.func2()
```
---

## **6. Encapsulation**

Encapsulation restricts access to methods and variables.

Prefix attributes with _ (protected) or __ (private).

```
class Person:
    def __init__(self, name, age):
        self.__name = name   # private attribute
        self.__age = age

    def get_name(self):
        return self.__name

p = Person("LearnCodeX", 21)
print(p.get_name())
```
---

## **7. Polymorphism**

Polymorphism allows methods with the same name to behave differently in different classes.

```
class Cat:
    def sound(self):
        print("Meow")

class Dog:
    def sound(self):
        print("Bark")

animals = [Cat(), Dog()]
for a in animals:
    a.sound()
```
---

## **8. Abstraction**

Abstraction hides the complex implementation from the user.

Use abc module and @abstractmethod.

```
from abc import ABC, abstractmethod

class Vehicle(ABC):
    @abstractmethod
    def move(self):
        pass

class Car(Vehicle):
    def move(self):
        print("Car moves on 4 wheels")

c = Car()
c.move()
```
---

## **9. Class & Static Methods**

**Class Method:** Operates on the class rather than the instance. Use @classmethod.

**Static Method:** Does not access class or instance. Use @staticmethod.

```
class LearnCodeX:
    count = 0

    @classmethod
    def increment_count(cls):
        cls.count += 1

    @staticmethod
    def greet():
        print("Welcome to LearnCodeX")

LearnCodeX.increment_count()
LearnCodeX.greet()
```
---

## **10. Summary (LearnCodeX)**

* **Class** → Blueprint

* **Object** → Instance of class
 
* __init__ → Constructor
 
* **self** → Refers to object instance
 
* **Inheritance** → Reuse parent properties
 
* **Encapsulation** → Restrict access to private variables
 
* **Polymorphism** → Same method name, different behavior
 
* **Abstraction** → Hide implementation
 
* **Class/Static methods** → Operate on class or independent of object