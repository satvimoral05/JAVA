import java.util.Scanner;

public class FindAngle {

    public static double angleClock(double hour, double minutes) {

        double hour_deg = (hour * 30) + (minutes * 0.5);
        double minute_deg = minutes * 6;

        double angle = Math.abs(hour_deg - minute_deg);

        angle = Math.min(angle, 360 - angle);

        return angle;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Hour: ");
        double hour = sc.nextDouble();

        System.out.println("Enter Minute: ");
        double minute = sc.nextDouble();

        System.out.println(
            "Angle between hour and minute = "
            + angleClock(hour, minute)
        );

        sc.close();
    }
}
