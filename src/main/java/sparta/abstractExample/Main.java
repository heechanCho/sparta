package sparta.abstractExample;

public class Main {
    public static void main(String[] args) {

        Bird bird = new Pigeon();
        Bird bird2 = new Kiwi();

        bird.fly(1, 2, 3);
        bird2.fly(1, 1, 1);
    }
}
