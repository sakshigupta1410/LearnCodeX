# **Python Loops**

Python has two main loop types:

- **while loops** → Execute a set of statements as long as a condition is true.
- **for loops** → Used for iterating over a sequence (list, tuple, dictionary, set, string).

---

## **while Loop**

The `while` loop executes as long as the condition is true.

```python
i = 1
while i < 6:
    print(i)
    i += 1
```

## **The break Statement**

Stops the loop even if the condition is true.

```
i = 1
while i < 6:
print(i)
if i == 3:
break
i += 1
```

## **The continue Statement**

Skips the rest of the code and continues with the next iteration.

```
i = 0
while i < 6:
i += 1
if i == 3:
continue
print(i)
```

## **The else Statement**

Runs once when the condition is no longer true.

```
i = 1
while i < 6:
print(i)
i += 1
else:
print("i is no longer less than 6")
```

## **for Loop**

The for loop iterates over a sequence (list, tuple, set, dictionary, string).

```
fruits = ["apple", "banana", "cherry"]
for x in fruits:
print(x)
```

### **Looping Through a String**
<br>

```
for x in "banana":
print(x)
```

### **The break Statement**
<br>

```
fruits = ["apple", "banana", "cherry"]
for x in fruits:
print(x)
if x == "banana":
break
```

### **The continue Statement**
<br>

```
fruits = ["apple", "banana", "cherry"]
for x in fruits:
if x == "banana":
continue
print(x)
```

### **The range() Function**

**range()** returns a sequence of numbers, starting from 0 by default.

```
for x in range(6):
print(x)
```

**Start from a specific number:**

```
for x in range(2, 6):
print(x)
```

**With step value:**

```
for x in range(2, 30, 3):
print(x)
```

## **The else Statement**

Executes once after the loop ends normally (not by break).

```
for x in range(6):
print(x)
else:
print("Finally finished!")
```

If the loop ends with break, else does not run:

```
for x in range(6):
if x == 3:
break
print(x)
else:
print("This will not be printed")
```

## **Nested Loops**

A loop inside another loop.

```
adj = ["red", "big", "tasty"]
fruits = ["apple", "banana", "cherry"]

for x in adj:
for y in fruits:
print(x, y)
```

## **The pass Statement**

Loops cannot be empty. Use pass as a placeholder.

```
for x in [0, 1, 2]:
pass
```