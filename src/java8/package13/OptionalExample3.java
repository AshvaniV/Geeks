package java8.package13;

import java.util.stream.IntStream;

//print sum of number 1 to 10
public class OptionalExample3 {

    public static void main(String[] args) {
        IntStream.range(1,11).reduce((a,b) -> a+b).ifPresent(System.out::print);
    }
}
