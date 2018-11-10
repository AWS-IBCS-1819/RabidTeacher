import java.util.*;
import java.io.*;


public class Habitat{

  String poke;
  String type;

  public void setName(String n) {
    poke = n;
  }

  public void setValue(String v) {
    type = v;
  }

  public String getName() {
    return poke.toString();
  }

  public String getValue() {
    return type.toString();
  }

  public Habitat() {
    poke = "";
    type = "";
  }
}
