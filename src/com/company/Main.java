package com.company;

public class Main {

    public static void main(String[] args) {
        int[] myIntArray = new int[10];
//        myIntArray[0] = 45;
//        myIntArray[1] = 476;
//        myIntArray[5] = 50;

        double[] myDoubleArray = new double[10];
        for (int i = 0; i < myIntArray.length; i++) {
            myIntArray[i] = i * 10;
        }
        for (int i = 0; i < myIntArray.length; i++) {
            System.out.println("Element " + i + " value is " + myIntArray[i]);
        }
    }
}
