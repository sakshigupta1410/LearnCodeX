# 🐍 **Writing Pythonic Code**

---

## 🔍 **What Does "Pythonic" Mean?**

**Pythonic** refers to writing code that:

- Follows Python's **idioms** and **best practices**
- Is **clear**, **concise**, and **readable**
- Takes advantage of Python’s features to write elegant and efficient code

Being Pythonic means writing code that **feels natural** to Python developers.

---

## 🧩 **Examples of Pythonic vs Non-Pythonic Code**
<br>

### **1. Using List Comprehensions**
<br>

**Non-Pythonic:**

```python
squares = []
for x in range(10):
    squares.append(x**2)
```

**Pythonic**:

```
squares = [x**2 for x in range(10)]
```

---

### **2. Using enumerate() Instead of range(len())**

**Non-Pythonic:**

```
items = ['a', 'b', 'c']
for i in range(len(items)):
print(i, items[i])
```

**Pythonic**:

```
items = ['a', 'b', 'c']
for i, item in enumerate(items):
print(i, item)
```

### **3. Using with Statement for File Handling**

**Non-Pythonic**:

```
file = open('file.txt', 'r')
data = file.read()
file.close()
```

**Pythonic**:

```
with open('file.txt', 'r') as file:
data = file.read()
```

## 🐍 **Other Pythonic Tips**

* Use meaningful variable names
* Avoid unnecessary variables and loops
* Leverage Python's built-in functions and libraries
* Use exceptions for error handling instead of error codes
* Follow PEP 8 style guidelines for readability

## 🧪 **Practice Challenge**

Rewrite this code to be more Pythonic:

```
result = []
for i in range(5):
if i % 2 == 0:
result.append(i * 2)
print(result)
```

## ✅ **Summary**

- Pythonic code is simple, readable, and efficient.

- Use Python’s powerful features like comprehensions, context managers, and built-in functions.

- Following Pythonic principles makes your code easier to maintain and share.