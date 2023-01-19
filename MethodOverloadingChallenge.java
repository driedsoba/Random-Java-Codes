public class MethodOverloadingChallenge {
    public static double convertToCentimetres(int inchHeight) {
       return inchHeight * 2.54;
    }

    public static double convertToCentimetres(int feetHeight, int remainingInchHeight) {
        double inchHeight = feetHeight * 12.0;
        return convertToCentimetres((int) (inchHeight + remainingInchHeight));
    }

    public static void main(String[] args) {
        System.out.println(convertToCentimetres(10));
        System.out.println(convertToCentimetres(1,3));
    }
}
