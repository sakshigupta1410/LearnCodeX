
---
# **Python Conditional Statements**

Python supports the usual logical conditions from mathematics:

- Equals: `a == b`
- Not Equals: `a != b`
- Less than: `a < b`
- Less than or equal to: `a <= b`
- Greater than: `a > b`
- Greater than or equal to: `a >= b`

These conditions can be used in several ways, most commonly in **if statements** and **loops**.

---

## **if Statement**
Used to test a condition and run a block of code if the condition is `True`.

```python
a = 33
b = 200
if b > a:
    print("b is greater than a")
```

## **if...else Statement**

Runs one block if the condition is True, another if it is False.
```
a = 200
b = 33
if b > a:
print("b is greater than a")
else:
print("b is not greater than a")
```
<br>

## **if...elif...else Statement**

Used when you need to test multiple conditions.

```
a = 33
b = 33
if b > a:
print("b is greater than a")
elif a == b:
print("a and b are equal")
else:
print("a is greater than b")
```
<br>

## **Short Hand if**

Write an if statement on one line:

```
if a > b: print("a is greater than b")
```
<br>

## **Short Hand if...else**

Use a single line with both if and else:

```
a = 2
b = 330
print("A") if a > b else print("B")
```

Can also use multiple conditions in one line:

```
a = 330
b = 330
print("A") if a > b else print("=") if a == b else print("B")
```

## **Logical Operators in Conditions**

**and** → Both conditions must be true

```
if a > b and c > a:
print("Both conditions are True")
```

**or** → At least one condition must be true

```
if a > b or a > c:
print("At least one condition is True")
```
<br>

## **Nested if**

An if statement inside another if.

```
x = 41
if x > 10:
print("Above ten,")
if x > 20:
print("and also above 20!")
else:
print("but not above 20.")
```
<br>

## **The pass Statement**

if statements cannot be empty, but if you have an empty block for some reason, use pass to avoid an error.

```
a = 33
b = 200
if b > a:
pass
```

---