package java8.package13;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.IntStream;

//print sum of number 1 to 10
public class OptionalExample3 {


    public static void main(String[] args) {
        /*IntStream.range(1,11).reduce((a,b) -> a+b).ifPresent(System.out::print);


        //other example
        String[] s = {"ash", "ashq","",null,null};
        Optional<String> o = Optional.ofNullable(s[3]);
        System.out.println(o);*/

        Pen P1 = new Pen(10, "black");
        Pen P2 = new Pen(10, "black");
        System.out.println(P1.equals(P2));

        List<Integer> l = new ArrayList<>();
        l.add(2);
        l.add(1);
        l.add(10);

    }


}
