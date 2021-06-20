package java8.package8;
import java.util.function.Predicate;

/*
find out numbers which are even and greater than 5. We have a default method and(), in Predicate which can help to
combine 2 or more different Predicate conditions.
We have another method or() which looks for any of true condition between 2 or more Predicates.
*/
public class PredicateExample2 {
    public static void main(String[] args) {
        Predicate<Integer> pr = age -> (age < 10);

        int[] numbers = {1, 20, 3, 41, 50, 61, 7, 8, 900};
        Predicate<Integer> even = num -> num % 2 == 0;
        Predicate<Integer> grt = num -> num > 5;
        for (int number : numbers) {
            if (even.and(grt).test(number))
                System.out.println(number);
        }
    }
}