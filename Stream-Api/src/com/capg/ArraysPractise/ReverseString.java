package com.capg.ArraysPractise;

import java.util.Scanner;

public class ReverseString {

    // reversing a string
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String :");
        // using StringBuilder because String is immutable
        StringBuilder stringBuilder = new StringBuilder(scanner.nextLine());
        // working till half of the string is enough
        for (int i = 0; i < stringBuilder.length() / 2; i++) {
            int front = i;
            int back = stringBuilder.length() - 1 - i;

            char frontChar = stringBuilder.charAt(front);
            char backChar = stringBuilder.charAt(back);

            stringBuilder.setCharAt(front, backChar);
            stringBuilder.setCharAt(back, frontChar);
        }
        System.out.println("reversed String is :" + stringBuilder);
    }
}
