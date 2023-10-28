import java.util.HashSet;
import java.util.Random;
import java.util.Spliterator;

public class HasSet {
    public static void main(String[] args) {
        //Iterable interface
        HashSet<Integer> hs = new HashSet<>();
        // Random r = new Random();
        // for (int i = 0; i < 10; i++) {
        //     hs.add(r.nextInt(1000));
        // }

        hs.add(625);
        hs.add(125);
        hs.add(114);
        hs.add(100);
        hs.add(794);
        hs.add(479);
        hs.add(830);
        hs.add(841);
        hs.add(778);
        hs.add(998);
        // System.out.println("HashSet: " + hs);

        // System.out.println(hs.contains(100));
        // System.out.println(hs.isEmpty());
        // System.out.println(hs.size());
        // System.out.println(hs.remove(100));

        // System.out.println("HashSet: " + hs);

        Spliterator<Integer> s = hs.spliterator();
        // s.forEachRemaining(n -> System.out.print(n + ", "));

        //try advance
        while(s.tryAdvance(n -> System.out.print(n + ", "))) {}

    }
}
/*
Methods of HashSet class:

1. add() - add element to the HashSet
2. clear() - remove all elements from the HashSet
3. clone() - return a shallow copy of the HashSet
4. contains() - return true if the HashSet contains the specified element
5. isEmpty() - return true if the HashSet is empty
6. remove() - remove the specified element from the HashSet
7. size() - return the number of elements in the HashSet
8. spliterator() - return a Spliterator over the elements in the HashSet

*/