package java8.package8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class PredicateExample1 {
    public static void main(String args[]) {
        Predicate<Integer> pr = age -> (age < 10);
        //System.out.println(pr.test(19));
        //System.out.println(pr.test(8));

        //Predicate<Collection> pc = collect -> collect.isEmpty();
        Predicate<Collection> pc = Collection::isEmpty;
        ArrayList<Object> Ar = new ArrayList<>();
        Ar.add("Ashvani");
        System.out.println("pr "+pc.test(Ar));

        //even and odd number print
        int[] numbers = {1,2,3,4,5,6,7,8,9};
        Predicate<Integer> even = num -> num % 2 == 0;


        for (int number : numbers) {
            if (even.test(number))
                System.out.println(number + " is even");
            if (even.negate().test(number))                     //else will also work but just to check negate()
                System.out.println(number + " is odd");
        }

    }
}


/*
Predicate is used for filtering collections in Java, it takes any data type and return Boolean value based on filter.
In above example we tried to find whether the number is even or odd.
*/
