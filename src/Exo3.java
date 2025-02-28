import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Exo3 extends Application    {
    @Override
    public void start(Stage primaryStage) {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("fxml/Exo3.fxml"));
        Button minusButton = new Button("-");
        Button plusButton = new Button("+");
        Label label = new Label("0");
        HBox root = new HBox(minusButton, label, plusButton);
        Scene scene = new Scene(root, 400, 200);

        minusButton.setOnMouseClicked(event -> {
            int value = Integer.parseInt(label.getText());
            label.setText(String.valueOf(value - 1));
        });

        plusButton.setOnMouseClicked(event -> {
            int value = Integer.parseInt(label.getText());
            label.setText(String.valueOf(value + 1));
        });

        primaryStage.setTitle("Compteur JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();

        root.requestFocus();
    }
}
