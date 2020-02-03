import javafx.scene.image.Image;

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

    public ArrayList<Card> getP1Hand() {
        return p1Hand;
    }

    public ArrayList<Card> getP2Hand() {
        return p2Hand;
    }

    /**
     * This returns the amount of cards in player 1's hand
     */
    public int getNumOfCardsP1()
    {
        return p1Hand.size();
    }

    /**
     * This returns the amount of cards in player 2's hand
     */
    public int getNumOfCardsP2()
    {
        return p2Hand.size();
    }

    /**
     * This method will get the Image of Player 1's top card
     */
    public Image getP1CardImage()
    {
        if (p1Hand.size()>0)
        {
            return p1Hand.get(0).getImage();
        }
        return null;
    }

    /**
     * This method will get the Image of Player 1's top card
     */
    public Image getP2CardImage()
    {
        if (p2Hand.size()>0)
        {
            return p2Hand.get(0).getImage();
        }
        return null;
    }

    /**
     * This method will simulate playing a round or hand of the game of war
     */
    public void playHand(ArrayList<Card> pile)
    {
        if (p1Hand.size()>0 && p2Hand.size()>0)
        {
            //get the value of each card
            int p1CardValue = p1Hand.get(0).getFaceValue();
            int p2CardValue = p2Hand.get(0).getFaceValue();

            //add the Card objects to the pile
            pile.add(p1Hand.remove(0));
            pile.add(p2Hand.remove(0));

            //p1 wins hand
            if (p1CardValue>p2CardValue)
            {
                p1Hand.addAll(pile);
                return;
            }

            //p2 wins hand
            if (p2CardValue>p1CardValue)
            {
                p2Hand.addAll(pile);
                return;
            }

            //We have WAR!!!
            //check if player 1 has enough cards for war
            if (p1Hand.size() < 4)
            {
                p2Hand.addAll(p1Hand);
                p1Hand.clear();
                return;
            }

            if (p2Hand.size() < 4)
            {
                p1Hand.addAll(p2Hand);
                p2Hand.clear();
                return;
            }

            for (int i=1; i<=3; i++)
            {
                pile.add(p1Hand.remove(0));
                pile.add(p2Hand.remove(0));
            }
            playHand(pile);
        }
    }
}
