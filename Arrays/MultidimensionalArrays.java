package dev.lpa;

import java.util.Arrays;

public class MultidimensionalArrays {

    public static void main(String[] args) {

        int[][] array2 = new int[4][4];
        System.out.println(Arrays.toString(array2));
        System.out.println("array2.length = " + array2.length);

        for (int[] outer : array2) {
            System.out.println(Arrays.toString(outer));
        }

        for ( int i = 0; i < array2.length; i ++) {
            var innerArray = array2;
            for (int j = 0; j < innerArray.length; j++) {
                //System.out.println(array2[i][j] + " ");
                array2[i][j] = (i*10) + (j+1);
            }
            //System.out.println();
        }

//        for (var outer : array2) {
//            for (var element : outer) {
//                System.out.println(element + " ");
//            }
//            System.out.println();
//        }

        // single method to print elements from 2d array
        System.out.println(Arrays.deepToString(array2));
    }
}
