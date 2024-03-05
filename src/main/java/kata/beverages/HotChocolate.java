package kata.beverages;

public class HotChocolate implements Beverage {

    double currentPrice = 1.45;

    @Override
    public double price() {
        return currentPrice;
    }

    @Override
    public void addExtras(Extras extra) {
        currentPrice += extra.extraPrice();
    }
}
