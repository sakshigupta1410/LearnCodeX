# 🌐 **Working with JSON & APIs in Python**

---

## 📦 **What is JSON?**

**JSON** stands for **JavaScript Object Notation**. It's a lightweight data format used to **store and exchange data**, especially between clients and web servers.

It is:
- Human-readable
- Language-independent
- Easy to parse in Python

---

## 🔄 **Python's `json` Module**

Python provides a built-in module called `json` for working with JSON data.

---

### 📥 **Converting JSON String to Python Object**
<br>

```python
import json

data = '{"name": "Alice", "age": 25, "is_student": false}'
parsed = json.loads(data)

print(parsed["name"])  # Output: Alice
```

### 📤 **Converting Python Object to JSON String**
<br>

```
person = {"name": "Bob", "age": 30, "is_student": True}
json_string = json.dumps(person)

print(json_string)
# Output: {"name": "Bob", "age": 30, "is_student": true}
```

## **📂 Working with JSON Files**

**Reading from a JSON File:**

```
with open('data.json', 'r') as file:
data = json.load(file)
print(data)
```
<br>

**Writing to a JSON File:**

```
info = {"language": "Python", "version": 3.11}

with open('info.json', 'w') as file:
json.dump(info, file, indent=4)
```

## 🌍 **What is an API?**

* API stands for Application Programming Interface.

* In web development, APIs let you:
 
* Send data to a server
 
* Get data from a server
 
* Communicate with services like GitHub, OpenWeather, Google Maps, etc.

## **🔗 Using the requests Library**

**Install it if needed:**

`pip install requests`

## 🔍 **Making a GET Request**
<br>

```
import requests

response = requests.get('https://api.agify.io?name=alice')
data = response.json()

print(data)

```

Output:

**{
"name": "alice",
"age": 25,
"count": 12345
}**

## 📬 **Making a POST Request**
<br>

```
import requests

payload = {"name": "Alice", "score": 95}
response = requests.post('https://httpbin.org/post', json=payload)

print(response.json())
```

## **⚠️ Handling Errors**

**Always check the response status:**

```
response = requests.get("https://api.example.com/data")

if response.status_code == 200:
data = response.json()
print(data)
else:
print("Request failed with status code", response.status_code)
````

## 🧪 **Practice Challenge**

**Try This:**

Use the API at https://api.genderize.io?name=tom to get the gender of a name.

Print the returned name and gender.

## ✅ **Summary**

* JSON is a popular format for data exchange.

* Use Python's json module to parse or write JSON.
 
* Use the requests library to interact with web APIs.
 
* Always handle errors and unexpected responses.

## 🔗 **Bonus APIs to Explore**

https://api.agify.io?name=YOUR_NAME

https://api.genderize.io?name=YOUR_NAME

https://catfact.ninja/fact

https://api.coindesk.com/v1/bpi/currentprice.json