import java.util.Iterator;
import java.util.Stack;

public class Stacc {
    public static void main(String[] args) {
        Stack<Integer> numbers = new Stack<>();

        numbers.push(19);
        numbers.push(2);
        numbers.push(93);
        numbers.push(93);
        numbers.push(44);
        numbers.push(24);
        numbers.push(58);
        numbers.push(64);
        numbers.push(65);
        numbers.push(96);
        numbers.push(21);
        numbers.push(70);
        numbers.push(18);

        Iterator<Integer> i = numbers.iterator();
        while(i.hasNext()) {
            System.out.print(i.next() + ", ");
        }
        System.out.println();

        System.out.println(numbers.pop());
        System.out.println(numbers);
        System.out.println(numbers.peek());
        // numbers.clear();
        System.out.println(numbers.empty());
        System.out.println(numbers.search(93));
        System.out.println(numbers.size());

    }
}

/*
LIFO - Last In First Out

Methods of Stack:
1. push() - adds an element to the stack
2. pop() - removes an element from the stack
3. peek() - returns the top element of the stack
4. empty() - returns true if the stack is empty
5. search() - returns the position of the element from the top of the stack
6. size() - returns the size of the stack

*/