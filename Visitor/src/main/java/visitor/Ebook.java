package visitor;

/**
 * Created by Mateusz on 23.11.2017.
 */
public class Ebook implements Visitable {

    private final double price;
    private final double weight;

    public Ebook(double price, double weight) {
        this.price = price;
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
