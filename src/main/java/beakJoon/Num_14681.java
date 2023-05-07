package beakJoon;

import java.util.Scanner;

public class Num_14681 {
    public static void main(String[] args) {
        // 점의 좌표를 입력받아 그 점이 어느 사분면에 속하는지 알아내는 프로그램을 작성하시오.

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > 0 && b > 0) {
            System.out.println(1);
        } else if (a < 0 && b > 0) {
            System.out.println(2);
        } else if (a < 0 && a < 0) {
            System.out.println(3);
        } else {
            System.out.println(4);
        }
    }
}
