
---
# **Constructors in Java**

Constructors in Java are **special methods** used to initialize objects. They are called when an object of a class is created. Constructors have the **same name as the class** and **do not have a return type**.

---

**Syntax**

```
class ClassName {
    ClassName() {
        // constructor body
    }
}
```
---

## **🔹 Types of Constructors**
<br>


### **1. Default Constructor**

A constructor with **no parameters**. 

Java provides a default constructor if no other constructors are defined.

```
class MyClass {
    MyClass() {
        System.out.println("Default constructor called");
    }
}
```

### **2. Parameterized Constructor**

A constructor that accepts **arguments** to initialize an object with specific values.


```
class MyClass {
    int x;

    MyClass(int val) {
        x = val;
    }
}
```

### **3. Copy Constructor**

Java _does not have a built-in copy constructor_ like C++, but it can be implemented manually.


```
class MyClass {
    int x;

    MyClass(int val) {
        x = val;
    }

    // Copy constructor
    MyClass(MyClass obj) {
        x = obj.x;
    }
}
```

## **🔹 Key Points**

* Constructor name must match the class name.

* No return type (not even void).

* Can be overloaded.

* Can use this() to call another constructor from the same class.

* Constructors are not inherited.

## **🔹 Constructor Overloading**

Java allows multiple constructors with different parameter lists.


```
class MyClass {
    int x;
    String name;

    MyClass() {
        x = 0;
        name = "Default";
    }

    MyClass(int val) {
        x = val;
    }

    MyClass(int val, String str) {
        x = val;
        name = str;
    }
}
```

---

## **🔹 this() Keyword**

You can call one constructor from another using this():


```
class MyClass {
    int x;
    String name;

    MyClass() {
        this(0, "Unknown");
    }

    MyClass(int x, String name) {
        this.x = x;
        this.name = name;
    }
}
```

---

## **✅ Summary**

* **Constructor Name** -> Same as class name

* **Return Type** -> None

* **Default Constructor** -> No parameters

* **Parameterized** -> Takes arguments

* **Overloading** -> Allowed

* **Copy Constructor** -> Manually created

* **this()** -> Calls another constructor in the same class