package kata.parrot;

abstract class Parrot {

    abstract double getSpeed();

    abstract String getCry();

    public double getBaseSpeed() {
        return 12.0;
    }
}
