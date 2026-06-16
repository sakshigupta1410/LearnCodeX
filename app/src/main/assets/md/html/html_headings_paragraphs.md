# **HTML Headings and Paragraphs**

HTML provides **tags to structure text content** using headings and paragraphs.

---
<br>

## **1. Headings**

- Headings define the **title or subtitle** of a section.
- HTML has **6 levels** of headings: **<h1>** to **<h6>**.
- Most important (largest) -> h1
- Least important (smallest) -> h6

**Example**:
<br>

```html
<h1>Main Heading</h1>
<h2>Subheading</h2>
<h3>Section Heading</h3>
<h4>Subsection</h4>
<h5>Smaller Heading</h5>
<h6>Smallest Heading</h6>
```
Output:


# Main Heading
<br>

## Subheading
<br>

### Section Heading
<br>

#### Subsection
<br>

##### Smaller Heading
<br>

###### Smallest Heading
<br>

---
<br>

## **2. Paragraphs**

Paragraphs are defined using the `<p>` tag.

Represents blocks of text separated by a line break.

**Example**:

```
<p>This is a paragraph of text.</p>
<p>Another paragraph comes here.</p>
```

**Output**:

**This is a paragraph of text.**
**Another paragraph comes here.**

---

<br>

## **3. Line Breaks**

Use <**br**> tag to insert a line break inside a paragraph.

<**br**> is a self-closing tag.

```
<p>This is the first line.<br>This is the second line.</p>
```

Output:

**This is the first line.**<br>

**This is the second line.**

---

<br>

## **4. Combining Headings and Paragraphs**

<br>

```
<h1>About HTML</h1>
<p>HTML stands for HyperText Markup Language.</p>

<h2>Features</h2>
<p>HTML is used to create the structure of web pages.</p>
```

<br>


| **Output**: |
|---------|
| **About HTML** |
| HTML stands for HyperText Markup Language. |
| **Features** |
| HTML is used to create the structure of web pages. |


<br>

## **Summary**

* Use `<h1>` to `<h6>` for headings (importance decreases from h1 → h6).

* Use `<p>` to define paragraphs of text.
 
* `<br>` adds a line break inside a paragraph.
 
* Headings + paragraphs form the basic structure of textual content on a webpage.