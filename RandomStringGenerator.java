package com.string.random;

import java.util.*;

public class RandomStringGenerator {


    // User-defined function
    public static String generateRandomString(int length) {

        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder result = new StringBuilder();
        Random rand = new Random();

        for (int i = 0; i < length; i++) {
            int index = rand.nextInt(chars.length());
            result.append(chars.charAt(index));
        }

        return result.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter desired length: ");
        int length = sc.nextInt();

        String randomStr = generateRandomString(length);

        System.out.println("Generated Random String: " + randomStr);

        sc.close();
    }
}