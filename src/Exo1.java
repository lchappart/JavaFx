import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.control.Button;
import javafx.stage.Stage;


public class Exo1 extends Application {

    @Override
    public void start(Stage primaryStage) {
        Text text = new Text("");
        Button button = new Button("Afficher le texte");
        VBox root = new VBox(text, button);
        Scene scene = new Scene(root, 400, 200);

        button.setOnMouseClicked(event -> {
            text.setText("T'as cliqué!!!!!");
        });

        primaryStage.setTitle("Événement souris JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();

        root.requestFocus();
    }
}

