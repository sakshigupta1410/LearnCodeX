# 📘 **Python Decorators**

---

## 🧠 **What is a Decorator?**

A **decorator** in Python is a function that **modifies the behavior of another function** without changing its actual code.

Think of decorators as **wrappers** around your functions — they let you **add extra functionality** dynamically.

---

## 🧩 **Why Use Decorators?**

- **Code reusability**
- **Separation of concerns**
- Clean and elegant way to extend functionality
- Commonly used in:
    - Logging
    - Authentication
    - Timing functions
    - Caching

---

## ⚙️ **Functions as First-Class Objects**

In Python:

- You can **pass functions** as arguments
- You can **return functions** from functions
- You can **assign functions** to variables

```python
def greet():
    return "Hello!"

print(greet())   Output: Hello!
```

Output: **Hello!**

<br>

## 🛠️ **Basic Decorator Syntax**

```
def my_decorator(func):
def wrapper():
print("Before the function call")
func()
print("After the function call")
return wrapper

@my_decorator
def say_hello():
print("Hello!")

say_hello()
```

Output:

**Before the function call<br>
Hello!<br>
After the function call**<br>

## 📦 **Creating and Using Your Own Decorator**
<br>

```
def debug_decorator(func):
def wrapper(*args, **kwargs):
print(f"Function '{func.__name__}' called with arguments: {args}, {kwargs}")
result = func(*args, **kwargs)
print(f"Function '{func.__name__}' returned: {result}")
return result
return wrapper

@debug_decorator
def add(a, b):
return a + b

add(5, 3)
```

Output:

**Function 'add' called with arguments: (5, 3), {}
Function 'add' returned: 8**

## 🔁 **Using Multiple Decorators**
<br>

```
def bold(func):
def wrapper():
return "<b>" + func() + "</b>"
return wrapper

def italic(func):
def wrapper():
return "<i>" + func() + "</i>"
return wrapper

@bold
@italic
def formatted_text():
return "Hello"

print(formatted_text())
```

Output:

**<b><i>Hello</i></b>**

## 🧹 **Preserving Metadata with functools.wraps**

When using decorators, the original function's name and docstring can get lost. Use functools.wraps to preserve them.

```
from functools import wraps

def log(func):
@wraps(func)
def wrapper(*args, **kwargs):
print("Calling", func.__name__)
return func(*args, **kwargs)
return wrapper

@log
def multiply(x, y):
"""Multiplies two numbers."""
return x * y

print(multiply.__name__)  # Output: multiply
print(multiply.__doc__)   # Output: Multiplies two numbers.
```

## 🧩 **Real-World Use Cases**

* Decorators are commonly used in:

* Web frameworks like Flask/Django
 
* Authentication (e.g., @login_required)
 
* Logging
 
* Timing
 
* Caching results

## 🧪 **Practice Challenge**

**Try It Yourself:**

Create a decorator called @timer that measures how long a function takes to run.

💡 **Hint**: Use the `time` module.

## ✅ **Summary**

* Decorators are used to wrap and extend the behavior of functions
 
* Use @decorator_name syntax to apply them

* Keep your code clean, modular, and reusable
 
* Widely used in professional Python applications