# Modules and Packages in Python

Modules and packages help organize Python code into reusable files and directories.

---

## 1. Python Modules

- A **module** is a file containing Python code (functions, classes, variables) that can be imported into other Python files.
- File extension: `.py`

### Example: Creating and Using a Module

**mymodule.py**
```python
def greet(name):
    print("Hello, " + name + " from LearnCodeX")
```
    
**main.py**

```
import mymodule

mymodule.greet("Python")
```
Output:

**Hello, Python from LearnCodeX**

## **Import Variations**

**Import Specific Function**

```
from mymodule import greet

greet("Python")
```

**Import All Functions**

```
from mymodule import *

greet("Python")
```

**Import with Alias**

```
import mymodule as mm

mm.greet("Python")
```
---

## **2. Python Standard Modules**

Python provides many built-in modules, e.g.:

**math** → Mathematical functions

**random** → Generate random numbers

**datetime** → Work with dates and times

**os** → Operating system functionalities

**sys** → System-specific parameters

Example: **Using math module**

```
import math

print(math.sqrt(16))    # 4.0
print(math.pi)          # 3.141592653589793
```

Example: **Using random module**

```
import random

print(random.randint(1, 10))   # Random integer between 1 and 10
```
---

## **3. Python Packages**

A package is a directory containing multiple Python modules.

A package must contain a special file __init__.py (can be empty).

### **Directory Structure**
<br>

```
LearnCodeX_Package/
    __init__.py
    module1.py
    module2.py
```

### **Importing from a Package**
<br>


```
from LearnCodeX_Package import module1

module1.greet("Python")
```
---

## **4. Installing External Modules**

Use pip to install third-party packages.

```
pip install requests
```

**Using the requests Module**
```
import requests

response = requests.get("https://www.learncodex.com")
print(response.status_code)
```
---

## **5. Exploring Modules**

**dir()** → List all functions/attributes in a module

```
import math
print(dir(math))
```

**help()** → Get documentation about a module

```
import math
help(math)
```
---

## **6. Summary (LearnCodeX)**

* **Module** → Single Python file with reusable code

* **Package** → Collection of modules in a directory
 
* **Importing** → import, from ... import ..., aliases
 
* **Standard Modules** → Built-in modules like math, random, os, sys
 
* **Third-party Modules** → Install using pip