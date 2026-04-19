package com.string.performance;

public class PerformanceTest {

  public static void main(String[] args) {

        // Test StringBuffer
        StringBuffer sbf = new StringBuffer();
        long startTimeBuffer = System.nanoTime();

        for (int i = 0; i < 10000; i++) {
            sbf.append("AIET");
        }

        long endTimeBuffer = System.nanoTime();
        long timeBuffer = endTimeBuffer - startTimeBuffer;

        System.out.println("StringBuffer Time: " + timeBuffer + " ns");

        // Test StringBuilder
        StringBuilder sbd = new StringBuilder();
        long startTimeBuilder = System.nanoTime();

        for (int i = 0; i < 10000; i++) {
            sbd.append("AIET");
        }

        long endTimeBuilder = System.nanoTime();
        long timeBuilder = endTimeBuilder - startTimeBuilder;

        System.out.println("StringBuilder Time: " + timeBuilder + " ns");
    }
}