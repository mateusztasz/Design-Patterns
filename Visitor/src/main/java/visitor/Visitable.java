package visitor;

/**
 * Created by Mateusz on 23.11.2017.
 */
public interface Visitable {
    void accept(Visitor visitor);
}
