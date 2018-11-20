import java.util.*;
import java.io.*;

public class Zoo {

//public Zoo(){
public static void main(String[] args) {
  while (true){
  ArrayList<String> name = new ArrayList<String>();
  ArrayList<String> element = new ArrayList<String>();
  ArrayList<String> buildWaste = new ArrayList<String>();
  ArrayList<String> leader = new ArrayList<String>();
  ArrayList<String> region = new ArrayList<String>();
  ArrayList<String> buildWaste2 = new ArrayList<String>();

  try {
    File text = new File("Pokemon.txt");
    Scanner sn = new Scanner(text); // read the text-file

  while (sn.hasNext()) {
    String temp2 = sn.next();
    if (temp2 == null){
      break;
    }
    name.add(temp2);
    buildWaste.add(sn.next());
    element.add(sn.next());
    }
  }
  catch (FileNotFoundException e) { // if the file is not found, shows an error
    e.printStackTrace();
    }

    try {
      File text = new File("Region.txt");
      Scanner sc = new Scanner(text); // read the text-file

    while (sc.hasNext()) {
      String temp = sc.next();
      if (temp == null){
        break;
      }
      leader.add(temp);
      buildWaste2.add(sc.next());
      region.add(sc.next());
      }
    }
    catch (FileNotFoundException e) { // if the file is not found, shows an error
      e.printStackTrace();
      }


Habitat h1 = new Habitat(region.get(0),leader.get(0));
Habitat h2 = new Habitat(region.get(1),leader.get(1));
Habitat h3 = new Habitat(region.get(2),leader.get(2));
Habitat h4 = new Habitat(region.get(3),leader.get(3));
Habitat h5 = new Habitat(region.get(4),leader.get(4));
Habitat h6 = new Habitat(region.get(5),leader.get(5));
Habitat h7 = new Habitat(region.get(6),leader.get(6));
Animal p1 = new Animal(name.get(0),element.get(0));
Animal p2 = new Animal(name.get(1),element.get(1));
Animal p3 = new Animal(name.get(2),element.get(2));
Animal p4 = new Animal(name.get(3),element.get(3));
Animal p5 = new Animal(name.get(4),element.get(4));
Animal p6 = new Animal(name.get(5),element.get(5));
Animal p7 = new Animal(name.get(6),element.get(6));
Animal p8 = new Animal(name.get(7),element.get(7));
Animal p9 = new Animal(name.get(8),element.get(8));
Animal p10 = new Animal(name.get(9),element.get(9));
Animal p11 = new Animal(name.get(10),element.get(10));
Animal p12 = new Animal(name.get(11),element.get(11));
Animal p13 = new Animal(name.get(12),element.get(12));
Animal p14 = new Animal(name.get(13),element.get(13));
Animal p15 = new Animal(name.get(14),element.get(14));
Animal p16 = new Animal(name.get(15),element.get(15));
Animal p17 = new Animal(name.get(16),element.get(16));
Animal p18 = new Animal(name.get(17),element.get(17));
Animal p19 = new Animal(name.get(18),element.get(18));
Animal p20 = new Animal(name.get(19),element.get(19));
Animal p21 = new Animal(name.get(20),element.get(20));


HashMap<String, Animal[]> info = new HashMap<String, Animal[]>();
Animal[] rock =  {p1, p2, p3};
    info.put(h1.getRegion(), rock);//pewter pokemon
Animal[] water =  {p4, p5, p6};
    info.put(h2.getRegion(), water);//cerlean pokemon
Animal[] electric =  {p7, p8, p9};
    info.put(h3.getRegion(), electric );//vermilion pokemon
Animal[] grass =  {p10, p11, p12};
    info.put(h4.getRegion(), grass);//celadon pokemon
Animal[] steel =  {p13, p14, p15};
    info.put(h5.getRegion(), steel );//olivine pokemon
Animal[] normal =  {p16, p17, p18};
    info.put(h6.getRegion(), normal);//petalbirg pokemon
Animal[] fairy =  {p19, p20, p21};
    info.put(h7.getRegion(), fairy);//laverre pokemon



Zoo z = new Zoo();
  System.out.println("\nPlease pick a region you would like to visit\n--------------------------------------------- ");
  System.out.println("Pewter \nCerulean \nVermilion \nCeladon \nOlivine \nPetalburg \nLaverre \nQuit\n");
  Scanner input = new Scanner(System.in);
  String result = input.next();


if (info.containsKey(result)){
  Animal[] pokemon = info.get(result);
  for(int i = 0; i < pokemon.length; i++){
 System.out.println("--" + pokemon[i].getName());
      }
    }else if (result.equals("Quit")){
      System.exit(0);
        }
      }
  }
}
