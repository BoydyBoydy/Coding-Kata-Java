package kata.parrot;

public class NorwegianBlue extends Parrot {
    private final double voltage;
    private final boolean isNailed;

    public NorwegianBlue(double voltage, boolean isNailed) {
        this.voltage = voltage;
        this.isNailed = isNailed;
    }

    @Override
    public double getSpeed() {
        return isNailed ? 0 : getBaseSpeed(voltage);
    }

    @Override
    String getCry() {
        return voltage > 0 ? "Bzzzzzz" : "...";
    }

    private double getBaseSpeed(double voltage) {
        return Math.min(24.0, voltage * getBaseSpeed());
    }
}
