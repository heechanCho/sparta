package sparta.stream;

import java.util.*;
import java.util.stream.Collectors;

public class Quiz {
    public static void main(String[] args) {

        // '이'씨 성을 가진 사람들의 수를 세보려고 합니다. 스트림을 활용해서 코드를 만들어보세요
        // 이씨성을 가진사람은 3명이다.

        List<String> strArr = Arrays.asList("김이우", "김호정", "이하늘", "이정희", "박정우", "박지현", "정우석", "이지수");

        System.out.println(strArr);

        System.out.println("---------------------");

        int count = (int) strArr.stream().filter(returnLee -> returnLee.contains("이")).count();

        int intNameCnt = 0;
        for (int i = 0; i < strArr.size(); i++) {
            if(strArr.get(i).startsWith("이")) {
                intNameCnt++;
            }

        }

        System.out.println(intNameCnt);

        System.out.println("----------------------------");

        System.out.println(count);


    }
}
