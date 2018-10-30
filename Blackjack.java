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
    int num = 0;//numbers 2-10
    int face = 0;//face cards (king,queen,jack)
    int ace = 0;//ace card
      for (int i = 0; i < h.size(); i++){
      //h.get(i).getValue();
      if (h.get(i).getValue()>10){
        face = 10;//face cards get new value
        num = num + face;
      }else if (h.get(i).getValue()== 1){
        ace = 11;
        num = num + ace;//ace gets new value
      }else if (h.get(i).getValue()<= 10){
      num = num + h.get(i).getValue();//values 2-10
    }
  }
    return num;//returns numbers
}
  public String nameHand(ArrayList<Card> n) {//using same logic from calculating values but for the names
    Card c;
   String name = "";
      for (int i = 0; i < n.size(); i++){
      n.get(i).getName();
      name = name + n.get(i).getName() + "   ";
    }
      return name;//returns the name of cards
    }

  public static void main(String[] args) {//for the words
    Blackjack b = new Blackjack();//creation of the blackjack object
    while(true){//loop to continue if user wants to play again
      b.d.reset();//resets the deck and shuffles it so that the cards are not in the same order every time
      b.d.shuffle();//shuffles deck so it isn't the same cards every game
      b.userHand.clear();//clears user's hand
      b.compHand.clear();//clears dealer's hand
    System.out.println("Let's play some Blackjack!\n"+"--------------------");//intro
  //loop until bust
    b.userHand.add(b.d.drawCard());//cards dealt to user hand
    b.userHand.add(b.d.drawCard());
    System.out.println("\nHere are your cards:\n" + b.nameHand(b.userHand)+"\n"+ "\nYour total is:\n" + " " + Integer.toString(b.calculateHand(b.userHand))+"\n---------------");//prints users cards and value in total

    b.compHand.add(b.d.drawCard());//cards dealt to dealers hand
    b.compHand.add(b.d.drawCard());
    System.out.println("\nDealer's card:\n" + b.compHand.get(0).getName());//prints dealers cards and value in total


while(b.calculateHand(b.userHand)<=21){//while the user does not bust the game continues

System.out.println("\nHere's your options\n---------------\nHit\nStay\nQuit\n");//prints options
       Scanner input = new Scanner(System.in);//creation of scanner
       String result = input.next();//scanning for user input
//user logic
    if(result.equals("Hit")){
        b.userHand.add(b.d.drawCard());
        System.out.println("Your cards are:\n" + b.nameHand(b.userHand) + " " + "\nYour total is now:\n" + " " + Integer.toString(b.calculateHand(b.userHand))+"\n---------------");//print card names after cards have been drawn
      }else if(result.equals("Stay")){ //if the user enters "Stay" it will break and move to a new loop depending on calculateHand(comphand)'s total
        break;
      }  // exit user loop. start dealer loop
        else if(result.equals("Quit")){
        System.exit(0);//If you want to quit
      }
}
//Dealer Logic
    boolean Bust = false;//a boolean is used so that the game doesn't unescessarily go through the dealer logic
    if (b.calculateHand(b.userHand)>21){
     Bust = true;//if bust is true the game continues to the "win"statements, if false it carries on to dealer logic
}
  if(Bust = false){
      while (b.calculateHand(b.compHand)<= 16){//if the dealer's cards are less than 16 when the user stays the dealer will draw a card
        b.compHand.add(b.d.drawCard());//drawing card to dealer's hand
        System.out.println("Dealer's cards are:\n" + b.nameHand(b.compHand) + " " + "\nDealer's total is now:\n" + " " + Integer.toString(b.calculateHand(b.compHand))+"\n---------------");//printing results
      }
}
//Win statements
      if (b.calculateHand(b.userHand) == 21){//if you get 21 then you win so it automatically prints out that you won
             System.out.println("\nYou win!\n");
          }else if (b.calculateHand(b.compHand) == 21){//if your amount is already equal to 21 or is exactly 21 you win
             System.out.println("Dealer's total was\n"+b.calculateHand(b.compHand)+"\n"+"\nDealer wins, you lose\n");
          }else if (b.calculateHand(b.userHand)> 21){ //if you lose you lose rather than conitnuing
             System.out.println("Dealer's total was\n"+b.calculateHand(b.compHand)+"\n"+"\nDealer wins, you lose\n");
          }else if (b.calculateHand(b.compHand)> 21){ //When the dealer has over 21 you automatically win
             System.out.println("\nYou win!\n");
          }else if (b.calculateHand(b.compHand) > b.calculateHand(b.userHand)){//if the dealer's hand is greather than the user's hand then the dealer wins
            System.out.println("Dealer's total was\n"+b.calculateHand(b.compHand)+"\n"+"\nDealer wins, you lose\n");
          }else if (b.calculateHand(b.compHand) < b.calculateHand(b.userHand)){//if the dealer's hand is less than the user's hand the user wins
            System.out.println("Dealer's total was\n"+b.calculateHand(b.compHand)+"\n"+"\nYou win!\n");
          }else if (b.calculateHand(b.compHand) == b.calculateHand(b.userHand)){//if the dealer and the user get the same amount (though this is highly unlikely) they will tie
             System.out.println("Dealer's total was\n"+b.calculateHand(b.compHand)+"\n"+"\nIt's a tie!\n");//if you and the dealer have the same amount you tie
           }
           System.out.println("\nDo you want to play again?\n---------------\nYes\nNo");
                Scanner input = new Scanner(System.in);
                String result = input.next();

                 if (result.equals("No")){
                   break;
                 }
                   //Game ends if user says no if yes while loop starts over
                   if (result.equals("no")){
                     break;//in case you type in lower case
                 }

         }

        }

      }
