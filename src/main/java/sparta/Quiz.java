package sparta;

public class Quiz {
    public static void main(String[] args) {
        // write your code here

        int result = 0;

        for (int i = 0; i <= 100; i++) {
            result += i;
            System.out.println(result);
        }

        System.out.println();

        result = 0;


        /**
         *  5부터 시작하는 카운트다운을 반복문을 사용하여 만들어보세요.
         */
        int countNum = 5;

        for (int i = 0; i < 5; i++) {
            System.out.println(countNum--);
        }

        System.out.println();

        for (int i = 5; i >= 0; i--) {
            System.out.println(i);
        }

        /**
         * 홀수의 합과 짝수의 합을 구하고 각각 출력하는 프로그램을 만들어보세요
         */

        // 홀수
        int oddNumber = 0;

        // 짝수
        int evenNumber = 0;

        for (int i = 1; i <= 30; i++) {
            if (i % 2 == 0) {
                evenNumber += i;
            } else {
                oddNumber += i;

            }
        }

        System.out.println("evenNumber " + evenNumber);
        System.out.println("oddNumber" + oddNumber);

        System.out.println();

        int sumOdd = 0;
        int sumEven = 0;
        for (int i = 0; i <= 30; i++) {
            if (i % 2 == 0) {
                sumEven += i;
            } else {
                sumOdd += i;
            }
        }
        System.out.println(sumOdd);
        System.out.println(sumEven);

    }
}
