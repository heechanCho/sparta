package sparta;

abstract class Bird {

    private int x, y, z;

    void fly(int x, int y, int z) {

        printLocation();
        System.out.println("이동합니다.");
        this.x = x;
        this.y = y;
        if (flyable(z)) {
            this.z = z;
        } else {
            System.out.println("그 높이는 날 수 없습니다.");
        }
        printLocation();
    }

    abstract boolean flyable(int z);

    public void printLocation() {
        System.out.println("현재 위치 (" + x + " ," + y + ", " + z + ")");
    }
}
