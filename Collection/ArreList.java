import java.util.ArrayList;
import java.util.Iterator;

public class ArreList {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();

        cars.add("Lamborghini");
        cars.add("Volvo");
        cars.add("Ferrari");
        cars.add("Fortuner");
        cars.add("BMW");

        System.out.println(cars);
        // for (String car : cars) {
        //     System.out.println(car);
        // }

        // for(int i = 0; i < cars.size(); i++) {
        //     System.out.println(cars.get(i));
        // }
        
        // cars.clear();
        // System.out.println(cars);
        // System.out.println(cars.iterator().hasNext());
        // System.out.println(cars.iterator().next());
        
        // Iterator<String> i = cars.iterator();
        // while(i.hasNext()) {
        //     System.out.println(i.next());
        // }

        //reverse the list
        // for(int i = cars.size()-1; i >= 0; i--) {
        //     System.out.println(cars.get(i));
        // }

        ArrayList<String> cars2 = new ArrayList<>();
        cars2.add("Lightning McQueen");
        cars2.add("Mater");
        cars2.add("Sally");
        cars2.add("Doc Hudson");
        cars2.add("Ramone");
        cars2.add("Flo");
        cars2.add("Sheriff");
        cars2.add("Luigi");
        cars2.add("Guido");

        cars.addAll(cars2);
        System.out.println(cars);
        // cars.removeAll(cars2);
        // System.out.println(cars);

        // cars.set(0, "Koenigsegg");
        // System.out.println(cars);

        // System.out.println(cars.contains("Lightning McQueen"));

        String[] carsArray = new String[cars.size()];
        cars.toArray(carsArray);

        for(String car : carsArray) {
            System.out.println(car);
        }

    }
}

/*
Methods of ArrayList: 

add() - adds an element to a list
addAll() - adds all elements of one list to another
get() - helps to randomly access elements from lists
iterator() - returns iterator object that can be used to sequentially access elements of lists
set() - changes elements of lists
remove() - removes an element from the list
removeAll() - removes all the elements from the list
clear() - removes all the elements from the list (more efficient than removeAll())
size() - returns the length of lists
toArray() - converts a list into an array
contains() - returns true if a list contains specified element

Iterator Methods:
hasNext() - returns true if there are more elements
next() - returns the next element



*/