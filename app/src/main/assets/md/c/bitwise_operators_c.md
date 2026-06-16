# **Bitwise Operators in C**

Bitwise operators are used to **manipulate data at the bit level**.  
They are often used in **low-level programming, embedded systems, and optimization tasks**.

---

## **1. Bitwise Operators Overview**

C provides the following bitwise operators:

1. **AND (`&`)** → Bitwise AND
2. **OR (`|`)** → Bitwise OR
3. **XOR (`^`)** → Bitwise XOR
4. **NOT (`~`)** → Bitwise NOT (complement)
5. **Left Shift (`<<`)** → Shift bits to the left
6. **Right Shift (`>>`)** → Shift bits to the right

---

## **2. Bitwise AND `&`**

- **Operation:** Sets each bit to `1` if **both bits are 1**, else `0`
- **Example:**
```c
#include <stdio.h>

int main() {
    int a = 5;   // 0101
    int b = 3;   // 0011
    printf("a & b = %d\n", a & b); // 0001 → 1
    return 0;
}
```

---

## **3. Bitwise OR `|`**

**Operation**: Sets each bit to 1 if any one of the bits is 1

**Example**:

```
int a = 5;   // 0101
int b = 3;   // 0011
printf("a | b = %d\n", a | b); // 0111 → 7
```

## **4. Bitwise XOR `^`**

**Operation**: Sets each bit to 1 if bits are different, else 0

**Example**:

```
int a = 5;   // 0101
int b = 3;   // 0011
printf("a ^ b = %d\n", a ^ b); // 0110 → 6
```

---

## **5. Bitwise NOT `~`**

**Operation**: Inverts all bits (0 → 1, 1 → 0)

**Example**:

```
int a = 5;   // 0000000000000101
printf("~a = %d\n", ~a);  // -6 (two's complement)
```

**Notes**:

C uses two's complement for negative numbers

---

## **6. Left Shift `<<`**

**Operation**: Shifts bits to the left by specified positions

Adds 0s at the right

Equivalent to multiplying by 2ⁿ

```
int a = 5;   // 0101
printf("a << 1 = %d\n", a << 1); // 1010 → 10
```

---

## **7. Right Shift `>>`**

**Operation**: Shifts bits to the right by specified positions

Equivalent to dividing by 2ⁿ (for unsigned numbers)

```
int a = 20;  // 10100
printf("a >> 2 = %d\n", a >> 2); // 101 → 5
```

---

## **8. Practical Examples**<br>

### **8.1. Checking Odd/Even**<br>

```
int num = 5;
if(num & 1) {
    printf("Odd\n");
} else {
    printf("Even\n");
}
```

### **8.2. Swapping Two Numbers Using XOR**<br>

```
int a = 5, b = 3;
a = a ^ b;
b = a ^ b;
a = a ^ b;
printf("a = %d, b = %d\n", a, b); // a=3, b=5
```

### **8.3. Masking Bits**
<br>

```
int num = 29; // 11101
int mask = 8; // 01000
printf("Masked value: %d\n", num & mask); // 8
```

---

## **9. Summary**

* & → AND, both bits 1 → 1
 
* | → OR, either bit 1 → 1
 
* ^ → XOR, bits different → 1
 
* ~ → NOT, invert bits
 
* << → Left shift, multiply by 2ⁿ

* Bitwise operators are fast and memory-efficient, widely used in embedded systems, graphics, cryptography, and performance optimization.