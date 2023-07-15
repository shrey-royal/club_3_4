class StudentsOfRoyal {
    String name;
    int rollNo;
    static String college = "Royal College of Engineering and Technology";
    static int count = 0;

    StudentsOfRoyal(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
        count++;
    }

    void display() {
        System.out.println("Name: " + name + "\nRoll No: " + rollNo + "\nCollege: " + college);
    }
} 

public class StaticKW {
    public static void main(String[] args) {
        StudentsOfRoyal dev = new StudentsOfRoyal("Dev", 420);
        StudentsOfRoyal ayush = new StudentsOfRoyal("Ayush", 69);
        StudentsOfRoyal herry = new StudentsOfRoyal("Herry", 42069);

        dev.display();
        ayush.display();
        herry.display();

        // Changing the college name
        System.out.println(StudentsOfRoyal.college);
        StudentsOfRoyal.college = "Royal Technosoft Pvt. Ltd.";
        System.out.println(StudentsOfRoyal.college);

        System.out.println("Total Students: " + StudentsOfRoyal.count);
    }
}

/*
Static Keyword can be used with
1. Variables
2. Methods
3. Blocks
4. Nested Classes

Static keyword is used for memory management mainly. We can use static keyword with variables, methods, blocks and nested classes. Static members belong to the class instead of a specific instance, this means if you make a member static, you can access it without object. Static members are initialized before the initialization of any instance. Static keyword belongs to the class than instance of the class.


*/