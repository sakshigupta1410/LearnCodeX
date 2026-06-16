# Type Casting in C++

**Type casting** is the process of converting one data type into another.  
C++ provides both **implicit conversions** and **explicit conversions (casts)**.

---

## **1. Implicit Type Casting (Type Promotion)**

- Also known as **type promotion**.
- Performed automatically by the compiler.
- Usually converts smaller types to larger types to prevent data loss.

```cpp
#include <iostream>
using namespace std;

int main() {
    int a = 5;
    double b = a;   // implicit conversion (int → double)

    cout << "a = " << a << ", b = " << b << endl;
    return 0;
}
```

## **2. Explicit Type Casting**

Conversion done manually by the programmer.

Can be done using C-style cast or C++ style casts.

### C-Style Cast

```
double pi = 3.14;
int x = (int)pi;   // C-style cast
```

## **3. C++ Type Casting Operators**

C++ provides safer and more expressive casting operators:

### **(a) static_cast**

Used for normal conversions (e.g., int ↔ double, pointer upcasting).

Checked at compile time.

```
#include <iostream>
using namespace std;

int main() {
    double pi = 3.14159;
    int x = static_cast<int>(pi);   // truncate
    cout << "pi = " << pi << ", x = " << x << endl;
    return 0;
}
```

### **(b) dynamic_cast**

Used for safe downcasting in inheritance hierarchies.

Works only with polymorphic classes (with at least one virtual function).

```
#include <iostream>
using namespace std;

class Base {
public:
    virtual void show() {}
};

class Derived : public Base {
public:
    void display() { cout << "Derived class" << endl; }
};

int main() {
    Base* b = new Derived();
    Derived* d = dynamic_cast<Derived*>(b);

    if (d)
        d->display();
    else
        cout << "Cast failed" << endl;

    delete b;
    return 0;
}
```

### **(c) const_cast**

Used to add or remove const qualifier from a variable.

Useful when working with legacy APIs.

```
#include <iostream>
using namespace std;

void print(char* str) {
    cout << str << endl;
}

int main() {
    const char* msg = "Hello";
    print(const_cast<char*>(msg));   // remove const
    return 0;
}
```

### **(d) reinterpret_cast**

Used for low-level casting (treat one type as another unrelated type).

Dangerous if misused.

```
#include <iostream>
using namespace std;

int main() {
    int a = 65;
    char* c = reinterpret_cast<char*>(&a);
    cout << "First byte of int: " << *c << endl;
    return 0;
}
```

## **Summary**

**Implicit casting** → done automatically.

**C-Style cast** → (type)expression.

C++ casts (preferred for clarity & safety):

**static_cast** → safe, normal conversions.

**dynamic_cast** → runtime-checked downcasting.

**const_cast** → add/remove const.

**reinterpret_cast** → low-level, unsafe conversion.