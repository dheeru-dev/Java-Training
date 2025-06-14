import java.util.Vector;
/*
public class VectorExample {
    public static void main(String[] args){
        Vector<String> names = new Vector<>();
        System.out.println("Size:"+names.capacity());
        names.add("Dheeraj");
        names.add("Kumar");
        names.add("Ram");
        System.out.println("Size:"+names.capacity());
        System.out.println(names.get(1));
        System.out.println(names.firstElement());
        System.out.println(names.lastElement());
        System.out.println(names.isEmpty());
        names.clear();
        System.out.println(names.isEmpty());
    }
}
*/

public class VectorExample {
    public static void main(String[] args) {
        // Creating a Vector with initial capacity of 3 and increment of 2
        Vector<Integer> numbers = new Vector<>(3, 2);

        // Adding elements
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println("Capacity after 3 elements: " + numbers.capacity());

        numbers.add(40); // Exceeds initial capacity, increases to 5
        System.out.println("Capacity after 4 elements: " + numbers.capacity());
        System.out.println("Vector Elements: " + numbers);
        numbers.add(50);
        System.out.println("Capacity after 5 elements: " + numbers.capacity());

        numbers.add(60); // Exceeds capacity again, increases to 7
        System.out.println("Capacity after 6 elements: " + numbers.capacity());

        // Displaying elements
        System.out.println("Vector Elements: " + numbers);
    }
}