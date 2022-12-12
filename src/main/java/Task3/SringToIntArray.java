package Task3;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SringToIntArray {
    public static void main(String[] args) {
        String[] input = new String[]{"11, 2, 0", "4, 5","9, 7, 21"};

        String inputString = "";
        String resultString = "";
        System.out.println("\nInput is:");
        for (int i = 0; i < input.length; i++) {
            System.out.println(input[i] + " ");
            inputString += input[i].toString() + ",";
        }

        final Stream<String> transformArr = Stream.of(inputString.split(","));

        final int[] result = transformArr
                .mapToInt(s -> Integer.parseInt(s.strip()))
                .sorted()
                .toArray();

        for (int i = 0; i < result.length; i++){
           resultString += result[i] + ", ";
        }

        if(resultString != null) {
            resultString = resultString.substring(0,resultString.length()-2);
        }
        System.out.println("Result is:");
        System.out.println("\"" + resultString + "\"");

    }
}
