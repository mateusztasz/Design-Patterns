package hexagonal.architecture.__gateways__.game;

import hexagonal.architecture.game.core.boundary.ports.Writer;

import javax.swing.*;

/**
 * Created by Mateusz on 23.09.2017.
 */
public class PopupWriter implements Writer{

    private JDialog dialog;

    public PopupWriter() {
        this.dialog = new JDialog();
    }

    @Override
    public void write(String content) {
        JOptionPane.showMessageDialog(dialog, content);
    }
}
