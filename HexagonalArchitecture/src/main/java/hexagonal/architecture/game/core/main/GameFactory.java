package hexagonal.architecture.game.core.main;

import hexagonal.architecture.game.core.boundary.api.Game;
import hexagonal.architecture.game.core.boundary.ports.Reader;
import hexagonal.architecture.game.core.boundary.ports.Writer;
import hexagonal.architecture.game.core.impl.GameImpl;

import java.util.Random;

/**
 * Created by Mateusz on 23.09.2017.
 */
public class GameFactory {

    public Game create(Reader reader, Writer writer) {
        return new GameImpl(new Random(), reader, writer);
    }

}
