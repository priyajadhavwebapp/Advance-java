package com.linkedlist.reverse;

import java.util.*;

public class ReverseLinkedList {

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

        // Use descendingIterator for reverse traversal
        Iterator<String> iterator = list.descendingIterator();

        // Iterate in reverse order
        System.out.print("Reverse Order: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}