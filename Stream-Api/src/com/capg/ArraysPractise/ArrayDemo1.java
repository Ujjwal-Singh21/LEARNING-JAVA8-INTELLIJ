package com.capg.ArraysPractise;

import java.util.Scanner;

public class ArrayDemo1 {

    // taking array size from user , then taking elements to be stored based on his size entered
    // then finally printing the array
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Array size :");
        int size = scanner.nextInt();

        //now making an array based on size entered
        int[] numbersArray = new int[size];

        // taking input elements from user based on array size entered
        System.out.println("Enter the input elements to be stored :");
        for (int i = 0; i < size; i++) {
            numbersArray[i] = scanner.nextInt();
        }

        // finally, printing the output
        for (int j = 0; j < size; j++) {
            System.out.println("the final array :" +numbersArray[j]);
        }
    }
}
