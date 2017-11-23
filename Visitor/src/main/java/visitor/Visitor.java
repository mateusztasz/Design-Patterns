package visitor;

/**
 * Created by Mateusz on 23.11.2017.
 */
public interface Visitor {
    void visit(Book book);
    void visit(Ebook ebook);
}
