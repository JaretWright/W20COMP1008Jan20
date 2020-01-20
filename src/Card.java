import javafx.scene.image.Image;

import java.util.Arrays;
import java.util.List;

public class Card {
    //these are "instance variables".  When an object is created
    //these should be given initial, valid values
    private String suit, faceName;
    private int faceValue;
    private Image image;

    /**
     * This constructor accepts a Card's suit and face name to configure the card
     * The goal of the constructor is to initialize the Card object with valid values
     * for each of the instance variables
     * @param suit can be hearts, diamonds, spades or clubs
     * @param faceName can be 2,3,4,5,6,7,8,9,10,jack,queen,king or ace
     */
    public Card(String faceName, String suit) {
        setSuit(suit);
        setFaceName(faceName);
        String fileName = faceName + "_of_" + suit +".png";
        image = new Image("./images/"+fileName);
    }

    public Image getImage() {
        return image;
    }

    public String getSuit() {
        return suit;
    }

    /**
     * This method will return a list of valid suit options for a Card object
     */
    public static List<String> getValidSuits()
    {
        return Arrays.asList("hearts","diamonds","spades","clubs");
    }

    /**
     * This method will validate that argument is hearts, spades, diamonds or clubs and set
     * the instance variable
     * @param suit hearts, diamonds, spades, clubs
     */
    public void setSuit(String suit) {
        List validSuits = getValidSuits();
        suit = suit.toLowerCase();

        if (validSuits.contains(suit))
            this.suit = suit;
        else
            throw new IllegalArgumentException("valid suits are hearts, diamonds,clubs or spades");
    }

    public String toString()
    {
        return String.format("%s of %s", faceName, suit);
    }
    public String getFaceName() {
        return faceName;
    }

    /**
     * This method returns a List with all valid face names
     */
    public static List<String> getAllFaceNames()
    {
        return Arrays.asList("2","3","4","5","6","7","8","9","10","jack",
                "queen","king","ace");
    }

    /**
     * This method will validate the faceName and set the instance variable
     * @param faceName 2,3,4,5,6,7,8,9,10,jack,queen,king,ace
     */
    public void setFaceName(String faceName) {
        faceName=faceName.toLowerCase();
        List validFaceNames = getAllFaceNames();
        if (validFaceNames.contains(faceName)){
            this.faceName = faceName;
            setFaceValue();
        }
        else
            throw new IllegalArgumentException("face name must be 2,3,4,5,6,7,8,9,10,jack,queen,king or ace");
    }

    public int getFaceValue() {
        return faceValue;
    }

    private void setFaceValue() {
        List validFaceNames = Arrays.asList("2","3","4","5","6","7","8","9","10","jack",
                "queen","king","ace");
        this.faceValue = validFaceNames.indexOf(faceName)+2;
    }
}