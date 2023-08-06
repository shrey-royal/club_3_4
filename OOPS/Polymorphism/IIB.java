class Students {
    int noOfStudents;
    {
        //Instance Initializer Block
        System.out.println("IIB 1 : Students");
        noOfStudents = 1200;
    }

    static {
        //Static Initializer Block
        System.out.println("SIB 1 : Students");
    }

    {
        //Instance Initializer Block
        System.out.println("IIB 2 : Students");
    }

    Students() {
        System.out.println("Students Constructor");
        System.out.println("No of Students : " + noOfStudents);
    }
}

class Employee {
    int noOfEmployees;
    {
        //Instance Initializer Block
        System.out.println("IIB 1 : Employee");
    }

    static {
        //Static Initializer Block
        System.out.println("SIB 1 : Employee");
    }

    {
        //Instance Initializer Block
        System.out.println("IIB 2 : Employee");
        noOfEmployees = 500;
    }

    Employee() {
        System.out.println("Employee Constructor");
        System.out.println("No of Employees : " + noOfEmployees);
    }
}

public class IIB {
    public static void main(String[] args) {
        Students s = new Students();
        Employee e = new Employee();
    }
}
