# **Kotlin Loops**

Loops in Kotlin allow you to **execute a block of code multiple times**.  
Kotlin supports **for, while, and do-while loops**.

---

## **1. For Loop**

Used to iterate over **ranges, arrays, collections, or anything iterable**.

### **Basic For Loop**

<br>

```kotlin
fun main() {
    for (i in 1..5) {
        println(i)
    }
}
```

Output:

**1
2
3
4
5**


### **For Loop with Step**
<br>


```
for (i in 1..10 step 2) {
    println(i)
}
```

Output:

**1
3
5
7
9**


### **For Loop with DownTo**
<br>

```
for (i in 5 downTo 1) {
    println(i)
}
```

Output:

**5
4
3
2
1**


### **Iterating Over Arrays or Collections**
<br>

```
val arr = arrayOf("Kotlin", "Java", "Python")
for (item in arr) {
    println(item)
}
```
---

## **2. While Loop**

Executes a block while a condition is true.

```
var i = 1
while (i <= 5) {
    println(i)
    i++
}
```

Output:

1
<br>

2
<br>

3
<br>

4
<br>

5
<br>

---

## **3. Do-While Loop**

Executes the block at least once, then checks the condition.

```
var j = 1
do {
    println(j)
    j++
} while (j <= 5)
```


Output:

**1
2
3
4
5**

---

## **4. Break and Continue**

**break** → exits the loop immediately.

**continue** → skips current iteration and moves to next.

```
for (i in 1..5) {
    if (i == 3) break
    println(i)
}
```

Output:

**1
2**

```
for (i in 1..5) {
    if (i == 3) continue
    println(i)
}
```
Output:

**1
2
4
5**


## **5. Labels in Loops**

Used to **break** or **continue** outer loops from nested loops.

```
loop@ for (i in 1..3) {
    for (j in 1..3) {
        if (i == 2 && j == 2) break@loop
        println("i=$i, j=$j")
    }
}
```

Output:

**i=1, j=1
i=1, j=2
i=1, j=3
i=2, j=1**


## **Summary**

* Kotlin supports for, while, and do-while loops.

* For loop can iterate over ranges, arrays, and collections.
 
* break and continue control loop execution.
 
* Labels allow breaking/continuing nested loops.