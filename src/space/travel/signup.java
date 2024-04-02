package space.travel;
import javax.swing.*;
import javax.swing.text.html.parser.ContentModel;
import java.awt.*;

public class signup extends JFrame{

    signup() {
        setBounds(350,200,900,360);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JPanel p1=new JPanel();
        p1.setBackground(new Color(133,193,233 ));
        p1.setBounds(0,0,500,400);
        p1.setLayout(null);
        add(p1);
        JLabel lblusername= new JLabel("Username");
        lblusername.setFont(new Font("Tahoma",Font.BOLD,14));
        lblusername.setBounds(50,20,125,25);
        p1.add( lblusername);
        JTextField Tfusername=new JTextField();
        Tfusername.setBounds(190,20,180,25);
        Tfusername.setBorder(BorderFactory.createEmptyBorder());
        p1.add(Tfusername);
        JLabel lblname= new JLabel("name");
        lblname.setFont(new Font("Tahoma",Font.BOLD,14));
        lblname.setBounds(50,60,125,25);
        p1.add( lblname);
        JTextField Tfname=new JTextField();
        Tfname.setBounds(190,60,180,25);
        Tfname.setBorder(BorderFactory.createEmptyBorder());
        p1.add(Tfname);
        JLabel lblpassword= new JLabel("Password");
        lblpassword.setFont(new Font("Tahoma",Font.BOLD,14));
        lblpassword.setBounds(50,100,125,25);
        p1.add(lblpassword);
        JTextField tfpassword=new JTextField();
        tfpassword.setBounds(190,100,180,25);
        tfpassword.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfpassword);
        JLabel lblsecurity= new JLabel("security Question");
        lblsecurity.setFont(new Font("Tahoma",Font.BOLD,14));
        lblsecurity.setBounds(50,140,125,25);
        p1.add(lblsecurity);
        Choice security=new Choice();
        security.add("fav pornstar");
        security.add("dick size");
        security.add("your lucky number");
        security.add("fav anime");
        security.setBounds(190,140,180,25);
        p1.add(security);
        JLabel lblanswer= new JLabel("answer");
        lblanswer.setFont(new Font("Tahoma",Font.BOLD,14));
        lblanswer.setBounds(50,180,125,25);
        p1.add(lblanswer);
        JTextField tfanswer=new JTextField();
        tfanswer.setBounds(190,180,180,25);
        tfanswer.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfanswer);
        JButton create=new JButton("Create");
        create.setBackground(new Color("133,193,233"));
        create.setForeground(Color.white);
        create.setFont(new Font("Tahoma",Font.BOLD,14));
        create.setBounds(80,250,100,30);

        LLLL







        setVisible(true);
    }



    public static void main(String[] args){
    new signup();

    }
}
