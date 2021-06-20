package java8.package12;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample8 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Double out1 = list.stream().collect(Collectors.averagingInt(value -> value));        //as averagingInt needs one arg so we are passing list's elements and not doing angy operation
        System.out.println(out1);

        //to get complete details of stream as count, sum, min, average, max}
        IntSummaryStatistics intSummaryStatistics = list.stream().collect(Collectors.summarizingInt(value -> value));
        System.out.println(intSummaryStatistics);
    }
}
