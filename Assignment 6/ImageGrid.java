import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class ImageGrid extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane pane = new GridPane();

        pane.add(new ImageView(new Image("images/uk.gif")), 0, 0);
        pane.add(new ImageView(new Image("images/ca.gif")), 1, 0);
        pane.add(new ImageView(new Image("images/china.gif")), 0, 1);
        pane.add(new ImageView(new Image("images/us.gif")), 1, 1);

        Scene scene = new Scene(pane);
        primaryStage.setScene(scene); 
        primaryStage.show(); 
    }
}
