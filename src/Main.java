import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Scanner;

public class Main extends Application {
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
        ArrayList<Card> p1Hand = new ArrayList<>();
        ArrayList<Card> p2Hand = new ArrayList<>();

        //deal 5 Card objects to each player
        for (int i=1; i<=5;i++)
        {
            p1Hand.add(deck.dealTopCard());
            p2Hand.add(deck.dealTopCard());
        }

        //display the contents of each players' hand and then we will take a break
        System.out.printf("Player 1's hand: %s%n",p1Hand);
        System.out.printf("Player 2's hand: %s%n",p2Hand);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("CardView.fxml"));
    }
}
