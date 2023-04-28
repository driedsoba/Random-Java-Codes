package dev.lpa;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement {
    public static void main(String[] args) {

        int[] returnedArray = readIntegers();
        System.out.println(Arrays.toString(returnedArray));

//        int returnedMin = findMin((returnedArray));
//        System.out.println("min = " + returnedMin);

        reverse(returnedArray);
        System.out.println(Arrays.toString(returnedArray));
    }

    private static int[] readIntegers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a list of integers, separated by commas:");
        String input = scanner.nextLine();

        String[] splits = input.split(",");
        int[] values = new int[splits.length];

        for (int i = 0; i < splits.length; i++) {
            values[i] = Integer.parseInt(splits[i].trim());
        }

        return values;
    }

    private static int findMin(int[] userArray) {
        // setting it to the highest number an integer can hold, assumes user enters number smaller
        int min = Integer.MAX_VALUE;
        for (int el : userArray) {
            if (el < min) {
                min = el;
            }
        }
        return min;
    }

    // middle element does not require to be swapped, consider half of array length
    public static void reverse(int[] originalArray) {
      int maxIndex = originalArray.length - 1;
      int halfLength = originalArray.length / 2;

      for (int i =0; i < halfLength; i++) {
          int temp = originalArray[i];
          originalArray[i] = originalArray[maxIndex - i];
          originalArray[maxIndex - i] = temp;
          System.out.println("-->" + Arrays.toString(originalArray));
      }
    }
}