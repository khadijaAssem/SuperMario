package sample;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class Controller {
    @FXML
    private ImageView MarioRight;
    @FXML
    private ImageView MarioLeft;

    @FXML
    public void runningForward() {
        MarioLeft.setVisible(false);
    }
}
