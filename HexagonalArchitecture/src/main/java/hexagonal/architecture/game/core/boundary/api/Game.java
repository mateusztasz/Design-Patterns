package hexagonal.architecture.game.core.boundary.api;

/**
 * Created by Mateusz on 23.09.2017.
 */
public interface Game {
    void play();

    Boolean isWin();
}

