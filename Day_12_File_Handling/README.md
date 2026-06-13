# Day 12: File Handling in Java

Welcome to Day 12! So far, all the data our programs processed was stored in RAM, meaning it disappeared as soon as the program stopped running. To persist data permanently, we need to read from and write to files on the hard drive. 

---

## 📁 1. The `File` Class

The `java.io.File` class represents a file or directory path. It doesn't actually read or write data, but it is used to create, search for, and delete files/directories.

### Common File Methods
| Method | Description |
| :--- | :--- |
| `createNewFile()` | Creates an empty file. Returns `true` if successful. |
| `exists()` | Checks if the file exists. |
| `getName()` | Returns the name of the file. |
| `getAbsolutePath()` | Returns the absolute pathname of the file. |
| `length()` | Returns the size of the file in bytes. |
| `delete()` | Deletes the file. |

```java
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            File myFile = new File("test.txt");
            if (myFile.createNewFile()) {
                System.out.println("File created: " + myFile.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
```

---

## ✍️ 2. Writing to a File

To write text to a file, we can use the `FileWriter` class.

```java
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        try {
            // true parameter means "append" instead of "overwrite"
            FileWriter writer = new FileWriter("test.txt", true);
            writer.write("Hello, Java File Handling!\n");
            
            // ALWAYS close the writer to free up system resources!
            writer.close(); 
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
```

---

## 📖 3. Reading from a File

There are multiple ways to read a file in Java (Scanner, BufferedReader, Files class). `Scanner` is often the easiest for beginners.

### Using `Scanner`
```java
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        try {
            File myFile = new File("test.txt");
            Scanner scanner = new Scanner(myFile);
            
            // Loop until there is no more data to read
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                System.out.println(data);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
```

### Flow of File IO

```mermaid
graph LR
    App[Java Application] --> |write()| StreamW[FileWriter / BufferedWriter]
    StreamW --> |Bytes| Disk[(Hard Drive)]
    Disk --> |Bytes| StreamR[Scanner / BufferedReader]
    StreamR --> |read()| App
```

---

## 🔒 4. The Try-With-Resources Statement

A major issue in File Handling is forgetting to call `.close()`, which leads to memory leaks and locked files. Java 7 introduced the **Try-With-Resources** statement, which automatically closes resources when the try block exits.

```java
import java.io.FileWriter;
import java.io.IOException;

public class SafeWrite {
    public static void main(String[] args) {
        // Resource declared in parentheses will be auto-closed!
        try (FileWriter writer = new FileWriter("test.txt")) {
            writer.write("This is safer!");
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
        // No need for a finally block with writer.close()
    }
}
```

---

## 📝 Learning & Assignments
- **Learning:** Go to the `Learning/` folder to see how to read and write files safely using try-with-resources.
- **Assignments:** Complete the `Assignments/` folder exercises. Write a program that copies the content of one text file to another!
