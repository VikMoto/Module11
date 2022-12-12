package Task4;

import Task4.RandomAlgoritm;

import java.util.stream.Collectors;

public class RandomAlgoritmStream {
    public static void main(String[] args) {

        RandomAlgoritm r = new RandomAlgoritm(25214903917L, 11L, powMy(2,48));
        r.LineCongurentGenerator(2)
                .limit(10)
                .peek(System.out::println)
                .collect(Collectors.toList());

    }

    public static Long powMy (int a, int degree) {
        if(degree == 1) {
            return (long) a;
        } else {
            return a * powMy(a, degree-1);
        }
    }
}
