
# 🐍 Python Variables

## 🧠 What Are Variables?

Variables are containers used to **store values**.

📌 In Python, you **don’t need to declare** the type of a variable — it's automatically assigned when you give it a value.

```python
x = 5
y = "John"
print(x)
print(y)
```

Python is **dynamically typed**, meaning a variable's type can change:

```python
x = 4        # x is an integer
x = "Sally"  # now x is a string
```

---

## 🎭 Type Casting

Sometimes you want to specify the type manually. You can **cast** variables like this:

```python
x = str(3)    # x becomes '3' (string)
y = int(3)    # y becomes 3 (integer)
z = float(3)  # z becomes 3.0 (float)
```

🔍 To **check the type** of a variable:

```python
print(type(x))  # e.g., <class 'str'>
```

---

## 🔤 Strings and Quotes

You can use **single** or **double quotes** to define strings:

```python
x = "John"
y = 'John'
```

✅ Both are valid and behave the same!

---

## 🔠 Case Sensitivity

Python is **case-sensitive**, so:

```python
a = 4
A = "Hello"
```

📝 `a` and `A` are **two different variables**.

---

## ✅ Rules for Naming Variables

Follow these rules while naming:

🔸 Must start with a **letter (A–Z, a–z)** or an **underscore `_`**  
🔸 Cannot start with a number  
🔸 Can contain **letters, numbers, and underscores** only  
🔸 **Case-sensitive**: `myvar`, `MyVar`, `MYVAR` are all different  
🔸 Don’t use Python’s **reserved keywords** (`if`, `while`, `class`, etc.)

### ✅ Valid Examples
```python
myvar = "John"
my_var = "John"
_my_var = "John"
myVar = "John"
MYVAR = "John"
myvar2 = "John"
```

### ❌ Invalid Examples
```python
2myvar = "John"    # ❌ Starts with a number
my-var = "John"    # ❌ Hyphens not allowed
my var = "John"    # ❌ No spaces allowed
```

---

## 🧱 Naming Styles (for multi-word names)

To make variables readable, you can use any of these styles:

| Style        | Example             |
|--------------|---------------------|
| camelCase    | `myVariableName`    |
| PascalCase   | `MyVariableName`    |
| snake_case 🐍 | `my_variable_name`  |

✅ Python developers usually prefer **snake_case**.

---

## 🧮 Assigning Multiple Values

Assign values to **multiple variables** in a single line:

```python
x, y, z = "Apple", "Banana", "Cherry"
```

Or assign **one value to multiple variables**:

```python
x = y = z = "Orange"
```

🔓 **Unpacking** a collection:

```python
fruits = ["apple", "banana", "cherry"]
x, y, z = fruits
```

---

## 🧪 Variable Data Types

Python comes with many built-in data types:

| Category     | Types                            |
|--------------|----------------------------------|
| Text         | `str`                            |
| Numbers      | `int`, `float`, `complex`        |
| Sequence     | `list`, `tuple`, `range`         |
| Mapping      | `dict`                           |
| Set          | `set`, `frozenset`               |
| Boolean      | `bool`                           |
| Binary       | `bytes`, `bytearray`, `memoryview` |
| Special Type | `NoneType`                       |

📌 Use `type()` to check a variable’s type:

```python
x = 5
print(type(x))  # Output: <class 'int'>
```

💡 Convert between types:

```python
x = str(5)
y = float(5)
```

---

## ✅ Quick Recap

| Feature              | Description                                 |
|----------------------|---------------------------------------------|
| **No declaration**   | Type assigned automatically                 |
| **Dynamic typing**   | Type can change during execution            |
| **Casting**          | Manually define type using `str()`, `int()` |
| **Naming rules**     | Letters, numbers, underscores only          |
| **Naming styles**    | Prefer `snake_case` in Python               |
| **Multi assignment** | Assign multiple variables at once           |
| **Data types**       | `str`, `int`, `float`, `list`, `bool`, etc. |
