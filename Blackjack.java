import java.util.*;

public class Blackjack {

  Deck d;
  ArrayList<Card> userHand;
  ArrayList<Card> compHand;

  public Blackjack() {//process of blakjack
    d = new Deck();
    userHand = new ArrayList<Card>();
    compHand = new ArrayList<Card>();
    //deck, computer hand and your hand


}
  public Integer calculateHand(ArrayList<Card> h) {//calculating values/ math of game

    int num = 0;
      for (int i = 0; i < h.size(); i++){
      num = num + i;
    }
      return num;
  }

  public static void main(String[] args) {//for the words

    Blackjack b = new Blackjack();

    System.out.println("Let's play some Blackjack");
    System.out.println("Here are your cards");
    b.d.reset();
    b.d.shuffle();
    b.userHand.add(b.d.drawCard());
    b.userHand.add(b.d.drawCard());
    //System.out.println();//for cards
    Scanner input = new Scanner(System.in);
    String result = input.next();

    if(result.equals("Hit")){
        b.userHand.add(b.d.drawCard());
      //System.out.println(userHand);//print card names
    } else if (result.equals("Stay")){
      //code to draw card for dealer
      System.out.println("Stay");//print card names of dealer
    } else if (result.equals("Quit")){
      System.exit(0);
  }
  /*if (i == 21){//if you get 21 then you win so it automatically prints out that you won
    System.out.println("You win!");
    }
    else if (i > 21){ //if you lose you lose rather than conitnuing
      System.out.println("Dealer wins, you lose D:");
    }*/

  }
}
