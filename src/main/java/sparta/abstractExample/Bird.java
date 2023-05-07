package sparta.abstractExample;

abstract class Bird {

    private int x, y, z;

    void fly(int x, int y, int z) {
        printLocation();
        System.out.println("이동합니다.");
        this.x = x;
        this.y = y;
        if (flyStatus(z)) {
            this.z = z;
        } else {
            System.out.println("날 수 없습니다.");
        }

        printLocation();

    }


    abstract boolean flyStatus(int z);


    public void printLocation() {
        System.out.println("현재위치" + x + " ," + y + " ," + z);
    }
}
