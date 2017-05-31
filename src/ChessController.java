/**
 * ChessController.java
 *
 * Accepts input from player and controls the state of board
 *
 * @author Brandon Nguyen
 *         Github @ lrbn
 *         Email: lrbn86@gmail.com
 *
 * @version May 30, 2017
 *
 */
public class ChessController {
    ChessViewer viewer;
    ChessModel model;
    public ChessController() {
        viewer = new ChessViewer();
        model = new ChessModel();
    }
    public void showChessBoard() {
        viewer.showBoard();
    }
}