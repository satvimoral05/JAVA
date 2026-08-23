abstract class Vegetable {

    String color;

    Vegetable(String color) {
        this.color = color;
    }

    public abstract String getColor();
}

class Potato extends Vegetable {

    Potato(String color) {
        super(color);
    }

    public String getColor() {
        return super.color;
    }
}

class Brinjal extends Vegetable {

    Brinjal(String color) {
        super(color);
    }

    public String getColor() {
        return super.color;
    }
}

class Tomato extends Vegetable {

    Tomato(String color) {
        super(color);
    }

    public String getColor() {
        return super.color;
    }
}

public class VegetableColor {

    public static void main(String[] args) {

        Potato p = new Potato("Brown");
        Brinjal b = new Brinjal("Purple");
        Tomato t = new Tomato("Red");

        System.out.println("Potato color = " + p.getColor());
        System.out.println("Brinjal color = " + b.getColor());
        System.out.println("Tomato color = " + t.getColor());
    }
}
