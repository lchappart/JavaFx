import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Exo2 extends Application {
    @Override
    public void start(Stage primaryStage) {
        TextField text = new TextField();
        Label label = new Label("Entrez un texte");
        VBox root = new VBox(text, label);
        Scene scene = new Scene(root, 400, 200);

        text.setOnKeyPressed(event -> {
            label.setText(text.getText());
        });

    primaryStage.setTitle("Événement keyPressed JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();

        root.requestFocus();
    }
}
