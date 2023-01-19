import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int counter = 0, sum = 0;
        long average;

        while(true) {
            System.out.println("Enter an integer number: ");
            String inputNumber = scanner.nextLine();
            try {
                int number = Integer.parseInt(inputNumber);
                sum += number;
                counter++;
            } catch(NumberFormatException badUserInput) {
                average = Math.round((double)sum / (double)counter);
                System.out.println("SUM = "+ sum + " AVG = " + average);
                break;
            }
        }
    }
}
