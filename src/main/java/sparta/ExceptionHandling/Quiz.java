package sparta.ExceptionHandling;

import java.io.IOException;

public class Quiz {
    public static void main(String[] args) {
        ArrayCalculation arrayCalculation = new ArrayCalculation();

        try {
            System.out.println("2 / 3 = " + arrayCalculation.divide(2, 1));
        } catch (ArithmeticException e) {
            System.out.println("문제발생");
        }

        try {
            System.out.println("1 / 0 = " + arrayCalculation.divide(1, 0)); // java.lang.ArithmeticException: "/ by zero"
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException 발생" + e.getMessage());

            try {
                System.out.println("Try to divide using out of index element = "
                        + arrayCalculation.divide(5, 0)); // java.lang.ArrayIndexOutOfBoundsException: 5
            } catch (ArrayIndexOutOfBoundsException a) {
                System.out.println("OutOfBound 발생" + a.getMessage());
                System.out.println("잘못된 index 값입니다. 현재 인덱스 범위는 0부터 " + (arrayCalculation.arr.length-1) + "까지입니다.");
            }
        }
    }
}