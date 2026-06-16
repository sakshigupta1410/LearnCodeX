# 🗂️ **Context Managers & the `with` Statement**

---

## 🔍 **What is the `with` Statement?**

The `with` statement in Python is used to wrap the execution of a block with methods defined by a **context manager**.

It helps **manage resources** like files, network connections, locks, and more, by **automatically handling setup and cleanup**.

---

## **Why Use the `with` Statement?**

Without `with`, you need to manually:

- Open resources
- Handle errors
- Close or release resources

Example without `with`:

```python
file = open('example.txt', 'r')
try:
    data = file.read()
finally:
    file.close()
```
With `with`, this becomes much simpler:

```
with open('example.txt', 'r') as file:
data = file.read()
```
---
 
**_file is automatically closed here_**

**_How Does with Work?_**

* When Python reaches a with statement, it:

* Calls the context manager’s __enter__() method — sets things up
 
* Assigns the value returned by __enter__() to the variable after as (if any)
 
* Executes the block of code inside with
 
* Calls the context manager’s __exit__() method — cleans up, even if exceptions occur

Example: **Writing a File with `with`**

```
with open('test.txt', 'w') as file:
file.write("Hello, world!")
```

**_No need to call file.close()_**

## **Creating Your Own Context Manager**

**Using a Class**

```
class ManagedFile:
def __init__(self, filename):
self.filename = filename

    def __enter__(self):
        self.file = open(self.filename, 'w')
        return self.file

    def __exit__(self, exc_type, exc_value, traceback):
        self.file.close()

with ManagedFile('hello.txt') as f:
f.write("Hello from ManagedFile!")
```

**Using `contextlib.contextmanager`**

```
from contextlib import contextmanager

@contextmanager
def managed_file(filename):
f = open(filename, 'w')
try:
yield f
finally:
f.close()

with managed_file('hello2.txt') as f:
f.write("Hello from contextlib!")
```

## 🧪 **Practice Challenge**

Write a context manager that prints “**Start**” when entering and “**End**” when exiting the block.

Use it with a with statement.

## ✅ **Summary**

* The with statement simplifies resource management by automatically handling setup and cleanup.
* Context managers implement __enter__ and __exit__ methods.
* Use built-in context managers (like open) or create your own using classes or `contextlib`.