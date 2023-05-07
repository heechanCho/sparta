package sparta.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<>(Arrays.asList("Korea", "japan", "china"));
        Stream<String> stream = strList.stream();
        stream.map(str -> str.toUpperCase()).forEach(it -> System.out.println(it));
    }
}
