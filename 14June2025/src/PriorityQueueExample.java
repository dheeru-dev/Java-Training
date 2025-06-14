import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(10);
        pq.add(30);
        pq.add(20);

        Iterator<Integer> iterator = pq.iterator();
        System.out.println("Iterating PriorityQueue:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\nPolling PriorityQueue:");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll()); // Retrieves and removes elements in sorted order
        }

        System.out.println("PQ:"+pq);
    }
}