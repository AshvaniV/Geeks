package java8.package12;

import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Arrays.stream;

/*
We have Stream for primitive datatype as well and it supports int, long and double. Stream for them are IntStream, LongStream and DoubleStream.
If we want to convert int array into Stream, we can use below two ways:

a. converts in particular type of Object data type based on primitive
int array[] = {1,2,3,4,5,6};
IntStream intStream = Arrays.stream(array);
b. convert array into generic type of Stream.
Stream S = Stream.of(array);
*/
public class StreamExample6 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        IntStream intStream = stream(array);
        intStream.map(s -> s*10).forEach(System.out::println);
        System.out.println();

        System.out.println("*************");
        Stream stream = Stream.of(array);        //we can't apply int type operation on this Stream as it is of generic type
        //stream.map(s -> s*10).forEach(System.out::println);      * can't applied here as it's not applicable on generic Stream
        stream.forEach(System.out::print);         //don't know why it's showing reference


        System.out.println();
        //print 1 to 10
        IntStream intStream2 = IntStream.rangeClosed(1,10);
        intStream2.forEach(num -> System.out.println("number "+num));
    }
}
