import java.util.*;
import java.io.*;

public class Animal{//like deck

 String name;
 String element;


   public void setName(String n) {
     name = n;
   }

   public void setValue(String k) {
     element = k;
   }

   public String getName() {
     return name;
   }

   public String getElement() {
     return element;
   }

   public Animal(String n,String k) {
     name = n;
     element = k;
   }
 }
