package abstractClasses;

public class PersonTest {
  public static void main(String[] args) {
    var people = new Person[2];
    PersonTest personTest = new PersonTest();

    people[0] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
    people[1] = new Student("Maria Morris", "computer science");


      System.out.println(people[1].equals(people[0]));
  }
}
