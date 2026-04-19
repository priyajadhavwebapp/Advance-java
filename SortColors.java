package com.arraylist.sorting;

import java.util.*;

public class SortColors {

    public static void main(String[] args) {

        // Create ArrayList
        ArrayList<String> colors = new ArrayList<>();

        // Add colors
        colors.add("Blue");
        colors.add("Red");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Black");

        // Display original list
        System.out.println("Original List: " + colors);

        // Sort the ArrayList
        Collections.sort(colors);

        // Display sorted list
        System.out.println("Sorted List: " + colors);
    }
}