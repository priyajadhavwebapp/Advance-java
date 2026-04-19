package com.linkedlist.display;

import java.util.*;

public class DisplayPositionLinkedList {

    public static void main(String[] args) {

        // Create LinkedList
        LinkedList<String> list = new LinkedList<>();

        // Add elements
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Mango");
        list.add("Grapes");

        // Display elements with positions
        System.out.println("Elements and their positions:");

        for (int p = 0; p < list.size(); p++) {
            System.out.println("Position " + p + " : " + list.get(p));
        }
    }
}