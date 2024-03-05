package kata.beverages;

public class CoffeeWithMilkAndCream extends Coffee {
    @Override
    public double price() {

        double endValue;
        Milk milk = new Milk();
        Cream cream = new Cream();
        endValue = super.price();
        endValue += milk.extraPrice();
        endValue += cream.extraPrice();

        return endValue;
    }
}
