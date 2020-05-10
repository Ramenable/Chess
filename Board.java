import Chess.Bishop;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Board {
    private static Tile[][] board;
    public Board() {
        board = new Tile[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = new Tile(i, j);
            }
        }
        board[0][0].piece = new Rook(true, board[0][0]);
        board[0][7].piece = new Rook(true, board[0][7]);
        board[0][1].piece = new Knight(true, board[0][1]);
        board[0][6].piece = new Knight(true, board[0][6]);
        board[0][2].piece = new Bishop(true, board[0][2]);
        board[0][5].piece = new Bishop(true, board[0][5]);
        board[0][3].piece = new Queen(true, board[0][3]);
        board[0][4].piece = new King(true, board[0][4]);
        board[7][0].piece = new Rook(false, board[7][0]);
        board[7][7].piece = new Rook(false, board[7][7]);
        board[7][1].piece = new Knight(false, board[7][1]);
        board[7][6].piece = new Knight(false, board[7][6]);
        board[7][2].piece = new Bishop(false, board[7][2]);
        board[7][5].piece = new Bishop(false, board[7][5]);
        board[7][3].piece = new Queen(false, board[7][3]);
        board[7][4].piece = new King(false, board[7][4]);
        for (int i = 0; i < 8; i++) {
            board[1][i].piece = new Pawn(true, board[1][i]);
            board[6][i].piece = new Pawn(false, board[6][i]);
        }
    }
    public Tile getTile(int xcoord, int ycoord) {
        return board[xcoord][ycoord];
    }
    public void setTile(int xcoord, int ycoord, Tile t) {
        board[xcoord][ycoord] = t;
    }
}