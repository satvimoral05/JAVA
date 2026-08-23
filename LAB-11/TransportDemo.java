interface Transport {
    public void deliver();
}

abstract class Animal {
    abstract public void display();
}

class Tiger extends Animal {

    public void display() {
        System.out.println("Tiger called");
    }
}

class Camel extends Animal implements Transport {

    public void deliver() {
        System.out.println("Deliver by Camel");
    }

    public void display() {
        System.out.println("Camel called");
    }
}

class Deer extends Animal {

    public void display() {
        System.out.println("Deer called");
    }
}

class Donkey extends Animal implements Transport {

    public void deliver() {
        System.out.println("Deliver by Donkey");
    }

    public void display() {
        System.out.println("Donkey called");
    }
}

public class TransportDemo {

    public static void main(String args[]) {

        Animal a[] = new Animal[4];

        a[0] = new Tiger();
        a[1] = new Camel();
        a[2] = new Deer();
        a[3] = new Donkey();

        for (int i = 0; i < 4; i++) {

            a[i].display();

            if (a[i] instanceof Transport) {
                Transport t = (Transport) a[i];
                t.deliver();
            }
        }
    }
}
