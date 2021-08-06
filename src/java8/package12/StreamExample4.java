package java8.package12;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/*
Qn: Collect all String from a list which start with "B" and print them in upper case. Code should be written
using double colon method reference and should be precise.
*/
public class StreamExample4 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Ashvani","Baani","Beer","Bijnor","Cross check");

        list.stream().map(String::toUpperCase).filter(element -> element.startsWith("B")).forEach(System.out::println);
    }
}
