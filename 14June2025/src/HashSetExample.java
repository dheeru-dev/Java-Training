import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args){
        Set hashSet = new HashSet();

        hashSet.add("Sunday");
        hashSet.add("Monday");
        hashSet.add("Tuesday");

        Iterator iterator = hashSet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
//treeSet