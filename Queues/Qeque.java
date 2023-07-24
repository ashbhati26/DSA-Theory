import java.util.*;

public class Qeque {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1); // 1
        deque.addFirst(2); // 2 1
        deque.addLast(3);
        deque.addLast(4);
        System.out.println(deque);
        deque.removeFirst();
        System.out.println(deque);

        System.out.println("first element = " + deque.getFirst());
        System.out.println("last element = " + deque.getLast());
    }  
}