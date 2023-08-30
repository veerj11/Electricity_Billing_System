package electricity.billing.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Paytm extends JFrame implements ActionListener{

    String meter;
    JButton back;
    Paytm(String meter) {
        super("PAYMENT GATEWAY");
        this.meter = meter;
        
        JEditorPane j = new JEditorPane();
        j.setEditable(false);
        
//        try {
//            j.setPage("https://paytm.com/online-payments");
//        } catch (Exception e) {
//            j.setContentType("text/html");
//            j.setText("<html>Could not load<html>");
//            
//        }
 ImageIcon upiImage = new ImageIcon(ClassLoader.getSystemResource("icon/upi.jpg"));
//        JLabel imageLabel = new JLabel(upiImage);
//        Image i2 = upiImage.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
        Image scaledImage = upiImage.getImage().getScaledInstance(270, 318, Image.SCALE_DEFAULT);
        upiImage = new ImageIcon(scaledImage);
        JLabel imageLabel = new JLabel(upiImage);
        
        imageLabel.setBounds(250, 50, 270, 318);
        add(imageLabel);
        
        JScrollPane pane = new JScrollPane(j);
        add(pane);
        
        back = new JButton("Back");
        back.setBounds(345, 450, 80, 30);
        back.addActionListener(this);
        j.add(back);
        
        setSize(800, 600);
        setLocation(580, 150);
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new PayBill(meter);
    }
    
    public static void main(String[] args) {
        new Paytm("");
    }
}