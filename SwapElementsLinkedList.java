package com.linkedlist.swap;

import java.util.*;

public class SwapElementsLinkedList {

    public static void main(String[] args) {

        // Create LinkedList
        LinkedList<String> list = new LinkedList<>();

        // Add elements
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Mango");
        list.add("Grapes");

        // Display original list
        System.out.println("Original List: " + list);

        // Swap 1st (index 0) and 3rd (index 2) elements
        Collections.swap(list, 0, 2);

        // Display updated list
        System.out.println("After swapping 1st and 3rd elements: " + list);
    }
}