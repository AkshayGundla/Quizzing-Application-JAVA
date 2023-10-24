import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
class Rules extends JFrame implements ActionListener{
      String name;
      JButton back,start;
    Rules(String name)
    {
        this.name=name;
        getContentPane().setBackground(Color.white);
        setLayout(null);
        JLabel head=new JLabel("Welcome "+name+" to Aspiring Minds");
        head.setBounds(45,30,700,30);
        head.setFont(new Font("Viner Hand ITC", Font.BOLD,30));
        head.setForeground(new Color(255,16,240));
        add(head);
        JLabel rules=new JLabel();
        rules.setBounds(55,100,900,350);
        rules.setFont(new Font("Tahoma",Font.PLAIN,16));
        rules.setText(
            "<html>"+
            ". Turn off your cell (or put it on vibrate mode)."+"<br><br>"+
            ". Do not start until we tell you so (do not even write your name)."+"<br><br>"+
            ". Keep the testing material face down until we indicate you can start."+"<br><br>"+
            ". Know your section number and TA name."+"<br><br>"+
            ". Write your directory id (what you use to log on to the grades server, grace cluster) if requested."+"<br><br>"+
            ". When we indicate time is up, do not write anything else."+"<br><br>"+
            ". Make sure you write your name immediately after starting the exam/quiz. We will not wait for you at the end."+"<br><br>"+
            ". It is recommended you complete your work using a pencil (makes it easier to correct mistakes)."+"<br><br>"+
            ". Bring a watch if you want to keep track of time."+"<br><br>"
        );
        add(rules);
        start=new JButton("Start");
        start.setFont(new Font("Viner Hand ITC", Font.BOLD,18));
        start.setBounds(60,490,120,30);
        start.addActionListener(this);
        start.setBackground(new Color(0,150,255));
        add(start);
        back=new JButton("Back");
        back.setFont(new Font("Viner Hand ITC", Font.BOLD,18));
        back.setBounds(260,490,120,30);
        back.addActionListener(this);
        back.setBackground(new Color(0,150,255));
        add(back);
        setSize(900,650);
        setLocation(600,200);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==start)
        {
            setVisible(false);
            new Questions(name);
        }
        else if(ae.getSource()==back)
        {
            setVisible(false);
            new Login();
        }
    }
    public static void main(String [] args)
    {
        new Rules("User");
    }
}