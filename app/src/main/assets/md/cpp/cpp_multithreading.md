# Multithreading in C++

**Multithreading** allows a program to execute multiple parts (threads) of code **concurrently**.  
C++11 introduced `<thread>` library to create and manage threads easily.

---

## Why Multithreading?

- Perform multiple tasks at the same time.
- Efficient CPU utilization.
- Useful in tasks like file handling, network programming, and parallel computation.

---

## Creating a Thread
<br>

```cpp
#include <iostream>
#include <thread>
using namespace std;

void printHello() {
    cout << "Hello from thread!" << endl;
}

int main() {
    thread t1(printHello);  // create a thread
    t1.join();              // wait for thread to finish
    return 0;
}
```

## **Thread with Parameters**
<br>

```
#include <iostream>
#include <thread>
using namespace std;

void printNumber(int n) {
    cout << "Number: " << n << endl;
}

int main() {
    thread t1(printNumber, 5);  // pass argument
    t1.join();
    return 0;
}
```

## **Detaching a Thread**

**detach()** allows the thread to run independently in the background.

The main thread will not wait for it.

```
#include <iostream>
#include <thread>
#include <chrono>
using namespace std;

void backgroundTask() {
    this_thread::sleep_for(chrono::seconds(2));
    cout << "Background task finished!" << endl;
}

int main() {
    thread t1(backgroundTask);
    t1.detach();   // run independently

    cout << "Main thread continues..." << endl;
    this_thread::sleep_for(chrono::seconds(3));
    return 0;
}
```

## **Mutex (Mutual Exclusion)**

When multiple threads access shared data, race conditions may occur.
**std::mutex** ensures only one thread accesses a resource at a time.

```
#include <iostream>
#include <thread>
#include <mutex>
using namespace std;

mutex mtx;

void printSafe(int id) {
    mtx.lock();
    cout << "Thread " << id << " is running" << endl;
    mtx.unlock();
}

int main() {
    thread t1(printSafe, 1);
    thread t2(printSafe, 2);

    t1.join();
    t2.join();
    return 0;
}
```

Lock Guard (RAII Mutex)
Instead of manually locking/unlocking, use lock_guard for automatic unlocking.

```
#include <iostream>
#include <thread>
#include <mutex>
using namespace std;

mutex mtx;

void task(int id) {
    lock_guard<mutex> lg(mtx);
    cout << "Thread " << id << " executing safely" << endl;
}

int main() {
    thread t1(task, 1), t2(task, 2);
    t1.join();
    t2.join();
    return 0;
}
```

## **Thread Synchronization Tools**

**std::mutex** → prevent race conditions.

**std::lock_guard** → auto-lock/unlock mutex.

**std::unique_lock** → flexible locking mechanism.

**std::condition_variable** → thread communication.

**std::future & std::promise** → return values from threads.

## **Summary**

<thread> → create and manage threads.

**join()** → wait for thread to finish.

**detach()** → run independently.

**mutex** → protect shared resources.

Use multithreading for parallelism and performance.