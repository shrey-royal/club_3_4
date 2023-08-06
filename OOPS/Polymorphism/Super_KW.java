class GrandParent {
    GrandParent() {
        System.out.println("GrandParent Constructor");
    }

    void printName(String name) {
        System.out.println("GrandParent Name: " + name);
    }
}

class Parent {
    int a = 10;
    // Parent() {
    //     System.out.println("Parent Constructor");
    // }
    
    // @Override
    void printName(String name) {
        System.out.println("Parent Name: " + name);
    }
}

class Child extends Parent {
    Child() {
        super();    // Calling Parent class constructor
        System.out.println("Child Constructor");
    }

    @Override
    void printName(String name) {
        super.printName(name);  // Calling Parent class method
        System.out.println("Child Name: " + name);
        System.out.println("Parent a: " + super.a); // Calling Parent class instance variable
        super.a = 20;   // Changing Parent class instance variable
        System.out.println("Parent a: " + super.a); // Calling Parent class instance variable
    }
}


public class Super_KW {
    public static void main(String[] args) {
        Child c = new Child();
        c.printName("Child");


        // Parent p = new Parent();
        // p.printName("Parent");

        // GrandParent gp = new GrandParent();
        // gp.printName("GrandParent");
    }
}

/*
 * 
 * Super Keyword: 
 * 
 * > Super keyword is used to refer immediate parent class instance variable.
 * 
 * 
 */