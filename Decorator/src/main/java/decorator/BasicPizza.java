package decorator;

/**
 * Created by Mateusz on 22.09.2017.
 */
public class BasicPizza implements Pizza {

    private static final double BASIC_PRICE = 20;

    @Override
    public double price() {
        return BASIC_PRICE;
    }

    @Override
    public String description() {
        return "Basic pizza";
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append(description())
                .append(" at price ")
                .append(price()).toString();
    }

}
