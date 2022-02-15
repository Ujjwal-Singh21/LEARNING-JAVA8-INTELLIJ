package com.capg.ArraysPractise;

import java.util.Scanner;

public class TwoDimensionalArray1 {

    // creating a 2-D array based on user size
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

        // printing final 2D array
        System.out.println("Your final 2D Array :");
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < columnSize; j++) {
                System.out.print(my2DArray[i][j] +" ");
            }
            System.out.println();
        }
    }
}
