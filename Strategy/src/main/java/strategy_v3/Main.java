package strategy_v3;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Mateusz on 30.09.2017.
 */
public class Main {

    public static Map<String, TopChef> chefMapping = new HashMap<String, TopChef>();

    public static void main(String[] args) {

        init();
        chefMapping.get("Mateusz").cook();
        chefMapping.get("Daria").cook();
    }

    private static void init() {
        chefMapping.put("Daria", new DariaChef());
        chefMapping.put("Mateusz", new MateuszChef());
    }


    interface TopChef {
        public void cook();
    }

    static class MateuszChef implements TopChef {
        public void cook() {
            System.out.println("Ugotuj kurczaka");
        }
    }

    static class DariaChef implements TopChef {
        public void cook() {
            System.out.println("Ugotuj pyszny placek");
        }
    }

    static class UnknownChed implements TopChef {
        public void cook() {
            System.out.println("Gotowanie nie wyszlo.");
        }
    }
}