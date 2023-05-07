package beakJoon;

import java.util.Scanner;

public class Num_2525 {
    public static void main(String[] args) {
        /**
         * 오븐에 요리를 시작하는 시각과 오븐구이를 하는 데 필요한 시간이 분단위로 주어졌을 때
         * 오븐구이가 끝나는 시각을 계산하는 프로그램을 작성하시오
         */

        /**
         * 현재시각 => 입력 줄에 현재 [시] 와 [분]을 정수로 입력한다.
         * 요리시간 => 두 번째 줄에는 [요리하는 데 필요한 시간]을 입력한다.
         *
         * 현재시각과 요리시간을 더한다.
         * 더한 값을 출력한다.
         *
         * ! 만약 [분]이 60을 넘으면
         * 현재시간의 [분]이 60과 같거나 초과하면 [시간]에 +1을 하고 0이 된다.
         * 0이 된 [분]에 더하고 남은 시간을 더한다.
         */

        /**
         * [분]이 60으로 나누어 떨어질 때마다 [시간]에 +1한다. (x)
         * 변수 over60Min = ([분] + [요리시간]) / 60;
         * [시간]에 over60min을 더한다.
         *
         */

        /**
         * if(hour >= 24 {
         * hour = 24 - hour;
         */

        Scanner sc = new Scanner(System.in);

        // 입력하는 시간
        int hour = sc.nextInt();

        // 입력하는 분
        int minute = sc.nextInt();

        // 요리하는데 필요한 시간
        int cookingTime = sc.nextInt();

        sc.close();

        if (minute + cookingTime >= 60) {

            System.out.println(hour + " " + String.valueOf(minute + cookingTime));

            int over60Time = (minute + cookingTime) / 60;
            System.out.println(String.format("overTime[%d] ========> %d + %d / 60",over60Time,minute,cookingTime));
            hour = hour + over60Time;
            minute = (minute + cookingTime) % 60;

            if(hour >= 24) {
                hour = hour - 24;
                System.out.println("\tHOUR==>" + hour);
                System.out.println(String.format("HOUR[%d] : MINUTE[%d]",hour,minute));
            }

            System.out.println(hour + " " + String.valueOf(minute));
        } else {
            System.out.println(hour + " " + String.valueOf(minute + cookingTime));
        }
    }
}
