package sparta.interfaceExample;

public class Main {
    public static void main(String[] args) {

        Bird bird = new Pigeon();

        bird.fly(1,2,3);

        Bird bird2 = new Kiwi();

        bird2.fly(1,2,3);
    }
}
