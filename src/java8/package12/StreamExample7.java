package java8.package12;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/*
We can collect values in Set and Map as well not only in List.
*/
public class StreamExample7 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.stream().filter(val -> val>2).collect(Collectors.toSet());
        System.out.println(set);

        Map map = set.stream().collect(Collectors.toMap((key->key),(key->key*100)));
        System.out.println(map);
    }
}
