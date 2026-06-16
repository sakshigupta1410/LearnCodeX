# File Handling in Java

Java provides `File`, `FileReader`, `FileWriter`, `BufferedReader`, etc., for file operations.

**Example:**
```java
File file = new File("test.txt");
if (file.createNewFile()) {
    System.out.println("File created");
}
```