

import java.io.*;
import java.util.*;

public class Gradebook2{
  //instance variables out of anything being outputted
  StringBuilder classN;
  StringBuilder sNames;
  StringBuilder empt;
  StringBuilder grd;

  Double top;
  Double low;
  Double avg;

  int numA;
  int numB;
  int numC;
  int numD;
  int numF;



  public Gradebook2(String gradeFile) {
     classN = new StringBuilder();//when it's an instance variable it doesn't need the "double"phrase at the beginning
     sNames = new StringBuilder();
     empt = new StringBuilder();
     grd = new StringBuilder();

    try {
      File file = new File(gradeFile);
      Scanner fRead = new Scanner(file);

      for (int i = 0; i < 5; i++) {
        classN.append(fRead.next() + " ");
      }

      while (fRead.hasNext()) { //checks to see if our file is empty
        sNames.append(fRead.next() + " ");
        sNames.append(fRead.next() + "\n");
        empt.append(fRead.next());
        grd.append(fRead.next());
        //count++;
      }
    }
    catch (FileNotFoundException e) {
      e.printStackTrace();
    }

    int count = 0;
    top = 0.0;
    low = 100.0;
    Double sum = 0.0;

    numA = 0;
    numB = 0;
    numC = 0;
    numD = 0;
    numF = 0;

    for (int i = 0; i < grd.length(); i = i+5) {
      count++;
      Double temp = Double.parseDouble(grd.substring(i, i+4));
      sum = sum + temp;

      if (temp > top) {
        top = temp;
      }
      if (temp < low) {
        low = temp;
      }
      if (temp >= 90.0) {
        numA++;
      }
      else if (temp >= 80.0) {
        numB++;
      }
      else if (temp >= 70.0) {
        numC++;
      }
      else if (temp >= 60) {
        numD++;
      }
      else {
        numF++;
      }
    }
    avg = sum/count;
}


    public Double meanGrade(){
      return avg;
    }
    public Integer gA(){
      return numA;
    }
    public Integer gB(){
      return numB;
    }
    public Integer gC(){
      return numC;
    }
    public Integer gD(){
      return numD;
    }
    public Integer gF(){
      return numF;
    }
    public Double topGrade(){
      return top;
    }
    public Double lowGrade(){
      return low;
    }
    public String Roster(){
      return sNames.toString();
    }
    public String Class(){
      return classN.toString();
    }

/*
    while (true) {
      //this is what will be changed
      System.out.println("What would you like to know about the class?");
      System.out.println("1) Mean Grade\n2) Grade Spread\n3) Top Grade\n" +
      "4) Lowest Grade\n5) Class Subject and Teacher\n6) Student Roster\n" +
      "7) Exit");
      Scanner userIn = new Scanner(System.in);
      String response = userIn.next();

      if (response.equals("1")) {//if responses will turn into buttons
        System.out.println("The mean grade is: " + Double.toString(avg) + "%");//turns into action performed
      }
      else if (response.equals("3")) {
        System.out.println("The highest grade is: " + Double.toString(top) + "%");
      }
      else if (response.equals("4")) {
        System.out.println("The lowest grade is: " + Double.toString(low) + "%");
      }
      else if (response.equals("2")) {
        System.out.println("The grade spread is:\n" + Integer.toString(numA) + " A's");
        System.out.println(Integer.toString(numB) + " B's");
        System.out.println(Integer.toString(numC) + " C's");
        System.out.println(Integer.toString(numD) + " D's");
        System.out.println(Integer.toString(numF) + " F's");
      }
      else if (response.equals("5")) {
        System.out.println("Here is the class subject and teacher: \n");
        System.out.println(classN);
      }
      else if (response.equals("6")) {
        System.out.println("Here is the class roster: \n");
        System.out.println(sNames);
      }
      else if (response.equals("7")) {
        break;
      }
      else {
        System.out.println("Please try again with input that matches a number between 1 and 6");
      }
      System.out.println("\n===========******===========\n");
      }

    }*/

}
