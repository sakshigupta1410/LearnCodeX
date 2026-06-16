# Smart Pointers in C++

In traditional C++, dynamically allocated memory using `new` must be manually released using `delete`.  
If not handled properly, it can lead to **memory leaks** and **dangling pointers**.

**Smart pointers** in C++ are objects that automatically manage the lifetime of dynamically allocated memory.  
They are defined in the `<memory>` header.

---

## Types of Smart Pointers
<br>

### 1. `std::unique_ptr`
- Owns the object exclusively (only one `unique_ptr` can point to a resource).
- Cannot be copied, only moved.
- Automatically deletes the object when it goes out of scope.

```cpp
#include <iostream>
#include <memory>
using namespace std;

int main() {
    unique_ptr<int> p1 = make_unique<int>(42);
    cout << "Value: " << *p1 << endl;

    // unique_ptr cannot be copied
    // unique_ptr<int> p2 = p1;  // ❌ error

    unique_ptr<int> p2 = move(p1);  // transfer ownership
    cout << "Value from p2: " << *p2 << endl;

    return 0;
}
```

### 2. std::shared_ptr

Multiple shared_ptr can share ownership of the same resource.

Maintains a reference count.

When the last shared_ptr is destroyed, the memory is released.

```
#include <iostream>
#include <memory>
using namespace std;

int main() {
    shared_ptr<int> p1 = make_shared<int>(100);
    shared_ptr<int> p2 = p1;  // both share ownership

    cout << "Value: " << *p1 << endl;
    cout << "Reference Count: " << p1.use_count() << endl;

    return 0;
}
```

### 3. std::weak_ptr

Works with shared_ptr but does not increase reference count.

Used to break circular references between shared_ptr.

Cannot directly access the resource → must be converted to shared_ptr using .lock().

```
#include <iostream>
#include <memory>
using namespace std;

int main() {
    shared_ptr<int> sp = make_shared<int>(200);
    weak_ptr<int> wp = sp;  // weak_ptr observes shared_ptr

    if (auto temp = wp.lock()) {
        cout << "Value: " << *temp << endl;
    } else {
        cout << "Resource no longer exists" << endl;
    }

    return 0;
}
```

## **Advantages of Smart Pointers**

- Prevent memory leaks.

- Prevent dangling pointers.

- Automatic and safe memory management.

- Encourage modern C++ practices.

**_When to Use_**

Use **unique_ptr** → when only one owner should exist.

Use **shared_ptr** → when multiple owners are needed.

Use **weak_ptr** → to avoid circular references in shared ownership.

## **Summary**

Smart pointers are wrappers around raw pointers that manage memory automatically.

**Types**: unique_ptr, shared_ptr, weak_ptr.

Prefer smart pointers over raw pointers in modern C++ for safety and readability.