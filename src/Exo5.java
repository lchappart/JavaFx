import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;

public class Exo5 extends Application{
    @Override
    public void start(Stage primaryStage)  throws Exception  {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/Exo5.fxml"));
        Scene scene = new Scene(root, 600, 400);

        primaryStage.setTitle("ComboBox JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();

        root.requestFocus();
    }
}
