package GuessGame;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Guess implements ActionListener{
    JFrame f;
    JLabel l1;
    JButton b1,b2,b3;
    public static int x,low=1,high=1000;
    Guess(){
        f=new JFrame("Guess Game");
        f.setBackground(Color.white);
        f.setLayout(null);
        x = BSearch.search(low,high);
        l1 = new JLabel("Is your number "+x+"?");
        l1.setBounds(100,10,300,40);
        l1.setFont(new Font("serif",Font.BOLD,20));
        l1.setForeground(Color.black);
        f.add(l1);

        b1=new JButton("Higher");
        b1.setBounds(100,80,100,40);
        b1.setFont(new Font("serif",Font.BOLD,15));
        b1.addActionListener(this);
        f.add(b1);


        b2=new JButton("Yes");
        b2.setBounds(220,80,100,40);
        b2.setFont(new Font("serif",Font.BOLD,15));
        b2.addActionListener(this);
        f.add(b2);

        b3=new JButton("Lower");
        b3.setBounds(340,80,100,40);
        b3.setFont(new Font("serif",Font.BOLD,15));
        b3.addActionListener(this);
        f.add(b3);

        f.setVisible(true);
        f.setSize(500,200);
        f.setLocation(450,200);

    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            f.setVisible(true);
            low = x+1;
            new Guess();
        }
        if(ae.getSource()==b2){

            JOptionPane.showMessageDialog(null,"Yayy!!! I did it");
            System.exit(0);
        }
        if(ae.getSource()==b3){
            f.setVisible(true);
            high = x-1;
            new Guess();
        }
    }
    public static void main(String[ ] arg){
        Guess g = new Guess();
    }

}
