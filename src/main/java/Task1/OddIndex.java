package Task1;
import java.util.List;


public class OddIndex {
    public static void main(String[] args) {
        List<String> names = List.of("Alpha", "Zeta", "Bravo", "Ivanka", "Tango", "John",  "Oleg", "Dmytro");
        System.out.println("input list : " + names);
        System.out.println("transform string : " + OddIndexSearch(names));
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
