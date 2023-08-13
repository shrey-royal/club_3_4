interface DevJi { 
    public String[] cars = {"BMW", "Audi", "Mercedes", "Lamborghini", "Ferrari", "Bugatti", "Rolls Royce", "Bentley", "Porsche", "Maserati"};
    public String[] bikes = {"Harley Davidson", "Ducati", "Kawasaki", "Yamaha", "Suzuki", "Triumph", "KTM", "BMW", "Honda", "Royal Enfield"};
    public String[] properties = {"Bungalow", "Flat", "Shop", "Office", "Land", "Farmhouse", "Mall", "Hotel", "Resort", "Restaurant"};
    public String[] businesses = {"Dudhwala", "Dairy", "Milk", "Milk Products", "Ice Cream", "Milk Shake", "Milk Powder", "Ghee", "Paneer", "Butter"};

    public void carCollection();
    public void bikeCollection();
    public void propertyCollection();
    public void businessCollection();
    public void devjiWHO();
}

class DevJiOrganisation implements DevJi {
    public void devjiWHO() {
        System.out.println("\n> Devjibhai Dudhwala, he's the owner of DevJi Organisation.");
        System.out.println("> DevJi Organisation is a group of companies which deals in various sectors like Dairy, Real Estate, Automobiles, etc.");
        System.out.println("> DevJi Organisation is a well known organisation in Gujarat.");
        System.out.println("> DevJi Organisation is the first organisation in Gujarat to have a turnover of 1999 crores.");
        System.out.println("> You can checkout their collection of cars, bikes, properties, and businesses.\n\n");
    }

    public void carCollection() {
        System.out.println("Devjibhai Dudhwala's Car Collection:");
        for (String car : DevJi.cars) {
            System.out.print(car + ", ");
        }
        System.out.println("\n\n");
    }

    public void bikeCollection() {
        System.out.println("Devjibhai Dudhwala's Bike Collection:");
        for (String bike : DevJi.bikes) {
            System.out.print(bike + ", ");
        }
        System.out.println("\n\n");

    }

    public void propertyCollection() {
        System.out.println("Devjibhai Dudhwala's Property Collection:");
        for (String property : DevJi.properties) {
            System.out.print(property + ", ");
        }
        System.out.println("\n\n");
    }

    public void businessCollection() {
        System.out.println("Devjibhai Dudhwala's Business Collection:");
        for (String business : DevJi.businesses) {
            System.out.print(business + ", ");
        }
        System.out.println("\n\n");
    }
}


public class Interface_1 {
    public static void main(String[] args) {
        DevJiOrganisation devji = new DevJiOrganisation();
        devji.devjiWHO();
        devji.carCollection();
        devji.bikeCollection();
        devji.propertyCollection();
        devji.businessCollection();
    }
}

/*
-> extends / --> implements

interface -> interface
class -> class
class --> interface

*/