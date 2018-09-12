import java.util.*;

public class AboutMe{

  public static String Birthday; // static means it won't change
  public static String BirthPlace;//if numbers were the answer Integer could be used instead of String
  public static String Patronus;
  public static String RoomMate;
  public static String DormGroup;
  public String Pets; //where variables are created
  public String Pokemon;//without static statement makes it mutable

  public AboutMe(){
    Birthday = "December 3rd 1999";
    BirthPlace = "China";
    Patronus = "Robin";
    RoomMate = "Nobody";
    DormGroup = "Orion";
    Pets = "None";
    Pokemon = "Garchomp"; //assigning names to variables
}

public static void main(String[] args) {

  AboutMe Katty = new AboutMe(); //constructor/organization method
  Scanner kattyIn = new Scanner (System.in); //creation of scanner

}
}
