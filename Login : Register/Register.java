import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class Register implements ActionListener {
        JFrame f;
        JTextField tf1 , tf2 , tf3  , tf5;
        JPasswordField pass;
        JButton btn, btn2;
        static ArrayList<Data> data = new ArrayList<>();
        Register()
        {
            f = new JFrame("Register");
            JLabel lb1 = new JLabel("Name: ");
            lb1.setBounds(100 , 200 , 100 , 30);
             tf1 = new JTextField();
            tf1.setBounds(150 , 200 , 200 , 30);
            JLabel lb2 = new JLabel("Mail: ");
            lb2.setBounds(100 , 250 , 100 , 30);
             tf2 = new JTextField();
            tf2.setBounds(150 , 250 , 200 , 30);
            JLabel lb3 = new JLabel("UserName: ");
            lb3.setBounds(100 , 300 , 100 , 30);
             tf3 = new JTextField();
            tf3.setBounds(170 , 300 , 200 , 30);
            JLabel lb4 = new JLabel("Password: ");
            lb4.setBounds(100 , 350 , 100 , 30);
             pass = new JPasswordField();
            pass.setBounds(170 , 350 , 200 , 30);
            btn = new JButton("Register");
            btn.setBounds(100 , 400 , 100 , 50);
            btn.addActionListener(this);
            btn2 = new JButton("Go back");
            btn2.addActionListener(this);
            btn2.setBounds(210 , 400 , 100  , 50);
            btn2.setVisible(false);
            tf5 = new JTextField();
            tf5.setBounds(100 , 460 , 300 , 30);
//            tf5.setVisible(false);
            //Frame adding
            f.add(tf1); f.add(lb1); f.add(tf2); f.add(lb2);
            f.add(lb3); f.add(tf3); f.add(lb4); f.add(pass); f.add(btn);
            f.add(tf5); f.add(btn2);
            f.setSize(500 , 600);
            f.setLayout(null);
            f.setVisible(true);
        }
    @Override
    public void actionPerformed(ActionEvent e) {
            if(e.getActionCommand().equals("Register")) {
                String name = tf1.getText(), mail = tf2.getText(), user = tf3.getText();
                char a[] = pass.getPassword();
                String pass = new String(a);
//                System.out.println("{ \n Name: " + name + ", \n Mail: " + mail + ", \n UserName: " + user + ", \n Password: " +
//                        pass + " \n }");
                tf5.setVisible(true);
                if(name.equals("") || mail.equals("") || user.equals("") || pass.equals(""))
                {
                    tf5.setText("Enter the details !");
                }
                else {
                    int flag = 0;
                    for(Data d: data)
                    {
                        if(d.user.equals(name) && d.mail.equals(mail))
                        {
                            flag = 1;
                            tf5.setText("Already Register pls Go back");
                            break;
                        }
                    }
                    if(flag == 0) {
                        boolean add = data.add(new Data(name, mail, user, pass));
                        tf5.setText("Register Done ! Kindly press Go back");
                    }
                    btn2.setVisible(true);
                    btn.setVisible(false);
                }
            }
            else if(e.getActionCommand().equals("Go back"))
            {
//                System.exit(0);
                f.dispose();
            }
    }
    public static void main(String[] args) {
        new Register();
    }
}
