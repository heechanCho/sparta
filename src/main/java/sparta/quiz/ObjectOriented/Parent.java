package sparta.quiz.ObjectOriented;

public class Parent extends Human implements Walk, Run {

    public Parent(String name, int age) {

        super(name, age, 3);
    }

    @Override
    public void walk(int x, int y) {
        whoAmI();
        System.out.println("현재속도 : " + speed);
        this.x = x;
        this.y = y;
        System.out.println("현재위치 : " + getLocation());

    }

    @Override
    public void run(int x, int y) {
        System.out.println("달립니다.");
        whoAmI();
        System.out.println("현재속도 : " + (speed + 2));
        this.x = x;
        this.y = y;
        System.out.println("현재위지 : " + getLocation());
    }


}
