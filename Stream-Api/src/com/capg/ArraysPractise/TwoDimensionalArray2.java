package com.capg.ArraysPractise;

import java.util.Scanner;

public class TwoDimensionalArray2 {

    // creating a 2-D array based on user size
    // getting an element x from user and searching it in our array
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the rows size :");
        int rowSize = scanner.nextInt();
        System.out.println("Enter the column size :");
        int columnSize = scanner.nextInt();

        // making a 2-d array based on entered data size
        int[][] my2DArray = new int[rowSize][columnSize];

        // taking inputs for array
        System.out.println("Enter elements to be stored");
        for (int i = 0; i < rowSize; i++) {  // for rows
            for (int j = 0; j < columnSize; j++) { // for columns
                my2DArray[i][j] = scanner.nextInt();
            }
        }

        // getting the element x from user
        System.out.println("Enter element to be searched :");
        int key = scanner.nextInt();
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < columnSize; j++) {
                if (key == my2DArray[i][j]) {
                    System.out.println("Element found at index :" + "(" + i + "," + j + ")");
                    break;
                }
            }
        }
    }
}
