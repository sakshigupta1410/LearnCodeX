# **List Comprehension in Python**

List comprehension provides a **concise way to create lists** in Python.  
It allows creating new lists by applying an expression to each item in an iterable.

---

## **1. Basic Syntax**
<br>

```python
new_list = [expression for item in iterable]
```
<br>

**Example**:

```
nums = [1, 2, 3, 4, 5]
squared = [x**2 for x in nums]
print(squared)
```
Output:

**[1, 4, 9, 16, 25]**

---

## **2. Using Conditions in List Comprehension** 
<br>


```
nums = [1, 2, 3, 4, 5, 6]
even = [x for x in nums if x % 2 == 0]
print(even)
```

Output:
**[2, 4, 6]**

---

## **3. Using If-Else in List Comprehension**

<br>


```
nums = [1, 2, 3, 4, 5]
labels = ["Even" if x % 2 == 0 else "Odd" for x in nums]
print(labels)
```

Output:
**['Odd', 'Even', 'Odd', 'Even', 'Odd']**


---

## **4. Nested Loops in List Comprehension**

<br>

You can use multiple for statements in a single comprehension.

```
colors = ["red", "green", "blue"]
objects = ["ball", "pen"]

combinations = [c + " " + o for c in colors for o in objects]
print(combinations)
```

Output:
**['red ball', 'red pen', 'green ball', 'green pen', 'blue ball', 'blue pen']**


---

## **5. Flattening a List of Lists**

<br>

```
matrix = [[1, 2], [3, 4], [5, 6]]
flat = [num for row in matrix for num in row]
print(flat)
```
<br>

Output:
**[1, 2, 3, 4, 5, 6]**


---

## **6. List Comprehension with Functions**


<br>

```
def square(n):
    return n ** 2

nums = [1, 2, 3, 4]
squared = [square(x) for x in nums]
print(squared)
```

Output:
**[1, 4, 9, 16]**

---

## **7. Advantages of List Comprehension**

<br>

* More concise than regular loops

* Faster execution
 
* Improves readability

---

## **8. Summary**

<br>

* **Syntax**: [expression for item in iterable if condition]

* Can include conditions, if-else, and nested loops

* Useful for creating new lists efficiently from existing iterables