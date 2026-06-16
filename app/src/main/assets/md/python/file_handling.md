# **File Handling in Python**

File handling is an essential part of programming. Python provides built-in functions to create, read, update, and delete files.

## **File Handling Modes**

When opening files, you need to specify the mode:

* "**r**" – Read (default). Opens the file for reading. Error if file does not exist.

* "**a**" – Append. Opens the file for appending (adds data at the end). Creates the file if it does not exist.

* "**w**" – Write. Opens the file for writing (overwrites existing content). Creates the file if it does not exist.

* "**x**" – Create. Creates a new file. Error if file already exists.

Additionally, you can specify **binary/text** mode:

"**t**" – Text mode (default).

"**b**" – Binary mode (e.g., images, PDFs).

### **Opening a File**
<br>

```
f = open("example.txt", "r")  # open file in read mode
print(f.read())               # read entire content
f.close()
```

### **Reading a File**

**Read Entire File:**

```
f = open("example.txt", "r")
print(f.read())
f.close()
```
<br>

**Read First N Characters:**

```
f = open("example.txt", "r")
print(f.read(10))  # reads first 10 characters
f.close()
```
<br>

**Read Line by Line:**

```
f = open("example.txt", "r")
print(f.readline())  # reads first line
print(f.readline())  # reads next line
f.close()
```
<br>

**Loop Through Lines:**

```
f = open("example.txt", "r")
for line in f:
print(line)
f.close()
```

## **Writing to a File**

**Overwrite File Content (w):**

```
f = open("example.txt", "w")
f.write("Hello, LearnCodeX!\n")
f.write("This will overwrite old content.")
f.close()
```
<br>

**Append to File (a):**
```
f = open("example.txt", "a")
f.write("\nAdding a new line at the end.")
f.close()
```
<br>

**Creating a New File**
```
f = open("newfile.txt", "x")  # creates a new file
f.write("This is a new file created by LearnCodeX.")
f.close()
```

## **Using with Statement**

It is a good practice to use with as it automatically closes the file:

```
with open("example.txt", "r") as f:
data = f.read()
print(data)
```

### **Deleting a File**

To delete a file, use the os module:

```
import os

if os.path.exists("example.txt"):
os.remove("example.txt")
else:
print("The file does not exist")
```

## ✅ **Summary (LearnCodeX):**

* Use **open()** with modes (**r**, **w**, **a**, **x**).

* Always close the file (or use **with**).

* Use `os.remove()` to delete files.

* Use **loops** to read line by line.