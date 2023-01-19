public class NumberOfDaysInAMonth {

    public static int getDaysInMonth(int month, int year) {
        if (year < 1 || year > 9999 || month < 1 || month > 12) {
            return -1;
        }
        if (month == 2) {
            if (isLeapYear(year)) {
                return 29;
            }
            else
                return 28;
        } else if (month == 1) {
            return 31;
        } else {
            return 30;
        }
    }

    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(getDaysInMonth(1,-2020));
    }
}
