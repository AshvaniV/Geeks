package java8.package2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1Exercise1SolutionJava7 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Ashvani", "Kumar", 23),
                new Person("Bharat", "Vashist", 21),
                new Person("Chanchal", "Singh", 20),
                new Person("Akshay", "Vats", 22));

        //step1: sort list by first name
        Collections.sort(people, new Comparator<Person>() {
                    @Override
                    public int compare(Person o1, Person o2) {
                        return o1.getFirstName().compareTo(o2.getFirstName());
                    }
                }
        );

        //step2: call
        //printList(people);

        //step3: call
        //printLastNameBeginningWithV(people);

        //step4.1: call
        System.out.println("print all names start with A");
        printConditionally(people, new ConditionInterface() {
            @Override
            public boolean test(Person P) {
                return P.getFirstName().startsWith("A");
            }
        });

        //step4.2: call
        System.out.println("print all names which contain i in last name");
        printConditionally(people, new ConditionInterface() {
            @Override
            public boolean test(Person P) {
                return P.getLastName().contains("i");
            }
        });
    }

    //step2: call a method that prints all elements in the list
    private static void printList(List<Person> l) {
        for (Person p : l) {
            System.out.println(p);
        }
    }

    //step3: call a method that prints all people that have last name beginning with V
    private static void printLastNameBeginningWithV(List<Person> l) {
        for (Person p : l) {
            if (p.getLastName().startsWith("V"))
                System.out.println(p);
        }
    }

    //Pass behavior as a parameter and implement it interface's method accordingly: Java7
    //step4: pass behavior as a condition and implement it according to our requirement each time.
    private static void printConditionally(List<Person> l, ConditionInterface conditionInterface) {
        for (Person p : l) {
            if (conditionInterface.test(p))
                System.out.println(p);
        }

    }
}

//we can use an existing Java class and create an interface in it. There is no as such requirement that there
//should be a new file for interface, this is because interface have it's identification using a class.
interface ConditionInterface {
    boolean test(Person P);
}
