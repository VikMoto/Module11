package Task4;

import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class RandomAlgoritm {
    private Long a, c, m;

    public RandomAlgoritm(Long a, Long c, Long m) {
        this.a = a;
        this.c = c;
        this.m = m;
    }

    public RandomAlgoritm() {
    }

    public Long next(Long n) {
        Long result = 1 * (a * n + c) % m;

        return result;
    }

    public Stream<Long> LineCongurentGenerator(int seed){
        Long seedInher = Long.valueOf(seed);
        if(seedInher != 0) {
            final Stream<Long> iterate = Stream.iterate(seedInher, n -> next(n));
            return iterate;
        } else
            System.out.println("Argument start with 1");
        final Stream<Long> result = Stream.iterate(1L, n -> next(n));
        return result;

    }
}
