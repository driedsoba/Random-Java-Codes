public class SumOddRange {
    public static boolean isOdd(int num) {
        if (num <= 0) {                     //error check for invalid values
            return false;
        }
        //odd number return true;
        //even number return false;
        return (num % 2) == 1;
    }
    public static int sumOdd(int start, int end) {
        int sumOdd = 0;
        if (start > end || end < 0 || start < 0) {        //error check for invalid values
            return -1;
        }
        for ( ; start <= end; start++) {     //for loop to iterate (end-start) times
            if (isOdd(start)) {
                sumOdd += start;
            }
        }
        return sumOdd;
    }
    public static void main(String[] args) {
        System.out.println(sumOdd(100, 1000));
    }
}
