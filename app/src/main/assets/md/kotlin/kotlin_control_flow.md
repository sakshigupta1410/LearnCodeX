# **Kotlin Control Flow**

Control flow statements in Kotlin allow you to decide **which part of code executes** and **how many times**.  
They include **conditional statements** and **loops**.

---

## **1. If Expression**

In Kotlin, `if` is an **expression** (it returns a value).

```kotlin
fun main() {
    val num = 10

    if (num > 0) {
        println("Positive number")
    } else {
        println("Negative number")
    }

```
<br>

**If as Expression:**

```
val max = if (10 > 5) 10 else 5
println("Max = $max")   // Output: Max = 
```
---

## **2. When Expression**

when in Kotlin is similar to switch in Java but more powerful.

```
fun main() {
    val x = 2

    when (x) {
        1 -> println("One")
        2 -> println("Two")
        3, 4 -> println("Three or Four")
        in 5..10 -> println("Between 5 and 10")
        else -> println("Unknown")
    }
}
```
<br>

**When as Expression:**

```
val day = 3
val result = when (day) {
    1 -> "Monday"
    2 -> "Tuesday"
    3 -> "Wednesday"
    else -> "Invalid"
}
println(result)   // Output: Wednesday
```

## **3. For Loop**

Iterates over ranges, arrays, or collections.

```
for (i in 1..5) {
    println(i)
}
```
<br>

### **Step & DownTo:**
<br>

```
for (i in 10 downTo 1 step 2) {
    println(i)
}
```

## **4. While Loop**

Repeats while condition is true.

```
var i = 1
while (i <= 5) {
    println(i)
    i++
}
```

## **5. Do-While Loop**

Executes the block at least once, then checks the condition.

```
var j = 1
do {
    println(j)
    j++
} while (j <= 5)
```

## **6. Break and Continue**

**break** → exits the loop.

**continue** → skips current iteration.

```
for (i in 1..5) {
    if (i == 3) break
    println(i)
}
```

```
for (i in 1..5) {
    if (i == 3) continue
    println(i)
}
```

## **7. Return with Labels**

Useful in **lambda** functions and nested loops.

```
fun main() {
    loop@ for (i in 1..3) {
        for (j in 1..3) {
            if (i == 2 && j == 2) break@loop
            println("i=$i, j=$j")
        }
    }
}
```

## **Summary**

* if and when are expressions in Kotlin.

* Loops: for, while, do-while.
 
* break, continue, and labels control execution flow.
 
* when is more powerful than Java’s switch.