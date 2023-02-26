import java.io.*;
import javax.swing.*;
import java.awt.Color;
import java.awt.event.*; 
public  class main implements ActionListener{
    JTextField tf1 , tf2 , tf3;
    JButton add , sub , mul , div , rem , pow , xor , or , and;
    JLabel lb1 , lb2 , lb3;
    private Color black;
    main()
    {
        JFrame f = new JFrame();
        //Number 1
        lb1 = new JLabel("Number 1 or Base: ");
        lb1.setBounds(30, 50, 150, 35);
        tf1 = new JTextField();
        tf1.setBounds(170, 50, 150, 35);
        //Number 2
        lb2 = new JLabel("Number 2 or Power: ");
        lb2.setBounds(30, 90, 150, 35);
        tf2 = new JTextField();
        tf2.setBounds(170, 90, 150, 35);
        //Output 
        lb3 = new JLabel("Output: ");
        lb3.setBounds(30, 260, 100, 35);
        tf3 = new JTextField();
        tf3.setBounds(100, 260, 190, 35);
        //Buttons
        add = new JButton("Addition");
        add.setBounds(10, 130, 100, 35);
        add.addActionListener(this);
        sub = new JButton("Subtraction");
        sub.setBounds(110, 130, 100, 35);
        sub.addActionListener(this);
        mul = new JButton("Multiplication");
        mul.setBounds(210 , 130 ,120 , 35);
        mul.addActionListener(this);
        div = new JButton("Division");
        div.setBounds(10 , 170 , 100 , 35);
        div.addActionListener(this);
        rem = new JButton("Remaider");
        rem.setBounds(110 , 170 , 100 , 35);
        rem.addActionListener(this);
        pow = new JButton("Power");
        pow.setBounds(210 , 170 , 100 , 35);
        pow.addActionListener(this);
        or = new JButton("Bitwise OR");
        or.setBounds(10 , 210 , 100 , 35);
        or.addActionListener(this);
        and = new JButton("Bitwise AND");
        and.setBounds(110 , 210 , 110 , 35);
        and.addActionListener(this);
        xor = new JButton("Bitwise XOR");
        xor.setBounds(220 , 210 , 100 , 35);
        xor.addActionListener(this);
        //Frame
        f.add(tf1); f.add(lb1); f.add(lb2); f.add(tf2); f.add(add); f.add(lb3);
        f.add(tf3); f.add(sub); f.add(mul); f.add(div); f.add(rem); f.add(pow);
        f.add(or); f.add(and); f.add(xor);
        f.setTitle("Basic Calculator");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        f.setBackground(Color.magenta);
        f.setSize(400,400); 
        f.setLayout(null); 
        f.setVisible(true);  
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        int flag = 1;
        Long a = 0L, b = 0L;
        try{
        a = Long.parseLong(tf1.getText());
        b = Long.parseLong(tf2.getText());
        }
        catch(Exception e1)
        {
            flag = 0;
            tf1.setText(""); tf2.setText("");
            tf3.setBounds(100 , 260 , 270 , 35);
            tf3.setText("Enter valid data (Integers , Double)");
        }
        if(flag == 1){
        if(e.getSource() == add)
        {
            try
            {
                Long c = a + b;
                tf3.setText("Addition: " + (c));
            }
            catch(Exception e1)
            {
                tf3.setText("Unable to Add ! Reduce the Number");
            }
        }
        else if(e.getSource() == sub)
        {
            try
            {
                Long c = a - b;
                tf3.setText("Subtraction: " + (c));
            }
            catch(Exception e1)
            {
                tf3.setText("Unable to Subtract ! Reduce the Number");
            }
        }
        else if(e.getSource() == mul)
        {
            try
            {
                Long c = a * b;
                tf3.setBounds(100 , 260 , 250 , 35);
                tf3.setText("Multiplication: " + (c));
            }
            catch(Exception e1)
            {
                tf3.setText("Unable to Multiply ! Reduce the Number");
            }
        }
        else if(e.getSource() == div)
        {
            try{
                tf3.setText("Divison: " + (a / b));
            }
            catch(Exception e1)
            {
                tf3.setText("Unable to divide !");
                tf1.setText(""); tf2.setText("");
            }
        }
        else if(e.getSource() == rem)
        {
            try{
                tf3.setText("Remainder: " + (a % b));
            }
            catch(Exception e1)
            {
                tf3.setBounds(100, 260, 210, 35);
                tf1.setText(""); tf2.setText("");
                tf3.setText("Unable to find the Remainder !");
            }
        }
        else if(e.getSource() == pow)
        {
            try{
                tf3.setBounds(100 , 260 , 250 , 35);
                tf3.setText("Power: " + (Math.pow(a, b)));
            }
            catch(Exception e1)
            {
                
                tf1.setText(""); tf2.setText("");
                tf3.setText("Unable to find the Power !");
            }
        }
        else if(e.getSource() == or)
        {
            try
            {
                tf3.setText("OR: " + (a | b));
            }
            catch(Exception e1) {
                tf3.setText("Unable to find OR !");
            }
        }
        else if(e.getSource()  == and)
        {
            try
            {
                tf3.setText("AND: " + (a & b));
            }
            catch(Exception e1) {
                tf3.setText("Unable to find AND !");
            }
        }
        else if(e.getSource() == xor)
        {
            try
            {
                tf3.setText("XOR: " + (a ^ b));
            }
            catch(Exception e1) {
                tf3.setText("Unable to find XOR !");
            }
        }
        }
    }
    public static void main(String[] args) {
        new main();
    }
}
