package kata.beverages;

public class Cinnamon implements Extras {

    double currentPrice = 0.05;

    @Override
    public double extraPrice() {
        return currentPrice;
    }
}
