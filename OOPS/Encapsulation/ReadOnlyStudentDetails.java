//java Bean Class: a type of class which will use to store data and it will have only getter and setter methods

public class ReadOnlyStudentDetails {
    // private data members
    private int rollNo;
    private String name;
    private int age;
    private String address;
    private String phone;
    private String course;
    
    // constructor
    public ReadOnlyStudentDetails(int rollNo, String name, int age, String address, String phone, String course) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone = phone;
        this.course = course;
    }

    // public getter methods
    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address; 
    }

    public String getPhone() {
        return phone;
    }

    public String getCourse() {
        return course;
    }

    // public setter methods
    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        if (address.length() > 50) {
            System.out.println("Address cannot be more than 50 characters.");
        } else {
            this.address = address;
        }
    }

    public void setPhone(String phone) {
        if (phone.length() != 10 && phone.length() != 12) {
            System.out.println("Phone number must be 10 digits.");
        } else {
            this.phone = phone;
        }
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
