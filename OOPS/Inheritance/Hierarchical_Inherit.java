class A{
    int a = 10;
}

class B extends A{
    public void display(){
        System.out.println("Class B: " + a);
    }
}

class C extends A{
    public void display(){
        System.out.println("Class C: " + a);
    }
}

class D extends A{
    public void display(){
        System.out.println("Class D: " + a);
    }
}


public class Hierarchical_Inherit {
    public static void main(String[] args) {
        System.out.println("Hierarchical Inheritance");
        
        B obj1 = new B();
        C obj2 = new C();
        D obj3 = new D();
        
        obj1.display();
        obj2.display();
        obj3.display();
    }
}
