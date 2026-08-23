class Circle {

    double radius;

    void setRad(double radius) {
        this.radius = radius;
    }

    double countArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}

public class Area {

    public static void main(String[] args) {

        Circle c1 = new Circle();

        c1.setRad(15.6);

        System.out.println(c1.countArea());
    }
}
