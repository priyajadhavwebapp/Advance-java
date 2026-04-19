package com.arraylist.remove;

import java.util.*;

public class RemoveColors {

    public static void main(String[] args) {

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

        // Remove 2nd element (index 1)
        colors.remove(1);
        System.out.println("After removing 2nd element: " + colors);

        // Remove "Blue"
        colors.remove("Blue");
        System.out.println("After removing 'Blue': " + colors);
    }
}