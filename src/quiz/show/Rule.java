package quiz.show;
import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rule extends JFrame implements ActionListener{
    String name ;
    JButton start, back;
    
    Rule(String name){
    
        this.name = name;
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        JLabel heading = new JLabel("Welcome "+name+" Mind GAME");
        heading.setBounds(50,20,700,30);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,22));
        heading.setForeground(new Color(30));
        add(heading);
        
        JLabel rule = new JLabel("");
        rule.setBounds(20,90,700,350);
        rule.setFont(new Font("Tahoma",Font.PLAIN,16));
        rule.setForeground(new Color(30));
        rule.setText(
                "<html>"+ 
                "1. You are trained to be a programmer and not a story teller, answer point to point" + "<br><br>" +
                "2. Do not unnecessarily smile at the person sitting next to you, they may also not know the answer" + "<br><br>" +
                "3. You may have lot of options in life but here all the questions are compulsory" + "<br><br>" +
                "4. Only a fool asks and a wise answers (Be wise, not otherwise)" + "<br><br>" +
                "5. Do not get nervous if your friend is answering, may be he/she is doing Jai  Mata Di" + "<br><br>" +
                "6. Brace yourself, this paper is not for the faint hearted" + "<br><br>" +
                "7. May you know more than what John Snow knows, Good Luck" + "<br><br>" +
                "8. You have 20 second for each QUESTIONS for answering "+        
            "<html>");
        add(rule);
        
        back = new JButton("Back");
        back.setBounds(250,500,100,30);
        back.setForeground(Color.white);
        back.setFont(new Font("Times New Roman",Font.BOLD,15));
        back.setBackground(new Color(30,144,254));
        back.addActionListener(this);
        add(back);
        
        start = new JButton("START");
        start.setBounds(400,500,100,25);
        start.setForeground(Color.white);
        start.setFont(new Font("Times New Roman",Font.BOLD,15));
        start.setBackground(new Color(30,144,254));
        start.addActionListener(this);
        add(start);
        
        
        
        setSize(800,650);
        setLocation(350,100);
        setVisible(true);
}
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== start){
            setVisible(false);
            new quiz(name);
        }else if(ae.getSource()== back){
        setVisible (false);
         new login();
         }
        
    }
    
    public static void main(String args[]){
        
        new Rule("user ");
    }
}
