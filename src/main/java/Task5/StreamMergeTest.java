package Task5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StreamMergeTest {
    public static void main(String[] args) {
        final Stream<String> alpha = Stream.of("Alpha", "Beta", "Bravo", "Tango");
        final Stream<String> zero = Stream.of("1", "2", "3", "4", "5", "6");

        final Stream<String> result = zip(alpha, zero);
        //Expect - Alpha, 1, Beta, 2, Bravo, 3, Tango, 4
        result.peek(System.out::println).collect(Collectors.toList());
    }




    /** result using zip by stream.iterator<T>*/
    public static <T> Stream<T> zip(Stream<T> streamA, Stream<T> streamB) {
        List<T> resultList = new ArrayList<>();
        Stream<T> result;

        final Iterator<T> iteratorA = streamA.iterator();
        final Iterator<T> iteratorB = streamB.iterator();

        while (iteratorA.hasNext() && iteratorB.hasNext()) {
            resultList.add(iteratorA.next());
            resultList.add(iteratorB.next());
        }

        return resultList.stream();
    }
}
