package Hotel.management.system;

import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {
    JLabel l1,l2;
    JTextField t1;
    JButton b1,b2,b3;
    JPasswordField t2;

    Login(){
        l1=new JLabel("UserName:");
        l1.setFont(new Font("serif",Font.PLAIN,20));
        l1.setBounds(15,80,120,30);
        add(l1);

        l2=new JLabel("Password:");
        l2.setFont(new Font("serif",Font.PLAIN,20));
        l2.setBounds(15,160,120,30);
        add(l2);

        t1=new JTextField();
        t1.setBounds(160,86,150,30);
        add(t1);

        t2=new JPasswordField();
        t2.setBounds(160,163,150,30);
        add(t2);

        b1=new JButton("Login");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(15,230,120,30);
        add(b1);

        b2=new JButton("Cancel");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(180,230,120,30);
        add(b2);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Hotel/management/system/icons/second.jpg"));
        Image i2=i1.getImage().getScaledInstance(300,350,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l3=new JLabel(i3);
        l3.setBounds(340,30,300,300);
        add(l3);

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setBounds(500,150,650,400);
        setVisible(true);
    }
    public static void main(String[] args){
        new Login();

    }
}
