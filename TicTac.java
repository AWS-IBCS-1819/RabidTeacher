import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*Notes before hand:
I know that this program does not work and that it will not do what it is supposed to do so
I'm sorry ahead of time for turning in an unfinished project.
I tried a lot of stuff and I'm sure that there are easier ways to go about this and I
probably should have thought through the other options before turning to an idea
I guess you can look at the code to see my ideas and thought process and how I would have wanted the
program to run, but in the end it most likely won't work but I think my ideas used throughout the program are 
still valid*/
public class TicTac extends Frame implements WindowListener, ItemListener{
Image image = new ImageIcon("tictacboard.jpg").getImage();

int[][] grid = {{0,0,0},{0,0,0},{0,0,0}};

//checkboxes
  Checkbox one;
  Checkbox two;
  Checkbox three;
  Checkbox four;
  Checkbox five;
  Checkbox six;
  Checkbox seven;
  Checkbox eight;
  Checkbox nine;
  Checkbox blue;//checkbox for comparison

//creating the objexts and adding the locations of each checkbox
public TicTac(String title) {
  super(title);
  setLayout(null);//since it's null I have to set everythings location
  addWindowListener(this);


  one = new Checkbox();
  add(one);
  one.setBounds(7,25,70,70);
  one.setVisible(true);
  one.addItemListener(this);

  two = new Checkbox();
  add(two);
  two.setBounds(80,25,70,70);
  two.setVisible(true);
  two.addItemListener(this);

  three = new Checkbox();
  add(three);
  three.setBounds(159,25,70,70);
  three.setVisible(true);
  three.addItemListener(this);

  four = new Checkbox();
  add(four);
  four.setBounds(7,105,70,70);
  four.setVisible(true);
  four.addItemListener(this);

  five = new Checkbox();
  add(five);
  five.setBounds(80,105,70,70);
  five.setVisible(true);
  five.addItemListener(this);
  five.addItemListener(this);

  six = new Checkbox();
  add(six);
  six.setBounds(159,105,70,70);
  six.setVisible(true);
  six.addItemListener(this);

  seven = new Checkbox();
  add(seven);
  seven.setBounds(7,180,70,70);
  seven.setVisible(true);
  seven.addItemListener(this);

  eight = new Checkbox();
  add(eight);
  eight.setBounds(80,180,70,70);
  eight.setVisible(true);
  eight.addItemListener(this);

  nine = new Checkbox();
  add(nine);
  nine.setBounds(159,180,70,70);
  nine.setVisible(true);
  nine.addItemListener(this);

  blue = new Checkbox();//you should not see this because it is very far off the screen
  add(blue);
  blue.setBounds(400,400,70,70);
  blue.setVisible(true);
  blue.setBackground(Color.blue);

}

public void paint(Graphics g){//creating the images on the frame
 g.drawImage(image, 0,20,null);//background image
}


public static void main(String[] args) {//Egg Window for all of the Checkboxs ad stuff
  TicTac myWindow = new TicTac("TicTacToe");//picture of tic tac toe board
  myWindow.setSize(236,248);//window size
  myWindow.setVisible(true);//it is visible
        }


public void itemStateChanged(ItemEvent e) {
  if(five.getState()==false){//5
    five.setBackground(Color.blue);
  }


if (one.getState()==true){//1
  if(two.getState()==true){
    if(three.getState()==false){
      if(three.getBackground() != blue.getBackground()){
    three.setBackground(Color.blue);
    }
  }
  }else if(three.getState() == true){
    if(two.getState()==false){
      if(two.getBackground() != blue.getBackground()){
    two.setBackground(Color.blue);
    }
  }
  }else if(four.getState()==true){
    if(seven.getState()==false){
      if(seven.getBackground() != blue.getBackground()){
      seven.setBackground(Color.blue);
    }
  }
  }if(seven.getState()==true){
      if(four.getState()==false){
        if(four.getBackground() != blue.getBackground()){
        four.setBackground(Color.blue);
      }
    }
    }else if(five.getState()==true){
      if(nine.getState()==false){
        if(nine.getBackground() != blue.getBackground()){
        nine.setBackground(Color.blue);
      }
    }
    }if(nine.getState()==true){
      if(eight.getState()==false){
        if(eight.getBackground() != blue.getBackground()){
        eight.setBackground(Color.blue);
      }
      }else if(six.getState()==true){
        if(eight.getState()==false){
          if(eight.getBackground() != blue.getBackground()){
          eight.setBackground(Color.blue);
      }
    }
  }
}else if(three.getState()==true){
          if(eight.getState()==true){
            if(six.getState()==false){
              if(six.getBackground() != blue.getBackground()){
            six.setBackground(Color.blue);
          }
          }else if(six.getState()==true){
            if(four.getState()==false){
              if(four.getBackground() != blue.getBackground()){
            four.setBackground(Color.blue);
            }
          }
          }
        }

    }else if(eight.getState()==true){
      if(two.getState()==false){
        if(two.getBackground() != blue.getBackground()){
        two.setBackground(Color.blue);
      }
      }
    }
  }else if(two.getState()==true){//2
  if(three.getState()==true){
    if(one.getState()==false){
      if(one.getBackground() != blue.getBackground()){
      one.setBackground(Color.blue);
    }
      }
    }
    if(five.getState()==true){
      if(eight.getState()==false){
        if(eight.getBackground() != blue.getBackground()){
      eight.setBackground(Color.blue);
        }
      }
    }else if(seven.getState()==true){
    if(four.getState()==false){
      if(four.getBackground() != blue.getBackground()){
      four.setBackground(Color.blue);
      }
    }
  }else if(four.getState()==true){
    if(one.getState()==false){
      if(one.getBackground() != blue.getBackground()){
      one.setBackground(Color.blue);
      }
    }else if(nine.getState()==true){
    if(seven.getState()==false){
      if(seven.getBackground() != blue.getBackground()){
      seven.setBackground(Color.blue);
      }
    }
  }
}
}else if (three.getState()==true){//3
  if(six.getState()==true){
    if(nine.getState()==false){
      if(nine.getBackground() != blue.getBackground()){
      nine.setBackground(Color.blue);
    }
  }
  }else if(nine.getState()==true){
    if(six.getState()==false){
      if(six.getBackground() != blue.getBackground()){
      six.setBackground(Color.blue);
      }
    }else if(four.getState()==true){
      if(eight.getState()==true){
        if(one.getState()==false){
          if(one.getBackground() != blue.getBackground()){
      one.setBackground(Color.blue);
        }
      }
    }
  }else if(eight.getState()==true){
      if(one.getState()==true){
        if(four.getState()==false){
          if(four.getBackground() != blue.getBackground()){
        four.setBackground(Color.blue);
          }
        }
      }
  }else if(seven.getState()==true){//no other way around because it isn't possible
    if(four.getState()==false){
      if(four.getBackground() != blue.getBackground()){
      four.setBackground(Color.blue);
      }
    }
  }else if(four.getState()==true){
      if(one.getState()==false){
        if(one.getBackground() != blue.getBackground()){
        one.setBackground(Color.blue);
      }
    }else if(nine.getState()==false){
        if(nine.getBackground() != blue.getBackground()){
        nine.setBackground(Color.blue);
      }
      }
    }
  }
}else if(four.getState()==true){//4
  if (seven.getState()==true){
    if(one.getState()==false){
      if(one.getBackground() != blue.getBackground()){
      one.setBackground(Color.blue);
    }
  }
  }else if(one.getState()==true){
    if(seven.getState()==false){
      if(seven.getBackground() != blue.getBackground()){
      seven.setBackground(Color.blue);
    }
  }
  }else if(five.getState()==true){
    if(six.getState()==false){
      if(six.getBackground() != blue.getBackground()){
      six.setBackground(Color.blue);
    }
    }
  }
}

 else if(five.getState()==true){//5
  seven.setBackground(Color.blue);
  if(four.getState()==true){
    if(six.getState()==false){
      if(six.getBackground() != blue.getBackground()){
      six.setBackground(Color.blue);
      }
    }
  }else if(six.getState()==true){
    if(four.getState()==false){
      if(four.getBackground() != blue.getBackground()){
      four.setBackground(Color.blue);
      }
    }
  }else if(eight.getState()==true){
    if(two.getState()==false){
      if(two.getBackground() != blue.getBackground()){
      two.setBackground(Color.blue);
      }
    }
  }else if(two.getState()==true){
    if(eight.getState()==false){
      if(eight.getBackground() != blue.getBackground()){
      eight.setBackground(Color.blue);
      }
    }
  }else if(nine.getState()==true){
    if(one.getState()==false){
      if(one.getBackground() != blue.getBackground()){
      one.setBackground(Color.blue);
      }
    }
  }else if(one.getState()==true){
    if(nine.getState()==false){
      if(nine.getBackground() != blue.getBackground()){
      nine.setBackground(Color.blue);
      }
    }
  }else if(three.getState()==true){
    if(seven.getState()==false){
      if(seven.getBackground() != blue.getBackground()){
      seven.setBackground(Color.blue);
      }
    }else if(one.getState()==false){
      if(one.getBackground() != blue.getBackground()){
      one.setBackground(Color.blue);
      }
    }
  }
}


else if(six.getState()==true){//6
  if(nine.getState()==true){
    if(three.getState()==false){
      if(three.getBackground() != blue.getBackground()){
      three.setBackground(Color.blue);
      }
    }
  }else if(three.getState()==true){
    if(nine.getState()==false){
      if(nine.getBackground() != blue.getBackground()){
      nine.setBackground(Color.blue);
      }
    }
  }
}


else if(seven.getState()==true){//7
  if(nine.getState()==true){
    if(eight.getState()==false){
      if(eight.getBackground() != blue.getBackground()){
      eight.setBackground(Color.blue);
      }
    }
  }else if(eight.getState()==true){
    if(nine.getState()==false){
      if(nine.getBackground() != blue.getBackground()){
      nine.setBackground(Color.blue);
      }
    }
  }
}


else if(eight.getState()==true){//8
  if(five.getState()==true){
    if(two.getState()==false){
      if(two.getBackground() != blue.getBackground()){
      two.setBackground(Color.blue);
      }
    }
  }else if(nine.getState()==true){
    if(seven.getState()==false){
      if(seven.getBackground() != blue.getBackground()){
      seven.setBackground(Color.blue);
    }
  }
  }
}


else if(nine.getState()==true){//9
  if(seven.getState()==true){
    if(eight.getState()==false){
      if(eight.getBackground() != blue.getBackground()){
      eight.setBackground(Color.blue);
      }
    }
  }else if(one.getState()==true){
    if(six.getState()==false){
      if(six.getBackground() != blue.getBackground()){
      six.setBackground(Color.blue);
      }
    }
  }else if(eight.getState()==true){
    if(seven.getState()==false){
      if(seven.getBackground() != blue.getBackground()){
      seven.setBackground(Color.blue);
        }
      }
  }else if(five.getState()==true){
        if(one.getState()==false){
          if(one.getBackground() != blue.getBackground()){
          one.setBackground(Color.blue);
            }
          }
  }else if(three.getState()==true){
          if(six.getState()==false){
            if(six.getBackground() != blue.getBackground()){
              six.setBackground(Color.blue);
            }
          }
    }else if(six.getState()==true){
          if(three.getState()==false){
            if(three.getBackground() != blue.getBackground()){
            three.setBackground(Color.blue);
            }
          }
        }
      }
    //like a random to account for things I did not code for
        else if(one.getState()==false){
          if(one.getBackground() != blue.getBackground()){
            one.setBackground(Color.blue);
            }
          }else if(two.getState()==false){
            if(two.getBackground() != blue.getBackground()){
              two.setBackground(Color.blue);
              }
          }else if(three.getState()==false){
            if(three.getBackground() != blue.getBackground()){
              three.setBackground(Color.blue);
              }
          }else if(four.getState()==false){
            if(four.getBackground() != blue.getBackground()){
              four.setBackground(Color.blue);
              }
          }else if(six.getState()==false){
            if(six.getBackground() != blue.getBackground()){
              six.setBackground(Color.blue);
              }
          }else if(seven.getState()==false){
            if(seven.getBackground() != blue.getBackground()){
              seven.setBackground(Color.blue);
              }
          }else if(eight.getState()==false){
            if(eight.getBackground() != blue.getBackground()){
              eight.setBackground(Color.blue);
              }
          }else if(nine.getState()==false){
            if(nine.getBackground() != blue.getBackground()){
              nine.setBackground(Color.blue);
            }


//if there is an opening where the AI  can win it will got there
  else if(two.getBackground() == blue.getBackground()){//123
    if(one.getBackground() == blue.getBackground()){
      if(three.getBackground() != blue.getBackground()){
        if(three.getState()==false){
          three.setBackground(Color.blue);
        }
      }
    }
  }else if(three.getBackground() == blue.getBackground()){//123
    if(two.getBackground() != blue.getBackground()){
      if(one.getBackground() == blue.getBackground()){
        if(two.getState()==false){
          two.setBackground(Color.blue);
        }
      }
    }
  }else if(two.getBackground() == blue.getBackground()){//123
    if(one.getBackground() != blue.getBackground()){
      if(three.getBackground() == blue.getBackground()){
        if(one.getState()==false){
          one.setBackground(Color.blue);
        }
      }
    }
  }else if(four.getBackground() == blue.getBackground()){//456
    if(five.getBackground() == blue.getBackground()){
      if(six.getBackground() != blue.getBackground()){
        if(six.getState()==false){
          six.setBackground(Color.blue);
        }
      }
    }
  }else if(four.getBackground() != blue.getBackground()){//456
      if(five.getBackground() == blue.getBackground()){
        if(six.getBackground() == blue.getBackground()){
          if(four.getState()==false){
            four.setBackground(Color.blue);
          }
        }
      }
    }else if(eight.getBackground() == blue.getBackground()){//789
        if(seven.getBackground() == blue.getBackground()){
          if(nine.getBackground() != blue.getBackground()){
            if(nine.getState()==false){
              nine.setBackground(Color.blue);
            }
          }
        }
      }else if(seven.getBackground() == blue.getBackground()){//789
          if(eight.getBackground() != blue.getBackground()){
            if(nine.getBackground() == blue.getBackground()){
              if(eight.getState()==false){
                eight.setBackground(Color.blue);
              }
            }
          }
        }else if(seven.getBackground() != blue.getBackground()){//123
            if(eight.getBackground() == blue.getBackground()){
              if(nine.getBackground() == blue.getBackground()){
                if(seven.getState()==false){
                  seven.setBackground(Color.blue);
                }
              }
            }
          }else if(two.getBackground() == blue.getBackground()){//258
                if(five.getBackground() == blue.getBackground()){
                  if(eight.getBackground() != blue.getBackground()){
                    if(eight.getState()==false){
                      eight.setBackground(Color.blue);
                  }
                }
              }
            }else if(two.getBackground() != blue.getBackground()){//258
                  if(five.getBackground() == blue.getBackground()){
                    if(eight.getBackground() == blue.getBackground()){
                      if(two.getState()==false){
                        two.setBackground(Color.blue);
                    }
                  }
                }
              }else if(five.getBackground() == blue.getBackground()){//357
                       if(seven.getBackground() == blue.getBackground()){
                         if(three.getBackground() != blue.getBackground()){
                           if(three.getState()==false){
                             three.setBackground(Color.blue);
                            }
                           }
                         }
              }else if(five.getBackground() == blue.getBackground()){//357
                      if(seven.getBackground() != blue.getBackground()){
                          if(three.getBackground() == blue.getBackground()){
                              if(seven.getState()==false){
                                seven.setBackground(Color.blue);
                               }
                            }
              }else if(six.getBackground() == blue.getBackground()){//369
                      if(three.getBackground() != blue.getBackground()){
                          if(nine.getBackground() == blue.getBackground()){
                              if(three.getState()==false){
                                three.setBackground(Color.blue);
                              }
                            }
                          }
                }else if(six.getBackground() != blue.getBackground()){//369
                      if(three.getBackground() == blue.getBackground()){
                        if(nine.getBackground() == blue.getBackground()){
                            if(six.getState()==false){
                                six.setBackground(Color.blue);
                      }
                    }
                  }
                }else if(nine.getBackground() != blue.getBackground()){//369
                        if(six.getBackground() == blue.getBackground()){
                            if(three.getBackground() == blue.getBackground()){
                                if(nine.getState()==false){
                                  nine.setBackground(Color.blue);
                          }
                      }
                    }
                  } else if(one.getBackground() == blue.getBackground()){//951
                            if(nine.getBackground() != blue.getBackground()){
                              if(five.getBackground() == blue.getBackground()){
                                if(nine.getState()==false){
                                  nine.setBackground(Color.blue);
                                  }
                                }
                              }
                            }else if(one.getBackground() != blue.getBackground()){//951
                                      if(nine.getBackground() == blue.getBackground()){
                                        if(five.getBackground() == blue.getBackground()){
                                          if(one.getState()==false){
                                            one.setBackground(Color.blue);
                                            }
                                          }
                                        }
                                      }



      //player win statements
  if(one.getState()==true){//123
    if(two.getState()==true){
      if(three.getState()==true){
        System.out.println("Congrats you won");
      }
    }
    if(four.getState()==true){//147
      if(seven.getState()==true){
        System.out.println("Congrats you won");
      }
    }
  }
  if(two.getState()==true){//258
    if(five.getState()==true){
      if(eight.getState()==true){
        System.out.println("Congrats you won");
      }
    }
  }
  if(three.getState()==true){//369
    if(six.getState()==true){
      if(nine.getState()==true){
        System.out.println("Congrats you won");
      }
    }
  }
  if(four.getState()==true){//456
    if(five.getState()==true){
      if(six.getState()==true){
        System.out.println("Congrats you won");
      }
    }
  }
  if(five.getState()==true){//357
    if(three.getState()==true){
      if(seven.getState()==true){
        System.out.println("Congrats you won");
      }
    }
  }
  if(seven.getState()==true){//789
    if(eight.getState()==true){
      if(nine.getState()==true){
        System.out.println("Congrats you win");
      }
    }
  }
  if(nine.getState()==true){//951
    if(five.getState()==true){
      if(one.getState()==true){
        System.out.println("Congrats you win");
      }
    }

  }//Computer Winning logic
if(one.getBackground() == blue.getBackground()){//123
  if(two.getBackground() == blue.getBackground()){
    if(three.getBackground() == blue.getBackground()){
      System.out.println("Computer wins");
      }
    }
  }
if(four.getBackground() == blue.getBackground()){//456
    if(five.getBackground() == blue.getBackground()){
      if(six.getBackground() == blue.getBackground()){
        System.out.println("Computer wins");
        }
      }
    }
if(seven.getBackground() == blue.getBackground()){//789
      if(eight.getBackground() == blue.getBackground()){
        if(nine.getBackground() == blue.getBackground()){
          System.out.println("Computer wins");
          }
        }
      }
 if(two.getBackground() == blue.getBackground()){//258
        if(five.getBackground() == blue.getBackground()){
          if(eight.getBackground() == blue.getBackground()){
            System.out.println("Computer wins");
            }
          }
        }
   if(three.getBackground() == blue.getBackground()){//356
          if(five.getBackground() == blue.getBackground()){
            if(six.getBackground() == blue.getBackground()){
              System.out.println("Computer wins");
              }
            }
          }
    if(four.getBackground() == blue.getBackground()){//147
            if(one.getBackground() == blue.getBackground()){
              if(seven.getBackground() == blue.getBackground()){
                System.out.println("Computer wins");
                }
              }
            }
     if(nine.getBackground() == blue.getBackground()){//369
              if(six.getBackground() == blue.getBackground()){
                if(three.getBackground() == blue.getBackground()){
                  System.out.println("Computer wins");
                  }
                }
              }
       if(five.getBackground() == blue.getBackground()){//951
                if(nine.getBackground() == blue.getBackground()){
                  if(one.getBackground() == blue.getBackground()){
                    System.out.println("Computer wins");
                    }
                  }
                }
              }
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
