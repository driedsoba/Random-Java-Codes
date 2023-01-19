public class AreaCalculator {
    public static double area(double radius) {
        // check for negative values of radius
        if (radius < 0) {
            return -1.0;
        }
        double areaOfCircle = radius * radius * Math.PI;
        return areaOfCircle;
    }

    public static double area(double x, double y) {
        // check for negative values of length and breadth
        if (x < 0 || y < 0) {
            return -1.0;
        }
        double areaOfRect = x * y;
        return areaOfRect;
    }
}
