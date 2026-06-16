# **Basic Structure of an HTML Document**
<br>

Every HTML page follows a **basic structure** that ensures it is properly interpreted by web browsers.

---

## **1. Doctype Declaration**

<br>

```html
<!DOCTYPE html>
```

Declares the document type and HTML version.

For modern HTML, use <!DOCTYPE html> (HTML5).

## **2. Root Element <html>**
<br>


```
<html lang="en">
    <!-- Head and Body go here -->
</html>
```
<br>

The `<html>` tag wraps the entire HTML content.

lang attribute specifies the language of the page.

## **3. Head Section <head>**
<br>

```
<head>
    <meta charset="UTF-8">
    <title>Page Title</title>
</head>
```

<br>

Contains metadata about the page.

### **Common elements inside <head>:**

* <**title**> → Title of the webpage.
* <**meta**> → Metadata (charset, description, viewport, etc.).
* <**link**> → Link to external CSS files.
* <**style**> → Internal CSS.
* <**script**> → Internal or external JavaScript.

## **4. Body Section <body>**
<br>

```
<body>
    <h1>Welcome to HTML</h1>
    <p>This is the body content.</p>
</body>
```

<br>

Contains all visible content of the webpage.

**Examples**: headings, paragraphs, images, lists, links, tables, forms.

## **5. Complete Basic HTML Structure**

**Example**:

```
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>My First HTML Page</title>
</head>
<body>
    <h1>Hello, World!</h1>
    <p>This is my first HTML page.</p>
</body>
</html>
```

<br>

## **Summary**

* <**!DOCTYPE html**> → Declares HTML5.

* <**html**> → Root element.

* <**head**> → Metadata, title, styles, scripts.

* <**body**> → Visible content of the webpage.

All HTML documents must follow this structure for proper rendering in browsers.