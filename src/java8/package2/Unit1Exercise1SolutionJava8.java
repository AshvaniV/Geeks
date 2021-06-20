package java8.package2;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Unit1Exercise1SolutionJava8 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Ashvani", "Kumar", 23),
                new Person("Bharat", "Vashist", 21),
                new Person("Chanchal", "Singh", 20),
                new Person("Akshay", "Vats", 22));

//step1: sort list by first name using lambda
        // Collections.sort(people, (o1, o2) -> o1.getFirstName().compareTo(o2.getFirstName()));
        // people.sort((o1, o2) -> o1.getFirstName().compareTo(o2.getFirstName()));
        people.sort(Comparator.comparing(Person::getFirstName));

//step2: print all using lambda
        printConditionally(people, list -> true);

//step3:print names starts with A using lambda
        System.out.println("print all names start with A");
        printConditionally(people, list -> list.getFirstName().startsWith("A"));

//step4.2: print all names which contain i in last name using lambda
        System.out.println("print all names which contain i in last name");
        printConditionally(people, list -> list.getLastName().contains("i"));
    }

//step4: pass behavior as a condition and implement it according to our requirement each time.
    //private static void printConditionally(List<Person> l, ConditionInterface conditionInterface) {
private static void printConditionally(List<Person> l, Predicate<Person> conditionInterface) {
        for (Person p : l) {
            if (conditionInterface.test(p))
                System.out.println(p);
        }
    }
}
