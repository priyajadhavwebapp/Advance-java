package PalindromeCheckProject;

import java.util.*;

public class PalindromeCheck {

    // User-defined function
    public static boolean isPalindrome(String str) {

        // Remove punctuation and spaces, convert to lowercase
        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Reverse the cleaned string
        String reversed = new StringBuilder(cleaned).reverse().toString();

        // Compare original and reversed
        return cleaned.equals(reversed);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        if (isPalindrome(input)) {
            System.out.println("The string is a PALINDROME.");
        } else {
            System.out.println("The string is NOT a palindrome.");
        }

        sc.close();
    }
}