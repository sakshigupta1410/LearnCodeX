# 🔍 **Regular Expressions in Python**

---

## 📘 **What is a Regular Expression?**

A **regular expression (regex)** is a **pattern** used to **match**, **search**, or **replace** text.

It allows for:
- Finding specific patterns in strings
- Validating input (emails, phone numbers, etc.)
- Powerful search and replace operations

Python provides the built-in `re` module to work with regex.

## 📦 **Importing the `re` Module**

```

import re
```

### **🔎 Basic Regex Functions**
<br>

`re.search()` - Returns the first match (anywhere in the string)

<br>

```
import re

text = "Hello 2025"
match = re.search(r'\d+', text)
print(match.group())  

re.match()
```
Output: 
**2025**


Matches the pattern only at the beginning of the string.

```
re.match(r'\d+', "2025 is the year")  # ✅ Match
re.match(r'\d+', "Year is 2025")      # ❌ No match

re.findall()
```

Returns all matches in a list.

```
re.findall(r'\d+', "There are 2 apples, 5 oranges, and 10 bananas.")
# Output: ['2', '5', '10']

re.sub()
```

Replaces matched text.

```
re.sub(r'\d+', '[number]', "I have 2 pens and 3 pencils.")
# 
```
Output: 
**"I have [number] pens and [number] pencils."**

## 🧩 **Common Regex Patterns**

| **Pattern** | **Meaning**                              | **Example Match**                      |
|-------------|-------------------------------------------|----------------------------------------|
| `\d`        | Any digit (0–9)                           | 0, 1, 2, ..., 9                         |
| `\D`        | Any non-digit                             | A, !, a, etc.                           |
| `\w`        | Word character (a-z, A-Z, 0-9, _)          | a, 1, _                                 |
| `\W`        | Non-word character                        | #, $, space                             |
| `\s`        | Whitespace (space, tab, newline)          |                                        |
| `.`         | Any character (except newline)            | a, b, 3, @                              |
| `^`         | Start of string                           | `^Hello` matches "Hello World"         |
| `$`         | End of string                             | `world$` matches "Hello world"         |

---

## 🧱 **Quantifiers**

| **Pattern** | **Meaning**                 | **Example**                                   |
|-------------|-----------------------------|-----------------------------------------------|
| `*`         | 0 or more                   | `lo*l` matches `ll`, `lol`, `lool`            |
| `+`         | 1 or more                   | `lo+l` matches `lol`, `lool`                  |
| `?`         | 0 or 1                      | `colou?r` matches `color`, `colour`           |
| `{n}`       | Exactly n times             | `\d{3}` matches `123`                         |
| `{n,}`      | n or more                   | `\d{2,}` matches `12`, `123`, ...             |
| `{n,m}`     | Between n and m times       | `\d{2,4}` matches `12`, `123`, `1234`         |
| -           | Using Groups                | `(abc)+` matches `abc`, `abcabc`, etc.        |

Use parentheses **()** to extract parts of a match.

```
text = "Name: Alice, Age: 25"
match = re.search(r"Name: (\w+), Age: (\d+)", text)

print(match.group(1))  
print(match.group(2))  
```
Output: Alice
Output: 25

## **📧 Regex Example: Validate Email**
<br>

```
pattern = r'^[\w\.-]+@[\w\.-]+\.\w+$'
email = "user@example.com"

if re.match(pattern, email):
print("Valid email!")
else:
print("Invalid email.")
```
Output:
**Valid email!**

## 🧪 **Practice Challenge**

**Try this:**

Write a regex that extracts all hashtags (#word) from a sentence.

**Example**:

```
text = "Loving #Python and #MachineLearning in 2025!"
tags = re.findall(r'#\w+', text)
print(tags)  # Output: ['#Python', '#MachineLearning']
```

## 🧹 **Useful Tips**

Always use raw strings **(r"")** to avoid escape issues.

Test your patterns on sites like **regex101.com**
.

## **✅ Summary**

- The re module is used for regex operations in Python.

- Use **search()**, **match()**, **findall()**, **sub()** for powerful string processing.

- Regex is great for **validation**, **parsing**, and text manipulation.