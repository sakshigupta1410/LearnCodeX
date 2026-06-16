# Exception Handling in Java

Exception handling is used to handle runtime errors.

**Example:**
```java
try {
    int result = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Cannot divide by zero");
} finally {
    System.out.println("Finally block executed");
}
```