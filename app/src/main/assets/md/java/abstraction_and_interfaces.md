
---

## **Abstract Classes and Methods**

Data abstraction is the process of **hiding** certain details and showing only essential information to the user.

Abstraction can be achieved with either abstract classes or interfaces (which you will learn more about in the next chapter).

The **`abstract`** keyword is a non-access modifier, used for classes and methods:

### **Abstract class:** 
It is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).

### **Abstract method:** 
It can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).

An abstract class can have both abstract and regular methods:

```
abstract class Animal {
public abstract void animalSound();
public void sleep() {
System.out.println("Zzz");
}
}
```

From the example above, it is not possible to create an object of the Animal class:

```
Animal myObj = new Animal(); // will generate an error
```

To access the abstract class, it must be inherited from another class. 

Let's convert the Animal class we used in the Polymorphism chapter to an abstract class:

Remember from the Inheritance chapter that we use the `extends` keyword to inherit from a class.

**Example**:

```
// Abstract class
abstract class Animal {
// Abstract method (does not have a body)
public abstract void animalSound();
// Regular method
public void sleep() {
System.out.println("Zzz");
}
}

// Subclass (inherit from Animal)
class Pig extends Animal {
public void animalSound() {
// The body of animalSound() is provided here
System.out.println("The pig says: wee wee");
}
}

class Main {
public static void main(String[] args) {
Pig myPig = new Pig(); // Create a Pig object
myPig.animalSound();
myPig.sleep();
}
}
```

---

### **Why And When To Use Abstract Classes and Methods?**

**To achieve security** - hide certain details and only show the important details of an object.

**Note:** Abstraction can also be achieved with Interfaces

---

## **Interfaces**

Another way to achieve abstraction in Java, is with interfaces.

An interface is a completely "**abstract class**" that is used to group related methods with empty bodies:

**Example**

```
// interface
interface Animal {
public void animalSound(); // interface method (does not have a body)
public void run(); // interface method (does not have a body)
}
```

To access the interface methods, the interface must be "**implemented**" (kinda like inherited)by another class with the implements keyword (instead of extends). 

The body of the interface method is provided by the "**implement**" class:

**Example**

```
// Interface
interface Animal {
public void animalSound(); // interface method (does not have a body)
public void sleep(); // interface method (does not have a body)
}

// Pig "implements" the Animal interface
class Pig implements Animal {
public void animalSound() {
// The body of animalSound() is provided here
System.out.println("The pig says: wee wee");
}
public void sleep() {
// The body of sleep() is provided here
System.out.println("Zzz");
}
}

class Main {
public static void main(String[] args) {
Pig myPig = new Pig();  // Create a Pig object
myPig.animalSound();
myPig.sleep();
}
}
```

---

**Notes on Interfaces:**
* Like **abstract classes**, interfaces **cannot** be used to create objects (in the example above, it is not possible to create an "Animal" object in the MyMainClass)
* Interface methods do not have a body - the body is provided by the "implement" class
* On implementation of an interface, you must override all of its methods
* Interface methods are by default **abstract** and **public**
* Interface attributes are by default **public**, **static** and **final**
* An interface cannot contain a constructor (as it cannot be used to create objects)

_**Why And When To Use Interfaces?**_
**1) To achieve security** - hide certain details and only show the important details of an object (interface).

**"multiple inheritance"** (a class can only inherit from one superclass). However, it can be achieved with interfaces, because the class can **implement** multiple interfaces. 
**Note**: To implement multiple interfaces, separate them with a comma (see example below).

---

## **Multiple Interfaces**

To implement multiple interfaces, separate them with a **comma**:

**Example**
```
interface FirstInterface {
public void myMethod(); // interface method
}

interface SecondInterface {
public void myOtherMethod(); // interface method
}

class DemoClass implements FirstInterface, SecondInterface {
public void myMethod() {
System.out.println("Some text..");
}
public void myOtherMethod() {
System.out.println("Some other text...");
}
}

class Main {
public static void main(String[] args) {
DemoClass myObj = new DemoClass();
myObj.myMethod();
myObj.myOtherMethod();
}
}
```