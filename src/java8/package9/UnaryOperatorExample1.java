//If we want to use function interface but our input and output data types are same then we can use Unary operator
//UnaryOperator is a child of Function interface.
package java8.package9;

import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class UnaryOperatorExample1 {
    public static void main(String[] args) {
        UnaryOperator<String> unaryOperator = value1 -> "Greeting "+value1;

        System.out.println(unaryOperator.apply("ashvani"));

//Find square of an int value using functional interface without any data type conversion.
        IntUnaryOperator intUnaryOperator = value -> value*value;
        System.out.println(intUnaryOperator.applyAsInt(10));
    }
}
