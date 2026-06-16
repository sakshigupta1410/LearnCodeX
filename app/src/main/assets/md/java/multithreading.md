
---

# 🔹**What is Multithreading?**

Multithreading is a feature that allows a program to execute **multiple threads** (smaller units of a process) concurrently.

- Improves **performance** and **responsiveness**.
- Useful for tasks like handling user interface, background processing, etc.

---


## 🔹**Creating Threads in Java**

There are two ways:

1. **Extending Thread class**
2. **Implementing Runnable interface**

---

### **🔸 1. Extending Thread Class**
<br>


```
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread running: " + Thread.currentThread().getName());
    }
}

public class TestThread {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();  // Start the thread, calls run() internally
```

### **🔸 2. Implementing Runnable Interface**
<br>


```
class MyRunnable implements Runnable {
public void run() {
System.out.println("Runnable Thread: " + Thread.currentThread().getName());
}
}

public class TestRunnable {
public static void main(String[] args) {
Thread t1 = new Thread(new MyRunnable());
t1.start();
}
}
```

---

### **🔹 Thread Lifecycle**

1. **New** -> Thread created but not started
 
2. **Runnable** -> Ready to run, waiting for CPU
 
3. **Running** -> Executing
 
4. **Waiting/Blocked** -> Waiting for resource or event

5. **Terminated** -> Finished execution


### **🔹 Common Thread Methods**

* **start()** -> Starts the thread and calls run()
* **run()** -> Contains the code executed by thread
* **sleep(ms)** -> Pauses thread for specified milliseconds
* **join()** -> Waits for thread to finish
* **setPriority()** -> Sets thread priority (1 to 10)

---

## **🔹 Synchronization**

Prevents race conditions when **multiple** threads access shared resources.

Use the `synchronized` keyword.

```
class Counter {
int count = 0;

    public synchronized void increment() {
        count++;
    }
}
```
<br>

**🔹 Example: Using Synchronization**

```
class Counter {
int count = 0;

    public synchronized void increment() {
        count++;
    }
}

class MyThread extends Thread {
Counter counter;

    MyThread(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}

public class TestSync {
public static void main(String[] args) throws InterruptedException {
Counter counter = new Counter();
MyThread t1 = new MyThread(counter);
MyThread t2 = new MyThread(counter);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Count: " + counter.count);
    }
}
```

---

## **✅ Summary**

* Multithreading allows multiple threads to run concurrently.
 
* Threads can be created by extending Thread or implementing Runnable.
 
* Use synchronization to avoid thread interference.
 
* Proper thread management avoids deadlocks and race conditions.