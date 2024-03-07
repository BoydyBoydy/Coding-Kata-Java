package kata.parrot;

public class European extends Parrot {

    @Override
    double getSpeed() {
        return super.getBaseSpeed();
    }

    @Override
    String getCry() {
        return "Sqoork!";
    }
}
