package sparta;

abstract class Terrestrial {

    private int x, y, z;

    public void run(int x, int y, int z) {
        printLocation();
        System.out.println("이동합니다.");
        this.x= x;
        this.y = y;
        if(jumpAble(z)) {
            this.z = z;
        } else {
            System.out.println("그 점프로는 이동할 수 없습니다.");
        }

        printLocation();
    }

    abstract boolean jumpAble(int z);

    public void printLocation() {
        System.out.println("현재 위치 (" + x + " ," + y + " ," + "z" + ")");
    }


}
