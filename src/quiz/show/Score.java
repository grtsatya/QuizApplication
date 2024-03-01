package quiz.show;
import java.awt.Color;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Score extends JFrame implements ActionListener{
    
    JButton submit,exit;
    
    Score(String name ,int score){
        setBounds(400,150,750,550);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        
        JLabel image = new JLabel (i3);
        image.setBounds(0,200,300,250);
	add(image);
        
        JLabel heading = new JLabel("Thankyou "+name+" for playing");
        heading.setBounds(45,30,700,30);
        heading.setFont(new Font("Tahoma",Font.PLAIN,24));
        add(heading);
        
        JLabel score1 = new JLabel("Your score is "+ score);
        score1.setBounds(350,200,300,30);
        score1.setFont(new Font("Tahoma",Font.PLAIN,24));
        add(score1);
        
        submit = new JButton("Play again ");
        submit.setBounds(380,270,120,30);
        submit.setBackground(Color.blue);
        //submit.setFont(new Font("Dialog",Font.PLAIN,18));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        //submit.setEnabled(false);
        add(submit);
        
        exit = new JButton("Exit ");
        exit.setBounds(580,270,120,30);
        exit.setBackground(Color.BLACK);
        exit.setFont(new Font("Dialog",Font.PLAIN,18));
        exit.addActionListener(this);
        exit.setForeground(Color.WHITE);
        //exit.setEnabled(false);
        add(exit);
        
        setVisible(true);
    }
     public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== submit){ 
        setVisible(false);
        new login();
        }else if (ae.getSource()== exit) {
            setVisible(false);
        }
        
}
    
    public static void main(String args []){
        new Score("user",0);
    } 
    
}


