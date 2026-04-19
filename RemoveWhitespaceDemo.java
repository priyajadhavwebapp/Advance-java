package com.string.cleanup;

import java.util.*;

public class RemoveWhitespaceDemo {

    // User-defined function
    public static String removeWhitespace(String str) {
        // Replace all whitespace (spaces, tabs, newlines) with empty string
        return str.replaceAll("\\s+", "");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String result = removeWhitespace(input);

        System.out.println("String after removing whitespace: " + result);

        sc.close();
    }
}