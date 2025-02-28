import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        Exo4 exo1 = new Exo4();
        exo1.start(primaryStage);
    }

    public static void main(String[] args) {
        launch(args);
    }
}