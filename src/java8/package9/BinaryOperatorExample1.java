package java8.package9;
//child of bifunction
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class BinaryOperatorExample1 {
    public static void main(String[] args) {

//2 input and 1 output.
        BiFunction<String, String, String> biFunction = (val1, val2) -> (val1 + val2);
        System.out.println(biFunction.apply("ashvani", "sharma"));

        //as we know all input and output parameters are of String type, we can replace it with BinaryOperator.
        //BinaryOperator is a sub class of BiFunction
        //BinaryOperator<String> binaryOperator = (val1, val2) -> val1.concat(val2);
        BinaryOperator<String> binaryOperator = String::concat;
        System.out.println(binaryOperator.apply("akki", "sharma"));;


        //UnaryOperator
        UnaryOperator<String> unaryOperator = value1 -> "Greeting "+value1;
        System.out.println(unaryOperator.apply("ashvani"));


    }
}
