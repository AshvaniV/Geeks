package java8.package12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample2 {

    public static void main(String[] args) {
        List<Integer> Ar = new ArrayList<Integer>();
        Ar.add(1);
        Ar.add(2);
        Ar.add(3);
        Ar.add(4);
        Ar.add(10);
        Ar.add(20);
        Ar.add(30);
        Ar.add(40);

        List<Integer> output = new ArrayList<>();
        //multiply each element by 2
        //output = Ar.stream().map("implemented functional interface function");
        output = Ar.stream().map(val -> val*2).collect(Collectors.toList());
        System.out.println(output);


        //find length of each city
        List<String> Ar2 = new ArrayList<>();
        Ar2.add("Mumbai");
        Ar2.add("Delhi");
        Ar2.add("Meerut");
        List<Integer> out2 = new ArrayList<>();
        out2 = Ar2.stream().map(s -> s.length()).collect(Collectors.toList());
        System.out.println("out2 "+out2);

        //city which length is 6

        List<String> Ar3 = Arrays.asList("Noida, Haridwar, Delhi, Bijnor");
        System.out.println("Ar3 "+Ar3);
        List<String> out3;
        out3 = Ar2.stream().filter(a -> a.length() <= 12).collect(Collectors.toList());

/*
Even though filter has Predicate interface which return boolean value but still Stream will be holding
current value on which filter is running each time and on each true condition it will be collected data to list.
*/
        System.out.println("out3 "+out3);
    }
}
