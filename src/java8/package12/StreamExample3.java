package java8.package12;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample3 {
    public static void main(String[] args) {
        List<String> ar = Arrays.asList("as100", "Ash", "aa", "A", "de", "D", "Delhi", "Dehradun");
        //find out String started with A in given list
        System.out.println(ar.stream().filter(val -> val.startsWith("A")).collect(Collectors.toList()));

//filter is a lazy operation and below lambda will not do anything until we do another operation on this.
//this will be in memory that's why we will get reference of this while printing it
        System.out.println(ar.stream().filter(
                element -> {
                    System.out.println(element);
                    return element.startsWith("D");
                }
        ));

//Here stream is performing 2 operation, first print all elements and second apply filter to these Strings and collect
//them in a list. Here filter is a lazy operation and collect is an action.
        List out = ar.stream().filter(
                element -> {
                    System.out.print(element +"* ");
                    return element.startsWith("D");
                }
        ).collect(Collectors.toList());

        System.out.println();
        System.out.println(out);
    }
}
