package java8.package7;

import java8.package2.Person;

import java.util.Arrays;
import java.util.List;

public class StreamExample1 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Ashvani", "Kumar", 23),
                new Person("Bharat", "Vashist", 21),
                new Person("Chanchal", "Singh", 20),
                new Person("Akshay", "Vats", 22)
        );

/*print list elements based on last name starting with v*/
        people.stream().filter((a) -> a.getLastName().startsWith("V")).forEach(System.out :: println);

        long count =  people.stream().filter((a) -> a.getLastName().startsWith("S")).count();
        System.out.println("count of persons having last name started with S "+count);
    }
}

/*
note1: Here most important thing is we can use as many filter as we want in single stream but forEach use only once.
note2: Stream in java 8 is comprises of 3 elements and in above example they are:
source => (which provide the input elements): people
operation => (which need to be perform on the stream): filter
terminate => (end condition) : forEach()

note3: we can use the concept of parallelStream() instead of stream(), so if there are multiple cores getting
used so some of the input portion can go to one core and some can go to another and can do operation in parallel.
*/