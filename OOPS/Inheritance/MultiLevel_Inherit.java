class GrandParent {
    public void grandParent() {
        System.out.println("GrandParent");
    }
}

class Parent extends GrandParent {
    public void parent() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    public void child() {
        System.out.println("Child");
    }
}

public class MultiLevel_Inherit {
    public static void main(String[] args) {
        System.out.println("MultiLevel Inheritance");
        
        Child obj = new Child();
        obj.grandParent();
        obj.parent();
        obj.child();
    }
}
