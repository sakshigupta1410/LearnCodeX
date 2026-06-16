# C++ Namespaces

Namespaces in C++ are used to **organize code** and **prevent name conflicts** in large projects.  
They allow multiple identifiers (like functions, variables, classes) to **coexist without collision**.

---

## 1. Basics

- A **namespace** is a declarative region that provides a **scope to identifiers**.
- Syntax:

```cpp
namespace namespace_name {
    // variables, functions, classes
}
```

**Example**

```
#include <iostream>
using namespace std;

namespace LearnCodeX {
    void greet() {
        cout << "Hello from LearnCodeX!" << endl;
    }
}

int main() {
    LearnCodeX::greet();  // Access using scope resolution operator
    return 0;
}
```

---

## **2. Using using Keyword**

using namespace allows you to avoid writing the full scope every time.

```
#include <iostream>
using namespace std;

namespace LearnCodeX {
    void greet() {
        cout << "Hello from LearnCodeX!" << endl;
    }
}

using namespace LearnCodeX;

int main() {
    greet();  // No need for LearnCodeX:: prefix
    return 0;
}
```

---

## **3. Nested Namespaces**

Namespaces can be nested inside another namespace.

```
namespace LearnCodeX {
    namespace Python {
        void display() {
            cout << "Learn Python!" << endl;
        }
    }
}

int main() {
    LearnCodeX::Python::display();
    return 0;
}
```

From C++17 onwards, you can combine nested namespaces:

```
namespace LearnCodeX::CPlusPlus {
    void show() {
        cout << "Learn C++!" << endl;
    }
}
```

---

## **4. Anonymous Namespaces**

Anonymous namespaces `(namespace { })` limit scope to current file.

Helps avoid linker conflicts in multi-file projects.

```
#include <iostream>
using namespace std;

namespace {
    void greet() {
        cout << "Hello from anonymous namespace!" << endl;
    }
}

int main() {
    greet();
    return 0;
}
```

---

## **5. Advantages of Namespaces**

* Avoid naming conflicts in large projects

* Organize code logically by modules or functionality
 
* Enable reusability of code without collisions
 
* Can be nested or anonymous for better scope management

## **6. Summary (LearnCodeX)**

* Namespace provides a scope for identifiers
 
* Use namespace_name::identifier to access members
 
* using namespace avoids repeatedly writing the scope
 
* Supports nested and anonymous namespaces
 
* Crucial for large-scale projects and library management
 
* Proper use of namespaces ensures clean, modular, and maintainable C++ code, avoiding symbol conflicts and improving code organization.