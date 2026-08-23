class Complex {
    // 1. Declare the instance variables
    int real;
    int imaginary;

    // 2. Default constructor
    public Complex() {
        this.real = 0;
        this.imaginary = 0;
    }

    // 3. Parameterized constructor
    public Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // 4. Method to add a complex number
    public void addition(int real, int imaginary) {
        this.real += real;
        this.imaginary += imaginary;
    }

    // 5. Method to print in standard formatted layout (a + bi)
    public void print() {
        System.out.println(this.real + " + " + this.imaginary + "i");
    }
}

public class ComplexAddition {
    public static void main(String[] args) {
        Complex c = new Complex();
        
        // Starts with (7 + 7i)
        Complex c1 = new Complex(7, 7); 
        
        // Adds (5 + 9i) -> Result: 12 + 16i
        c1.addition(5, 9); 
        
        // Prints the final output
        c1.print(); 
    }
}
