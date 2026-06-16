# **HTML Lists**

HTML provides **list elements** to display information in an organized manner.  
There are **three main types of lists**:

---

## **1. Unordered List (`<ul>`)**

- Displays items with **bullets**.
- Each item is wrapped in `<li>` (list item) tag.

### Example:
<br>

```html
<h2>Fruits</h2>
<ul>
    <li>Apple</li>
    <li>Banana</li>
    <li>Orange</li>
</ul>
```
<br>

Output:

**Apple**
<br>

**Banana**
<br>

**Orange**
<br>


## **2. Ordered List (`<ol>`)**

* Displays items in a numbered sequence.

* Can also customize numbering type with type attribute (1, A, a, I, i).

### **Example**:
<br>

```
<h2>Steps to Make Tea</h2>
<ol>
    <li>Boil water</li>
    <li>Add tea leaves</li>
    <li>Pour into cup</li>
</ol>
```

Output:

**Boil water**<br>

**Add tea leaves**<br>

**Pour into cup**<br>


### **Custom Numbering:**

```
<ol type="A">
    <li>Step One</li>
    <li>Step Two</li>
</ol>
```

Output:

**A. Step One**<br>

**B. Step Two**

## **3. Nested Lists**

Lists can be nested inside other lists.

**Example**:

```
<h2>Menu</h2>
<ul>
    <li>Fruits
        <ul>
            <li>Apple</li>
            <li>Banana</li>
        </ul>
    </li>
    <li>Vegetables
        <ul>
            <li>Carrot</li>
            <li>Tomato</li>
        </ul>
    </li>
</ul>
```

Output:

**Fruits**

**Apple**

**Banana**

**Vegetables**

**Carrot**

**Tomato**

## **Summary**

- ul → Unordered (bulleted) list.

- ol → Ordered (numbered) list.

- li → Defines each list item.

Lists can be nested to show hierarchy or sub-items.