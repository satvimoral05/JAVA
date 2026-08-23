// Interface
interface Shape {
    double getArea();
}

// Rectangle class
class Rectangle implements Shape {

    double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double getArea() {
        return length * breadth;
    }
}

// Circle class
class Circle implements Shape {

    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}

// Triangle class
class Triangle implements Shape {

    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getArea() {
        return 0.5 * base * height;
    }
}

// Driver class
public class ShapeDemo {

    public static void main(String[] args) {

        Shape rect = new Rectangle(10, 5);
        Shape circle = new Circle(7);
        Shape tri = new Triangle(6, 4);

        System.out.println("Rectangle Area: " + rect.getArea());
        System.out.println("Circle Area: " + circle.getArea());
        System.out.println("Triangle Area: " + tri.getArea());
    }
}
