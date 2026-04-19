package com.string.format;

import java.util.*;

public class CapitalizeWordsDemo {

    // User-defined function
    public static String capitalizeWords(String str) {

        String[] words = str.toLowerCase().split("\\s+");
        String result = "";

        for (String word : words) {
            if (word.length() > 0) {
                result += Character.toUpperCase(word.charAt(0)) 
                        + word.substring(1) + " ";
            }
        }

        return result.trim();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        String output = capitalizeWords(input);

        System.out.println("Capitalized Sentence: " + output);

        sc.close();
    }
}