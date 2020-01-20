import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        //Create a DeckOfCards
        //class name   variable name    calling the constructor
        Scanner        keyboard       = new Scanner(System.in);
        Card           aceOfSpades    = new Card("ace","spades");
        DeckOfCards    deck           = new DeckOfCards();

        //Display all the cards to the screen
        deck.displayDeck();

        //shuffle the deck and display the cards in the new order
        deck.shuffle();
        System.out.println("\nAfter the shuffle:");
        deck.displayDeck();

        //your goal is:
        //in the DeckOfCards class, create a method to "deal" the top card from the deck.
        //hint:  ArrayList has a method called remove( index ) that returns the card from
        //       the specified index position.  Don't forget to protect against if
        //       the deck is empty

        //Here in the main method, deal 2 hands of Card objects.  5 Card objects per hand.
    }
}
