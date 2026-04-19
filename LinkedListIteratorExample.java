package com.linkedlist.iterator;

import java.util.*;

public class LinkedListIteratorExample {

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

        // Create iterator starting from index 1 (2nd position)
        ListIterator<String> iterator = list.listIterator(1);

        // Iterate from 2nd element
        System.out.print("Elements from 2nd position: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}