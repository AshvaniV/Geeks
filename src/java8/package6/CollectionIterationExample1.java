package java8.package6;
import java8.package2.Person;

import java.util.Arrays;
import java.util.List;

public class CollectionIterationExample1 {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Ashvani", "Kumar", 23),
                new Person("Bharat", "Vashist", 21),
                new Person("Chanchal", "Singh", 20),
                new Person("Akshay", "Vats", 22));

/*If we want to iterate through this list we can use for loop or for-in loop but we need to write code for this
*imperatively (telling compiler what to do). This is known as external iterator where we are writing code for
* iteration */
     //for loop
        System.out.println("for loop");
        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i));
        }
    //for in loop
        System.out.println("for in loop");
        for(Person p : people) {
            System.out.println(p);
        }
    //lambda forEach loop : java8, This is happening at run time
        System.out.println("lambda forEach loop");
        people.forEach(System.out :: println);
    }
}
