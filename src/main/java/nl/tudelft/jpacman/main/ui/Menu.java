package nl.tudelft.jpacman.main.ui;

import nl.tudelft.jpacman.Launcher;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.Border;

import static java.awt.SystemColor.text;

public class Menu {
    public static void main(){
        JFrame frame = new JFrame();
        ImageIcon image = new ImageIcon("src/main/resources/pacmanMenu.png");
        Image scaleImage = image.getImage().getScaledInstance(600, 420,Image.SCALE_DEFAULT);
        image = new ImageIcon(scaleImage);
        Border border = BorderFactory.createLineBorder(Color.yellow,3);

        Container c = frame.getContentPane();


        JLabel label = new JLabel();
        label.setText("Bro..");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(new Color(0x00FF00));
        label.setFont(new Font("MV Boli",Font.PLAIN,20));
        label.setIconTextGap(-50);
        label.setBackground(Color.black);
        label.setOpaque(true);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(100,100,600,420);


        JButton button,button2;
        button = new JButton("Start Game");
        button.addActionListener(e->new Launcher().launch());
        button2 = new JButton("Exit");
        button2.addActionListener(e->exit());

        JPanel panel = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();

        //panel2.setPreferredSize(new Dimension(100,100));
        panel.add(label,BorderLayout.NORTH);
        panel.add(button,BorderLayout.EAST);
        panel.add(button2);
        //panel2.add(button2);
        //panel3.setLayout(new BorderLayout());
        //panel3.add(button2,BorderLayout.CENTER);

        c.setBackground(Color.red);


        JTextField nameInput;
        nameInput= new JTextField("", 16);
        panel.add(nameInput);


        frame.setTitle("Pacman Game Project");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000,1000);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        //panel3.add(button);
        frame.add(panel);
        //frame.add(butt1);
        //frame.add(panel3,BorderLayout.SOUTH);
        frame.getContentPane().setBackground(Color.BLACK);
        frame.pack();
    }

    /*public void actionPerformed(ActiveEvent e){
        String s = e.getActionCommand();
        if (s.equals("Start Game")){
            System.out.println("Easyy");
        }
    }   */
     public static void exit(){
        System.exit(0);
    }
}
