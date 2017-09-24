package decorator;

import static java.util.Objects.requireNonNull;

/**
 * Created by Mateusz on 22.09.2017.
 */
public class SalamiPizza implements Pizza {

    private static final double PRICE = 3;

    private final Pizza pizza;

    public SalamiPizza(final Pizza pizza) {
        this.pizza = requireNonNull(pizza);
    }

    @Override
    public double price() {
        return pizza.price() + PRICE;
    }

    @Override
    public String description() {
        return pizza.description() + " with salami";
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append(description())
                .append(" at price ")
                .append(price()).toString();
    }
}
