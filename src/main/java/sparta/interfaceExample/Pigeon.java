package sparta.interfaceExample;

public class Pigeon implements Bird {

    private int x, y, z;

    @Override
    public void fly(int x, int y, int z) {
        print();
        System.out.println("난다!");
        this.x = x;
        this.y = y;
        this.z = z;
        print();
    }




    public void print() {
        System.out.println("현재 위치 (" + x + " , " + y + " ," + z + ")");
    }
}
