package kata.parrot;

public class African extends Parrot {

    private final double numberOfCoconuts;

    public African(double numberOfCoconuts) {
        this.numberOfCoconuts = numberOfCoconuts;
    }

    @Override
    public double getSpeed() {

        return Math.max(0, getBaseSpeed() - getLoadFactor() * numberOfCoconuts);
    }

    @Override
    String getCry() {
        return "Sqaark!";
    }

    private double getLoadFactor() {
        return 9.0;
    }
}

