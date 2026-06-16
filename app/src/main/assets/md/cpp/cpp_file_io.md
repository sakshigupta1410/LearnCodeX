# **C++ File Handling (File I/O)**

File handling allows a C++ program to **store data permanently** on disk and **read/write** from files.  
The `<fstream>` library provides **file stream classes** for input and output operations.

---

## **1. File Stream Classes**

1. **`ifstream`** – Input file stream (for reading files)
2. **`ofstream`** – Output file stream (for writing files)
3. **`fstream`** – File stream (for both reading and writing)

```cpp
#include <fstream>
using namespace std;
```

---

## **2. Opening a File**

Open file using **open()** or constructor

```
#include <iostream>
#include <fstream>
using namespace std;

int main() {
    ofstream outFile("example.txt"); // Create and open file for writing
    if (!outFile) {
        cout << "Error opening file!" << endl;
        return 1;
    }
    outFile << "LearnCodeX C++ File Handling" << endl;
    outFile.close();  // Always close the file
    return 0;
}
```

---

## **3. Writing to a File**<br>

Use **ofstream** object with << operator

```
ofstream outFile("data.txt");
outFile << "Hello, LearnCodeX!" << endl;
outFile << 123 << endl;
outFile.close();
```

---

## **4. Reading from a File**

Use ifstream object with >> operator or getline()

```
#include <iostream>
#include <fstream>
#include <string>
using namespace std;

int main() {
    ifstream inFile("data.txt");
    string line;

    if (!inFile) {
        cout << "File not found!" << endl;
        return 1;
    }

    while (getline(inFile, line)) {
        cout << line << endl;  // Print each line
    }

    inFile.close();
    return 0;
}
```

---

## **5. File Modes**

Common file open modes:

ios::in -> Open for reading
ios::out -> Open for writing (overwrite)
ios::app -> Append data to file
ios::binary -> Binary mode
ios::ate -> Move to end after opening
ios::trunc -> Truncate file if exists

**Example**:

```
ofstream file("log.txt", ios::app); // Open in append mode
```

---

## **6. Checking File State**

**is_open()** – Check if file opened successfully

**eof()** – Check end of file

**fail()** – Check for read/write failure

```
ifstream file("data.txt");
if (!file.is_open()) {
    cout << "Cannot open file!" << endl;
}
```

---

## **7. Reading/Writing Binary Files**<br>

```
#include <iostream>
#include <fstream>
using namespace std;

struct Student {
    char name[20];
    int age;
};

int main() {
    Student s1 = {"LearnCodeX", 21};
    
    // Write binary
    ofstream outFile("student.dat", ios::binary);
    outFile.write((char*)&s1, sizeof(s1));
    outFile.close();

    // Read binary
    Student s2;
    ifstream inFile("student.dat", ios::binary);
    inFile.read((char*)&s2, sizeof(s2));
    cout << s2.name << ", " << s2.age << endl;
    inFile.close();

    return 0;
}
```

---

## **8. Summary (LearnCodeX)**

ofstream → write, ifstream → read, fstream → read/write

* Always close files after use (close())

* Use modes (ios::in, ios::out, ios::app, ios::binary) as needed
 
* Check file state with is_open(), eof(), fail()
 
* Can handle text files and binary files
 
* File handling enables persistent data storage in C++ programs
 
* Proper file handling ensures data is safely stored, retrieved, and managed, making programs robust and reliable.
