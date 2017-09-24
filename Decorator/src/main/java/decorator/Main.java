package decorator;

public class Main {

    public static void main(String[] args) {
        Pizza basicPizza = new BasicPizza();
        Pizza pepperPizza = new PepperPizza(new BasicPizza());
        Pizza salamiPizza = new SalamiPizza(new BasicPizza());
        Pizza doubleCheesePizza = new DoubleCheesePizza(new BasicPizza());

        Pizza megaPizza = new DoubleCheesePizza(
                new PepperPizza(
                        new SalamiPizza(
                                new BasicPizza())));

        System.out.println(basicPizza);
        System.out.println(pepperPizza);
        System.out.println(salamiPizza);
        System.out.println(doubleCheesePizza);
        System.out.println(megaPizza);
    }
}
