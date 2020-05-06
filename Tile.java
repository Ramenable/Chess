import javafx.scene.paint.Color;

public class Tile {
    protected int x;
    protected int y;
    protected Color color;
    protected boolean occupied;

    public Tile(int a, int b) {
        x = a;
        y = b;
        if ((x + y) % 2 == 0) {
            color = Color.WHITE;
        } else {
            color = Color.BLACK;
        }
        occupied = false;
    }

    public void setColor(Color col) {
        color = col;
    }
}
