package hexagonal.architecture;

import hexagonal.architecture.__gateways__.gui.ConsoleWriter;
import hexagonal.architecture.__gateways__.gui.GuessMyGame;
import hexagonal.architecture.__gateways__.gui.KeyboardReader;

import hexagonal.architecture.game.core.main.GameFactory;
import hexagonal.architecture.gui.core.main.GuiFactory;

/*
 * Created by Mateusz on 23.09.2017.
 */
public class Main {
    public static void main(String[] args) {


        new GuiFactory().create(
                new GuessMyGame(),
                new KeyboardReader(),
                new ConsoleWriter())
                .run();

    }
}