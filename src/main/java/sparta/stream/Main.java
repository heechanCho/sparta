package sparta.stream;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("서울");
        list.add("부산");
        list.add("인천");
        list.add("속초");

        System.out.println(list);
        List<String> result = list.stream()
                .limit(2)
                .collect(Collectors.toList());

        System.out.println(result);

        System.out.println("list -> information -> set");
        Set<String> set = list.stream()
                .filter("서울"::equals)
                .collect(Collectors.toSet());
        set.forEach(System.out::println);

    }
}
