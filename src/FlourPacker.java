import java.util.Scanner;

public class FlourPacker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the goal amount of kilos of flour: ");
        int goal = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter the number of big flour bags: ");
        int bigCount = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter the number of small flour bags: ");
        int smallCount = Integer.parseInt(scanner.nextLine());

        System.out.println(canPack(bigCount, smallCount, goal));
    }


    public static boolean canPack(int bigCount, int smallCount, int goal) {

        if (bigCount < 0 || smallCount < 0 || goal < 0) {       //check for negative values
            return false;
        }

        int sum = (bigCount * 5) + smallCount;
        int remainder = goal % 5;

        if (sum >= goal) {

            if (remainder == 0) {
                return true;
            }
            else if(smallCount >= remainder) {
                return true;
            }
            return false;
        }
        return false;
    }
}
