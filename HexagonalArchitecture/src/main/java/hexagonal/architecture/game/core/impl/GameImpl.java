package hexagonal.architecture.game.core.impl;

import hexagonal.architecture.game.core.boundary.api.Game;
import hexagonal.architecture.game.core.boundary.ports.Reader;
import hexagonal.architecture.game.core.boundary.ports.Writer;

import java.util.Random;
import java.util.function.Predicate;

import static java.util.Objects.*;

/**
 * Created by Mateusz on 23.09.2017.
 */


public class GameImpl implements Game {

    private static final int BOUND = 10;
    private static final int ATTEMPTS = 5;

    private final int numberToGuess;
    private Reader reader;
    private Writer writer;
    private Boolean guessedCorrectly = null;

    public GameImpl(final Random numberToGuess, final Reader reader, final Writer writer) {
        this.numberToGuess = requireNonNull(numberToGuess.nextInt(BOUND));
        this.reader = requireNonNull(reader);
        this.writer = requireNonNull(writer);
    }

    @Override
    public void play() {
        displayIntroduction();
        this.guessedCorrectly = givePlayerAttemptsToGuess();
        displayFinalResult(this.guessedCorrectly);
    }

    @Override
    public Boolean isWin() {
        return this.guessedCorrectly;
    }

    private boolean givePlayerAttemptsToGuess() {
        int attemptNumber = 1;
        boolean guessedCorrectly = false;
        int read;

        while (attemptNumber <= ATTEMPTS && !guessedCorrectly) {
            displayPrompt(attemptNumber);

            read = reader.read();
            if (read == numberToGuess) {
                guessedCorrectly = true;
            } else {
                writer.write("Try again\n");
            }
            attemptNumber++;
        }
        return guessedCorrectly;
    }

    private void displayPrompt(int attemptNumber) {
        writer.write(String.format("Your Guess? (attempt %d) > ", attemptNumber));
    }

    private void displayIntroduction() {
        writer.write("I'm thinking of a number between 0 and " + BOUND + '\n');
        writer.write("Can you guess it, in " + ATTEMPTS + " attemps?\n");
    }

    private void displayFinalResult(boolean guessedCorrectly) {
        if (guessedCorrectly) {
            writer.write("You guessed it!");
        } else {
            writer.write("Bad luck. A correct number was: " + numberToGuess + "\n");
        }
    }

}
