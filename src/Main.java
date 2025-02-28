import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Exo5 exo1 = new Exo5();
        exo1.start(primaryStage);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
