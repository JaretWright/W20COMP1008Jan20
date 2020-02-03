import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class GameOfWarViewController implements Initializable {

    @FXML private Label p1CardCountLabel;
    @FXML private Label p2CardCountLabel;
    @FXML private ImageView p1backOfDeckImageView;
    @FXML private ImageView p1CurrentCardImageVIew;
    @FXML private ImageView p2backOfDeckImageView;
    @FXML private ImageView p2CurrentCardImageVIew;
    private GameOfWar game;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        game = new GameOfWar();
        p1backOfDeckImageView.setImage(new Image("./images/backOfCard.png"));
        p2backOfDeckImageView.setImage(new Image("./images/backOfCard.png"));

        p1CardCountLabel.setText("P1 Card Count: "+game.getNumOfCardsP1());
        p2CardCountLabel.setText("P2 Card Count: "+game.getNumOfCardsP2());

    }
}
