package dev.lpa;

import java.util.Arrays;
import java.util.Random;

public class ArraysRandomSorting {

    public static void main(String[] args) {
        int[] unsortedArray = getRandomArray(5);
        System.out.println(Arrays.toString(unsortedArray));

        int[] sortedArray = sortInteger(new int[] {7, 10, 35});
        System.out.println(Arrays.toString(sortedArray));
    }
    private static int[] getRandomArray(int len) {
        Random random = new Random();
        int[] dummyArray = new int[len];

        for (int i = 0; i < len; i++) {
            dummyArray[i] = random.nextInt(1000);
        }
        return dummyArray;
    }

    private static int[] sortInteger(int[] array) {

        System.out.println(Arrays.toString(array));
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for(int i = 0; i < sortedArray.length - 1; i++) {
                if(sortedArray[i] < sortedArray[i + 1]) {
                        temp = sortedArray[i];
                        sortedArray[i] = sortedArray[i + 1];
                        sortedArray[i+ 1] = temp;
                        flag = true;
                        System.out.println("---->" + Arrays.toString(sortedArray));
                }
            }

            System.out.println("-->" + Arrays.toString(sortedArray));
        }
        return sortedArray;
    }
}
