package java8.package13;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/*
Optional: final class which is wrapper of Stream class.
This class is mainly used to prevent null check.
* */
public class OptionalExample1 {
    public static void main(String[] args) {
        List<String> flats = Arrays.asList("A102", "B12", "A121", "a1", "A101", "A101", "A22", "G11", "H1", "J101");
        Optional<String> firstFlat = flats.stream().filter(flat -> flat.startsWith("I")).findFirst();

        firstFlat.ifPresent(System.out::print);
        System.out.println("\n************************");
        if(firstFlat.isPresent()) {
            System.out.println("found " +firstFlat);
        }
        //if it Optional doesn't find any value then we can write logic for else condition as below
        System.out.println(firstFlat.orElse("[orElse] there is no match for given flat"));              //String arg

        System.out.println(firstFlat.orElseGet(() -> "[orElseGet] there is no match for given flat"));       //Consumer arg
    }
}
