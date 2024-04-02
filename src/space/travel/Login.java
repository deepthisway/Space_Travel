package space.travel;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.*; // border is subpackage of of swing, subpackages are not imported on importing packages
public class Login extends JFrame {
    
    Login() {
        setSize(900, 400);
        setLocation(350,200);
        setLayout(null);
        //panel class is used to create the panel inside this new box.
        getContentPane().setBackground(Color.white);

        JPanel loginPanel = new JPanel();
        loginPanel.setBackground(new Color(131,193,223));
        loginPanel.setBounds(0, 0, 400, 400);
        loginPanel.setLayout(null);
        add(loginPanel);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.png"));
        Image i2 = i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(100,120,200,200);   // works only when setBound function is null.
        loginPanel.add(image); // to bring image over the panel we used loginpanel.

        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBounds(400,30,450,300);
        add(p2);
    // JLabel can be used to write the text over the panel.
        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(60,20,100,25);
        lblusername.setFont(new Font("SAN SERIF", Font.PLAIN , 20));
        p2.add(lblusername);

        JLabel lblpassword = new JLabel("Password");
        lblpassword.setBounds(60,110,100,25);
        lblpassword.setFont(new Font("SAN SERIF", Font.PLAIN , 20));
        p2.add(lblpassword);

        // textflield for username
        JTextField tfusername = new JTextField();
        tfusername.setBounds(60, 60, 300,30);
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tfusername);

        // textfield for password
        JTextField tfpassword = new JTextField();
        tfpassword.setBounds(60, 150, 300,30);
        tfpassword.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tfpassword);

        // creating login button

        JButton login = new JButton("Login");
        login.setBounds(60,200,130,30);
        login.setBackground(new Color(133,193,233));
        login.setForeground(Color.WHITE);
        login.setBorder(new LineBorder(new Color(133,193,233)));
        p2.add(login);

        JButton signup = new JButton("Sign Up");
        signup.setBounds(230,200,130,30);
        signup.setBackground(new Color(133,193,233));
        signup.setForeground(Color.WHITE);
        signup.setBorder(new LineBorder(new Color(133,193,233)));
        p2.add(signup);

        JButton fgtpsw = new JButton("Forgot Password?");
        fgtpsw.setBounds(130,250,130,30);
        fgtpsw.setBackground(new Color(133,193,233));
        fgtpsw.setForeground(Color.WHITE);
        fgtpsw.setBorder(new LineBorder(new Color(133,193,233)));
        p2.add(fgtpsw);

        JLabel text = new JLabel("Trouble signing in?");
        text.setBounds(300,250,150,20);
        p2.add(text);
        text.setForeground(Color.RED);
        setVisible(true);
        
    }
    
    public static void main(String[] args)  {
        new Login();
        
    }
}

