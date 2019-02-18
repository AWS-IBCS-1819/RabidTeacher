import java.awt.*;
import java.awt.event.*;
import java.awt.Color.*;

public class FunWin extends Frame implements WindowListener,ActionListener {
        TextField text = new TextField(80);

        Button b;
        Button b2;
        Button b3;
        Button b4;
        Button b5;
        Button b6;


        private int numClicks = 0;
        private String choice = "";
        Gradebook2 g;

        public FunWin(String title) {
          super(title);
          setLayout(new FlowLayout());
          setBackground(Color.gray);
          addWindowListener(this);

          g = new Gradebook2("grades.txt");
                add(text);
                b = new Button("Mean Grade");
                add(b);
                b2 = new Button("Top Grade");
                add(b2);
                b3 = new Button("Low Grade");
                add(b3);
                b4 = new Button("Roster");
                add(b4);
                b5 = new Button("Class Name");
                add(b5);
                b6 = new Button("Grade Spread");
                add(b6);

                b.addActionListener(this);
                b2.addActionListener(this);
                b3.addActionListener(this);
                b4.addActionListener(this);
                b5.addActionListener(this);
                b6.addActionListener(this);

                b.setBackground(Color.red);
                b2.setBackground(Color.orange);
                b3.setBackground(Color.yellow);
                b4.setBackground(Color.green);
                b5.setBackground(Color.blue);
                b6.setBackground(Color.magenta);


                }


        public static void main(String[] args) {
                FunWin myWindow = new FunWin("Buttons Examples");
                myWindow.setSize(750,800);
                myWindow.setVisible(true);
        }

        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == b){
            text.setText(Double.toString(g.meanGrade())) ;
            }
            else if (e.getSource() == b2){
            text.setText(Double.toString(g.topGrade()));//linking to gradebook
            }
            else if (e.getSource() == b3){
            text.setText(Double.toString(g.lowGrade()));//linking to gradebook
            }
            else if (e.getSource() == b4){
            text.setText(g.Roster());//linking to gradebook
            }
            else if (e.getSource() == b5){
            text.setText(g.Class());//linking to gradebook
            }


           if (e.getSource() == b6){
            text.setText(g.gA()+"--A's  "+g.gB()+"--B's  "+g.gC()+"--C's  "+g.gD()+"--D's  "+g.gF()+"--F's");
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
