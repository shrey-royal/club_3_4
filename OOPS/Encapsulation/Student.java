public class Student {
    public static void main(String[] args) {
        ReadOnlyStudentDetails student = new ReadOnlyStudentDetails(1, "Dev", 20, "Pune", "1234567890", "Java");
        printStudent(student);

        student.setAge(21);
        student.setName("Devansh");
        student.setAddress("Pune, Maharashtra, India");
        student.setPhone("0987654321");
        student.setCourse("Java, Python");

        printStudent(student);
    }

    //print student
    public static void printStudent(ReadOnlyStudentDetails student) {
        System.out.println("\nDetails of " + student.getName() + ": \n");
        System.out.println("Roll No: " + student.getRollNo());
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Address: " + student.getAddress());
        System.out.println("Phone: " + student.getPhone());
        System.out.println("Course: " + student.getCourse());
    }
}
