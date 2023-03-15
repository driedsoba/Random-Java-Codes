package dev.lpa;

public class Main {
    public static void main(String[] args) {

        int[] myIntArray = new int[10];
        myIntArray[5] = 50;             // element 6

        double[] myDoubleArray = new double[10];
        myDoubleArray[2] = 3.5;
        System.out.println(myDoubleArray[2]);

        // array initializer
        int[] firstFivePositives = new int[]{1, 2, 3, 4, 5};
        System.out.println("first = " + firstFivePositives[0]);
        int arrayLen = firstFivePositives.length;
        System.out.println("length of array = " + arrayLen);
        System.out.println("last = " + firstFivePositives[arrayLen - 1]);

        int[] newArray;
        newArray = new int[]{5, 4, 3, 2, 1};
        for(int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i] + " ");
        }
    }
}
