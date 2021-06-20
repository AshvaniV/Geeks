package java8.package8;

import java.util.Objects;
import java.util.function.Predicate;

/*
Remove null or empty String from an array.
*/
public class PredicateExample3 {
    public static void main (String[] args) {
        String[] arr = {"India", "", "UK", "USA", null, "Singapore"};
        Predicate<String> pr = Objects::nonNull;
        Predicate<String>  pr1 = s -> !s.isEmpty();
        for(String s: arr){
            if(pr.and(pr1).test(s)){
                System.out.println(s+" ");
            }
        }
    }
}
