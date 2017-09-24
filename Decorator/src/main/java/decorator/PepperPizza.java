package decorator;

import static java.util.Objects.requireNonNull;

/**
 * Created by Mateusz on 22.09.2017.
 */

public class PepperPizza implements Pizza {

    private static final double PRICE = 1.5;

    private final Pizza pizza;

    public PepperPizza(final Pizza pizza) {
        this.pizza = requireNonNull(pizza);
    }

    @Override
    public double price() {
        return pizza.price() + PRICE;
    }

    @Override
    public String description() {
        return pizza.description() +  " with pepper";
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append(description())
                .append(" at price ")
                .append(price()).toString();
    }
}