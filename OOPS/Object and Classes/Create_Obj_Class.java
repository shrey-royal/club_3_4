class Vehicle {
    //class variables, instance variables, data members, fields, attributes
    private String make;
    private String model;
    private int no_of_wheels;
    private int cc;

    //method, behaviour
    public void ScanVehicleDetails(String m, String mo, int wheels, int CCs) {
        make = m;
        model = mo;
        no_of_wheels = wheels;
        cc = CCs;
    }

    public void PrintVehicleDetails() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("No. of Wheels: " + no_of_wheels);
        System.out.println("CC: " + cc + "\n");
    }
}


class Create_Obj_Class {
    public static void main(String[] args) {
        //we have to create an object of class Vehicle so that we can access the methods of class Vehicle and memory will be allocated to the object.

        //syntax: ClassName objectName = new ClassName();
        // Vehicle car = new Vehicle();

        //we can access the methods of class Vehicle using the object of class Vehicle.
        // car.ScanVehicleDetails("Maruti", "Swift", 4, 1200);
        // car.PrintVehicleDetails();
        
        // Vehicle bike = new Vehicle();
        // bike.ScanVehicleDetails("Kawasaki", "Ninja H2", 2, 998);
        // bike.PrintVehicleDetails();

        // Vehicle truck = new Vehicle();
        // truck.ScanVehicleDetails("Tata", "407", 6, 2956);
        // truck.PrintVehicleDetails();

        // Vehicle motorcycle = new Vehicle();
        // motorcycle.ScanVehicleDetails("Royal Enfield", "Classic 350", 2, 346);
        // motorcycle.PrintVehicleDetails();

        //we can also create an array of objects of class Vehicle.

        Vehicle[] vehicles = new Vehicle[4];    //array of objects of class Vehicle
        vehicles[0] = new Vehicle();
        vehicles[1] = new Vehicle();
        vehicles[2] = new Vehicle();
        vehicles[3] = new Vehicle();

        vehicles[0].ScanVehicleDetails("Maruti", "Swift", 4, 1200);
        vehicles[1].ScanVehicleDetails("Kawasaki", "Ninja H2", 2, 998);
        vehicles[2].ScanVehicleDetails("Tata", "407", 6, 2956);
        vehicles[3].ScanVehicleDetails("Royal Enfield", "Classic 350", 2, 346);

        for(int i = 0; i < vehicles.length; i++) {
            vehicles[i].PrintVehicleDetails();
        }


    }
}

/*
    Class: it is a blueprint or template from which objects are created.
    class:  -> int, float, char -> Memory -> 4 bytes
    > when i will create an instance of class, then only memory will be allocated.

    Object: it is an instance of a class.
    All the objects will be unique.

Example of Class: 
> Vehicle (Car, Bike, Truck, MotorCycle) 
> Animal (Dog, Cat, Lion, Tiger) 
> Employee (Manager, Developer, Tester, HR)

Example of Object:
> Car (Maruti, BMW, Audi, Honda)
> Dog (Pug, Labrador, German Shepherd)
> Manager (Rahul, Rohan, Rakesh)

Access Modifiers: They are used to define the scope of the class, method, variable.

> public: it can be accessed from anywhere.
> private: it can be accessed only within the class.
> protected: it can be accessed within the package and outside the package but through inheritance only.
> default: it can be accessed only within the package.

Task:

Design a class Hierachy for the following:
> Animal (Dog, Cat, Lion, Tiger) -> Behaviour (Bark, Meow, Roar)
> Vehicle (Car, Bike, Truck, MotorCycle) -> Behaviour (Start, Stop, Accelerate, Brake)
> Employee (Manager, Developer, Tester, HR) -> Behaviour (Work, Eat, Sleep)

*/