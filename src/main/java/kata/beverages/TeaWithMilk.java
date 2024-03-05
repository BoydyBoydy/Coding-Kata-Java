package kata.beverages;

public class TeaWithMilk extends Tea {
    @Override
    public double price() {

        double endValue;
        Milk milk = new Milk();
        endValue = super.price();
        endValue += milk.extraPrice();

        return endValue;
    }
}
