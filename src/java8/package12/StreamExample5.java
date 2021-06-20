package java8.package12;
/*
peak() : It's an important method of stream which might be used for debugging purpose as it takes Consumer lambda
which means we can use this method to print values which are coming somewhere in between of stream operation.

Qn: find all flat numbers which are starting with A and are not duplicate.
*/

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample5 {
    public static void main(String[] args) {
        List<String> flats = Arrays.asList("A102", "B12", "A121", "a1", "A101", "A101", "A22", "G11", "H1", "J101");
        List<String> out = flats.stream().map(flat -> flat.toUpperCase()).distinct().peek(System.out::println).filter(flat -> flat.startsWith("A")).collect(Collectors.toList());
        System.out.println("********************");
        System.out.println(out);
    }
}
