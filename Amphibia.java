
public class Amphibia {

 public String thinskin;
 public String glandular;
 public String magid;
 public String tetrapods;

//construction of amphibia
 public Amphibia (String startThinskin, String startGlandular, String startMagid, String startTetrapods) {
   thinskin = startThinskin;
   glandular = startGlandular;
   magid = startMagid;
   tetrapods = startTetrapods;
 }
//things inherited in the axolotl but are part of amphibia in general (methods/actions)
 public void setThinskin (String newName) {
   thinskin = newName;
 }

 public void setGlandular (String newName) {
   glandular = newName;
 }

 public void setMagid (String newName)  {
   magid = newName;
 }

 public void setTetratpods (String newName) {
   tetrapods = newName;
 }

}
