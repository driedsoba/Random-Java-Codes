import java.util.Scanner;

public class ReadingUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 1;
        double sumNumber = 0;

        do {
            System.out.println("Enter number #" + count + ":");
            String number = scanner.nextLine();
            try {
                double dNumber = Double.parseDouble(number);
                sumNumber += dNumber;
                count++;
            } catch (NumberFormatException badUserData) {
                System.out.println("Invalid number");
            }
        } while (count <= 5);

        System.out.println("Sum of five numbers is " + sumNumber);
    }
}