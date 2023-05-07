package sparta.interfaceExample;

public class Kiwi implements Bird {

    private int x, y, z;

    @Override
    public void fly(int x, int y, int z) {
        print();
        this.x = x;
        this.y = y;
        this.z = 0;
        System.out.println("못 난다!");
        print();

    }

    private boolean flyalbe = false;


    public void print() {
        System.out.println("현재위치" + x + " ," + y + " ," + z + ")");
    }
}
