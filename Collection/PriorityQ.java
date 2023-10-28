import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class PriorityQ {
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>();

        pq.add("Ram");
        pq.add("Krishna");
        pq.add("Shiva");
        pq.add("Ganesh");
        pq.add("Vishnu");
        pq.add("Brahma");

        System.out.println("Priority Queue: " + pq);

        System.out.println(pq.peek());
        System.out.println(pq.poll());
        pq.removeIf(element -> (element.charAt(0) == 'R'));

        System.out.println("Priority Queue: " + pq);

        ArrayDeque<Integer> dq = new ArrayDeque<>();

        dq.addFirst(11);
        dq.addFirst(21);
        dq.addLast(31);
        dq.addFirst(41);
        dq.addLast(51);

        System.out.println(dq.getFirst());
        System.out.println(dq.getLast());

        System.out.println("Deque: " + dq);



    }
}

/*
Methods of Queue:
    1. add() - add element to the end of the Queue
    2. remove() - remove element from the front of the Queue
    3. peek() - return the element at the front of the Queue
    4. poll() - return the element at the front of the Queue and remove it
    5. size() - return the number of elements in the Queue
    6. isEmpty() - return true if the Queue is empty
    7. clear() - remove all elements from the Queue

Methods of Deque:
    1. addFirst() - add element to the front of the Deque
    2. addLast() - add element to the end of the Deque
    3. removeFirst() - remove element from the front of the Deque
    4. removeLast() - remove element from the end of the Deque
    5. getFirst() - return the element at the front of the Deque
    6. getLast() - return the element at the end of the Deque
    7. size() - return the number of elements in the Deque
    8. isEmpty() - return true if the Deque is empty
    9. clear() - remove all elements from the Deque

*/