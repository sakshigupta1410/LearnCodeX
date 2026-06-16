# 🧪 **Testing in Python**

---

## **Why Testing?**

- Ensures your code works correctly
- Helps catch bugs early
- Makes code easier to maintain and refactor

---

## **Simple Assertion Testing**

You can use `assert` statements to quickly check conditions:

```python
def add(a, b):
    return a + b

assert add(2, 3) == 5
assert add(0, 0) == 0
print("All tests passed!")
```

If an assertion fails, Python raises an AssertionError.

### **Using the unittest Module**

Python’s built-in unittest framework helps write organized test cases.

**Basic Example**

```
import unittest

def add(a, b):
return a + b

class TestAddFunction(unittest.TestCase):
def test_add_positive(self):
self.assertEqual(add(2, 3), 5)

    def test_add_zero(self):
        self.assertEqual(add(0, 0), 0)

if __name__ == "__main__":
unittest.main()
```
<br>

Run this file, and it will run all tests, showing results.

## **Other Testing Frameworks**

**pytest** — more powerful and user-friendly than unittest

**doctest** — tests embedded in docstrings

## **🧪 Practice Challenge**

- Write a function that multiplies two numbers.

- Write unittest test cases for it.

- Run the tests and confirm they pass.

## **Summary**

* Use assert for quick checks.

* Use unittest for structured testing.
 
* Testing improves code quality and confidence.