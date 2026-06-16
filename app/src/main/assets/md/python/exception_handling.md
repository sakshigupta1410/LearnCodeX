# **Exception Handling in Python**

Exception handling is used to **handle errors** in Python so that the program does not crash.  
Common errors include dividing by zero, accessing missing files, or invalid input.

---

## **Try and Except**

The basic syntax uses `try` and `except`:

```python
try:
    x = 10 / 0
except ZeroDivisionError:
    print("Cannot divide by zero")
    
```
Output:

**Cannot divide by zero**

## **Handling Multiple Exceptions**

You can handle multiple types of exceptions:

```
try:
    x = int("LearnCodeX")
except ValueError:
    print("Invalid conversion")
except ZeroDivisionError:
    print("Cannot divide by zero")
```

## **The Else Clause**

The else block runs if no exception occurs:

```
try:
    x = 10 / 2
except ZeroDivisionError:
    print("Cannot divide by zero")
else:
    print("Division successful:", x)
    
```
Output:

**Division successful: 5.0**

## **The Finally Clause**

The finally block always runs, whether an exception occurs or not:

```
try:
    f = open("file.txt")
except FileNotFoundError:
    print("File not found")
finally:
    print("Execution finished")
    
```

## **Raising an Exception**

You can manually raise an exception using raise:

```
x = -5
if x < 0:
    raise Exception("Sorry, negative numbers are not allowed")
```
Output:

**Exception: Sorry, negative numbers are not allowed**

## **Catching All Exceptions**

You can catch any exception (not recommended for production):

```
try:
    x = 10 / 0
except:
    print("Something went wrong")
```

## **Using Exception Objects**

You can get the error details:

```
try:
    x = 10 / 0
except ZeroDivisionError as e:
    print("Error:", e)
```
Output:

**Error: division by zero**

## **Example with File Handling**
<br>

```
try:
    with open("LearnCodeX.txt", "r") as f:
        data = f.read()
except FileNotFoundError as e:
    print("Error:", e)
finally:
    print("Finished checking the file")
```
<br>

## ✅ **Summary (LearnCodeX):**

* **try** → Code that might cause an exception

* **except** → Handles the exception
 
* **else** → Runs if no exception occurs
 
* **finally** → Always runs
 
* **raise** → Raise your own exceptions