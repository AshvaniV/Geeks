package java8.package5;

import java8.package2.Person;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReferenceExample2 {


    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Ashvani", "Kumar", 23),
                new Person("Bharat", "Vashist", 21),
                new Person("Chanchal", "Singh", 20),
                new Person("Akshay", "Vats", 22));

//without method reference
        performOperation(people, list -> true, list -> System.out.println(list));
/*using method reference,
here System.out is an instance and println() is a method, which will understand that
* there will be 1 argument passed as consumer.accept(P) is having one argument that is a list of person */

        performOperation(people, list -> true, System.out::println);
    }

    private static void performOperation(List<Person> list, Predicate<Person> predicate, Consumer<Person> consumer) {

        for (Person P : list) {
            if (predicate.test(P)) {
                consumer.accept(P);
            }
        }
    }
}
