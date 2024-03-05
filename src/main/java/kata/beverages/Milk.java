package kata.beverages;

public class Milk implements Extras {

    double currentPrice = 0.10;

    @Override
    public double extraPrice() {
        return currentPrice;
    }
}
