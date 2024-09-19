# Lab: 7.0.8

**Objective:**

- Understand the concept and importance of Command Line Arguments in Java development. 
- Learn how to implement and process Command Line Arguments in Java. 
- Explore practical applications of Command Line Arguments with input streams. 
- Identify common pitfalls and best practices when working with Command Line Arguments. 
- Gain hands-on experience with a complete Java example that demonstrates Command Line Arguments and basic input processing.

**Prerequisites:**

- Solid understanding of Java programming. 
- Familiarity with basic input/output operations in Java. 
- Basic knowledge of exception handling in Java.

**What You'll Achieve:**

- Develop a solid understanding of Command Line Arguments in Java. 
- Implement practical examples that can be applied in real-world scenarios. 
- Enhance your skills in parsing and validating user input, working with input streams, and building flexible command-line tools.

**Assignment Details**

You are provided with the following `TextAnalyzer` class that processes text input based on command-line arguments:

1. Implement the following functionality:
   - If no arguments are provided, print usage instructions.
   - The first argument should be the operation to perform: "count", "search", or "replace".
   - Additional arguments depend on the operation:
     - For "count": No additional arguments. Count words and lines in the input. 
     - For "search": The second argument is the search term. Find and print lines containing the term. 
     - For "replace": The second argument is the search term, and the third is the replacement. Perform the replacement in the input.
2. `Use System.in` to read the input text. The program should process the input until it encounters an EOF (End of File) signal (Ctrl+D on Unix-like systems, Ctrl+Z on Windows).
3. Implement error handling for:
   - Invalid number of arguments
   - Invalid operation
4. Create helper methods for each operation (count, search, replace) to keep the main method clean.
5. Use try-with-resources for handling the input stream to ensure proper resource management.

**Example Output**

```
$ java TextAnalyzer count
Enter text (Ctrl+D to end):
Java is a popular programming language.
Many applications are written in Java.
^D
Word count: 11
Line count: 2

$ java TextAnalyzer search Java
Enter text (Ctrl+D to end):
Java is a popular programming language.
Python is another widely used language.
Many applications are written in Java.
^D
Line 1: Java is a popular programming language.
Line 3: Many applications are written in Java.

$ java TextAnalyzer replace Java Python
Enter text (Ctrl+D to end):
Java is a popular programming language.
Many applications are written in Java.
^D
Python is a popular programming language.
Many applications are written in Python.

$ java TextAnalyzer
Usage: java TextAnalyzer <operation> [search_term] [replacement]
Operations:
  count: Count words and lines in the input
  search <term>: Find lines containing the search term
  replace <search> <replacement>: Replace occurrences of search term
```

**Starter Code**

The `TextAnalyzer.java` file contains the following starter code:

```java
package academy.javapro.lab;

import java.io.*;
import java.util.*;

public class TextAnalyzer {
    public static void main(String[] args) {
        if (args.length < 1) {
            printUsage();
            return;
        }

        String operation = args[0];

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter text (Ctrl+D to end):");
            
            switch (operation) {
                case "count":
                    // TODO: Implement count operation
                    break;
                case "search":
                    // TODO: Implement search operation
                    break;
                case "replace":
                    // TODO: Implement replace operation
                    break;
                default:
                    System.out.println("Invalid operation: " + operation);
                    printUsage();
            }
        } catch (IOException e) {
            System.err.println("Error reading input: " + e.getMessage());
        }
    }

    private static void printUsage() {
        // TODO: Implement usage instructions
    }

    // TODO: Implement helper methods for count, search, and replace operations
}

```

**Hints**

- Use `reader.readLine()` to read input line by line. It returns null when it reaches the end of the input.
- For the count operation, consider using `String.split()` to count words.
- For the search and replace operations, you can use `String.contains()` and `String.replace()` methods.
- Remember to handle the case where required command-line arguments are missing (e.g., search term for "search" operation).
- Use `System.err` for error messages to distinguish them from regular output.



**Submission Instructions**

1. Fork the repository
2. Clone your fork
3. Navigate into the repository
4. Implement the required functionality in the `TextAnalyzer.java` file
5. Test your implementation with various inputs
6. Git add, commit, and push to your fork
7. Submit a pull request
    - Set the title of the pull request to your first name and last name
    - In the comment, briefly explain your implementation approach and any challenges you faced

Remember, the goal is to learn and have fun! Don't hesitate to ask for help if you get stuck.