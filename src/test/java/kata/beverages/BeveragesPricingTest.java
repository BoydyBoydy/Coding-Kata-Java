package kata.beverages;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;

public class BeveragesPricingTest {
    @Test
    public void computes_coffee_price() {
        Beverage coffee = new Coffee();
        assertThat(coffee.price(), is(closeTo(1.20, 0.001)));
    }

    @Test
    public void computes_tea_price() {
        Beverage tea = new Tea();
        assertThat(tea.price(), is(closeTo(1.50, 0.001)));
    }

    @Test
    public void computes_hot_chocolate_price() {
        Beverage hotChocolate = new HotChocolate();
        assertThat(hotChocolate.price(), is(closeTo(1.45, 0.001)));
    }

    @Test
    public void computes_tea_with_milk_price() {

        Beverage tea = new Tea();
        tea.addExtras(new Milk());

        assertThat(tea.price(), is(closeTo(1.60, 0.001)));
    }

    @Test
    public void computes_coffee_with_milk_price() {
        Beverage coffeeWithMilk = new Coffee();
        coffeeWithMilk.addExtras(new Milk());

        assertThat(coffeeWithMilk.price(), is(closeTo(1.30, 0.001)));
    }

    @Test
    public void computes_coffee_with_milk_and_cream_price() {
        Beverage coffeeWithMilkAndCream = new Coffee();
        coffeeWithMilkAndCream.addExtras(new Milk());
        coffeeWithMilkAndCream.addExtras(new Cream());

        assertThat(coffeeWithMilkAndCream.price(), is(closeTo(1.45, 0.001)));
    }

    @Test
    public void computes_hot_chocolate_with_cream_price() {
        Beverage hotChocolateWithCream = new HotChocolate();
        hotChocolateWithCream.addExtras(new Cream());

        assertThat(hotChocolateWithCream.price(), is(closeTo(1.60, 0.001)));
    }

    // We'd like you to add an optional cinnamon supplement that costs 0.05 cents to all our existing catalog of beverages.
    // Assumed that it is for all not just the basic 3

    @Test
    public void computes_coffee_with_cinnamon_price() {
        Beverage coffee = new Coffee();
        coffee.addExtras(new Cinnamon());
        assertThat(coffee.price(), is(closeTo(1.25, 0.001)));
    }

    @Test
    public void computes_tea_with_cinnamon_price() {
        Beverage tea = new Tea();
        tea.addExtras(new Cinnamon());
        assertThat(tea.price(), is(closeTo(1.55, 0.001)));
    }

    @Test
    public void computes_hot_chocolate_with_cinnamon_price() {
        Beverage hotChocolate = new HotChocolate();
        hotChocolate.addExtras(new Cinnamon());
        assertThat(hotChocolate.price(), is(closeTo(1.50, 0.001)));
    }

    @Test
    public void computes_tea_with_milk_and_cinnamon_price() {

        Beverage tea = new Tea();
        tea.addExtras(new Milk());
        tea.addExtras(new Cinnamon());

        assertThat(tea.price(), is(closeTo(1.65, 0.001)));
    }

    @Test
    public void computes_coffee_with_milk_and_cinnamon_price() {
        Beverage coffeeWithMilk = new Coffee();
        coffeeWithMilk.addExtras(new Milk());
        coffeeWithMilk.addExtras(new Cinnamon());

        assertThat(coffeeWithMilk.price(), is(closeTo(1.35, 0.001)));
    }

    @Test
    public void computes_coffee_with_milk_and_cream_and_cinnamon_price() {
        Beverage coffeeWithMilkAndCream = new Coffee();
        coffeeWithMilkAndCream.addExtras(new Milk());
        coffeeWithMilkAndCream.addExtras(new Cream());
        coffeeWithMilkAndCream.addExtras(new Cinnamon());

        assertThat(coffeeWithMilkAndCream.price(), is(closeTo(1.50, 0.001)));
    }

    @Test
    public void computes_hot_chocolate_with_cream_and_cinnamon_price() {
        Beverage hotChocolateWithCream = new HotChocolate();
        hotChocolateWithCream.addExtras(new Cream());
        hotChocolateWithCream.addExtras(new Cinnamon());

        assertThat(hotChocolateWithCream.price(), is(closeTo(1.65, 0.001)));
    }
}
