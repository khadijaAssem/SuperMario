package sample;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class Main extends Application {

    Controller controller = new Controller();

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");

        Scene scene = new Scene(root, 675, 431);
        primaryStage.setScene(scene);

        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                System.out.print("KK");
                switch (event.getCode()) {
//                    case UP:    goNorth = true; break;
//                    case DOWN:  goSouth = true; break;
//                    case LEFT:  goWest  = true; break;
                    case RIGHT: controller.runningForward();
//                    case SHIFT: running = true; break;
                }
            }
        });

        scene.setOnKeyReleased(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                switch (event.getCode()) {
//                    case UP:    goNorth = false; break;
//                    case DOWN:  goSouth = false; break;
//                    case LEFT:  goWest  = false; break;
//                    case RIGHT: goEast  = false; break;
//                    case SHIFT: running = false; break;
                }
            }
        });

        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }

}
