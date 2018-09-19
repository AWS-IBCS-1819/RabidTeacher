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
          Build.append(temp + " ");
        }
      }

    catch(FileNotFoundException e) {
      e.printStackTrace();
    }

    System.out.println(Build);
    int numO = 0;
    for (int i = 0; i < Build.length() -7; i = i + 1){
        if (Build.substring(i, i + 7).equals("Dorothy")){//i stands for index
          System.out.println(Build.substring(i, i + 7));
          numO = numO + 1; //can also be written as numO++
        }
        else if (Build.substring(i, i + 3).equals("END")){
          break;
        }
    }
 System.out.println(Integer.toString(numO));

  }
}
