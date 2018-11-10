import java.util.*;
import java.io.*;

public class Animal{//like deck

  ArrayList<Pokemon> poke;
  ArrayList<Pokemon> type;


public static void main(String[] args) {

  StringBuilder poke = new StringBuilder();
  StringBuilder type = new StringBuilder();
  StringBuilder buildWaste = new StringBuilder();

  try {
    File text = new File("Pokemon.txt");
    Scanner sn = new Scanner(text); // read the text-file

  while (sn.hasNext()) {
    poke.append(sn.next());
    buildWaste.append(sn.next());
    poke.append(" "); // add space for formatting
    poke.append("\n");
    type.append(sn.next());
    type.append(" "); // add space for formatting
    type.append("\n");
  }

System.out.println(poke);
System.out.println(type);

    }
    catch (FileNotFoundException e) { // if the file is not found, shows an error
      e.printStackTrace();
      }

  Habitat h = new Habitat();
  h.setName(poke);
  h.setValue(type);
}
}
