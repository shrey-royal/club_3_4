abstract class Devji {
    public void show() {
        System.out.println("Devjibhai Dudhwala");
    }

    abstract protected void carCollection();   // Abstract method
}

class DevjiDudhwala extends Devji {
    public void carCollection() {
        String[] cars = {"BMW", "Audi", "Mercedes", "Lamborghini", "Ferrari", "Bugatti", "Rolls Royce", "Bentley", "Porsche", "Maserati"};

        System.out.println("Devjibhai Dudhwala's Car Collection:");
        for (String car : cars) {
            System.out.print(car + ", ");
        }
        System.out.println();
    }
}

public class Abstract_1 {
    public static void main(String[] args) {
        // Devji d = new Devji();  // Error: Devji is abstract; cannot be instantiated
        // Devji d = new DevjiDudhwala();  // Abstract class reference and object
        // d.show();
        // d.carCollection();

        DevjiDudhwala devji = new DevjiDudhwala();
        devji.show();
        devji.carCollection();
    }
}

/*
Abstract Class in java:
> A class which is declared with the abstract keyword is known as an abstract class in Java.
> It can have abstract and non-abstract methods (method with the body).
> Abstraction is a process of hiding the implementation details and showing only functionality to the user.
> Abstract class needs to be extended and its method implemented. It cannot be instantiated.
*/