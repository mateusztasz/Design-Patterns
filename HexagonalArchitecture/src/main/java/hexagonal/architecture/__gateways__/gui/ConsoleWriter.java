package hexagonal.architecture.__gateways__.gui;


import hexagonal.architecture.gui.core.boundary.ports.Writer;

/**
 * Created by Mateusz on 23.09.2017.
 */
public class ConsoleWriter implements Writer {

    @Override
    public void write(String content) {
        System.out.print(content);
    }
}
