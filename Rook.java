import java.util.Set;

public class Rook extends Piece {

    public Rook(boolean bl, Tile t) {
        super(bl, t);
    }

    public Set<Tile> combinations() {
        Set<Tile> set = new Set<>();
        int xloc = this.location.x;
        int yloc = this.location.y;
        if (xloc != 7) {
            int i = xloc + 1;
            Tile curr = /* tile at i, yloc */;
            while (i < 8 && !curr.occupied) {
                i++;
                curr = /* tile at i, yloc */;
                set.add(curr);
            }
        } else if (xloc != 0) {
            int i = xloc - 1;
            Tile curr = /* tile at i, yloc */;
            while (i >= 0 && !curr.occupied) {
                i--;
                curr = /* tile at i, yloc */;
                set.add(curr);
            }
        }
        if (yloc != 7) {
            int j = yloc + 1;
            Tile curr = /* tile at xloc, j */;
            while (j < 8 && !curr.occupied) {
                j++;
                curr = /* tile at xloc, j */;
                set.add(curr);
            }
        } else if (yloc != 0) {
            int j = yloc - 1;
            Tile curr = /* tile at xloc, j */;
            while (j >= 0 && !curr.occupied) {
                j--;
                curr = /* tile at xloc, j */;
                set.add(curr);
            }
        }
        return set;
    }
}