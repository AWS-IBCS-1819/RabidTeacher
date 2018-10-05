
import java.util.*;
import java.io.*;

public class Reverse {
//using a loop
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    String word = scan.nextLine();

    for (int i = word.length()-1; i>=0;i--)
      System.out.print(word.charAt(i));

  }
//using a recursion (this took me a solid hour)

  public static void main(String[] args) {
       String word;

       Scanner scan = new Scanner(System.in);
       word = scan.nextLine();
       String reversed = reverse(word);
       System.out.println(reversed);
   }

   public static String reverse(String word)
   {
       if (word.isEmpty()){
           return word;
         }
      else {
        return reverse(word.substring(1)) + word.charAt(0);
   }
 }
}
