package com.string.operations;

import java.util.*;

public class StringOperationsDemo {

    // 1. String Creation and Basic Operations
    public static void stringCreation() {
        String s1 = "Hello";
        String s2 = new String("World");
        System.out.println("String 1: " + s1);
        System.out.println("String 2: " + s2);
    }

    // 2. Length and Character Access
    public static void lengthAndChar() {
        String str = "Java";
        System.out.println("Length: " + str.length());
        System.out.println("Character at index 2: " + str.charAt(2));
    }

    // 3. String Comparison
    public static void stringComparison() {
        String a = "Java";
        String b = "java";
        System.out.println("Equals: " + a.equals(b));
        System.out.println("Equals Ignore Case: " + a.equalsIgnoreCase(b));
    }

    // 4. String Searching
    public static void stringSearching() {
        String str = "Programming";
        System.out.println("Index of 'g': " + str.indexOf('g'));
        System.out.println("Contains 'gram': " + str.contains("gram"));
    }

    // 5. Substring Operations
    public static void substringDemo() {
        String str = "HelloWorld";
        System.out.println("Substring (0,5): " + str.substring(0, 5));
    }

    // 6. String Modification
    public static void stringModification() {
        String str = "java";
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Replace 'a' with 'o': " + str.replace('a', 'o'));
    }

    // 7. Whitespace Handling
    public static void whitespaceHandling() {
        String str = "   Hello Java   ";
        System.out.println("Trimmed: '" + str.trim() + "'");
    }

    // 8. String Concatenation
    public static void concatenation() {
        String a = "Hello ";
        String b = "World";
        System.out.println("Concatenated: " + a.concat(b));
    }

    // 9. String Splitting
    public static void stringSplitting() {
        String str = "Java,Python,C++";
        String[] parts = str.split(",");
        System.out.println("Split result:");
        for (String p : parts) {
            System.out.println(p);
        }
    }

    // 10. StringBuilder Demo
    public static void stringBuilderDemo() {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" Java");
        System.out.println("StringBuilder: " + sb);
    }

    // 11. String Formatting
    public static void stringFormatting() {
        String name = "Priya";
        int marks = 95;
        System.out.println(String.format("Name: %s, Marks: %d", name, marks));
    }

    // 12. Validate Email
    public static void validateEmail() {
        String email = "example@gmail.com";

        if (email.contains("@") &&
            email.startsWith("example") &&
            email.endsWith(".com")) {
            System.out.println("Valid Email");
        } else {
            System.out.println("Invalid Email");
        }
    }

    public static void main(String[] args) {

        System.out.println("----- String Operations -----");

        stringCreation();
        lengthAndChar();
        stringComparison();
        stringSearching();
        substringDemo();
        stringModification();
        whitespaceHandling();
        concatenation();
        stringSplitting();
        stringBuilderDemo();
        stringFormatting();
        validateEmail();
    }
}