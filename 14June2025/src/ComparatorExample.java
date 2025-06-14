import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ComparatorExample {

    public static void main(String args[]){
        ArrayList studentList = new ArrayList();

        studentList.add(new Student("Sandy", "MCA/07/06", 29));
        studentList.add(new Student("Roxy", "MCA/07/32", 28));
        studentList.add(new Student("Sunil", "MCA/07/15", 26));
        studentList.add(new Student("Munish", "MCA/07/04", 27));

        System.out.println("Sorting by student name:");
        Collections.sort(studentList,new StudentNameComparator());

        Iterator iterator1=studentList.iterator();
        while(iterator1.hasNext()){
            Student student=(Student)iterator1.next();
            System.out.println("Name: " + student.getName()+", " +
                    "RollNo: "+student.getRollNo()+", Age: "+student.getAge());
        }

        System.out.println("Sorting by student age:");
        Collections.sort(studentList,new StudentAgeComparator());

        Iterator iterator2=studentList.iterator();
        while(iterator2.hasNext()){
            Student student=(Student)iterator2.next();
            System.out.println("Name: " + student.getName()+", " +
                    "RollNo: "+student.getRollNo()+", Age: "+student.getAge());
        }

    }
}
