class Student {
    private int rollNo; //instance variables
    private String name;
    private String grade;
    private String address;

    //Default Constructor
    public Student() {
        System.out.println("Default Constructor");
        rollNo = 0;
        name = "NA";
        grade = "NA";
        address = "NA";
    }

    public void setDetails(int rno, String n, String g, String a) {
        rollNo = rno;
        name = n;
        grade = g;
        address = a;
    }


    //Parameterized Constructor
    public Student(int rno, String n, String g, String a) {
        System.out.println("Parameterized Constructor");
        rollNo = rno;
        name = n;
        grade = g;
        address = a;
    }

    public void getDetails() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
        System.out.println("Address: " + address);
    }
}


public class Constructors {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s = new Student(420, "Dev Bhatt", "E", "Panwel");
        s.getDetails();

        s1.setDetails(1, "John", "A", "New York");
        s1.getDetails();


    }
}


/*
Constructor is a block of code that initializes the newly created object.

> it's a special type of method which is used to initialize the object.

> there are 2 types of constructors:
    1. Default Constructor - no parameters
    2. Parameterized Constructor - with parameters

RUles for creating constructors:
> Constructor name must be same as class name.
> Constructor must have no explicit return type.
> Constructor can not be abstract, static, final and synchronized.
> it can be overloaded.
> it can have any access modifier. (public, private, protected, default)
> we will use public access modifier most of the time.


*/