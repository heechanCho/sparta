package beakJoon;

import java.util.Scanner;

public class Num_2884 {
    public static void main(String[] args) {
        // 45분 일찍 알람 설정하기
        // 시간 표현은 24시간을 표현 사용한다. 하루의 시작은 0:0 자정이고 끝은 23.59분이다.
        // 입력한 시간에서 45분을 일찍 설정한다. -> min - 45
        // 만약 min이 0보다 작으면 hour에서 1을 뺀다

        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int min = sc.nextInt();

        if (min - 45 < 0) {
            min = (min + 60) - 45;
            hour = hour - 1;
            if (hour < 0) {
                hour = 23;
            }
        } else {
            min = min - 45;
        }

        System.out.println(hour);
        System.out.println(min);
    }
}
