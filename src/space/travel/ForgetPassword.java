package space.travel;

import javax.swing.*;
import java.awt.*;

public class ForgetPassword extends JFrame {

    JTextField tfusername, name, tfpassword;
    JButton search;
    ForgetPassword()    {
        setBounds(350,200,850,380);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icoojns/forgotpassword.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200,200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(580,70,200,200);
        add(image);

        JPanel pl = new JPanel();
        pl.setLayout(null);
        pl.setBounds(30,30,500,280);
        add(pl);

        JLabel username = new JLabel("Username");
        username.setBounds(40,20,100,25);
        username.setFont(new Font("Tahoma" , Font.BOLD, 14));
        pl.add(username);

        tfusername = new JTextField();
        tfusername.setBounds(220,20,150, 25);
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        pl.add(tfusername);

        search = new JButton("Search");
        search.setBackground(Color.GRAY);
        search.setForeground(Color.WHITE);
        search.setBounds(380,20,100,25);
        pl.add(search);

        JLabel name = new JLabel("Name");
        name.setBounds(40,60,100,25);
        name.setFont(new Font("Tahoma" , Font.BOLD, 14));
        pl.add(name);

        JTextField lblname = new JTextField();
        lblname.setBounds(220,60,150, 25);
        lblname.setBorder(BorderFactory.createEmptyBorder());
        pl.add(lblname);

        JLabel lblquestion = new JLabel("Your Security Question");
        lblquestion.setBounds(40,100,100,25);
        lblquestion.setFont(new Font("Tahoma" , Font.BOLD, 14));
        pl.add(lblquestion);

        JTextField tfquestion = new JTextField();
        tfquestion.setBounds(220,100,150, 25);
        tfquestion.setBorder(BorderFactory.createEmptyBorder());
        pl.add(tfquestion);

        setVisible(true);
    }

    public static void main(String[] args) {
        new ForgetPassword();
    }
}
