import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("Alice");
        queue.add("Bob");
        queue.add("Charlie");

        System.out.println("Front Element: " + queue.peek());
        System.out.println("Removed: " + queue.poll());
        System.out.println("Updated Queue: " + queue);
    }
}

