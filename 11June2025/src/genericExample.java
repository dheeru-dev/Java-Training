
public class genericExample {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.set("Generic Example1");
        System.out.println(stringBox.get());

        Box<Integer> integerBox = new Box<>();
        integerBox.set(12);
        System.out.println(integerBox.get());

        Person person1 = new Person("Person A", 21);
        Person person2 = new Person("Person B", 24);
        Person person3 = new Person("Person C", 26);

        Box<Person> personBox = new Box<>();
        personBox.set(person1);

        System.out.println(personBox.get());
    }
}