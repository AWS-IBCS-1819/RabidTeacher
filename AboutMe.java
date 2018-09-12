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

  AboutMe katty = new AboutMe(); //constructor/organization method
  System.out.println("About Katty");//basic text

  Scanner kattyIn = new Scanner (System.in); //creation of scanner
  String personIn = kattyIn.next();//tells scanner what to do

  if(personIn.equals("birthday")){
    System.out.println("Katty's birthday is " + katty.Birthday);
    }
  else if(personIn.equals("pokemon")){
    System.out.println("Katty's favorite pokemon is " + katty.Pokemon);
    }
  else if(personIn.equals("room mate")){
    System.out.println("Katty's room mate is " + katty.RoomMate);
    }
  else if(personIn.equals("dorm group")){
    System.out.println("Katty's dorm group is " + katty.DormGroup);
    }
  else if(personIn.equals("pets")){
    System.out.println(katty.Pets);
    }
  else if(personIn.equals("patronus")){
    System.out.println("Katty's patronus is " + katty.Patronus);
    }
    else if(personIn.equals("birth place")){
      System.out.println("Katty's was born in " + katty.BirthPlace);
      }
else System.out.println("We don't know this yet, but here's a joke Q: Why don't cannibals eat clowns? A: Because they taste funny");
  }
}
