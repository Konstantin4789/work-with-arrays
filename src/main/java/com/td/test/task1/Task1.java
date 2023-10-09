package com.td.test.task1;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static int length;

    public static void main(String[] args) {
        int[] ints1 = inputArray(true);
        int[] ints2 = inputArray(false);
        System.out.println("Result: " + Arrays.toString(addArray(ints1, ints2)));
    }

    public static int[] addArray(int[] ints1, int[] ints2) {
        for (int i = 0; i < ints1.length; i++) {
            ints2[i] = ints1[i] + ints2[i];
        }
        return ints2;
    }

    public static int[] inputArray(boolean needToInputLength) {
        Scanner scanner = new Scanner(System.in);
        if (needToInputLength) {
            length = 0;
            try {
                System.out.println("Enter array length:");
                length = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Only numbers");
            }
        }

        int[] ints = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Enter " + (i + 1) + " number:");
            ints[i] = scanner.nextInt();
        }
        return ints;
    }
}
