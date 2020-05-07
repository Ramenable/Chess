package Chess;

import java.util.Set;

public class Bishop extends Piece{

    Bishop (boolean bl, Tile t) {
        super (bl, t);
    }
    @Override
    public Set<Tile> combinations() {
        Set<Tile> set = (Set<Tile>) new HashSet<>();
        int xloc = this.location.x;
        int yloc = this.location.y;
        int count = 0;

        xloc = this.location.x;
        yloc = this.location.y;
        while (blah) {
            set.add(board.get(xloc, yloc));
            xloc ++;
            yloc ++;
        }
        xloc = this.location.x;
        yloc = this.location.y;
        while (blah) {
            set.add(board.get(xloc, yloc));
            xloc --;
            yloc ++;
        }
        xloc = this.location.x;
        yloc = this.location.y;
        while (blah) {
            set.add(board.get(xloc, yloc));
            xloc ++;
            yloc --;
        }
        xloc = this.location.x;
        yloc = this.location.y;
        while (blah) {
            set.add(board.get(xloc, yloc));
            xloc --;
            yloc --;
        }

        return set;
    }

    @Override
    public void move(Tile moveToTile) {
        this.location.x = moveToTile.x;
        this.location.y = moveToTile.y;
    }
}