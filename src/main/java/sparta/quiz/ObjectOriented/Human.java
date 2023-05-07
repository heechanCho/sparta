package sparta.quiz.ObjectOriented;

public class Human {

    String name;

    int age;

    int speed;

    int x, y;

    public Human(String name, int age, int x, int y) {
        this.name = name;
        this.age = age;
        this.x = x;
        this.y = y;
    }

    public Human(String name, int age, int speed) {
        this.name = name;
        this.age = age;
        this.speed = speed;
    }

    public String getLocation() {
        return "(" + x + " : " + y + ")";
    }

    public void whoAmI() {
        System.out.println("My name is " + name + age + "ages");
    }
}
