package Task3;

import java.util.Arrays;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SringToIntArray {
    public static void main(String[] args) {
        String[] input = new String[]{"11, 2, 0", "4, 5","9, 7, 21"};

        String inputString = "";
        System.out.println("\nInput is:");
        for (int i = 0; i < input.length; i++) {
            System.out.println(input[i] + " ");
            inputString += input[i].toString() + ",";
        }

        final int[] resultSort = Arrays.stream(inputString.split(","))
                .mapToInt(s -> Integer.parseInt(s.strip()))
                .sorted()
                .toArray();

        final String resultString = IntStream
                .range(0, resultSort.length)
                .mapToObj(i -> resultSort[i])
                .map(n -> String.valueOf(n))
                .collect(Collectors.joining(", ", "", ""));

        System.out.println("Result is:");
        System.out.println("\"" + resultString + "\"");

    }
}
