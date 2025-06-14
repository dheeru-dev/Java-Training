import java.util.PriorityQueue;

class Patient implements Comparable<Patient> {
    String name;
    int severity;

    public Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }

    @Override
    public int compareTo(Patient p) {
        return Integer.compare(p.severity, this.severity); // Higher severity first
    }

    @Override
    public String toString() {
        return name + " (Severity: " + severity + ")";
    }
}

public class EmergencyRoomPq {
    public static void main(String[] args) {
        PriorityQueue<Patient> queue = new PriorityQueue<>();

        queue.add(new Patient("Alice", 2));
        queue.add(new Patient("Bob", 5));
        queue.add(new Patient("Charlie", 1));

        while (!queue.isEmpty()) {
            System.out.println("Treating: " + queue.poll());
        }
    }
}
 