import java.util.*;

public class ArrayListTest {
    public static void main(String[] args) {
        int[] arr = new int[2];
        arr[0] = 8;
        arr[1] = 9;
        System.out.println("Array Element:" +Arrays.toString(arr));

//        ArrayList<String> nameList = new ArrayList<>();
        var nameList = new ArrayList<String>();
        var numList = new ArrayList<Integer>();

        nameList.add("Dheeraj Kumar");
        nameList.add("Second String");
        numList.add(5);
        numList.add(7);
        numList.add(null);

        System.out.println(nameList);
        System.out.println("Num:"+numList);

        numList.remove(1);
        System.out.println("Num:"+numList);

        numList.add(1,8);
        System.out.println("Num:"+numList);

        numList.set(1,9);
        System.out.println("Num:"+numList);
        System.out.println("Size:"+numList.size());
        System.out.println("Address#"+System.identityHashCode(numList));

        for(Integer s: numList){
            System.out.println("Iteration:"+s);
            System.out.println("Address#"+System.identityHashCode(s));
        }

        LinkedList<String> list = new LinkedList<String>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");
        System.out.println("Linked List:"+list);
        for(String t: list){
            System.out.println("Iteration:"+t);
            System.out.println("Address#"+System.identityHashCode(t));
        }
    }
}

class User {
    private String email;
    private String name;
    private String status;
    public User(String email, String name, String status) {
        this.email = email;
        this.name = name;
        this.status = status;
    }
    // Getters and setters
    // public String getEmail() {
    //      return email; }
    // public String getName() { return name; }
    // public String getStatus() { return status; }
    // @Override    public String toString() {
    //      return name + " (" + status + ")";
    //      }
    //}
}
