class Animal {

    String name = "Generic Animal";

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    String name = "Dog";

    @Override
    void sound() {

        super.sound();

        System.out.println("Dog barks");
    }

    void showNames() {

        System.out.println("Parent name: " + super.name);
        System.out.println("Child name: " + name);
    }
}

public class SuperExample {

    public static void main(String[] args) {

        Dog d = new Dog();

        d.sound();
        d.showNames();
    }
}
