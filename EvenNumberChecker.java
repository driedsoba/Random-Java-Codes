public class EvenNumberChecker {

    public static void main(String[] args) {
        int i = 5;
        int countOfEven = 0;
        int countOfOdd = 0;
        while(i <= 20) {

            if(countOfEven >= 5) {      //exit loop once 5 even numbers found
                break;
            }

            if (isEvenNumber(i)) {      //call method to check even number
                System.out.println("Even number is " + i);
                countOfEven++;      //count of even numbers
            } else {
                countOfOdd++;       //count of odd numbers
            }
            i++;
        }

        System.out.println("Total count of even numbers = " + countOfEven);
        System.out.println("Total count of odd numbers = " + countOfOdd);

    }


    public static boolean isEvenNumber(int num) {
        return num % 2 == 0;        // even number returns true, odd returns false

    }
}
