import javax.swing.*;
import java.awt.*;
public class Shop {

    public static void main(String[] args){
        new Shop();
    }

    JFrame frame;
    ImageIcon appimage;
    JLabel label1, label2, label3, labelimage;
    JTextField textfield1, textfield2, textfield3;
    JButton Submit,Reset;

    Shop(){
        frame=new JFrame("WELCOME TO SNAPSHOP");
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(1500,1000);
        frame.setResizable(false);

        appimage= new ImageIcon("appimage.png");
        frame.setIconImage(appimage.getImage());
        labelimage.setIcon(appimage);
        frame.getContentPane().setBackground(Color.gray);

        label1=new JLabel("Enter Your Username: ");
        label1.setBounds(20,20,150,20);
        label2=new JLabel("Enter Your Email: ");
        label2.setBounds(20,50,150,20);
        label3=new JLabel("Enter Your Password: ");
        label3.setBounds(20,80,150,20);

        textfield1=new JTextField();
        textfield1.setBounds(250,20,100,20);
        textfield2=new JTextField();
        textfield2.setBounds(250,50,100,20);
        textfield3=new JTextField();
        textfield3.setBounds(250,80,100,20);

        Submit=new JButton("Login");
        Submit.setBounds(50,120,160,40);
        Reset=new JButton("Reset");
        Reset.setBounds(200,120,160,40);

        frame.add(label1);
        frame.add(label2);
        frame.add(label3);
        frame.add(labelimage);
        frame.add(textfield1);
        frame.add(textfield2);
        frame.add(textfield3);
        frame.add(Submit);
        frame.add(Reset);
    }
}
