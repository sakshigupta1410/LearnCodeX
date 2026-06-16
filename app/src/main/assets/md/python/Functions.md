# **Functions in Python**

In Python, a **function** is a block of code that only runs when it is called.  
You can pass data, known as parameters, into a function.  
A function can return data as a result.

---

## **Creating a Function**
In Python, a function is defined using the `def` keyword.

```python
def my_function():
    print("Hello from a function")
   
```
    
## **Calling a Function**

To call a function, use the function name followed by parentheses.

```
def my_function():
    print("Hello from a function")

my_function()
```

## **Arguments**

Information can be passed into functions as arguments.
Arguments are specified after the function name, inside the parentheses.

```
def my_function(fname):
    print(fname + " Refsnes")

my_function("Emil")
my_function("Tobias")
my_function("Linus")
```

## **Number of Arguments**

By default, a function must be called with the correct number of arguments.

```
def my_function(fname, lname):
    print(fname + " " + lname)

my_function("Emil", "Refsnes")  # ✅ Correct
# my_function("Emil")           # ❌ Error
```

## **Arbitrary Arguments (args)**

If you do not know how many arguments will be passed, add * before the parameter name.

```
def my_function(*kids):
    print("The youngest child is " + kids[2])

my_function("Emil", "Tobias", "Linus")
```

## **Keyword Arguments**

You can also send arguments with the key = value syntax.

```
def my_function(child3, child2, child1):
    print("The youngest child is " + child3)

my_function(child1="Emil", child2="Tobias", child3="Linus")
```

## **Arbitrary Keyword Arguments (kwargs)**

If you don’t know how many keyword arguments will be passed, add ** before the parameter name.

```
def my_function(**kid):
    print("His last name is " + kid["lname"])

my_function(fname="Tobias", lname="Refsnes")
```

## **Default Parameter Value**

If no argument is given, a function can use a default value.

```
def my_function(country="Norway"):
    print("I am from " + country)

my_function("Sweden")
my_function()
```

## **Passing a List as an Argument**

You can send any data type of argument, including a list.

```
def my_function(food):
    for x in food:
        print(x)

fruits = ["apple", "banana", "cherry"]
my_function(fruits)
```

## **Return Values**

Functions can return values using the return statement.

```
def my_function(x):
    return 5 * x

print(my_function(3))
```

## **Recursion**

Python allows functions to call themselves (recursion).

```
def tri_recursion(k):
    if k > 0:
        result = k + tri_recursion(k - 1)
        print(result)
    else:
        result = 0
    return result

print("Recursion Example Results")
tri_recursion(6)
```
---