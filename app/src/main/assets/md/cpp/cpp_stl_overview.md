# C++ Standard Template Library (STL) Overview

The **Standard Template Library (STL)** is a powerful library in C++ that provides **generic classes and functions** for **data structures and algorithms**.  
It allows programmers to **write efficient and reusable code** without implementing common data structures manually.

---

## 1. Components of STL

STL consists of **three main components**:

1. **Containers** – Store data in specific structures
2. **Algorithms** – Functions to perform operations on containers
3. **Iterators** – Objects to traverse container elements

---

## 2. Containers

Containers store collections of **objects or data**. They are classified into:

### 2.1. Sequence Containers

- Maintain **order of insertion**
- Examples: `vector`, `deque`, `list`, `array`

```cpp
#include <iostream>
#include <vector>
using namespace std;

int main() {
    vector<int> v = {10, 20, 30};
    v.push_back(40);  // Add element
    for (int x : v) cout << x << " ";
    return 0;
}
// Output: 10 20 30 40
```

### **2.2. Associative Containers**

Automatically sorted based on keys

**Examples**: set, map, multiset, multimap

```
#include <iostream>
#include <set>
using namespace std;

int main() {
    set<int> s = {3, 1, 4, 2};
    s.insert(5);  // Adds 5
    for (int x : s) cout << x << " ";
    return 0;
}
// Output: 1 2 3 4 5 (sorted automatically)
```

### **2.3. Unordered Containers**

No specific order, but faster access

Examples: unordered_set, unordered_map

---

## **3. Iterators**

Iterators provide a pointer-like interface to traverse container elements

```
#include <iostream>
#include <vector>
using namespace std;

int main() {
    vector<int> v = {1, 2, 3, 4};
    for (vector<int>::iterator it = v.begin(); it != v.end(); ++it) {
        cout << *it << " ";
    }
    return 0;
}
// Output: 1 2 3 4
```

**Types of Iterators:** begin(), end(), rbegin(), rend()

---

## **4. Algorithms**

STL provides many built-in functions like:

**Searching**: find(), binary_search()
**Sorting**: sort(), stable_sort()
**Counting**: count(), accumulate()
**Modifying**: reverse(), rotate(), remove()

```
#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;

int main() {
    vector<int> v = {4, 2, 3, 1};
    sort(v.begin(), v.end());
    for (int x : v) cout << x << " ";
    return 0;
}
// Output: 1 2 3 4
```

---

## **5. Advantages of STL**

**Reusability**: No need to implement common data structures

**Efficiency**: Optimized for performance

**Flexibility**: Works with any data type using templates

**Consistency**: Same interface across containers and algorithms


## **6. Summary (LearnCodeX)**

* STL is a generic library for data structures and algorithms

* Containers store data (vector, list, set, map)
 
* Iterators traverse containers (begin(), end())
 
* Algorithms perform operations (sort(), find(), count())
 
* STL improves code efficiency, readability, and maintainability
 
* Learning STL is essential for competitive programming and professional C++ development, as it provides ready-to-use, efficient tools for almost all common tasks.