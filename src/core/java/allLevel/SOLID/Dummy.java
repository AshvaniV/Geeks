package core.java.allLevel.SOLID;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public interface Dummy {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(10);
        a.add(11);
        a.add(12);
        a.add(13);
        List<Integer> b1 = a.stream().map(a1 -> a1*a1).filter(b -> (b>100)).collect(Collectors.toList());
        //List<Integer> c1 = b1.stream().filter(b -> (b>100)).collect(Collectors.toList());
        System.out.println(b1);

    }
}
