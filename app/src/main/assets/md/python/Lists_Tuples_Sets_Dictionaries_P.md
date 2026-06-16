# **Python Collections (Arrays)**

Python has four built-in collection data types:

1. **List** – Ordered, changeable, allows duplicates
2. **Tuple** – Ordered, unchangeable (immutable), allows duplicates
3. **Set** – Unordered, unindexed, no duplicates
4. **Dictionary** – Ordered (Python 3.7+), changeable, no duplicate keys

---

## **1. Python Lists**

- Lists are created using square brackets `[]`.
- Ordered and changeable.
- Allow duplicate values.

```python
mylist = ["apple", "banana", "cherry"]
print(mylist)
```

---

### **List Characteristics**

Indexed (first item has index 0).

Can contain different data types.

Can be changed after creation.

### **Access Items**
<br>

```
print(mylist[1])       # banana
print(mylist[-1])      # cherry
print(mylist[1:3])     # ['banana', 'cherry']
```


### **Change Item Value**
<br>

```
mylist[1] = "blackcurrant"
```

### **Add Items**
<br>

```
mylist.append("orange")       # Add to end
mylist.insert(1, "kiwi")      # Add at index 1
```

### **Remove Items**
<br>

```
mylist.remove("banana")   # Remove by value
mylist.pop(1)             # Remove by index
del mylist[0]             # Delete first item
mylist.clear()            # Empty list
```

### **Loop Through a List**
<br>

```
for x in mylist:
print(x)
```

### **List Comprehension**

fruits = ["apple", "banana", "cherry", "kiwi", "mango"]
newlist = [x for x in fruits if "a" in x]
print(newlist)

---

## **2. Python Tuples**

Tuples are created using parentheses ().

Ordered and unchangeable (immutable).

Allow duplicates.

```
mytuple = ("apple", "banana", "cherry")
print(mytuple)
```

### **Tuple Characteristics**

Items are indexed.

Cannot be changed, but you can convert to a list and back.

```
x = ("apple", "banana", "cherry")
y = list(x)
y[1] = "kiwi"
x = tuple(y)
```

### **Access Tuple Items**
<br>

```
print(mytuple[1])    # banana
print(mytuple[-1])   # cherry
```

### **Unpacking Tuples**
<br>

```
fruits = ("apple", "banana", "cherry")
(green, yellow, red) = fruits
print(green)
print(yellow)
print(red)
```

### **Loop Through a Tuple**
<br>

```
for x in mytuple:
print(x)
```
---

## **3. Python Sets**

Sets are created using curly braces **{}**.

Unordered, unindexed, no duplicates.

```
myset = {"apple", "banana", "cherry"}
print(myset)
```

### **Set Characteristics**

Cannot have two items with the same value.

Items cannot be accessed by index.

### **Add Items**
<br>

```
myset.add("orange")
```

### **Add Multiple Items**
<br>

```
myset.update(["kiwi", "mango"])
```


### **Remove Items**
<br>

```
myset.remove("banana")
myset.discard("apple")
x = myset.pop()     # removes a random item
myset.clear()       # empties the set
```

### **Loop Through a Set**
<br>


```
for x in myset:
print(x)
```

### **Set Operations**
<br>


```
set1 = {"a", "b", "c"}
set2 = {"c", "d", "e"}

print(set1.union(set2))         # combine
print(set1.intersection(set2))  # common items
print(set1.difference(set2))    # items only in set1
```
---

## **4. Python Dictionaries**

Dictionaries are created using curly braces {key: value}.

Ordered (Python 3.7+), changeable, no duplicate keys.

```
mydict = {
"brand": "Ford",
"model": "Mustang",
"year": 1964
}
print(mydict)
```

### **Access Items**
<br>

```
print(mydict["model"])
print(mydict.get("year"))
```

### **Change Values**
<br>

```
mydict["year"] = 2018
```

### **Add Items**
<br>

```
mydict["color"] = "red"
```

### **Remove Items**
<br>

```
mydict.pop("model")
mydict.popitem()       # removes last inserted
del mydict["brand"]
mydict.clear()
```

### **Loop Through a Dictionary**
<br>

```
for x in mydict:           
print(x)

for x in mydict.values(): 
print(x)

for x, y in mydict.items(): 
print(x, y)
```

### **Nested Dictionaries**

```
myfamily = {
"child1": {"name": "Emil", "year": 2004},
"child2": {"name": "Tobias", "year": 2007},
"child3": {"name": "Linus", "year": 2011}
}
```

## **Summary**

**List** → Ordered, changeable, allows duplicates

**Tuple** → Ordered, unchangeable, allows duplicates

**Set** → Unordered, no duplicates

**Dictionary** → Ordered, changeable, key–value pairs