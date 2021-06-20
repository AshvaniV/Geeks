package java8.package2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Unit1Exercise2SolutionJava8 {

    //We want to write a method which accept lambda function interface, do operation on input and print output
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Ashvani", "Kumar", 23),
                new Person("Bharat", "Vashist", 21),
                new Person("Chanchal", "Singh", 20),
                new Person("Akshay", "Vats", 22));

        performOperation(people, list -> list.getFirstName().startsWith("A"), System.out::println);
    }

    private static void performOperation(List<Person> list, Predicate<Person> predicate, Consumer<Person> consumer) {
        //Predicate have a function with return type boolean so good for any condition that we want in our logic
        //Predicate have a function with return type void so good non returning condition like print list
        for(Person P : list) {
            //below two condition means, if predicate true for a condition then execute consumer
            if(predicate.test(P)) {
                consumer.accept(P);
            }
        }
    }
}
