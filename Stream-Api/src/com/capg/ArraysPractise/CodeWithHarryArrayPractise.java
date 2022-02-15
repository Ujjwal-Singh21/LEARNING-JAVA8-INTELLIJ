package com.capg.ArraysPractise;

public class CodeWithHarryArrayPractise {
    public static void main(String[] args) {

        // problem-1
        // create a array of 5 floats and print their sum
//        float[] floatArray = {1.0f, 2.0f, 3.0f, 4.0f, 5.0f};
//
//        float sum = 0;
//        for (float newArray : floatArray) {
//            sum = sum + newArray;
//        }
//        System.out.println("total sum of float array :" + sum);
//
//        // problem-2
//        // find a given number is present in array or not
//        int[] marks = {45, 43, 21, 32, 50};
//        int key = 99;
//        boolean isAvailable = false;
//        for (int newMarks : marks) {
//            if (key == newMarks) {
//                isAvailable = true;
//                break;
//            }
//        }
//        if (isAvailable) {
//            System.out.println("the value is present in the array");
//        } else {
//            System.out.println("the value is not present in the array");
//        }
//
//        // problem-3
//        // calculate the average marks from a student's physics marks array using for-each loop
//        int[] physicsMarks = {88, 87, 95, 99, 73};
//        int size = physicsMarks.length;
//        int totalMarks = 0;
//
//        for (int newPhysicsMarks : physicsMarks) {
//            totalMarks = totalMarks + newPhysicsMarks;
//        }
//        float average = totalMarks / size;
//        System.out.println("Average physics marks :" + average);
//
//        // problem-4
//        // addition of two metrics
//        int[][] matrix1 = {{22, 33, 44}, {13, 16, 15}};
//        int[][] matrix2 = {{61, 11, 13}, {19, 12, 15}};
//        int[][] finaMatrix = new int[2][3];
//
//        for (int i = 0; i < 2; i++) {
//            for (int j = 0; j < 3; j++) {
//                finaMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
//            }
//        }
//        for (int i = 0; i < 2; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.print(finaMatrix[i][j] + " ");
//            }
//            System.out.println();
//        }

        // problem-5
        // reverse an array
        int[] freshArray = {1, 3, 5, 7, 9, 666};
        for (int i = 0; i < freshArray.length / 2; i++) {
            int front = i;
            int back = freshArray.length - 1 - i;

            int frontElement = freshArray[front];
            int backElement = freshArray[back];

            freshArray[front] = backElement;
            freshArray[back] = frontElement;

        }
        System.out.println("Reverse Array one :");
        for (int a : freshArray) {
            System.out.print(a + " ");
        }


        // problem-5.1 reverse an array (another approach)
        int[] newarray = {1, 3, 5, 7, 9, 66, 999};
        int temp;
        int lenght = newarray.length;
        int n = newarray.length / 2;
        for (int i = 0; i < n; i++) {

            temp = newarray[i];
            newarray[i] = newarray[lenght - i - 1];
            newarray[lenght - 1 - i] = temp;
        }
        System.out.println(" \n Reverse Array two :");
        for (int b : newarray) {
            System.out.print(b + " ");
        }

        // problem-6
        // find maximum number from an array
        int[] maxArray = {33, 43, 51, 97, 11};
        int max = 0;
        for (int e : maxArray) {
            if (e > max) {
                max = e;
            }
        }
        System.out.println(" \n Maximum no from array one :" + max);

        // problem-6.1 (if array has any negative value then)
        // find maximum number from an array
        int[] maxArray1 = {33, 43, 51, -97, 11};
        int max1 = Integer.MIN_VALUE;  // IF ARRAY HAS NEGATIVE VALUE
        for (int e : maxArray1) {
            if (e > max1) {
                max1 = e;
            }
        }
        System.out.println(" \n Maximum no from array two :" + max1);

        // problem-7
        // find minimum number from an array
        int[] minArray = {33, 43, 51, 97, 11};
        int min = minArray[0];
        for (int e : minArray) {
            if (e < min) {
                min = e;
            }
        }
        System.out.println(" \n Minimum no from array one :" + min);

        // problem-7.1 // IF ARRAY HAS NEGATIVE VALUE
        // find minimum number from an array
        int[] minArray1 = {33, 43, 51, 97, 11};
        int min1 = Integer.MAX_VALUE;
        for (int e : minArray1) {
            if (e < min1) {
                min1 = e;
            }
        }
        System.out.println(" \n Minimum no from array two :" + min1);
    }
}

