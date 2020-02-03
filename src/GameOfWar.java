import java.util.ArrayList;

public class GameOfWar {

    /**
     * This is the "model" class that defines the rules of the game of war
     */

    //These are instance variables for the players' hands
    ArrayList<Card> p1Hand, p2Hand;

    /**
     * The constructor will create a DeckOfCards and deal 26 cards to each
     * hand
     */
    public GameOfWar()
    {
        p1Hand = new ArrayList<>();
        p2Hand = new ArrayList<>();
        DeckOfCards deck = new DeckOfCards();
        deck.shuffle();

        dealCards(deck);
    }

    /**
     * The goal of this method is to "deal" the cards evenly to each player
     */
    public void dealCards(DeckOfCards deck)
    {
        for (int i=1; i<=52; i++)
        {
            if (i%2==0)
                p2Hand.add(deck.dealTopCard());
            else
                p1Hand.add(deck.dealTopCard());
        }
    }


    /**
     * This method will simulate playing a round or hand of the game of war
     */
    public void playHand(ArrayList<Card> pile)
    {
        if (p1Hand.size()>0 && p2Hand.size()>0)
        {

        }
    }
}
