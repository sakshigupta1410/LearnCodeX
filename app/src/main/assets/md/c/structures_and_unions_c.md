
---
# **Structures and Unions in C**

C provides **user-defined data types** called **structures** and **unions** to group different types of variables together.  
They allow more **organized and complex data management**.

---

## **1. Structures in C**

A **structure** is a collection of **variables of different types** under a single name.<br>


### **1.1. Declaring a Structure**<br>


```
struct StructureName {
    data_type member1;
    data_type member2;
    ...
};
```
**Example**:

```
#include <stdio.h>

struct Student {
    int rollNo;
    char name[50];
    float marks;
};
```
<br>

### **1.2. Creating Structure Variables** <br>

```
struct Student s1, s2;
```
<br>

### **1.3. Accessing Members**

Use the **dot** operator (**.**) to access structure members.

```
#include <stdio.h>

struct Student {
    int rollNo;
    char name[50];
    float marks;
};

int main() {
    struct Student s1;

    s1.rollNo = 101;
    strcpy(s1.name, "LearnCodeX");
    s1.marks = 95.5;

    printf("Roll No: %d\n", s1.rollNo);
    printf("Name: %s\n", s1.name);
    printf("Marks: %.2f\n", s1.marks);

    return 0;
}
```

Output:

**Roll No: 101**<br>
**Name: LearnCodeX**<br>
**Marks: 95.50**


### **1.4. Array of Structures**

You can create **multiple** structure variables in an array.

```
struct Student students[3];
students[0].rollNo = 101;
students[1].rollNo = 102;
```

### **1.5. Nested Structures**

Structures can contain other structures as members.

```
struct Date {
    int day, month, year;
};

struct Student {
    char name[50];
    struct Date dob;
};
```

### **1.6. Structure Pointer**

Pointers can point to structures using -> `operator`.

```
struct Student s1;
struct Student *ptr = &s1;

ptr->rollNo = 101;
```



### **1.7. "Typedef" with Structures**


`typedef` simplifies structure declaration.

```
typedef struct {
    int rollNo;
    char name[50];
} Student;

Student s1;  // no need to write 'struct'
```

---

## **2. Unions in C**

A union is similar to a **structure**, but all members share the **same memory** location.

Only one member can hold a value at a time.

### **2.1. Declaring a Union**<br>

```
union UnionName {
    data_type member1;
    data_type member2;
    ...
};
```

**Example**:

```
union Data {
    int i;
    float f;
    char str[20];
};
```

### **2.2. Accessing Members**

Use the dot operator (**.**) similar to structures.

```
#include <stdio.h>

union Data {
    int i;
    float f;
    char str[20];
};

int main() {
    union Data d;

    d.i = 10;
    printf("i: %d\n", d.i);

    d.f = 220.5;
    printf("f: %.2f\n", d.f);

    strcpy(d.str, "LearnCodeX");
    printf("str: %s\n", d.str);

    return 0;
}
```

Output (last value only matters):
**str: LearnCodeX**

**Notes**:

* Memory used = size of largest member

* Modifying one member overwrites others

---

## **3. Structure vs Union**<br>

#### **Memory allocation:**

**Structure**: Each member has its own memory

**Union**: All members share the same memory

---

#### **Size:**

**Structure**: Sum of sizes of all members

**Union**: Size of the largest member

---

#### **Member access:**

**Structure**: All members can be accessed simultaneously

**Union**: Only one member can store a value at a time

---

## **4. Summary**

* Structures group variables of different types together

* Access members with . operator or -> for pointers
 
* Can use arrays, nested structures, and typedef for convenience
 
* Unions allow multiple data types to share the same memory location
 
* Use structures for multiple simultaneous data, unions for memory-efficient single data
 
* Structures and unions are essential for organizing complex data in C programs, forming the backbone for advanced data structures.
