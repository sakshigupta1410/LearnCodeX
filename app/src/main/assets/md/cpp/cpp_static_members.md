# Static Members in C++

In C++, a **static member** (data or function) belongs to the **class** rather than any specific object.  
This means it is **shared among all objects** of that class.

---

## Static Data Members

- Declared inside the class with the keyword `static`.
- Only one copy exists for all objects.
- Must be **defined outside the class**.
- Initialized separately (cannot be initialized inside class except with `const static`).

### Example: Static Data Member
<br>

```cpp
#include <iostream>
using namespace std;

class Student {
    int rollNo;
    static int count;  // declaration of static member

public:
    Student(int r) : rollNo(r) {
        count++;
    }

    void show() {
        cout << "Roll No: " << rollNo << endl;
    }

    static void showCount() {   // static member function
        cout << "Total Students: " << count << endl;
    }
};

// definition of static member
int Student::count = 0;

int main() {
    Student s1(101), s2(102), s3(103);

    Student::showCount();  // access static function without object
    return 0;
}
```

**Output**:

Total Students: 3
Static Member Functions
Declared with static keyword.

<br>

Can access only static data members.

Called using the class name or an object.

Example: <br>
**Static Function**

```
#include <iostream>
using namespace std;

class Counter {
    static int value;

public:
    static void increment() {
        value++;
    }

    static void show() {
        cout << "Value: " << value << endl;
    }
};

int Counter::value = 0;

int main() {
    Counter::increment();
    Counter::increment();

    Counter::show();   // Output: Value: 2
    return 0;
}
```

## **Key Points**

Static data members are shared across all objects.

Static functions can be called without creating an object.

## **Useful for:**

Counting number of objects.

Keeping global info shared across objects.

Utility/helper functions.

## **Summary**

static keyword makes data/function class-level.

Static data must be defined outside the class.

Static functions can only access static data.

Accessed using ClassName::member syntax.