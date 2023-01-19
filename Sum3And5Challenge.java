public class Sum3And5Challenge {
    public static void main(String[] args) {

        int numCount = 0;
        int numSum = 0;

        for (int i = 1; i <= 1000; i++) {
            if (numCount == 5) {
                System.out.println("Sum of the five numbers is " + numSum);
                break;
            }
            if (i % 3 == 0 && i % 5 ==0) {
                numSum += i;
                numCount++;
                System.out.println("Found a number " + i);
            }
        }
    }
}
