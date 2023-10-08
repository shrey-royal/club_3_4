import java.io.*;

public class TC_Block {
    public static void main(String[] args) {
            
            System.out.println("Before Exception");
            // String string = null;
            // char arr[] = {'a', 'b', 'c'};

            // System.out.println(string.length());
            // System.out.println(arr[3]);

            try {
                div(12, 1);
                // System.out.println(12/0);   // ArithmeticException
                FileReader file = new FileReader("file.txt");
                System.out.println("File Opened");
            } catch (FileNotFoundException e) {
                System.err.println(e.getClass());
                System.err.println(e.getMessage());
            } catch (ArithmeticException e) {
                System.err.println(e.getClass());
                System.err.println(e.getMessage());
            } finally {
                System.out.println("Finally Block");
            }
            
            System.out.println("After Exception");
    }

    public static void div(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Divide by zero error");
        }
        System.out.println(a/b);
    }
}

/*
Try-Catch Block
    - try : block of code that may throw an exception
    - catch : block of code that handles the exception
    - finally : block of code that is always executed
    - throw : used to throw an exception
    - throws : used to declare an exception

    Checked Exception are checked at compile-time.
    Unchecked Exception are checked at run-time.


*/