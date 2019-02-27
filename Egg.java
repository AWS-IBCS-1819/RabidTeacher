import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Egg extends Frame implements WindowListener, ActionListener{

  Button b;//receipt

  Checkbox fry;//check boxes for the dishes you want
  Checkbox scram;
  Checkbox boil;
  Checkbox poach;
  Label Choices;//label for the choicebox

  Checkbox b3;//like
  Checkbox b4;//dislike
  CheckboxGroup likes;//group so you can't like and dislike at the same time


  TextField name = new TextField();//where to type name
  Label names = new Label();
  TextField deli = new TextField();//type delivery instructions
  Label delis = new Label();

  Image image = new ImageIcon("Egg3.jpg").getImage();//background image
  Image image2 = new ImageIcon("eggboy2.jpg").getImage();//egg man
  Label Man;//label for egg man

  Choice extra;//extras
  Label Extras;//label for extras


  StringBuilder pur;//stringbuilder for the choices
  StringBuilder ex;//stringbuilder for the extras

  private Double total = 0.00;//total deals with cents so it has to be double


  public Egg(String title) {

      super(title);
      setLayout(null);//since it's null I have to set everythings location
      addWindowListener(this);

      add(name);//name box and values
      name.setBackground(Color.yellow);//setting the color
      name.addActionListener(this);//adding action listener
      name.setBounds(475,90,200,50);//settting the location

      names = new Label(" Name");//label for names box
      add (names);
      names.setBounds (550,70,45,20);

      add(deli);//delivery text box and values
      deli.setBackground(Color.yellow);
      deli.addActionListener(this);
      deli.setBounds(900,90,200,200);

      delis = new Label("   Delivery Instructions");//label for delivery box
      add(delis);//adding to frame
      delis.setBounds(925,70,145,20);

      b = new Button("Get Receipt");//get reciept button with values
      add(b);//adding to frame
      b.addActionListener(this);
      b.setBackground(Color.yellow);
      b.setBounds(535,500,120,25);


      fry = new Checkbox("Fried Egg $1.00",false);//fried egg checkbox set to false so it does not appear true when opened
      add(fry);//adding to frame
      fry.setBackground(Color.yellow);//yellow
      fry.setBounds(25,90,300,110);//setting the location
      scram = new Checkbox("Scrambled Egg $2.50",false);//scrambeled checkbox
      add(scram);//adding to frame
      scram.setBackground(Color.yellow);
      scram.setBounds(25,250,300,110);
      boil = new Checkbox("Boiled Egg $2.00",false);//boiled checkbox
      add(boil);//adding to frame
      boil.setBackground(Color.yellow);
      boil.setBounds(25,410,300,110);
      poach = new Checkbox("Poached Egg $3.00",false);//poached checkbox
      add(poach);//adding to frame
      poach.setBackground(Color.yellow);
      poach.setBounds(25,570,300,110);
      Choices = new Label("Choices");//label for choices lsited above
      add(Choices);//adding to frame
      Choices.setBounds(130,70,50,20);//loaction

      extra = new Choice();//extras for egg
      add(extra);
      extra.setBackground(Color.yellow);
      extra.add("None");//if you don't want to get an extra the "None" option gives you nothing extra
      extra.add("Salt");//adds salt
      extra.add("Pepper");//adds pepper
      extra.add("Cheese");//adds cheese
      extra.add("Souls");//adds Souls
      extra.setBounds(475,310,100,25);//location of choice
      Extras = new Label(" Eggstra Extras $0.10");//label for extras
      add(Extras);//adding to frame
      Extras.setBounds(475,290,225,20);//setting label bounds

      likes = new CheckboxGroup();//checkbox group for likes and dislikes so that you can only pick one

      b3 = new Checkbox("Like",likes,false);//Like checkbox
      add(b3);//adding to frame
      b3.setBackground(Color.blue);
      b3.setForeground(Color.white);
      b3.setBounds(800,620,120,25);

      b4 = new Checkbox("Dislike",likes,false);//dislike checkbox
      add(b4);//adding to frame
      b4.setBackground(Color.red);
      b4.setBounds(1060,620,120,25);

      Man = new Label("This is our prized egg, like for a special surprise");//label for the egg man
      Man.setBounds(800,350,350,20);//label location
      add(Man);//adding to frame


}

  public void paint(Graphics g){//creating the images on the frame
   g.drawImage(image, 0,0,null);//background image
   g.drawImage(image2, 800,370,null);//man image
 }

  public static void main(String[] args) {//Egg Window for all of the buttons ad stuff
    Egg myWindow = new Egg("Egg");
    myWindow.setSize(1280,900);//window size
    myWindow.setVisible(true);//it is visible
          }

  public void actionPerformed(ActionEvent e) {
    pur = new StringBuilder();//string builder for main egg options
    ex = new StringBuilder();//stringbuilder for the extras


    if(extra.getSelectedItem() == "None"){//if you choose none nothing happens, techincally doesn't have to be here, but I thought it logically made sense
      total = total;
    }else if(extra.getSelectedItem() == "Salt"){//if you choose salt it adds it to the stringbuilder
        total = total + 0.10 ;//adding 0.10 to all totals
        ex.append(extra.getSelectedItem()+" $0.10");//stringbuilder
      }else if(extra.getSelectedItem() == "Pepper"){
        total = total + 0.10;
        ex.append(extra.getSelectedItem()+" $0.10");//addition to stinrgbuilder
      }else if(extra.getSelectedItem() == "Cheese"){
        total = total + 0.10;
        ex.append(extra.getSelectedItem()+"$0.10");//addisiton to stringbuilder
      }else if(extra.getSelectedItem() == "Souls"){
        total = total + 0.10;
        ex.append(extra.getSelectedItem()+"$0.10");//addition to stringbuilder
      }
      if (fry.getState()) {//if the fried egg option is chosen it adds $1 to total
          total = total + 1.00;
          pur.append("\nFried egg $1.00"+"\n");//adding to stringbuilder
      }
      if (scram.getState()) {//if the scrambeled egg option is chosen it adds $2.50 to total
        total = total + 2.50;
        pur.append("\nScrambled egg $2.50"+"\n");//adding to strinbuilder
      }
      if (boil.getState()) {//if the boiled egg option is chosen it adds $2.00 to total
        total = total + 2.00;
        pur.append("\nBoiled egg $2.00"+"\n");//adding tos tringbuilder
      }
      if (poach.getState()) {//if the poached egg option is chosen it adds $3.00 to total
        total = total + 3.00;
        pur.append("\nPoached egg $3.00"+"\n");//adding to stringbuilder
      }
      if(b4.getState()){//if you dislike the egg man's picture it adds $50 to your total
        total = total + 50.0;
        pur.append("\nYou have angered the egg man he has added $50 to your total\n");//text explaining
      }else if (b3.getState()){//if you like the picture you get your eggs for free
        total = 0.0;
        pur.append("\nThe the egg man blesses you with free egg\n");//text explaining
      }
      if (e.getSource() == b){//creating the receipt
          Frame Receipt = new Frame("Receipt");
          Receipt.setSize(480,500);//size
          Receipt.setBackground(Color.white);//color
          Receipt.setVisible(true);
          TextArea words = new TextArea();//text area so that it gets spaced out correctly unlike with a textfield
          Receipt.add(words);//adding receipt to the frame
          words.setText("Name: "+ name.getText() +"\n" + "Delivery Instructions: " + deli.getText() + "\n" + pur.toString() + "\n" + ex.toString() + "\n" + "Your total is: $" + total+"0" );//the receipt
          words.setBounds(0,0,480,700);//location of the text area

      }

}
      public void windowClosing(WindowEvent e) {//so it closes
              dispose();
              System.exit(0);

      }

      public void windowOpened(WindowEvent e) {}//override stuff
      public void windowActivated(WindowEvent e) {}
      public void windowIconified(WindowEvent e) {}
      public void windowDeiconified(WindowEvent e) {}
      public void windowDeactivated(WindowEvent e) {}
      public void windowClosed(WindowEvent e) {}

}
