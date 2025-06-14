import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionExample {
    public static void main(String[] args){
        List<String> subjects = new ArrayList<>();
        subjects.add("Maths");
        subjects.add("Sci");
        subjects.add("Eng");
        subjects.add("Geo");
        subjects.add("Eng"); //Duplicate allowed

        System.out.println("subjects:"+subjects);

       /* for (String subject : subjects) {
            System.out.println(subject);
        }
        Iterator<String> iterator = subjects.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        } */
        //subjects.forEach(subject -> System.out.println(subject)); //arrow mark lambda expression
        //subjects.remove(1);
        //subjects.forEach(subject -> System.out.println(subject));
    }
}
