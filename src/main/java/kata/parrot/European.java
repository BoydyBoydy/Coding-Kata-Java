package kata.parrot;

public class European extends Parrot {

    @Override
    public double getSpeed() {
        return super.getBaseSpeed();
    }

    @Override
    String getCry() {
        return "Sqoork!";
    }
}
