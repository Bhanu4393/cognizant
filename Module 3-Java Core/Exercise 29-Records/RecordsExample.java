import java.util.List;

record Person(String name, int age) {
}

public class RecordsExample {
    public static void main(String[] args) {

        Person person1 = new Person("Mithun", 18);
        Person person2 = new Person("Tamil", 21);

        System.out.println(person1);
        System.out.println(person2);

        List<Person> people = List.of(
                person1,
                person2,
                new Person("Sagar", 17),
                new Person("Vijay", 22)
        );

        people.stream()
              .filter(person -> person.age() >= 18)
              .forEach(System.out::println);
    }
}