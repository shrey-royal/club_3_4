import java.io.FileReader;

public class CheckedExcept {
    public static void main(String[] args) {

        System.out.println("Before Exception");

        try {
            FileReader file = new FileReader("file.txt");
            System.out.println("File Opened");
        } catch (Exception e) {
            System.err.println("File not found");
        }
        
        System.out.println("After Exception");
    }
}

/*
Checked Exception are checked at compile-time.

ex:

FileNotFoundException
IOException
ParseException
ClassNotFoundException

Unchecked Exception are not checked at compile-time.

ex:

ArithmeticException
NullPointerException
ArrayIndexOutOfBoundsException



*/