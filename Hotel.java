package Hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Hotel extends JFrame implements ActionListener {
    Hotel(){
        setBounds(10,10,1366,565);
        //setSize(400,400);

        //setLocation(300,300);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Hotel/management/system/icons/first.jpg"));
        JLabel l1=new JLabel(i1);
        l1.setBounds(0,0,1360,565);
        add(l1);

        JLabel l2=new JLabel("Hotel Management System");
        l2.setBounds(20,430,1000,90);
        l2.setForeground(Color.WHITE);
        l2.setFont(new Font("serif",Font.PLAIN,70));
        l1.add(l2);

        JButton b1=new JButton("Next");
        b1.setBackground(Color.WHITE);
        b1.setForeground(Color.BLACK);
        b1.setBounds(1150,470,120,40);
        b1.addActionListener(this);
        l1.add(b1);

        setLayout(null);
        setVisible(true);

        while(true){
            l2.setVisible(false);
            try{
                Thread.sleep(500);
            }
            catch (Exception e){

            }
            l2.setVisible(true);
            try{
                Thread.sleep(500);
            }
            catch (Exception e){

            }

        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        new Login().setVisible(true);
        this.setVisible(false);

    }
    public static void main(String[] args){
        new Hotel();
    }


}
