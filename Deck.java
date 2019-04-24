import java.util.*;
import java.io.*;
import java.util.*;

public class Deck {

  ArrayList<Card> cards;//main Deck
  ArrayList<Card> discard;//keeps track of what is given out so that multiples of the same card are not handed out

  public Card drawCard() {//doesn't need input to draw cards
    Card c = cards.get(0);
    cards.remove(0);//when a card is drawn we remove the card from the deck
    discard.add(c);//the card taken is put in the discard pile so that it is not given out again
    return c;//return value matches with the method and returns a card object
  }

  public void reset() {//adds everything in discard back into the main Deck
    cards.addAll(discard);
    discard.clear();//clears discard to fully reset Cards and Discard
  }

  public void shuffle() {
    Random r = new Random();//using a random object r to create an int stream (stream of integers) that are all distinct and in an array
    ArrayList<Card> shuffled = new ArrayList<Card>();

    int[] ar = r.ints(100000, 0, 52).distinct().toArray();//large number 5200 is how many times it randomly chooses a number from 0 to 52
    for (int i = 0; i < 52; i ++) {
      shuffled.add(cards.get(ar[i]));
    }
    cards = shuffled;
  }

  public Deck() {
    cards = new ArrayList<Card>();
    discard = new ArrayList<Card>();

    for (int i = 1; i <= 13; i++) {
      for (int j = 1; j <= 4; j++) {
        String num;
        String suit;
        if (i == 11) {
          num = "Jack";
        }
        else if (i == 12) {
          num = "Queen";
        }
        else if (i == 13) {
          num = "King";
        }
        else if (i == 1) {
          num = "Ace";
        }
        else {
          num = Integer.toString(i);
        }
        if (j == 1) {
          suit = "Diamonds";
        }
        else if (j == 2) {
          suit = "Clubs";
        }
        else if (j == 3) {
          suit = "Hearts";
        }
        else {
          suit = "Spades";
        }
        Card c = new Card();
        c.setName(num + " of " + suit);
        c.setValue(i);
        cards.add(c);
      }
    }

  }

}


  /*ArrayList<String> cards;

  public Deck() {
    cards = new ArrayList<String>();
    for (int i = 1; i < 2; i++){
      cards.add ("Ace of Diamonds");
    }
    for (int i = 2; i <= 10; i++){
      cards.add (i + " of Diamonds");
    }
    for (int i = 11; i < 12; i++){
      cards.add ("Jack of Diamonds");
    }
    for (int i = 12 ; i < 13; i++){
      cards.add ("Queen of Diamonds");
    }
    for (int i = 13; i == 13; i++){
      cards.add ("King of Diamonds");
    }
    for (int i = 1; i < 2; i++){
      cards.add ("Ace of Clubs");
    }
    for (int i = 2; i <= 10; i++){
      cards.add (i + " of Clubs");
    }
    for (int i = 11; i < 12; i++){
      cards.add ("Jack of Clubs");
    }
    for (int i = 12 ; i < 13; i++){
      cards.add ("Queen of Clubs");
    }
    for (int i = 13; i == 13; i++){
      cards.add ("King of Clubs");
    }
    for (int i = 1; i < 2; i++){
      cards.add ("Ace of Hearts");
    }
    for (int i = 2; i <= 10; i++){
      cards.add (i + " of Hearts");
    }
    for (int i = 11; i < 12; i++){
      cards.add ("Jack of Hearts");
    }
    for (int i = 12 ; i < 13; i++){
      cards.add ("Queen of Hearts");
    }
    for (int i = 13; i == 13; i++){
      cards.add ("King of Hearts");
    }
    for (int i = 1; i < 2; i++){
      cards.add ("Ace of Spades");
    }
    for (int i = 1; i <= 13; i++){
      cards.add (i + " of Spades");
    }
    for (int i = 11; i < 12; i++){
      cards.add ("Jack of Spades");
    }
    for (int i = 12 ; i < 13; i++){
      cards.add ("Queen of Spades");
    }
    for (int i = 13; i == 13; i++){
      cards.add ("King of Spades");
      }
    }
  }*/
