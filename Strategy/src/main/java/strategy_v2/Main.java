package strategy_v2;

/**
 * Created by Mateusz on 29.09.2017.
 */
public class Main {
    public static void main(String[] args) {



        Dinner dinner = new Dinner();

        dinner.setChef(new MateuszChef());
        dinner.cook();

        dinner.setChef(new DariaChef());
        dinner.cook();

    }

}


class Dinner {

    TopChef chef;

    public void setChef(TopChef chef) {
        this.chef = chef;
    }

    void cook() {
        chef.cook();
    }
}

interface TopChef {
    public void cook();
}

class MateuszChef implements TopChef {
    public void cook() {
        System.out.println("Ugotuj kurczaka");
    }
}

class DariaChef implements TopChef {
    public void cook() {
        System.out.println("Ugotuj pyszny placek");
    }
}

class UnknownChed implements TopChef {
    public void cook() {
        System.out.println("Gotowanie nie wyszlo.");
    }
}