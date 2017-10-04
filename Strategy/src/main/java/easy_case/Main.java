package easy_case;


/**
 * Created by Mateusz on 29.09.2017.
 */
public class Main {
    public static void main(String[] args) {

        Dinner dinner = new Dinner();

        dinner.cook("Mateusz");
        dinner.cook("Daria");
    }

}

class Dinner {

    void cook(String chef) {

        if (chef.toLowerCase().equals("mateusz")) {
            System.out.println("Ugotuj kurczaka");
        } else if (chef.toLowerCase().equals("daria")) {
            System.out.println("Ugotuj pyszny placek");
        } else {
            System.out.println("Gotowanie nie wyszlo.");
        }
    }
}
