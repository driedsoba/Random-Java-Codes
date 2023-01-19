public class DigitSumChallenge {
    public static int sumDigits(int num) {
        int lNum, sum = 0;
        if (num <= 0) {
            return -1;
        }
        while (num >= 1) {
            lNum = num % 10;
            sum += lNum;
            num = num/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int argNum = 1234;
        System.out.println("Sum of digits of " + argNum + " is " + sumDigits(argNum));
    }
}
