import java.util.Deque;
import java.util.LinkedList;

public class DequeExample {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();

        deque.addFirst("Alice");
        deque.addLast("Bob");
        deque.addFirst("Charlie");

        System.out.println("Deque Elements: " + deque);
        System.out.println("Removed First: " + deque.removeFirst());
        System.out.println("Removed Last: " + deque.removeLast());
        System.out.println("Updated Deque: " + deque);
    }
}
 