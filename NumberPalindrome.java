public class NumberPalindrome {

    public static void main(String[] args) {
        int checkNumber = -1321;
        System.out.println("The reverse of " + checkNumber + " is " + isPalindrome(checkNumber));
    }


    public static boolean isPalindrome (int number) {
        int checkNumber = number;
        int reverse = 0;
        while (number != 0) {
            int lastDigit = number % 10;                        //extracting last digit from number
            reverse = (reverse * 10) + lastDigit;               //adding last digit to reverse then increasing place value by 1
            number = number / 10;                               //removing last digit from number
        }
        return checkNumber == reverse;                          //logic check for palindrome number
    }
}
