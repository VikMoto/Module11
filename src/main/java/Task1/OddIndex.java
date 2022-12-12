package Task1;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class OddIndex {
    public static void main(String[] args) {
        List<String> names = List.of("Alpha", "Zeta", "Bravo", "Ivanka", "Tango", "John",  "Oleg", "Dmytro");
        System.out.println("input list : " + names);
        System.out.println("transform by array : " + OddIndexSearch(names));
        System.out.println("transform by stream : " + OddIndexSearchStream(names));
    }

    private static String OddIndexSearchStream(List<String> names) {
        AtomicInteger index = new AtomicInteger(0);
        final List<String> indexNamesList = names
                .stream()
                .map(n -> index.incrementAndGet() + ". " + n)
                .collect(Collectors.toList());

        String[] indexNames = indexNamesList.toArray(new String[indexNamesList.size()]);
        String result = "";
        final String resultOdd = IntStream
                .range(0, indexNames.length)
                .filter(i -> i % 2 != 0)
                .mapToObj(i -> indexNames[i])
                .map(n -> String.valueOf(n))
                .collect(Collectors.joining(", ", "", ""));
        return resultOdd;
    }

    public static String OddIndexSearch(List<String> names) {
        String[] namesArr = new String[names.size()];
        String result ="";
        for (int i = 0; i < namesArr.length; i++) {
            namesArr[i] = (i+1) + ". " + names.get(i);
        }
        for (int i = 1; i < namesArr.length; i +=2) {
            result +=namesArr[i] + ", ";
        }
        return result;
    }
}
