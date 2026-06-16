
---
# **The Collections Framework**

* Before we explore **ArrayList**, **HashSet**, **HashMap**, and other data structures in more detail, it's important to understand that all of these are part of something bigger - the Java Collections Framework.
 
* The **Java Collections Framework** provides a set of _interfaces_ (like List, Set, and Map) and a set of classes (ArrayList, HashSet, HashMap, etc.) that implement those interfaces.
 
* All of these are part of the **_java.util_** package.
 
* They are used to **store**, **search**, **sort**, and **organize** data more easily - all using _standardized_ methods and patterns.

**Tip**: Think of the Collections Framework as a toolbox.

**_Interfaces_** like List define what tools can do, and classes like **ArrayList** are the actual tools that do the work.

## **Core Interfaces**

Here are some common interfaces, along with their classes:

* List - ArrayList, LinkedList
* Set - HashSet, TreeSet
* Map - HashMap, TreeMap

-Use **List** classes when you care about order, you may have duplicates, and want to access elements by index.

-Use **Set** classes when you need to store unique values only.

-Use **Map** classes when you need to store pairs of keys and values, like a name and its phone number.

# **List Interface**

The **`List`** interface is part of the Java Collections Framework and represents an **ordered collection** of elements.

You can access elements by their index, add duplicates, and maintain the insertion order.

Since List is an interface, you cannot create a **List** object directly.

Instead, you use a class that implements the List interface, such as:

* **ArrayList** - like a resizable array with fast random access
* **LinkedList** - like a train of cars you can easily attach or remove

**Tip**: Use **List** when you care about order, you may have duplicates, and want to access elements by index.

---

## **Common List Methods**

* **add()** - Adds an element to the end of the list
* **get()** - Returns the element at the specified position
* **set()** - Replaces the element at the specified position
* **remove()** - Removes the element at the specified position
* **size()** - Returns the number of elements in the list

---

# **ArrayList**

An **ArrayList** is like a resizable array.

It is part of the **java.util** package and _implements_ the List interface.

The difference between a built-in array and an ArrayList in Java, is that the size of an array cannot be modified (if you want to **add** or **remove** elements to/from an array, you have to **create** a new one). While elements can be added and removed from an ArrayList whenever you want.

## **Create an ArrayList**

To use an ArrayList, you must first import it from java.util:

**Example**

Create an ArrayList object called cars that will store strings:

```
import java.util.ArrayList; // Import the ArrayList class

ArrayList<String> cars = new ArrayList<String>(); // Create an ArrayList object

```

Now you can use methods like **add()**, **get()**, **set()**, and **remove()** to manage your list of elements.

---

## **Add Elements**

To add elements to an ArrayList, use the **add()** method:

**Example**
```
import java.util.ArrayList;

public class Main {
public static void main(String[] args) {
ArrayList<String> cars = new ArrayList<String>();
cars.add("Volvo");
cars.add("BMW");
cars.add("Ford");
cars.add("Mazda");
System.out.println(cars);
}
}
```

You can also add an element at a specified position by referring to the index number:

**Example**
```
import java.util.ArrayList;

public class Main {
public static void main(String[] args) {
ArrayList<String> cars = new ArrayList<String>();
cars.add("Volvo");
cars.add("BMW");
cars.add("Ford");
cars.add(0, "Mazda"); // Insert element at the beginning of the list (0)
System.out.println(cars);
}
}
```

An **ArrayList** keeps elements in the _same_ order you add them, so the first item you add will be at index 0, the next at index 1, and so on.

---

## **Access an Element**

To access an element in the ArrayList, use the get() method and refer to the index number:

**Example**
```
cars.get(0);  // Get the first element
```

---

## **Change an Element**

To modify an element, use the **set()** method and refer to the index number:

**Example**
```
cars.set(0, "Opel");
```

---

## **Remove an Element**

To remove an element, use the **remove()** method and refer to the index number:

**Example**
```
cars.remove(0);
```

To remove all the elements in the ArrayList, use the **clear()** method:

**Example**
```
cars.clear();
```

---

## **ArrayList Size**

To find out how many elements an ArrayList have, use the size method:

**Example**
```
cars.size();
```

---

## **Loop Through an ArrayList**

Loop through the elements of an ArrayList with a for loop, and use the **size()** method to specify how many times the loop should run:

**Example**

```
public class Main {
public static void main(String[] args) {
ArrayList<String> cars = new ArrayList<String>();
cars.add("Volvo");
cars.add("BMW");
cars.add("Ford");
cars.add("Mazda");
for (int i = 0; i < cars.size(); i++) {
System.out.println(cars.get(i));
}
}
}
```

You can also loop through an ArrayList with the **for-each** loop:

**Example**
```
public class Main {
public static void main(String[] args) {
ArrayList<String> cars = new ArrayList<String>();
cars.add("Volvo");
cars.add("BMW");
cars.add("Ford");
cars.add("Mazda");
for (String i : cars) {
System.out.println(i);
}
}
}
```

---

## **Other Types**

* Elements in an ArrayList are actually objects. 

* In the examples above, we created elements (objects) of type "**String**". 

* Remember that a String in Java is an object (not a primitive type). 

* To use other types, such as int, you must specify an equivalent wrapper class: Integer. 

* For other primitive types, **_use_**: Boolean for boolean, Character for **char**, Double for **double**, etc:

**Example**
Create an ArrayList to store numbers (add elements of type Integer):

```
import java.util.ArrayList;

public class Main {
public static void main(String[] args) {
ArrayList<Integer> myNumbers = new ArrayList<Integer>();
myNumbers.add(10);
myNumbers.add(15);
myNumbers.add(20);
myNumbers.add(25);
for (int i : myNumbers) {
System.out.println(i);
}
}
}
```

---

## **Sort an ArrayList**

Another useful class in the java.util package is the Collections class, which include the **sort()** method for sorting lists alphabetically or numerically:

**Example**
Sort an ArrayList of Strings:

```
import java.util.ArrayList;
import java.util.Collections;  // Import the Collections class

public class Main {
public static void main(String[] args) {
ArrayList<String> cars = new ArrayList<String>();
cars.add("Volvo");
cars.add("BMW");
cars.add("Ford");
cars.add("Mazda");
Collections.sort(cars);  // Sort cars
for (String i : cars) {
System.out.println(i);
}
}
}
```

**Example**
Sort an ArrayList of Integers:

```
import java.util.ArrayList;
import java.util.Collections;  // Import the Collections class

public class Main {
public static void main(String[] args) {
ArrayList<Integer> myNumbers = new ArrayList<Integer>();
myNumbers.add(33);
myNumbers.add(15);
myNumbers.add(20);
myNumbers.add(34);
myNumbers.add(8);
myNumbers.add(12);
Collections.sort(myNumbers);  // Sort myNumbers
for (int i : myNumbers) {
      System.out.println(i);
    }
}
}
```

---

## **The List Interface**

**Note**: Sometimes you will see both List and ArrayList in Java code, like this:

```
import java.util.List;
import java.util.ArrayList;

List<String> cars = new ArrayList<>();
```


This means the variable (cars) is declared as a _**List**_ (the interface), but it stores an ArrayList object (the actual list).

It works the same way, but some developers prefer this style because it gives them more flexibility to change the type later.