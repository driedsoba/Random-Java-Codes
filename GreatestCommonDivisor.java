public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second) {

        int lesser;
        int greatestCommonDivisor = 0;

        if (first < 10 || second < 10) {
            return -1;
        }

        if (first < second) {       // determine smaller number
            lesser = first;
        } else {
            lesser = second;
        }

        for (int i = 1; i <= lesser; i++) {     // looping to find the largest common value of i
            greatestCommonDivisor = (first % i == 0) && (second % i == 0)? i : greatestCommonDivisor;
        }
        return greatestCommonDivisor;
    }

}
