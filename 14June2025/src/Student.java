public class Student {
    //data members
    private String name;
    private String rollNo;
    private int age;

    //no-argument constructor
    public Student(){

    }

    //argument constructor
    public Student(String name, String rollNo, int age){
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
    }

    //getter setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getRollNo() {
        return rollNo;
    }
    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}