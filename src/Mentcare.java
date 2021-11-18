import javafx.application.Application;
import javafx.stage.Stage;

public class Mentcare extends Application {
    private Stage appStage;

    @Override
    public void start(Stage stage) throws Exception {
        appStage = stage;
        appStage.show();
        while (appStage.isShowing()) {}
    }
}
