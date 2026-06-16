
---
# **Python Operators**

Operators are used to perform operations on variables and values.

**Example**:
```python
print(10 + 5)
```
<br>

Python divides the operators into the following groups:
- **Arithmetic operators**
- **Assignment operators**
- **Comparison operators**
- **Logical operators**
- **Identity operators**
- **Membership operators**
- **Bitwise operators**

---

## **1. Arithmetic Operators**
Used with numeric values to perform common math operations:

  | Operator | Operation       | Example     |
  |----------|------------------|-------------|
  | `+`      | Addition         | `x + y`     |
  | `-`      | Subtraction      | `x - y`     |
  | `*`      | Multiplication   | `x * y`     |
  | `/`      | Division         | `x / y`     |
  | `%`      | Modulus          | `x % y`     |
  | `**`     | Exponentiation   | `x ** y`    |
  | `//`     | Floor Division   | `x // y`    |


---

## **2. Assignment Operators**
Used to assign values to variables:

| Operator | Example          | Explanation               |
|----------|------------------|---------------------------|
| `=`      | `x = 5`          | Assigns 5 to `x`          |
| `+=`     | `x += 3`         | Same as `x = x + 3`       |
| `-=`     | `x -= 3`         | Same as `x = x - 3`       |
| `*=`     | `x *= 3`         | Same as `x = x * 3`       |
| `/=`     | `x /= 3`         | Same as `x = x / 3`       |
| `%=`     | `x %= 3`         | Same as `x = x % 3`       |
| `//=`    | `x //= 3`        | Same as `x = x // 3`      |
| `**=`    | `x **= 3`        | Same as `x = x ** 3`      |
| `&=`     | `x &= 3`         | Same as `x = x & 3`       |
| `^=`     | `x ^= 3`         | Same as `x = x ^ 3`       |
| `>>=`    | `x >>= 3`        | Same as `x = x >> 3`      |
| `<<=`    | `x <<= 3`        | Same as `x = x << 3`      |
| `:=`     | `print(x := 3)`  | Assigns 3 to `x` inside expression |


---

## **3. Comparison Operators**
Used to compare two values:

| Operator | Meaning                    | Example     |
|----------|----------------------------|-------------|
| `==`     | Equal                      | `x == y`    |
| `!=`     | Not equal                  | `x != y`    |
| `>`      | Greater than               | `x > y`     |
| `<`      | Less than                  | `x < y`     |
| `>=`     | Greater than or equal to   | `x >= y`    |
| `<=`     | Less than or equal to      | `x <= y`    |


---

## **4. Logical Operators**
Used to combine conditional statements:

- `and` → Returns True if both statements are true  
  Example: `x < 5 and x < 10`
- `or` → Returns True if one statement is true  
  Example: `x < 5 or x < 4`
- `not` → Reverses the result  
  Example: `not(x < 5 and x < 10)`

---

## **5. Identity Operators**
Compare memory locations:

- `is` → True if both variables are the same object  
  Example: `x is y`
- `is not` → True if not the same object  
  Example: `x is not y`

---

## **6. Membership Operators**
Test if a value is present in a sequence:

- `in` → True if value is present  
  Example: `x in y`
- `not in` → True if value is not present  
  Example: `x not in y`

---

## **7. Bitwise Operators**
Operate on binary numbers:

| Operator | Operation              | Example     |
|----------|------------------------|-------------|
| `&`      | Bitwise AND            | `x & y`     |
| `|`      | Bitwise OR             | `x | y`     |
| `^`      | Bitwise XOR            | `x ^ y`     |
| `~`      | Bitwise NOT            | `~x`        |
| `<<`     | Left shift             | `x << 2`    |
| `>>`     | Right shift            | `x >> 2`    |


---

## **Operator Precedence**

Order in which operations are evaluated (highest to lowest):

| Level | Operator(s)                                             | Description                                 |
|-------|---------------------------------------------------------|---------------------------------------------|
| 1     | `()`                                                    | Parentheses                                 |
| 2     | `**`                                                    | Exponentiation                              |
| 3     | `+x`, `-x`, `~x`                                        | Unary plus, minus, bitwise NOT              |
| 4     | `*`, `/`, `//`, `%`                                     | Multiplication, division, floor division, modulus |
| 5     | `+`, `-`                                                | Addition, subtraction                       |
| 6     | `<<`, `>>`                                              | Shifts                                      |
| 7     | `&`                                                     | Bitwise AND                                 |
| 8     | `^`                                                     | Bitwise XOR                                 |
| 10    | `==`, `!=`, `<`, `>`, `<=`, `>=`, `is`, `is not`, `in`, `not in` | Comparisons, identity, membership |
| 11    | `not`                                                   | Logical NOT                                 |
| 12    | `and`                                                   | Logical AND                                 |
| 13    | `or`                                                    | Logical OR                                  |


---

**Examples**

- Parentheses first:
```python
print((6 + 3) - (6 + 3))
```

- Multiplication before addition:
```python
print(100 + 5 * 3)
```

- Left to right with equal precedence:
```python
print(5 + 4 - 7 + 3)
```

---
