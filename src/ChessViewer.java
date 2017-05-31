import javax.swing.*;
import java.awt.*;

/**
 * ChessViewer.java
 *
 * Organizes visual layout of the game.
 *
 * @author Brandon Nguyen
 *         Github @ lrbn
 *         Email: lrbn86@gmail.com
 *
 * @version May 30, 2017
 *
 */
public class ChessViewer {
    public static final int WINDOW_WIDTH = 500;
    public static final int WINDOW_HEIGHT = 500;
    public ChessViewer() {
        JFrame frame = new JFrame();
        frame.setTitle("Chess");
        frame.setPreferredSize(new Dimension(WINDOW_WIDTH, WINDOW_HEIGHT));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.pack();
        frame.setVisible(true);
    }

    public void showBoard() {
        System.out.println("Showing Board");
        // Image overlay of the chess board
    }
}