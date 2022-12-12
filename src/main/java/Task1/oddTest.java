package Task1;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class oddTest {
    public static void main(String[] args) {


        String[] names = {"Sam", "Pamela", "Dave", "Pascal", "Erik"};
        AtomicInteger index = new AtomicInteger(0);
        List<String> list = Arrays.stream(names)
                .filter(n -> n.length() >= index.incrementAndGet())
                .collect(Collectors.toList());
        System.out.println("list = " + list);

        System.out.println(getEvenIndexedStrings(names));

    }

    public static List<String> getEvenIndexedStrings(String[] names) {
        List<String> evenIndexedNames = IntStream
                .range(0, names.length)
                .filter(i -> i % 2 == 0)
                .mapToObj(i -> names[i])
                .collect(Collectors.toList());

        return evenIndexedNames;
    }

}

