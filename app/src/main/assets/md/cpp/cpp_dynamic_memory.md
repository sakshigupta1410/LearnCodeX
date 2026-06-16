# Dynamic Memory in C++

In C++, memory can be allocated and deallocated at runtime using **dynamic memory allocation**.  
This allows programs to use memory efficiently when the exact size of data is not known at compile time.

---

## Dynamic Memory Operators

- **`new`** → Used to allocate memory dynamically.
- **`delete`** → Used to free memory allocated with `new`.
- **`new[]`** → Used to allocate memory for arrays.
- **`delete[]`** → Used to free memory allocated for arrays.

---

## Example: Single Variable Allocation
<br>

```cpp
#include <iostream>
using namespace std;

int main() {
    int *ptr = new int;   // allocate memory for one int
    *ptr = 42;

    cout << "Value: " << *ptr << endl;

    delete ptr;           // free memory
    return 0;
}
```

**Example:** <br>
Dynamic Array

```
#include <iostream>
using namespace std;

int main() {
    int n;
    cout << "Enter number of elements: ";
    cin >> n;

    int *arr = new int[n];   // allocate memory for n integers

    for (int i = 0; i < n; i++) {
        arr[i] = i + 1;
    }

    cout << "Array elements: ";
    for (int i = 0; i < n; i++) {
        cout << arr[i] << " ";
    }

    delete[] arr;   // free memory
    return 0;
}
```

## **Common Mistakes**
<br>

### **Memory Leak**

Forgetting to delete allocated memory causes memory leaks.

### **Dangling Pointer**

Using a pointer after delete leads to undefined behavior.

### **Double Delete**

Deleting the same memory twice is dangerous.

## **Best Practices**

-Always delete memory after use.

-Initialize pointers to nullptr after deletion.

-Prefer smart pointers (std::unique_ptr, std::shared_ptr) in modern C++.

## **Summary**

**new / delete** → Allocate/free single objects.

**new[] / delete[]** → Allocate/free arrays.

Use smart pointers to avoid manual memory management issues.