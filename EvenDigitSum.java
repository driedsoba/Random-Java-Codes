public class EvenDigitSum {

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(2000));
    }


    public static int getEvenDigitSum(int number) {
        int evenSum = 0;
        if (number < 0) {
            return -1;
        }
        while (number > 0) {
            int lastDigit = number % 10;

            if (number % 2 == 0) {
                evenSum += lastDigit;
            }
            number = number / 10;
        }
        return evenSum;
    }
}
