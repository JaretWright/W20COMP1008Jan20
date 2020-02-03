import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class GameOfWarViewController implements Initializable {

    @FXML private ImageView p1backOfDeckImageView;
    @FXML private ImageView p1CurrentCardImageVIew;
    @FXML private ImageView p2backOfDeckImageView;
    @FXML private ImageView p2CurrentCardImageVIew;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        GameOfWar game = new GameOfWar();

    }
}
