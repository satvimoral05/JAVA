class Cube {

    double height;
    double width;
    double depth;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public double volume() {
        return height * width * depth;
    }
}

public class CubeDemo {

    public static void main(String[] args) {

        Cube c1 = new Cube();
        Cube c2 = new Cube();

        c1.setHeight(2.0);
        c1.setWidth(3.0);
        c1.setDepth(4.0);

        c2.setHeight(5.0);
        c2.setWidth(6.0);
        c2.setDepth(7.0);

        System.out.println(
            "Volume of Cube 1 = " + c1.volume()
        );

        System.out.println(
            "Volume of Cube 2 = " + c2.volume()
        );
    }
}
