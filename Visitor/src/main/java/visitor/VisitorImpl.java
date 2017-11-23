package visitor;

/**
 * Created by Mateusz on 23.11.2017.
 */
public class VisitorImpl implements Visitor {
    private double totalPostageForCart;

    public void visit(Book book) {
        if (book.getPrice() < 100.0) {
            totalPostageForCart += book.getWeight() * 2;
        }
    }

    @Override
    public void visit(Ebook ebook) {
        totalPostageForCart += ebook.getPrice();
    }

    public double getTotalPostage() {
        return totalPostageForCart;
    }
}
