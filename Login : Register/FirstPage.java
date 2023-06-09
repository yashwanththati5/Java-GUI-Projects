import javax.swing.*;
import java.awt.*;

public class FirstPage {
    JFrame f;

    FirstPage(String User)
    {
        f = new JFrame("Welcome to ... !");
        JLabel lb1 = new JLabel("Welcome " + User + " this is the main Page");
        lb1.setBounds(50 , 50 , 700 , 30);
        lb1.setForeground(new Color(0 , 153 , 153));
        lb1.setFont(new Font("Arial" , Font.PLAIN , 20));

        //Frame adding
            f.add(lb1);
        f.setSize(1000 , 1000);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new FirstPage("Yash");
    }
}
