/**
 * ChessModel.java
 *
 * Data structures and logic of the game
 *
 * @author Brandon Nguyen
 *         Github @ lrbn
 *         Email: lrbn86@gmail.com
 *
 * @version May 30, 2017
 *
 */
public class ChessModel {

    King king;
    Queen queen;
    Knight knight;
    Rook rook;
    Bishop bishop;
    Pawn pawn;

    private int totalNumOfPieces = 32; // Each player has 16 pieces
    private int turns = 0;

    private String spaces[] = {
            "a1", "a2", "a3", "a4", "a5", "a6", "a7", "a8",
            "b1", "b2", "b3", "b4", "b5", "b6", "b7", "b8",
            "c1", "c2", "c3", "c4", "c5", "c6", "c7", "c8",
            "d1", "d2", "d3", "d4", "d5", "d6", "d7", "d8",
            "e1", "e2", "e3", "e4", "e5", "e6", "e7", "e8",
            "f1", "f2", "f3", "f4", "f5", "f6", "f7", "f8",
            "g1", "g2", "g3", "g4", "g5", "g6", "g7", "g8",
            "h1", "h2", "h3", "h4", "h5", "h6", "h7", "h8",
    };

    // Chess Pieces must be placed into their respective starting positions when new game

    public ChessModel() {
        king = new King();
        queen = new Queen();
        knight = new Knight();
        rook = new Rook();
        bishop = new Bishop();
        pawn = new Pawn();
    }
}