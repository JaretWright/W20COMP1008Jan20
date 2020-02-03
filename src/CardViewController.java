import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class CardViewController implements Initializable {

//    @FXML private ImageView imageView;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //Create a Card object
        Card card = new Card("ace","spades");

//        //display the Card object
//        imageView.setImage(card.getImage());
    }
}
