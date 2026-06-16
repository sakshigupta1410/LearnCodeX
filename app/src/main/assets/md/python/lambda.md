# **Lambda Functions in Python**

A **lambda function** is a small anonymous function defined using the `lambda` keyword.  
It can have any number of arguments but only **one expression**.  
Lambda functions are also called **anonymous functions**.

---

## **1. Basic Syntax**

<br>

```python
lambda arguments: expression
```

**Example**:

```
x = lambda a: a + 10
print(x(5))
```
<br>

Output:
**15**

---

## **Lambda with Multiple Arguments**
<br>

```
x = lambda a, b: a + b
print(x(5, 3))
```

Output:

**8**

---

## **3. Using Lambda Functions with `map()`**
<br>

The **map()** function applies a function to all items in an iterable.

```
nums = [1, 2, 3, 4]
squared = list(map(lambda x: x**2, nums))
print(squared)
```

Output: 
**[1, 4, 9, 16]**

---

## **4. Using Lambda Functions with `filter()`**
<br>

The **filter()** function returns items from an iterable that satisfy a condition.
<br>

```
nums = [1, 2, 3, 4, 5, 6]
even = list(filter(lambda x: x % 2 == 0, nums))
print(even)
```

Output:
**[2, 4, 6]**

---


## **5. Using Lambda Functions with `reduce()`**

The **reduce()** function from functools applies a function cumulatively to items.

```
from functools import reduce

nums = [1, 2, 3, 4]
result = reduce(lambda x, y: x + y, nums)
print(result)
```

Output:

**10**

---

## **6. Using Lambda Functions with `sorted()`**

You can sort a list of tuples by a specific element using lambda:

```
points = [(2, 3), (1, 2), (4, 1)]
points_sorted = sorted(points, key=lambda x: x[1])
print(points_sorted)
```

Output:
**[(4, 1), (1, 2), (2, 3)]**

---

## **7. Lambda Functions vs Regular Functions**

**Lambda functions**: Single line, anonymous, used for small tasks

**Regular functions**: Defined with def, can have multiple expressions, named

```
# Lambda
x = lambda a: a + 5

# Regular
def add_five(a):
    return a + 5
```
---

## **8. Summary**

* Lambda functions are anonymous, single-expression functions.

* Useful with **map()**, **filter()**, **reduce()**, **sorted()**.
 
* **Syntax**: lambda arguments: expression
 
* Can take multiple arguments but only one expression.