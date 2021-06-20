//java.util.stream;            it is also in java.io.stream; but only for input/output
//Used to perform operations on collection packages.

package java8.package12;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample1 {
    public static void main(String[] args) {
        //to find out of numbers in a list
        //ArrayList<Integer> Ar = new ArrayList<Integer>();           //stream can take for ArrayList and List
        List<Integer> Ar = new ArrayList<Integer>();
        Ar.add(1);
        Ar.add(2);
        Ar.add(3);
        Ar.add(101);
        List<Integer> out = new ArrayList<Integer>();

        //St.filter("implement functional method of Predicate");
        out = Ar.stream().filter(x -> x % 2 != 0).collect(Collectors.toList());
        System.out.println(out);

    }
}
