# Multithreading in Java

Multithreading allows concurrent execution of two or more threads.

**Example:**
```java
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread running");
    }
}
```