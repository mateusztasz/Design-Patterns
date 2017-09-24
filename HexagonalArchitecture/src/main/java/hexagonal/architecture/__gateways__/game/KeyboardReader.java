package hexagonal.architecture.__gateways__.game;

import hexagonal.architecture.game.core.boundary.ports.Reader;

import java.util.Scanner;

/**
 * Created by Mateusz on 23.09.2017.
 */
public class KeyboardReader implements Reader {

    @Override
    public int read() {
        Scanner keyboard = new Scanner(System.in);
        return keyboard.nextInt();
    }
}
