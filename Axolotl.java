public class Axolotl extends Amphibia{//inherits from amphibia

public String thickarms;//these are strings specific to axolotl and are not inherited from amphibia
public String featherygills;
public String shortlimbs;


public Axolotl (//constuction of axolotl
    String startThinskin,
    String startGlandular,
    String startMagid,
    String startTetrapods,//these are the strings inherited from amphibia
    String startThickarms,
    String startFeatherygills,
    String startShortlimbs){
super(startThinskin, startGlandular, startMagid, startTetrapods);//superclass things being addded like above to make the axolotl
   thickarms = startThickarms;
   featherygills = startFeatherygills;
   shortlimbs = startShortlimbs;
 }

public void setThickarms(String newName){//set names for new variables
  thickarms = newName;
}
public void setFeatherygills(String newName){
  featherygills = newName;
}
public void setShortlimbs(String newName){
  shortlimbs = newName;
}
public static void main(String[] args) {
  Axolotl a = new Axolotl("Biggest Loser","Slimy","No scales","4 leg","thickems","flower boy","smol");
  System.out.print(a.thickarms);

}


}
