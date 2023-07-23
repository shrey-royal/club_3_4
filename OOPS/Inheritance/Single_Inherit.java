class Parent {
    int a = 10;
    int b = 20;
    int c = 30;
}

class Child extends Parent {
    int d = a+b;
    int e = b+c;
}

public class Single_Inherit {
    public static void main(String[] args) {
        System.out.println("Single Inheritance");
        
        Child obj = new Child();
        System.out.println("a = " + obj.a + "\nb = " + obj.b + "\nc = " + obj.c + "\nd = " + obj.d + "\ne = " + obj.e);
    }
}