package kata.beverages;

public class Coffee implements Beverage {

    double currentPrice = 1.2;

    @Override
    public double price() {
        return currentPrice;
    }

    @Override
    public void addExtras(Extras extra) {
        currentPrice += extra.extraPrice();
    }
}
