/*
interface I {}

class A {}

class B extends A implements I{}

public class Upcasting {
    A a = new B(); // Upcasting
}
*/

/*
Relationship of Class B:

B IS-A A
B IS-A I(Interface)
B IS-A Object

*/

class Bike {
    void run() {
        System.out.println("Running");
    }
}

class Splendor extends Bike {
    void run() {
        System.out.println("Running Safely with 60km");
    }
}

public class Upcasting {
    public static void main(String[] args) {
        Bike b = new Splendor(); // Upcasting - Dynamic Binding
        Splendor s = new Splendor();    // Normal Object Creation - Static Binding
        Splendor s1 = null;
        b.run();

        //instanceof operator
        System.out.println(b instanceof Bike); // true
        System.out.println(b instanceof Splendor); // true
        System.out.println(s instanceof Bike); // true
        System.out.println(s instanceof Splendor); // true
        System.out.println(b instanceof Object && s instanceof Object); // true
        System.out.println(s1 instanceof Splendor); // false

        //Downcasting
        Bike b1 = new Splendor();
        Splendor s2 = (Splendor) b1; // Downcasting
        System.out.println(s2 instanceof Splendor); // true
        System.out.println(s2 instanceof Bike); // true

    }
}