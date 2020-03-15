package GuessGame;

import java.awt.*;
import javax.swing.*;
import java.lang.Thread;
import java.awt.event.*;

class Front_Page implements ActionListener{
    JFrame f;
    JLabel id;
    JButton b;

    Front_Page(){

        f=new JFrame("Guess Game");
        f.setBackground(Color.red);
        f.setLayout(null);


        b = new JButton(" CONTINUE ");
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);


        b.setBounds(100,100,130,40);
        b.addActionListener(this);

        id=new JLabel();
        id.setBounds(0,0,900,750);
        id.setLayout(null);



        JLabel lid=new JLabel("Think of a number between 1-1000");
        lid.setBounds(20,10,300,50);
        lid.setFont(new Font("serif",Font.PLAIN,20));
        lid.setForeground(Color.red);
        id.add(lid);

        id.add(b);
        f.add(id);


        f.getContentPane().setBackground(Color.WHITE);

        f.setVisible(true);
        f.setSize(350,200);
        f.setLocation(500,300);

        while(true){
            lid.setVisible(false); // lid =  j label
            try{
                Thread.sleep(200); //1000 = 1 second
            }catch(Exception e){}
            lid.setVisible(true);
            try{
                Thread.sleep(1500);
            }catch(Exception e){}
        }

    }
    public void actionPerformed(ActionEvent ae){

        if(ae.getSource()==b){
            f.setVisible(false);
            new Guess();
        }
    }

    public static void main(String[] arg){
        Front_Page f = new Front_Page();
    }
}
