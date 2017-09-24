package hexagonal.architecture.gui.core.impl;

import hexagonal.architecture.gui.core.boundary.api.Gui;
import hexagonal.architecture.gui.core.boundary.ports.MyGame;
import hexagonal.architecture.gui.core.boundary.ports.Reader;
import hexagonal.architecture.gui.core.boundary.ports.Writer;

import static java.util.Objects.requireNonNull;

/**
 * Created by Mateusz on 23.09.2017.
 */
public class GuiImpl implements Gui {

    private Writer writer;
    private Reader reader;
    private MyGame myGame;

    public GuiImpl(final MyGame myGame, final Reader reader, final Writer writer) {
        this.reader = requireNonNull(reader);
        this.writer = requireNonNull(writer);
        this.myGame = requireNonNull(myGame);
    }


    @Override
    public void run() {
        writer.write("************************\n");
        writer.write("********* MENU *********\n");
        writer.write("************************\n");
        writer.write("Choose your action:\n");
        writer.write("1) play a game\n");
        writer.write("2) show rules\n");
        writer.write("3) about application\n");
        writer.write("4) show your last result\n");
        writer.write("5) quit\n\n");

        react();
    }


    private void react() {


        int read = -1;
        do {
            if (read == 1) myGame.play();
            if (read == 2) showRules();
            if (read == 3) showABout();
            if (read == 4) showLastResult();

            writer.write("Your input:> ");
            read = reader.read();
        } while (read != 5);
    }

    private void showLastResult() {
        writer.write("************************\n");
        writer.write("****** Last Result *****\n");
        writer.write("************************\n");

        String lastResult;
        if (myGame.isWin() == null)
            lastResult = "not played yet";
        else if (myGame.isWin())
            lastResult = "won.";
        else
            lastResult = "lost.";

        writer.write("Lastly you have " + lastResult + "\n\n");

    }

    private void showRules() {
        writer.write("************************\n");
        writer.write("********* RULES ********\n");
        writer.write("************************\n");
        writer.write("Guess number :)\n\n");
    }

    private void showABout() {
        writer.write("************************\n");
        writer.write("********* ABOUT ********\n");
        writer.write("************************\n");
        writer.write("Author: Mateusz :)\n\n");
    }
}
