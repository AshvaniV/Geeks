package java8.package10;

import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerExample1 {
    public static void main(String args[]) {
        Consumer<String> consumer1 = param1 -> System.out.println("Hello "+ param1);
        Consumer<String> consumer2 = param1 -> System.out.println(param1.toUpperCase());

//        consumer1.accept("ashvani");

        //consumer chaining
        consumer2.andThen(consumer1).accept("vashist");            //first run consumer2 and then run consumer1
        System.out.println("*************************");

        IntConsumer intConsumer = input -> System.out.println("int consumer output "+input * input);   //no conversion required from int to Integer
        intConsumer.accept(10);

        ObjIntConsumer<String> objIntConsumer = (input1, input2) -> System.out.println("objIntConsumer find String length and add it to second element: "+(input1.length() + input2));
        objIntConsumer.accept("ashvani", 10);
    }
}


