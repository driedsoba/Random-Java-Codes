import java.util.Scanner;

public class MinMaxChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 1;
        double maxNumber = 0, minNumber = 0;

        while (true) {
            System.out.println("Enter a number or character: ");
            String numberInput = scanner.nextLine();
            try {
                double number = Double.parseDouble(numberInput);
                if (counter == 1) {
                    maxNumber = number;
                    counter++;
                } else if (number < maxNumber) {
                    minNumber = number;
                } else {
                    maxNumber = number;
                }
            } catch (NumberFormatException badUserInput) {
                if (counter == 1) {
                    System.out.println("No valid data entered");
                } else {
                    System.out.println("Maximum number is " + maxNumber);
                    System.out.println("Minimum number is " + minNumber);
                }
                break;
            }
        }

    }
}
