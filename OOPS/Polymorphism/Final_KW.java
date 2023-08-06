final class Parent {
    // final int a;
    // {
    //     a = 10;
    //     // a = 23;  // error: variable a might already have been assigned
    // }

    final void show() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    // Child() {
    //     a = 20;  // error: cannot assign a value to final variable a
    // }

    @Override
    void show() {
        System.out.println("Child");
    }
}

public class Demo {
    private Demo() {
        System.out.println("Demo");
    }
}


public class Final_KW {
    public static void main(String[] args) {
        // Parent p = new Parent();
        // System.out.println(p.a);
        // p.a = 25;   // error: cannot assign a value to final variable a

        Child c = new Child();

        Demo d = new Demo();    // error: Demo() has private access in Demo
    }
}


/*
 * Final Keyword:
 * > In java final keyword can be used in 3 contexts:
 *     1. Variable
 *     2. Method
 *     3. Class
 * 
 * Final keyword will prevent:
 * > Variable: value cannot be changed
 * > Method: method cannot be overridden
 * > Class: class cannot be inherited
 * 
 * 
 */