# Lambda Expressions in C++

A **lambda expression** in C++ is an anonymous (unnamed) function that can be defined **inline**.  
It is mainly used for short functions, callbacks, and algorithms.

---

## Syntax

```cpp
[capture_list] (parameters) -> return_type {
    // function body
};
```

**capture_list** → Defines what variables from the surrounding scope are accessible.

**parameters** → Like normal function parameters (optional).

**return_type** → Can be explicitly specified using -> (optional, often auto-deduced).

Example 1: **Basic Lambda**

```
#include <iostream>
using namespace std;

int main() {
    auto greet = []() {
        cout << "Hello, Lambda!" << endl;
    };

    greet();  // call the lambda
    return 0;
}
```

Example 2: **Lambda with Parameters**

```
#include <iostream>
using namespace std;

int main() {
    auto add = [](int a, int b) {
        return a + b;
    };

    cout << "Sum = " << add(5, 7) << endl;
    return 0;
}
```

Example 3: **Capture by Value and Reference**

```
#include <iostream>
using namespace std;

int main() {
    int x = 10, y = 20;

    auto byValue = [x]() {
        cout << "Captured by value: " << x << endl;
    };

    auto byRef = [&y]() {
        cout << "Captured by reference: " << y << endl;
    };

    byValue();  // Output: Captured by value: 10
    byRef();    // Output: Captured by reference: 20
    return 0;
}
```

Example 4: **Using Lambda with STL Algorithm**

```
#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main() {
    vector<int> nums = {1, 2, 3, 4, 5};

    // Print only even numbers using lambda
    for_each(nums.begin(), nums.end(), [](int n) {
        if (n % 2 == 0)
            cout << n << " ";
    });

    return 0;
}
```

## **Capture Modes**

[ ] → Capture nothing

[x] → Capture x by value

[&x] → Capture x by reference

[=] → Capture all variables by value

[&] → Capture all variables by reference

[=, &y] → Capture all by value except y by reference

## **Key Features**

Short and inline function definition.

Useful in STL algorithms (sort, for_each, find_if, etc.).

Can capture local variables by value or reference.

Can be stored in variables using auto.

## **Summary**

Lambdas are anonymous inline functions.

Use **[]** to define captures.

Often used in STL algorithms and callbacks.

Make code shorter and more expressive.