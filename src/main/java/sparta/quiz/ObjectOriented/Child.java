package sparta.quiz.ObjectOriented;

public class Child extends Human implements Walk, Run, Swim {

    public Child(String name, int age) {
        super(name, age, 5);
    }

    @Override
    public void run(int x, int y) {
        whoAmI();
        System.out.println("현재속도 : " + (speed + 2));
        this.x = x;
        this.y = y;
        System.out.println("현재위치 : " + getLocation());
    }

    @Override
    public void swim(int x, int y) {
        whoAmI();
        System.out.println("현재속도 : " + (speed + 1));
        this.x = x;
        this.y = y;
        System.out.println("현재위치 : " + getLocation());
    }

    @Override
    public void walk(int x, int y) {
        whoAmI();
        System.out.println("현재속도 : " + speed);
        this.x = x;
        this.y = y;
        System.out.println("현재위치 : " + getLocation());
    }
}
