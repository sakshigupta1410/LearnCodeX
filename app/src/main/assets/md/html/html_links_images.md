# **HTML Links and Images**

HTML allows you to add **hyperlinks** to navigate between pages and **images** to make web pages visually appealing.

---

## **1. Hyperlinks (`<a>` Tag)**
<br>

The `<a>` tag defines a **hyperlink**.

### Syntax:
<br>

```html
<a href="URL">Link Text</a>
```

**href** → specifies the URL of the page the link goes to.

Can link to external URLs, internal pages, or anchors.

**Example**:

```
<a href="https://www.example.com">Visit Example</a>
<a href="about.html">About Us</a>
<a href="#section1">Go to Section 1</a>
```

Open Link in a New Tab
Use target=**"_blank"**:

```
<a href="https://www.example.com" target="_blank">Open Example in New Tab</a>
```

**Email Link**
```
<a href="mailto:someone@example.com">Send Email</a>
```
---

## **2. Images (`<img>` Tag)**

The `<img>` tag is used to display images on a webpage.

**Syntax**:

```
<img src="image_url" alt="description" width="width_in_px" height="height_in_px">
```
<br>

**src** → path to the image (local or online).

**alt** → text displayed if image cannot be loaded.

**width and height** → optional dimensions.

**Example**:

```
<img src="logo.png" alt="Company Logo" width="200" height="100">
<img src="https://via.placeholder.com/150" alt="Placeholder Image">
```

**Image as a Link**
<br>

You can wrap an image inside an `<a>` tag:

```
<a href="https://www.example.com">
    <img src="logo.png" alt="Logo" width="100">
</a>
```
---

## **3. Summary**

* <**a**> → creates hyperlinks.

* Can navigate to external websites, internal pages, anchors, or emails.
 
* target="**_blank**" opens link in a new tab.
 
* <**img**> → displays images.
 
* Use src for image path and alt for description.
 
* Can adjust size using width and height.
 
* Images can also serve as clickable links.