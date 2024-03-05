package kata.beverages;

public class Cream implements Extras {

    double currentPrice = 0.15;

    @Override
    public double extraPrice() {
        return currentPrice;
    }
}
