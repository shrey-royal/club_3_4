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

public class Multiple_Inherit {
    public static void main(String[] args) {
        System.out.println("Multiple Inheritance");
        
        C obj = new C();
        obj.show();
        obj.display();
    }
}
