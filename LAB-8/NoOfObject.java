
class NoOfClass {

    static int number;

    public NoOfClass() {
        number++;
    }
}

public class NoOfObject {

    public static void main(String[] args) {
      
        NoOfClass n1 = new NoOfClass();
        NoOfClass n2 = new NoOfClass();
        NoOfClass n3 = new NoOfClass();
        NoOfClass n4 = new NoOfClass();

        System.out.println(NoOfClass.number);
    }
}
