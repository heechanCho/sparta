package sparta.quiz.ObjectOriented;

public class GrandParent extends Human implements Walk {

    public GrandParent(String name, int age) {
        super(name, age, 1);
    }

    @Override
    public void walk(int x, int y) {
        System.out.println("현재위치 : " + x + " " + y);
        this.x = x;
        this.y = y;
        System.out.println(getLocation());
    }
}
