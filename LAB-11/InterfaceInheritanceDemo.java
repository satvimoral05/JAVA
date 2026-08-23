interface A {
    int X = 10;

    void methodA();
}

interface A1 extends A {
    int Y = 20;

    void methodA1();
}

interface A2 extends A {
    int Z = 30;

    void methodA2();
}

interface A12 extends A1, A2 {
    int W = 40;

    void methodA12();
}

class B implements A12 {

    public void methodA() {
        System.out.println("Constant from A: " + X);
    }

    public void methodA1() {
        System.out.println("Constant from A1: " + Y);
    }

    public void methodA2() {
        System.out.println("Constant from A2: " + Z);
    }

    public void methodA12() {
        System.out.println("Constant from A12: " + W);
    }
}

public class InterfaceInheritanceDemo {

    public static void main(String[] args) {

        B obj = new B();

        obj.methodA();
        obj.methodA1();
        obj.methodA2();
        obj.methodA12();
    }
}
