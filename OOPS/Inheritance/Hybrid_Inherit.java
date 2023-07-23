interface A{
    void show();
}

interface B{
    void display();
}

class C implements A, B {
    public void show(){
        System.out.println("Show");
    }
    
    public void display(){
        System.out.println("Display");
    }
}

class D extends C{
    public void print(){
        System.out.println("Print");
    }
}

public class Hybrid_Inherit {
    public static void main(String[] args) {
        System.out.println("Hybrid Inheritance");
        
        D obj = new D();
        obj.show();
        obj.display();
        obj.print();
    }
}
