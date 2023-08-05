/*
> Covariant Return Type: In java, a method can only return a value of same type as defined in the method signature. But, in case of method overriding, a child class method can return a value of subclass type.
class A {
    A get() {
        return this;
    }
}

*/

class A {
    A get() {
        return this;
    }

    void message() {
        System.out.println("welcome to covariant return type by A class");
    }
}

public class Covariant_RT extends A {
    Covariant_RT get() {
        return this;
    }

    void message() {
        System.out.println("welcome to covariant return type by Covariant_RT class");
    }

    public static void main(String args[]) {
        new Covariant_RT().get().message();
        new A().get().message();
    }
}