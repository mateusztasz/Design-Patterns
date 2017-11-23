package visitor;

/**
 * Created by Mateusz on 23.11.2017.
 */
public class Main {


    public static void main(String[] args) {

        double v = calculatePostage();
        System.out.println(v);
    }

    public static double calculatePostage() {

        Visitable[] items = new Visitable[]{(new Ebook(10,10))};
        //create a visitor
        VisitorImpl visitor = new VisitorImpl();

        //iterate through all items
        for (Visitable item : items) {
            item.accept(visitor);
        }

        return visitor.getTotalPostage();
    }

}

