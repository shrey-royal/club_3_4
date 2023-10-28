import java.util.TreeSet;

public class TriSet {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(625);
        ts.add(125);
        ts.add(114);
        ts.add(100);
        ts.add(794);
        ts.add(479);

        System.out.println("TreeSet: " + ts);

        // System.out.println(ts.subSet(100, 200));    // >= 100 && < 200
        // System.out.println(ts.tailSet(200));    // >= 200
        // System.out.println(ts.headSet(120));    // < 120

        // System.out.println(ts.first()); //smallest
        // System.out.println(ts.last());  //largest

        // System.out.println(ts.lower(150)); // < 150
        // System.out.println(ts.higher(150)); // > 150

        System.out.println(ts.floor(150)); // <= 150
        System.out.println(ts.ceiling(150)); // >= 150


    }
}

/*
Set Methods:

1. subset() - return a view of the portion of this set whose elements range from fromElement, inclusive, to toElement, exclusive
2. tailSet() - return a view of the portion of this set whose elements are greater than or equal to fromElement
3. headSet() - return a view of the portion of this set whose elements are less than or equal to toElement
4. first() - return the first (lowest) element currently in this set
5. last() - return the last (highest) element currently in this set
6. lower() - return the greatest element in this set strictly less than the given element, or null if there is no such element
7. higher() - return the least element in this set strictly greater than the given element, or null if there is no such element
8. floor() - return the greatest element in this set less than or equal to the given element, or null if there is no such element
9. ceiling() - return the least element in this set greater than or equal to the given element, or null if there is no such element

*/