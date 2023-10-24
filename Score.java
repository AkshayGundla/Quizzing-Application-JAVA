import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
public class Score extends JFrame implements ActionListener{

    Score(String name,int score)
    {
        setBounds(400,150,750,550);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/score.jpg"));
        Image i2=i1.getImage().getScaledInstance(300,250,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel img=new JLabel(i3);
        img.setBounds(0,200,300,250);
        add(img);
        JLabel qno=new JLabel("Thankyou "+name+" for playing Aspiring Minds");
        qno.setBounds(45,30,700,30);
        qno.setFont(new Font("Tahoma",Font.PLAIN,26));
        add(qno);
        JLabel sco=new JLabel("Your Score is "+score);
        sco.setBounds(350,200,300,30);
        sco.setFont(new Font("Tahoma",Font.PLAIN,26));
        add(sco);

        JButton sub=new JButton("Play Again");
        sub.setBounds(380,270,200,30);
        sub.setFont(new Font("Tahoma",Font.PLAIN,22));
        sub.setBackground(new Color(30,144,255));
        sub.addActionListener(this);
        sub.setForeground(Color.white);
        add(sub);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
        setVisible(false);
        new Login();
    }
    public static void main(String [] args)
    {
        new Score("User",0);
    }
}