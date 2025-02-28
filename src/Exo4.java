import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Exo4 extends Application {
    @Override
    public void start(Stage primaryStage) {
        Button redButton = new Button("Rouge");
        Button greenButton = new Button("Vert");
        Button blueButton = new Button("Bleu");
        HBox root = new HBox(redButton, greenButton, blueButton);
        Scene scene = new Scene(root, 400, 200);

        redButton.setOnMouseClicked(event -> {
            scene.getRoot().setStyle("-fx-background-color: red;");
        });

        greenButton.setOnMouseClicked(event -> {
            scene.getRoot().setStyle("-fx-background-color: #00ff00;");
        });

        blueButton.setOnMouseClicked(event -> {
            scene.getRoot().setStyle("-fx-background-color: blue;");
        });

        primaryStage.setTitle("Compteur JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();

        root.requestFocus();
    }
}
