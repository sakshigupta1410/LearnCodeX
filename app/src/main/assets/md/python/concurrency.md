# ⚡ **Concurrency in Python**

---

## 🔍 **What is Concurrency?**

Concurrency means doing **multiple things at the same time** to improve performance, especially when dealing with:

- I/O operations (reading files, network requests)
- Tasks that can run independently

Python supports concurrency mainly through:
- **Threads**
- **Asyncio (asynchronous programming)**

---

## **🧵 Using Threads with `threading` Module**

Threads allow running multiple operations concurrently in the same process.

---

### Example: Running Threads
<br>

```python
import threading
import time

def print_numbers():
    for i in range(5):
        print(i)
        time.sleep(1)

thread = threading.Thread(target=print_numbers)
thread.start()

print("Main thread continues...")
thread.join()  # Wait for thread to finish
print("Thread finished.")
```
Output:
**0
Main thread continues...
1
2
3
4
Thread finished.**

## **⚠️ Note About Python Threads and GIL**

Python has a Global Interpreter Lock (GIL) which means only one thread executes Python bytecode at a time.

Threads are great for I/O-bound tasks but not much for CPU-bound tasks.

## **🌀 Asynchronous Programming with asyncio**

Async programming lets you run tasks without blocking while waiting for I/O.

Example: **Async Function**

```
import asyncio

async def say_hello():
print("Hello")
await asyncio.sleep(1)
print("World")

asyncio.run(say_hello())
```
Output:
**Hello
World**

<br>

**Running Multiple Async Tasks Concurrently**

```
import asyncio

async def count(name, delay):
for i in range(3):
print(f"{name}: {i}")
await asyncio.sleep(delay)

async def main():
await asyncio.gather(
count("A", 1),
count("B", 1.5),
)

asyncio.run(main())
```
Output:
**A: 0
B: 0
A: 1
B: 1
A: 2
B: 2**


## **🧪 Practice Challenge**

* Write a program that fetches data from two URLs asynchronously using aiohttp (an async HTTP client).

* Print the lengths of the responses.

## **✅ Summary**

* Concurrency improves efficiency for I/O-bound tasks.

* Use threading for simple threads and I/O-bound concurrency.
 
* Use asyncio for scalable asynchronous code.
 
* Python’s GIL limits CPU-bound parallelism with threads (use multiprocessing for that).