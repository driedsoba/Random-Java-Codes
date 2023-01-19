public class ThePrimeNumberChallenge {

    public static void main(String[] args) {

        int primeCounter = 0;

        for (int i = 2; i <= 1000; i++) {
            if (primeCounter == 10) {               //exit loop once 3 prime numbers are printed
                System.out.println("Exiting for loop");
                break;
            }

            if (isPrime(i)) {                      //for loop to iterate wholeNumber
                primeCounter += 1;
                System.out.println(i + " is a prime number.");
            }
        }
    }

    public static boolean isPrime(int wholeNumber) {
        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }
        for (int divisor = 2; divisor < wholeNumber ; divisor++) {
            if (wholeNumber % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}
