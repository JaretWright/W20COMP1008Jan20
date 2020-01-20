import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DeckOfCards {
    private ArrayList<Card> deck;

    public DeckOfCards(ArrayList<Card> deck) {
        this.deck = deck;
    }

    /**
     * This constructor should be used when trying to create a standard deck of cards
     */
    public DeckOfCards(){
        deck = new ArrayList<Card>();

        //create 52 Card objects and store in the deck
        List<String> faceNames = Card.getAllFaceNames();
        List<String> suits = Card.getValidSuits();

        for (String suit : suits)
        {
            for (String faceName : faceNames)
                deck.add(new Card(faceName, suit));
        }
    }

    /**
     * This method will display the deck to the console
     */
    public void displayDeck()
    {
        for (Card card:deck)
            System.out.println(card);
    }

    /**
     * This method will shuffle the order of the Card objects in the deck
     */
    public void shuffle()
    {
        Collections.shuffle(deck);
    }

    /**
     * This method will return a Card from the top of the deck.  If the deck
     * is empty, it will return NULL
     */
    public Card dealTopCard()
    {
        if (deck.size()>0)
            return deck.remove(0);
        else
            return null;
    }
}
