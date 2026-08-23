class MyPoint {

    double x;
    double y;

    MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(MyPoint p) {

        double dx = this.x - p.x;
        double dy = this.y - p.y;

        return Math.sqrt(dx * dx + dy * dy);
    }

    public double distance(double x, double y) {

        double dx = this.x - x;
        double dy = this.y - y;

        return Math.sqrt(dx * dx + dy * dy);
    }
}

class ThreeDPoint extends MyPoint {

    double z;

    ThreeDPoint() {

        super(0, 0);

        this.z = 0;
    }

    ThreeDPoint(double x, double y, double z) {

        super(x, y);

        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public double distance(ThreeDPoint p) {

        double dx = this.getX() - p.getX();
        double dy = this.getY() - p.getY();
        double dz = this.z - p.z;

        return Math.sqrt(
            dx * dx + dy * dy + dz * dz
        );
    }
}

public class PointDemo {

    public static void main(String[] args) {

        ThreeDPoint p1 =
            new ThreeDPoint(0, 0, 0);

        ThreeDPoint p2 =
            new ThreeDPoint(10, 30, 25.5);

        double dist = p1.distance(p2);

        System.out.println(
            "Distance between points: " + dist
        );
    }
}
