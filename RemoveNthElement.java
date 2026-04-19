package com.arraylist.remove;

import java.util.*;

public class RemoveNthElement {
	
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create ArrayList
        ArrayList<String> colors = new ArrayList<>();

        // Add colors
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Black");

        // Display original list
        System.out.println("Original List: " + colors);

        // Get nth position from user
        System.out.print("Enter position to delete (1 to " + colors.size() + "): ");
        int n = sc.nextInt();

        // Remove nth element (convert to index n-1)
        if (n >= 1 && n <= colors.size()) {
            colors.remove(n - 1);
            System.out.println("After deleting " + n + "th element: " + colors);
        } else {
            System.out.println("Invalid position!");
        }

        sc.close();
    }
}