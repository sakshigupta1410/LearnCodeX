# **Kotlin Variables and Data Types**

In Kotlin, variables are used to store data. Every variable has a **name**, a **type**, and a **value**.  
Kotlin provides **type inference**, meaning the compiler can automatically determine the type.

---

## **Declaring Variables**

Kotlin has two keywords for variable declaration:

- `val` → Immutable (read-only, like `final` in Java)
- `var` → Mutable (can be reassigned)

```kotlin
val pi = 3.14        // Immutable variable
var age = 21         // Mutable variable

// Explicit type declaration
val name: String = "Naina"
var score: Int = 95
```

## **Kotlin Data Types**

Kotlin supports both primitive and reference data types, but internally all types are objects.

### **1. Numbers**

**Integer types:** Byte, Short, Int, Long

**Floating-point types:** Float, Double

```
val num1: Int = 100
val num2: Long = 10000000000
val pi: Double = 3.14159
val marks: Float = 95.5f
```

### **2. Characters**

Represented by **Char**

Declared using single quotes

```
val grade: Char = 'A'
```

### **3. Boolean**

Represents true or false

```
val isKotlinFun: Boolean = true
```

### **4. Strings**

A sequence of characters enclosed in double quotes **""**

Can be multi-line with triple quotes **""" """**

```
val str1: String = "Hello Kotlin"
val str2 = "Welcome"

// Multi-line string
val text = """
    Kotlin is modern
    Kotlin is concise
"""
```

---

## **Type Inference**

Kotlin automatically infers the type based on the assigned value:

```
val x = 10      // Int
val y = 3.14    // Double
val z = "Hi"    // String
```

## **Nullable Types**

Unlike Java, Kotlin differentiates between nullable and non-nullable types.

```
var name: String = "Kotlin"
// name = null   ❌ Error

var language: String? = "Kotlin"
language = null   // ✅ Allowed
```

## **Summary**

* Use val for read-only and var for mutable variables.

* Kotlin supports standard types: **Numbers**, **Char**, **Boolean**, **String**.
 
* Kotlin has type inference, so explicit type is optional.
 
* Use ? for nullable types to avoid **NullPointerException**.