package sparta.abstractExample;

public class Pigeon extends Bird {

    @Override
    boolean flyStatus(int z) {
        return z < 100;
    }
}
