public class PerfectNumber {
    public static boolean isPerfectNumber(int number) {

        int sumDivisors = 0;

        if (number < 1) {
            return false;
        }
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {          //remainder of perfect divisors is 0
                sumDivisors += i;
            }
        }
        if (sumDivisors == number) {    //logic check for sum of divisors against number
            return true;
        } else {
            return false;
        }
    }
}