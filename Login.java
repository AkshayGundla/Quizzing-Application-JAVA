import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
public class Login extends JFrame implements ActionListener
{
    JButton rules,back;
    JTextField enter;
    Login()
    {
        getContentPane().setBackground(new Color(30,30,50));
        setLayout(null);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/quizz.jpg"));
        JLabel img=new JLabel(i1);
        img.setBounds(0,0,700,600);
        add(img);
        JLabel head=new JLabel("Aspiring Minds");
        head.setBounds(700,85,450,60);
        head.setFont(new Font("Viner Hand ITC", Font.BOLD,45));
        head.setForeground(new Color(255,16,240));
        add(head);
        JLabel name=new JLabel("Enter your Name");
        name.setBounds(718,170,800,50);
        name.setFont(new Font("Viner Hand ITC", Font.BOLD,30));
        name.setForeground(new Color(0,150,255));
        add(name);
        enter=new JTextField();
        enter.setBounds(715,250,700,33);
        enter.setSize(300,25);
        enter.setFont(new Font("Times New Roman", Font.BOLD,20));
        add(enter);
        rules=new JButton("Rules");
        rules.setFont(new Font("Viner Hand ITC", Font.BOLD,18));
        rules.setBounds(715,310,120,30);
        rules.addActionListener(this);
        rules.setBackground(new Color(0,150,255));
        add(rules);
        back=new JButton("Back");
        back.setFont(new Font("Viner Hand ITC", Font.BOLD,18));
        back.setBounds(890,310,120,30);
        back.addActionListener(this);
        back.setBackground(new Color(0,150,255));
        add(back);
        setVisible(true);
        setSize(1200,700);
        setLocation(350,220);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==rules)
        {
            String name=enter.getText();
            setVisible(false);
            new Rules(name);
        }
        else if(ae.getSource()==back)
        {
            setVisible(false);
        }
    }
    public static void main(String[] args)
    {
        new Login();
    }
} 