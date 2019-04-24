import java.util.*;
public class Hash{
public static void main(String[] args) {

Scanner reader = new Scanner(System.in);
System.out.println("Enter a number (five digits): ");
int num = reader.nextInt();
reader.close();

    //public static int[] IntToIntArray(int num){
String digs = Integer.toString(num);
  ArrayList<Character> digits = new ArrayList<Character>();
      for (char c : digs.toCharArray()) {
          digits.add(c);
          int has = Integer.parseInt(c);
          has = has * 3;

        }



  System.out.println(has);



  }
}
