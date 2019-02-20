import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//gets you

public class Gottem extends Frame implements WindowListener, ActionListener {

      Button b;
      Button b2;
      private int numClicks = 0;
      TextField t = new TextField(40);
      Image image = new ImageIcon("gottem.png").getImage();


  public Gottem(String title) {

      super(title);
      setLayout(new FlowLayout());
      addWindowListener(this);
      add(t);


      b2 = new Button("really cool button wink wink");
      add(b2);
      b2.addActionListener(this);
      b2.setBackground(Color.green);
      b2.setForeground(Color.blue);
      setBackground(Color.magenta);
}
 public void paint(Graphics g){
g.drawImage(image, 0,150,null);
        }

  public static void main(String[] args) {
      Gottem myWindow = new Gottem("Button");
      myWindow.setSize(370,120);
      myWindow.setVisible(true);

          }
  public void actionPerformed(ActionEvent e) {
  if (e.getSource() == b2){
      Gottem myWindow = new Gottem("Gottem");
      myWindow.setSize(370,500);
      myWindow.setVisible(true);
      
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
