# **Kotlin Functions**

A **function** in Kotlin is a block of reusable code that performs a specific task.  
Functions help in **modularity, reusability, and readability** of programs.

---

## **Defining a Function**

The general syntax is:

```kotlin
fun functionName(parameters): ReturnType {
    // body of function
    return value
}
```

**fun** → keyword to define a function

**functionName** → name of the function

**parameters** → optional input values

**ReturnType** → type of value returned (optional, Unit if nothing is returned)

Example: **Simple Function**

```
fun greet() {
    println("Hello, Kotlin!")
}

fun main() {
    greet()
}
```

Output:

**Hello, Kotlin!**


## **Function with Parameters**
<br>

```
fun add(a: Int, b: Int): Int {
    return a + b
}

fun main() {
    val sum = add(5, 10)
    println("Sum = $sum")
}
```
Output:

**Sum = 15**

## **Single Expression Function**

If a function contains only one expression, we can write it in a shorter form:

```
fun multiply(a: Int, b: Int) = a * b

fun main() {
    println(multiply(4, 5))   // Output: 20
}
```

## **Default and Named Arguments**

Kotlin allows setting default values for parameters.

```
fun greet(name: String = "Guest") {
    println("Hello, $name!")
}

fun main() {
    greet()           // Output: Hello, Guest!
    greet("Naina")    // Output: Hello, Naina!
}
```

Also supports named arguments:

```
fun displayInfo(name: String, age: Int) {
    println("$name is $age years old.")
}

fun main() {
    displayInfo(age = 21, name = "Naina")
}
```

## **Functions with Return Type**
<br>

```
fun square(x: Int): Int {
    return x * x
}

fun main() {
    println(square(6))   // Output: 36
}
```

## **Recursive Functions**

Functions can call themselves (recursion).

```
fun factorial(n: Int): Int {
    return if (n == 0) 1 else n * factorial(n - 1)
}

fun main() {
    println(factorial(5))   // Output: 120
}
```

## **Higher-Order Functions & Lambdas**

Functions can take other functions as parameters (higher-order functions).

```
fun operate(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}

fun main() {
    val sum = operate(3, 4) { x, y -> x + y }
    println("Sum = $sum")   // Output: 7
}
```

## **Summary**

* Functions are defined using the fun keyword.

* Can have parameters with default values and support named arguments.
 
* Single-expression functions make code concise.

* Supports recursion and higher-order functions for advanced programming.