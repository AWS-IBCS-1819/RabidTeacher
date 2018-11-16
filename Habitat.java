import java.util.*;
import java.io.*;

public class Habitat{

  String region;
  String leader;

  public void setName(String r) {
    region = r;
    }

     public void setValue(String l) {
       leader = l;
     }
     public String getRegion() {
       return region;
     }
     public String getLeader() {
       return leader;
     }

     public Habitat(String r,String l) {
       region = r;
       leader = l;
     }
   }
