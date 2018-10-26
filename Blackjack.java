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
    Card c;
    //value = public Integer getValue();
    int num = 0;
    int face = 0;
      for (int i = 0; i < h.size(); i++){
      //h.get(i).getValue();
      if (h.get(i).getValue()>10){
        face = 10;
        num = num + face;
      }else if (h.get(i).getValue()<= 10){
      num = num + h.get(i).getValue();
    }
  }
  return num;
}
  public String nameHand(ArrayList<Card> n) {//calculating values/ math of game
    Card c;
   String name = "";
      for (int i = 0; i < n.size(); i++){
      n.get(i).getName();
      name = name + n.get(i).getName() + "   ";
    }
      return name;
 }

  public static void main(String[] args) {//for the words

    Blackjack b = new Blackjack();//creation of the black jack object


    System.out.println("Let's play some Blackjack!\n"+"--------------------");//intro

    b.d.reset();//resets the deck and shuffles it so that the cards are not in the same order every time
    b.d.shuffle();


  //loop until bust
    b.userHand.add(b.d.drawCard());//cards dealt to user hand
    b.userHand.add(b.d.drawCard());
    System.out.println("\nHere are your cards:\n" + b.nameHand(b.userHand)+"\n"+ "\nYour total is:\n" + " " + Integer.toString(b.calculateHand(b.userHand))+"\n---------------");//prints users cards and value in total

    b.compHand.add(b.d.drawCard());//cards dealt to dealers hand
    b.compHand.add(b.d.drawCard());
    System.out.println("\nDealer's cards:\n" + b.nameHand(b.compHand) +"\n"+ "\nDealer's total:\n" + " " + Integer.toString(b.calculateHand(b.compHand)));//prints dealers cards and value in total



    int i = b.calculateHand(b.compHand);



    /*if (i == 21){//if you get 21 then you win so it automatically prints out that you won
      System.out.println("You win!");
      }else if (i > 21){ //if you lose you lose rather than conitnuing
        System.out.println("Dealer wins, you lose");*/
while(b.calculateHand(b.userHand)<=21){

System.out.println("\nHere's your options\n---------------\nHit\nStay\nQuit\n");//prints options
       Scanner input = new Scanner(System.in);
       String result = input.next();

    if(result.equals("Hit")){
        b.userHand.add(b.d.drawCard());
        System.out.println("Your cards are:\n" + b.nameHand(b.userHand) + " " + "\nYour total is now:\n" + " " + Integer.toString(b.calculateHand(b.userHand))+"\n---------------");//print card names after cards have been drawn
      }else if(result.equals("Stay")){ //if the user enters "Stay" a card will be added to the Dealer's hand
        break;
      }  // exit user loop. start dealer loop
        else if(result.equals("Quit")){
        System.exit(0);
      }
}

//Dealer Logic
      if (b.calculateHand(b.compHand)<= 16){
        b.compHand.add(b.d.drawCard());
        System.out.println("Dealer's cards are:\n" + b.nameHand(b.compHand) + " " + "\nDealer's total is now:\n" + " " + Integer.toString(b.calculateHand(b.compHand))+"\n---------------");
}

      if (b.calculateHand(b.userHand) == 21){//if you get 21 then you win so it automatically prints out that you won
             System.out.println("\nYou win!\n");
             System.exit(0);
           }
       if (b.calculateHand(b.compHand) == 21){
             System.out.println("\nDealer wins, you lose\n");
             System.exit(0);
           }
       if (b.calculateHand(b.userHand)> 21){ //if you lose you lose rather than conitnuing
             System.out.println("\nDealer wins, you lose\n");
             System.exit(0);
           }
      if (b.calculateHand(b.compHand)> 21){ //When the dealer has over 21 you automatically win
             System.out.println("\nYou win!\n");
             System.exit(0);
           }
      if (b.calculateHand(b.compHand) > b.calculateHand(b.userHand)){
            System.out.println("\nDealer wins, you lose\n");
            System.exit(0);
           }
      if (b.calculateHand(b.compHand) < b.calculateHand(b.userHand)){
            System.out.println("\nYou win!\n");
            System.exit(0);
           }
      if (b.calculateHand(b.compHand) == b.calculateHand(b.userHand)){
             System.out.println("\nIt's a tie!\n");
             System.exit(0);
           }

        }
      }














//dealer logic if < 16 draw if greater break value > 16
//player logic if < 16 draw else stay
