package sparta.stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class ExchangeArray {
    public static void main(String[] args) {
        String[] arr = {"사과", "귤", "오렌지", "자두"};
        Stream<String> stringStream = Arrays.stream(arr);
        stringStream.forEach(fruit -> System.out.println("과일명 : " + fruit));
        System.out.println();
    }
}
