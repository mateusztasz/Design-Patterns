package hexagonal.architecture.gui.core.main;

import hexagonal.architecture.gui.core.boundary.ports.MyGame;
import hexagonal.architecture.gui.core.boundary.ports.Reader;
import hexagonal.architecture.gui.core.boundary.ports.Writer;
import hexagonal.architecture.gui.core.boundary.api.Gui;
import hexagonal.architecture.gui.core.impl.GuiImpl;

/**
 * Created by Mateusz on 23.09.2017.
 */
public class GuiFactory {

    public Gui create(MyGame myGame, Reader reader, Writer writer){
        return new GuiImpl(myGame, reader, writer);
    }
}
