package kata.beverages;

public class Tea implements Beverage {

    double currentPrice = 1.5;

    @Override
    public double price() {
        return currentPrice;
    }

    @Override
    public double addExtras(Extras extra) {
        return currentPrice += extra.extraPrice();
    }
}
