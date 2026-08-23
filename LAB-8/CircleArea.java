class Area {

    public static final double PI = 3.1415;

    static double calculateArea(double r) {
        return PI * r * r;
    }
}

public class CircleArea {

    public static void main(String[] args) {

        double r1 = 5.0;

        System.out.printf(
            "%.3f",
            Area.calculateArea(r1)
        );
    }
}
