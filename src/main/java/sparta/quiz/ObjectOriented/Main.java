package sparta.quiz.ObjectOriented;

public class Main {
    public static void main(String[] args) {

        Human grandParent = new GrandParent("조주동", 70);

        Human parent = new Parent("조조", 50);

        Human child = new Child("조비", 24);

        System.out.println("조부모님위치" + grandParent.getLocation());

        System.out.println("부모님위치" + parent.getLocation());

        System.out.println("자식위치" + child.getLocation());

        if (grandParent instanceof Walk) {

            ((Walk) grandParent).walk(1, 1);
            System.out.println("--------------------");
        }

        if (parent instanceof Walk) {

            ((Walk) parent).walk(1, 1);
            System.out.println("--------------------");
        }

        if (parent instanceof Run) {

            ((Run) parent).run(2, 2);
            System.out.println("-------------------");

        }

        if (child instanceof Walk) {

            ((Walk) child).walk(1, 1);
            System.out.println("-----------------------");
        }

        if (child instanceof Run) {

            ((Run) child).run(2, 2);
            System.out.println("----------------------");
        }

        if (child instanceof Swim) {

            ((Swim) child).swim(3, -1);
            System.out.println("----------------------");
        }


    }
}
