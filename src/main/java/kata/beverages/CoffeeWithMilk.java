package kata.beverages;

public class CoffeeWithMilk extends Coffee {
    @Override
    public double price() {

        double endValue;
        Milk milk = new Milk();
        endValue = super.price();
        endValue += milk.extraPrice();

        return endValue;
    }
}
