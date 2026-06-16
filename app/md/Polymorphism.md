# Polymorphism in Java

Polymorphism allows methods to have different implementations.

**Types:**
- Compile-time (Method Overloading)
- Runtime (Method Overriding)

**Example of Overriding:**
```java
class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}
```