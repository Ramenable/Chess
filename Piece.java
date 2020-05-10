import java.util.Set;

public abstract class Piece {
    protected boolean isBlack;
    protected boolean isCaptured;
    protected Tile location;

    public Piece(boolean bl, Tile t) {
        isBlack = bl;
        location = t;
        isCaptured = false;
    }

    // show combinations of movements
    public abstract Set<Tile> combinations(Board board);

    // actually move from combinations
    public void move() {
        Set<Tile> set = combinations();
        
    }
}
