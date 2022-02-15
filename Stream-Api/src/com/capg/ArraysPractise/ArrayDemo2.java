package com.capg.ArraysPractise;

import java.util.Scanner;

public class ArrayDemo2 {

    // taking array size from user , then taking elements to be stored based on his size entered.
    // then taking an element "x" from user and searching it in given array, if its available then telling its index number
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array :");
        int arraySize = scanner.nextInt();
        // making an array BASED ON SIZE
        int[] myArray = new int[arraySize];

        // taking input from user
        System.out.println("Enter elements of array :");
        for (int i = 0; i < arraySize; i++) {
            myArray[i] = scanner.nextInt();
        }

        // taking element x that need to be searched
        System.out.println("Enter elements to be searched in array :");
        int key = scanner.nextInt();
        for (int j = 0; j < arraySize; j++) {
            if (key == myArray[j])
                System.out.println("Element found at index :" + j);
            break;
        }
    }
}

