package hexagonal.architecture.__gateways__.gui;

import hexagonal.architecture.game.core.boundary.api.Game;
import hexagonal.architecture.game.core.main.GameFactory;

import hexagonal.architecture.__gateways__.game.ConsoleWriter;
import hexagonal.architecture.__gateways__.game.KeyboardReader;
import hexagonal.architecture.gui.core.boundary.ports.MyGame;

/**
 * Created by Mateusz on 23.09.2017.
 */
public class GuessMyGame implements MyGame {

    private Game game;

    public GuessMyGame() {
        game = new GameFactory().create(new KeyboardReader(), new ConsoleWriter());
    }

    @Override
    public void play() {
        game.play();
    }

    @Override
    public Boolean isWin() {
        return game.isWin();
    }
}
