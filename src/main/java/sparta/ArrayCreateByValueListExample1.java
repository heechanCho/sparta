package sparta;

public class ArrayCreateByValueListExample1 {
    public static void main(String[] args) {

        int[] scores = {85, 70, 60 , 40, 30};
        int total = 0;

        System.out.println(scores[0]);
        System.out.println(scores[1]);

        for(int i = 0; i < scores.length; i++) {
            total = total + scores[i];

        }
        System.out.println(total);
        System.out.println((double)(total / 6));
    }
}
