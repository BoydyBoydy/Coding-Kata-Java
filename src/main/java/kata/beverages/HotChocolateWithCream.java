package kata.beverages;

public class HotChocolateWithCream extends HotChocolate {
    @Override
    public double price() {

        double endValue;
        Cream cream = new Cream();
        endValue = super.price();
        endValue += cream.extraPrice();

        return endValue;
    }
}
