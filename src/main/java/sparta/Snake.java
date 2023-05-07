package sparta;

public class Snake extends Animal {

    public Snake(String name) {
        super(name);
    }

    public void poison() {
        System.out.println("독 있음");
    }
}
