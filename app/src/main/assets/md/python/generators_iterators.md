# 🔁 **Python Generators and Iterators**

---

## 🧠 **What Are Iterators?**

An **iterator** is an object that allows you to **traverse through all the elements** of a collection (like a list or tuple) one at a time.

To be an iterator, an object must implement two methods:

- `__iter__()` – returns the iterator object
- `__next__()` – returns the next value (or raises `StopIteration` when done)

### ✅ **Example: Custom Iterator**
<br>

```python
class CountUp:
    def __init__(self, limit):
        self.limit = limit
        self.counter = 0

    def __iter__(self):
        return self

    def __next__(self):
        if self.counter < self.limit:
            self.counter += 1
            return self.counter
        else:
            raise StopIteration

counter = CountUp(3)
for num in counter:
    print(num)
```
Output:

**1
2
3**

## **🔄 What Is a Generator?**

A generator is a simpler way to create an iterator using the yield keyword instead of return.

It automatically creates:

The __iter__() method

The __next__() method

## **Internal state management**

**⚡ Generator Example**

```
def count_up(limit):
counter = 1
while counter <= limit:
yield counter
counter += 1

for num in count_up(3):
print(num)

```
Output:

**1
2
3**

## 🧬 **How yield Works**

yield pauses the function and remembers the state

When **next()** is called again, the function resumes from where it left off

## 🧠 **Generator vs. Function**

| **Aspect**       | **Function**             | **Generator**                  |
|------------------|--------------------------|--------------------------------|
| **Uses**         | `return`                 | `yield`                        |
| **Returns**      | Value and exits          | Iterator                       |
| **Memory usage** | Stores all results       | Generates one value at a time  |
| **Use case**     | One-time computation     | Iteration / lazy loading       |

## ✅ **Use Case: Reading Large Files**
<br>

```
def read_large_file(filepath):
with open(filepath, 'r') as f:
for line in f:
yield line

for line in read_large_file('bigfile.txt'):
print(line.strip())
```

Efficiently reads one line at a time without loading the entire file into memory.

## ⚙️ **Generator Expressions**

Just like list comprehensions, but use **()** instead of **[]**

```
squares = (x*x for x in range(5))

for num in squares:
print(num)

```

Output:

**0
1
4
9
16**

## 🧪 **Practice Task**

**Try This:**

Create a generator that yields all even numbers up to a given number n.

**Hint**: Use yield and a loop with step of 2.

## 🚀 **Bonus: iter() with Sentinel**
<br>

```
f = open('data.txt', 'r')
for line in iter(f.readline, ''):
print(line.strip())
```

This uses `iter()` with a sentinel value ('' means EOF).

## ✅ **Summary**

* Iterators require __iter__() and __next__() methods

* Generators are a simple way to create iterators using yield
 
* They are memory-efficient and lazy-loaded
 
* Ideal for large datasets, infinite sequences, or streaming data