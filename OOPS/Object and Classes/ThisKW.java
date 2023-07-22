public class ThisKW {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Rahul", 10000, "Java");
        Student s2 = new Student(2, "Rohit", 20000, "Python");
        s1.display();
        s2.display();

        s1.setCourse("CCC");
        s1.setName("Rahul Singh");

        s2.setRollNumber(420);
        s2.setFee(42000);
        s2.setName("Dev Bhatt");
        s2.setCourse("HTML/CSS/JS");

        s1.display();
        s2.display();
    }
}

class Student {
    private int rollNumber; // instance variable
    private String name;
    private float fee;
    private String course;

    public Student() {} // default constructor

    public Student(int rollNumber, String name, float fee, String course) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.fee = fee;
    }

    // this keyword can be used to invoke current class method (implicitly).
    public void display() {
        System.out.println("Roll Number: " + this.rollNumber + "\nName: " + this.name + "\nFee: " + this.fee + "\nCourse: " + this.course + "\n");
    }

    // this keyword can be used to refer current class instance variable. (getter / setter)

    public int getRollNumber() {
        return this.rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name; // this.name refers to instance variable
    }

    public float getFee() {
        return this.fee;
    }

    public void setFee(float fee) {
        this.fee = fee;
    }

    public String getCourse() {
        return this.course;
    }

    public void setCourse(String course) {
        this.course = course; // this.course refers to instance variable
    }
}

/* 
This Keyword in Java:

1. this is a keyword in Java which is used as a reference to the object of the current class, with in an instance method or a constructor.


variables -> class members -> allocate memory -> instance variables

2. this keyword can be used to refer current class instance variable.
3. this keyword can be used to invoke current class method (implicitly).
4. this() can be used to invoke current class constructor.
*/

/*
Task based on this keyword:

> Create a class named Employee with instance variables as id, name, salary. Create a parameterized constructor to initialize the instance variables. Create a method named display() to display the details of the employee. Create another class named TestEmployee to create the object of the Employee class and call the display() method. 
*/
