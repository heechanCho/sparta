package sparta;

class Pigeon extends Bird {

    @Override
    boolean flyable(int z) {
        return z < 1000;
    }
}
