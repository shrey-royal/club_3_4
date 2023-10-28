import java.util.Iterator;
import java.util.Vector;

public class Vektor {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();

        v.add("Krishna");
        v.add("Ram");
        v.add("Shiva");
        v.add("Ganesh");
        v.add("Vishnu");
        v.add("Brahma");
        v.add("Parshuram");
        v.add("Kalki");
        v.add("Narsimha");
        v.add("Buddha");
        v.add("Mahavir");

        System.out.println("Vector: " + v);
        System.out.println(v.size());   //max -> 22 -> 100% capacity increment

        System.out.println(v.elementAt(3));

        Iterator<String> i = v.iterator();

        while (i.hasNext()) {
            System.out.println(i.next());
        }


    }
}
/*
Methods are same as ArrayList
arraylist is not synchronized -> fast -> multiple threads are allowed
vector is synchronized -> slow -> only one thread is allowed

*/