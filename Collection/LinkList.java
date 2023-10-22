import java.util.Iterator;
import java.util.LinkedList;

public class LinkList {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<>();

        cars.add("Lightning McQueen");
        cars.add("Mater");
        cars.add("Sally");
        cars.add("Doc Hudson");
        cars.add("Mater");
        cars.add("Ramone");
        cars.add("Flo");
        cars.add("Mater");
        cars.add("Sheriff");
        cars.add("Luigi");
        cars.addFirst("Guido");
        cars.add("Francesco Bernoulli");
        cars.add("Mack");
        cars.add("Mater");

        System.out.println(cars);

        // cars.removeFirst(); // removes the first element
        // cars.removeLast(); // removes the last element

        // System.out.println(cars);

        // System.out.println(cars.getFirst());
        // System.out.println(cars.getLast());

        cars.removeFirstOccurrence("Mater");
        cars.removeLastOccurrence("Mater");

        // System.out.println(cars);


        Iterator<String> i = cars.iterator();
        while(i.hasNext()) {
            System.out.println(i.next());
        }

    }
}

/*
Methods of LinkedList:

1. addFirst() - adds an element to the beginning of the list
2. addLast() - adds an element to the end of the list
3. removeFirst() - removes an element from the beginning of the list
4. removeLast() - removes an element from the end of the list
5. getFirst() - returns the first element of the list
6. getLast() - returns the last element of the list
7. removeFirstOccurrence() - removes the first occurrence of the specified element from the list
8. removeLastOccurrence() - removes the last occurrence of the specified element from the list

Other methods are same as ArrayList

Methods of Queue:

1. add() - adds an element to the queue
2. remove() - removes an element from the queue
3. element() - returns the element at the head of the queue
4. offer() - adds an element to the queue
5. poll() - removes an element from the queue
6. peek() - returns the element at the head of the queue
7. size() - returns the size of the queue
8. isEmpty() - returns true if the queue is empty


*/