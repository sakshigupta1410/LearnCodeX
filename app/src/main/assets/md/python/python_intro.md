
---
# **What is Python?**

Python is a popular **programming** language. It was created by **Guido van Rossum**, and released in 1991.

**_It is used for:_**

* web development (server-side),
* software development,
* mathematics,
* system scripting.

---

**_What can Python do?_**

* Python can be used on a server to create **web applications**.
 
* Python can be used alongside software to create **workflows**.
 
* Python can connect to **database** systems. It can also read and modify files.
 
* Python can be used to handle **big data** and perform complex mathematics.
 
* Python can be used for rapid **prototyping**, or for production-ready software development.

---

## **Python Syntax**

As we learned earlier, Python syntax can be executed by writing directly in the Command Line:

```
>>> print("Hello, World!")
Hello, World!
```

Or by creating a python file on the server, using the **.py** file extension, and running it in the Command Line:

```
>>> C:\Users\Your Name>python myfile.py
```

---

## **Python Indentation**

Indentation refers to the **spaces** at the beginning of a code line.

Where in other programming languages the indentation in code is for readability only, the indentation in Python is **very important**.

Python uses indentation to **indicate** a block of code.

**Example**

```
if 5 > 2:
print("Five is greater than two!")
```

Python will give you an **error** if you _skip the indentation_:

### **Example**

**Syntax Error:**

```
if 5 > 2:
print("Five is greater than two!")
```

The number of spaces is up to you as a programmer, the most common use is **four**, but it has to be at least **one**.

**Example**

```
if 5 > 2:
    print("Five is greater than two!")
if 5 > 2:
        print("Five is greater than two!")
```

You have to use the same number of spaces in the same block of code, otherwise Python will give you an error:

**Example**
```
//Syntax Error:

if 5 > 2:
    print("Five is greater than two!")
        print("Five is greater than two!")
```
---

## **Python Variables**

In Python, variables are created when you assign a value to it:

**Example**

```
// Variables in Python:

x = 5
y = "Hello, World!"
```

Python has no command for declaring a variable.

You will learn more about variables in the Python Variables chapter.

---

## **Comments**

Python has **commenting** capability for the purpose of **in-code** documentation.

Comments start with a **`#`** , and Python will render the rest of the line as a comment:

**Example**

```



Comments in Python:

#This is a comment.
print("Hello, World!")
```

---

**_Why Python?_**

* Python works on different platforms (Windows, Mac, Linux, Raspberry Pi, etc).
 
* Python has a simple syntax similar to the English language.
 
* Python has syntax that allows developers to write programs with fewer lines than some other programming languages.
 
* Python runs on an interpreter system, meaning that code can be executed as soon as it is written. This means that prototyping can be very quick.
 
* Python can be treated in a procedural way, an object-oriented way or a functional way.

---

**_Good to know_**

* The most recent major version of Python is Python 3, which we shall be using in this tutorial. 
 
* In this tutorial Python will be written in a text editor. It is possible to write Python in an Integrated Development Environment, such as Thonny, Pycharm, Netbeans or Eclipse which are particularly useful when managing larger collections of Python files.
 
* Python Syntax compared to other programming languages
 
* Python was designed for readability, and has some similarities to the English language with influence from mathematics.
 
* Python uses new lines to complete a command, as opposed to other programming languages which often use semicolons or parentheses.
 
* Python relies on indentation, using whitespace, to define scope; such as the scope of loops, functions and classes. Other programming languages often use curly-brackets for this purpose.

**Example**

```
print("Hello, World!")
```
---