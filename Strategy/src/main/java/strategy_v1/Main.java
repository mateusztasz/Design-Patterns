package strategy_v1;

/**
 * Created by Mateusz on 29.09.2017.
 */
public class Main {
    public static void main(String[] args) {

        Dinner dinner = new Dinner();

        dinner.cook(new MateuszChef());
        dinner.cook(new DariaChef());

    }

}


class Dinner {

    void cook(TopChef chef) {
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