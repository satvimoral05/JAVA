public class ExceptionDemo{
    public static void manin(String[]args){

        try{
            int a = 10;
            int b = 0;
            int c = a/b;
            System.out.println("Result: " + c);
        }
        catch(ArithmeticException e){
            System.out.println("ArithmeticException caught: division by zero.");
        }
        System.out.println();

        try{
            int[] arr = {10,20,30};
            System.out.println(arr[5]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException caught: index out of bounds.");
        }
        
    }
}
