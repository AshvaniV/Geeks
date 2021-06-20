package java8.package10;

import java.util.function.DoubleSupplier;
import java.util.function.Supplier;

public class SupplierExample1 {
    public static void main(String args[]) {

        Supplier<Double> supplier1 = Math::random;
        System.out.println(supplier1.get());

//Here no data conversion is required as Math.random() will return a double data type value and our interface is of same type.
        DoubleSupplier supplier2 = () -> Math.random();
        System.out.println(supplier2.getAsDouble());
    }
}
