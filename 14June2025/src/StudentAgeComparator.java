import java.util.Comparator;

public class StudentAgeComparator implements Comparator {

    public int compare(Object obj1, Object obj2) {
        Student student1=(Student)obj1;
        Student student2=(Student)obj2;

        if(student1.getAge()==student2.getAge())
            return 0;
        else if(student1.getAge()>student2.getAge())
            return 1;
        else
            return -1;
    }
}