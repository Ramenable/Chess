package Chess;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Chess extends Application {
    private Stage stage;
    private GridPane board = new GridPane();

    @Override
    public void start(Stage primaryStage) {
        BorderPane pane = new BorderPane();
        GridPane board = new GridPane();
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                Rectangle r;
                if ((i + j) % 2 == 0) {
                    r = new Rectangle(40,40, Color.WHITE);
                } else {
                    r = new Rectangle(40,40, Color.BLACK);
                }
                board.add(r, i, j);
            }
        }
        pane.setCenter(board);
        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.setMinWidth(800);
        primaryStage.setMinHeight(600);
        primaryStage.setWidth(800);
        primaryStage.setHeight(600);
        primaryStage.setTitle("hi");
        primaryStage.show();

    }

    public static void main(String[] args) {
        Application.launch(Chess.class, args);
    }
}