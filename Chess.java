package Chess;

import javafx.application.Application;
import javafx.stage.Stage;

public class Chess extends Application {
    private Stage stage;

    @Override
    public void start(Stage primaryStage) {
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