import java.util.*;
import java.io.*;

class Conditions{

  public static void main(String[] args) {

    StringBuilder Build = new StringBuilder();

    try{
      File Oz = new File ("RoadToOz.txt");

      Scanner scan = new Scanner(Oz);

        while (scan.hasNext()){
          String temp = scan.next();
          System.out.println(temp);
          Build.append(temp + " ");
        }
      }

    catch(FileNotFoundException e) {
      e.printStackTrace();
    }

    System.out.println(Build);
  }
}
