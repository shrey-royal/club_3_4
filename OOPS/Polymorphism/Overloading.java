public class Overloading {

    Overloading() {
        System.out.println("Constructor called");
    }

    Overloading(int a) {
        System.out.println("Constructor called with parameter " + a);
    }

    Overloading(int a, int b) {
        System.out.println(a + b);
    }

    Overloading(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    Overloading(int a, float b) {
        System.out.println(a + b);
    }

    Overloading(float a, int b) {
        System.out.println(a + b);
    }

    Overloading(float a, float b) {
        System.out.println(a + b);
    }


    // void add() {
    //     System.out.println("No parameters passed");
    // }

    // void add(int a, int b) {
    //     System.out.println("Sum of two numbers: " + (a + b));
    // }

    public static void main(String[] args) {
        Overloading obj;    // Reference variable ->  Object created

        obj = new Overloading();    // Object created -> Instance created
        obj = new Overloading(23);    // Here the previous object is destroyed and a new object is created

        obj = new Overloading(1, 2);
        obj = new Overloading(1, 2, 3);
        obj = new Overloading(1, 2.0f);
        obj = new Overloading(1.0f, 2);
        obj = new Overloading(1.0f, 2.0f);
    }
}

/*
 * When a class has multiple methods having same name but different in parameters, it is known as Method Overloading.
 * 
 * Task 1: Create a class named Adder which will have following methods:
 *  - add() which will print "No parameters passed"
 *  - add(int a, int b) which will print "Sum of two numbers: " + (a + b)
 *  - add(int a, int b, int c) which will print "Sum of three numbers: " + (a + b + c)
 *  - add(int a, float b) which will print "Sum of two numbers: " + (a + b)
 *  - add(float a, int b) which will print "Sum of two numbers: " + (a + b)
 *  - add(float a, float b) which will print "Sum of two numbers: " + (a + b)
 * 
 * same thing can be done using constructor overloading
 */