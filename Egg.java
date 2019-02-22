import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Egg extends Frame implements WindowListener, ActionListener{

  Button b;//receipt
  Button b2;//enter 1
  Button b3;//enter 2

  Checkbox fry;
  Checkbox scram;
  Checkbox boil;
  Checkbox poach;
  CheckboxGroup food;

  TextField name = new TextField(70);
  TextField deli = new TextField(100);

  Image image = new ImageIcon("Egg3.jpg").getImage();

  Choice extra;
  Choice extra2;

  private String Dish = "";



  private int total = 0;

  public Egg(String title) {

      super(title);
      setLayout(new FlowLayout());
      addWindowListener(this);

      add(name);
      name.setText("Name");
      name.addActionListener(this);

      add(deli);
      deli.setText("Delivery Instructions");
      deli.addActionListener(this);

      b = new Button("Get Receipt");
      add(b);
      b.addActionListener(this);
      b.setBackground(Color.yellow);

      b2 = new Button("Enter");
      add(b2);
      b2.addActionListener(this);
      b2.setBackground(Color.yellow);

      b3 = new Button("Enter");
      add(b3);
      b3.addActionListener(this);
      b3.setBackground(Color.yellow);

      food = new CheckboxGroup();
      fry = new Checkbox("Fried Egg",food,false);
      add(fry);
      scram = new Checkbox("Scrambled Egg",food,false);
      add(scram);
      boil = new Checkbox("Boiled Egg",food,false);
      add(boil);
      poach = new Checkbox("Poach Egg",food,false);
      add(poach);

      extra = new Choice();
      add(extra);
      extra.add("Extras");
      extra.add("Salt");
      extra.add("Pepper");
      extra.add("Cheese");
      extra.add("Souls");

      extra2 = new Choice();
      add(extra2);
      extra2.add("Extras");
      extra2.add("Salt");
      extra2.add("Pepper");
      extra2.add("Cheese");
      extra2.add("Souls");



}

  public void paint(Graphics g){
   g.drawImage(image, 0,0,null);
 }

  public static void main(String[] args) {
    Egg myWindow = new Egg("Egg");
    myWindow.setSize(1000,900);
    myWindow.setVisible(true);
          }

  public void actionPerformed(ActionEvent e) {

      if (e.getSource() == b2){

      }
      if (e.getSource() == b3){

      }
    /*  if (e.getSource() == name){
        name.setText(null);
      }
      if (e.getSource() == deli){
        deli.setText(null);
      }*/
      if (fry.getState()) {//$1
          total = total + 1;
      }
      if (scram.getState()) {//$2
        total = total + 2;
      }
      if (boil.getState()) {//$2
        total = total + 2;
      }
      if (poach.getState()) {//$3
        total = total + 3;
      }
      if (e.getSource() == b){
          //Egg myWindow = new Egg("Receipt");
          //myWindow.setVisible(true);
          setBackground(Color.white);
          TextField receipt = new TextField(20);
          add(receipt);
          receipt.setText("your total is: $" + total);//won't output integers
      }
}
      public void windowClosing(WindowEvent e) {
              dispose();
              System.exit(0);
      }

      public void windowOpened(WindowEvent e) {}
      public void windowActivated(WindowEvent e) {}
      public void windowIconified(WindowEvent e) {}
      public void windowDeiconified(WindowEvent e) {}
      public void windowDeactivated(WindowEvent e) {}
      public void windowClosed(WindowEvent e) {}

}
