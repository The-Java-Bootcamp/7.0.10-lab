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
