package decorator;

import static java.util.Objects.requireNonNull;

/**
 * Created by Mateusz on 22.09.2017.
 */
public class DoubleCheesePizza implements Pizza {

    private static final double PRICE = 2.5;

    private final Pizza pizza;

    public DoubleCheesePizza(final Pizza pizza) {
        this.pizza = requireNonNull(pizza);
    }

    @Override
    public double price() {
        return pizza.price() + PRICE;
    }

    @Override
    public String description() {
        return pizza.description() +  " with double cheese";
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append(description())
                .append(" at price ")
                .append(price()).toString();
    }
}