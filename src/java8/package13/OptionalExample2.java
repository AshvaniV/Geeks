package java8.package13;

import java.util.Optional;

public class OptionalExample2 {
    public static void main(String[] args) {
      //Optional Op1 = Optional.of(null);                             //will through NullPointer exception
        Optional Op2 = Optional.ofNullable(null);
        Optional Op3 = Optional.of("Ashvani");
        Optional Op4 = Optional.ofNullable(100);


        System.out.println(Op2);
        System.out.println(Op3);
        System.out.println(Op4);
        Op3.map(value -> value.toString()).ifPresent(System.out::println);
    }
}
