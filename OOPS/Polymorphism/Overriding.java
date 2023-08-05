class Parent {
    public void show() {
        System.out.println("Parent's show()");
    }
}

class Child extends Parent {
    @Override
    public void show() {
        System.out.println("Child's show()");
    }
}

class RBI {
    public void getInterestRate() {
        System.out.println("RBI Interest Rate: 7%");
    }
}

class SBI extends RBI {
    @Override
    public void getInterestRate() {
        System.out.println("SBI Interest Rate: 8%");
    }
}

class ICICI extends RBI {
    @Override
    public void getInterestRate() {
        System.out.println("ICICI Interest Rate: 9%");
    }
}

class AXIS extends RBI {
    @Override
    public void getInterestRate() {
        System.out.println("AXIS Interest Rate: 10%");
    }
}

public class Overriding {
    public static void main(String[] args) {
        // Parent obj1 = new Parent();
        // obj1.show();
        
        // Child obj3 = new Child();
        // obj3.show();
        
        // Parent obj2 = new Child();  // Child reference and child object (downcasting)
        // obj2.show();

        // 
        
        RBI bank = new RBI();
        bank.getInterestRate();

        bank = new SBI();
        bank.getInterestRate();

        bank = new ICICI();
        bank.getInterestRate();

        bank = new AXIS();
        bank.getInterestRate();
    }
}


/*
 * Overriding in java is a concept of runtime polymorphism.
 * 
 * Overriding is a feature that allows a subclass or child class to provide a 
 * specific implementation of a method that is already provided by one of its
 * super-classes or parent classes.
 * 
 * When a method in a subclass has the same name, same parameters or signature
 * and same return type(or sub-type) as a method in its super-class, then the
 * method in the subclass is said to override the method in the super-class.
 * 
 * The version of a method that is executed will be determined by the object
 * that is used to invoke it. If an object of a parent class is used to invoke
 * the method, then the version in the parent class will be executed, but if an
 * object of the subclass is used to invoke the method, then the version in the
 * child class will be executed. In other words, it is the type of the object
 * being referred to (not the type of the reference variable) that determines
 * which version of an overridden method will be executed.
 * 
 */