import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.System.out;
public class Login implements ActionListener {
    JFrame f;
    JTextField tf1 , tf2;
    JPasswordField pas;

    Login()
    {
         f = new JFrame("Login");
        JLabel lb1 = new JLabel("Username: ");
        lb1.setBounds(100 , 100  , 100 , 30);
         tf1 = new JTextField();
        tf1.setBounds(200 , 100 , 100 , 30);
        JLabel lb2 = new JLabel("Password: ");
        lb2.setBounds(100 , 150  , 100 , 30);
        pas = new JPasswordField();
        pas.setBounds(200 , 150 , 100 , 30);
        JButton btn = new JButton("Login");
        btn.setBounds(200 , 200 , 100 , 50);
        JButton btn2 = new JButton("Register");
        btn2.setBounds(320 , 200 , 100 , 50);
        tf2 = new JTextField("");
        tf2.setBounds(100 , 300 , 200 , 30);
        tf2.setVisible(false);
        btn.addActionListener(this);
        btn2.addActionListener(this);
        //Frame adding
        f.add(tf1); f.add(lb1); f.add(lb2); f.add(pas); f.add(btn); f.add(tf2);
        f.add(btn2);
        f.setSize(600,600);
        f.setLayout(null);
        f.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Login")) {
            String UserName = tf1.getText();
            char a[] = pas.getPassword();
            String pass = new String(a);
//        out.print(pass + "  " + UserName);
            tf2.setVisible(true);
            int flag = 0;
            for (Data d : Register.data) {
                    if(d.user.equals(UserName) && d.pass.equals(pass))
                    {
//                        tf2.setText("Logged in !");
                        flag = 1;
                        break;
                    }
            }
            if(flag == 0)
            {
                tf2.setText("Sorry Register !");
            }
            else {new FirstPage(UserName); f.dispose();}
        }
        if(e.getActionCommand().equals("Register"))
        {
            //Need a new Page for register
//            out.print("In this register");
            new Register();
//            f.dispose();
        }
    }

    public static void main(String[] args) {
       new Login();
    }
}
