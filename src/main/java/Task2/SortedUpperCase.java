package Task2;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedUpperCase {
    public static void main(String[] args) {
        List<String> names = List.of("Alpha", "Zeta", "Bravo", "Ivanka", "Tango", "John",  "Oleg", "Dmytro");
        final List<String> result = names
                .stream()
                .map(n -> n.toUpperCase())
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(result);

    }
}
