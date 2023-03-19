package nl.tudelft.jpacman.main.ui;

import nl.tudelft.jpacman.Launcher;
import nl.tudelft.jpacman.ui.ThemeConfig;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ThemeUI extends JFrame {
    private JLabel pacLogo, pacWalk;
    private JButton exitButton, christmasButton, olympicButton, halloweenButton, candyButton, spaceButton;
    private JTextField textField1;
    private JButton startButton;

    public ThemeUI() {
        super("Pacman Theme Menu");

        // Set the layout manager for the frame
        setLayout(new BorderLayout());

        // Create a panel for the buttons
        JPanel buttonPanel = new JPanel();

        //set the theme class
        ThemeConfig config = new ThemeConfig();

        //Image Bg
        ImageIcon classicIcon = new ImageIcon(getClass().getResource("/sprite/select_them.png"));
        pacLogo = new JLabel(classicIcon);
        buttonPanel.add(pacLogo);
        pacLogo.setBounds(0, 0, 10, 10);

        //Create the Halloween button
        ImageIcon olympicIcon = new ImageIcon(getClass().getResource("/sprite/olympic.png"));
        olympicButton = new JButton(olympicIcon);
        olympicButton.setBorderPainted(false);
        olympicButton.setContentAreaFilled(true);
        olympicButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                config.setConfig("0");
                new Launcher().launch();
            }
        });
        add(olympicButton);
        olympicButton.setBounds(80, 250, 160, 147);

        // Create the Halloween button
        ImageIcon halloweenIcon = new ImageIcon(getClass().getResource("/sprite/halloween.png"));
        halloweenButton = new JButton(halloweenIcon);
        halloweenButton.setBorderPainted(false);
        halloweenButton.setContentAreaFilled(true);
        halloweenButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                config.setConfig("1");
                new Launcher().launch();
            }
        });
        add(halloweenButton);
        halloweenButton.setBounds(260, 250, 160, 147);

        // Create the Christmas button
        ImageIcon christmasBtn = new ImageIcon(getClass().getResource("/sprite/christmas.png"));
        christmasButton = new JButton(christmasBtn);
        christmasButton.setBorderPainted(false);
        christmasButton.setContentAreaFilled(true);
        christmasButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                config.setConfig("2");
                new Launcher().launch();
            }
        });
        add(christmasButton);
        christmasButton.setBounds(445, 250, 160, 147);

        // Create the Candy button
        ImageIcon candyIcon = new ImageIcon(getClass().getResource("/sprite/halloween.png"));
        candyButton = new JButton(candyIcon);
        candyButton.setBorderPainted(false);
        candyButton.setContentAreaFilled(true);
        candyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                config.setConfig("2");
                new Launcher().launch();
            }
        });
        add(candyButton);
        candyButton.setBounds(80, 450, 160, 147);

        // Create the Halloween button
        ImageIcon spaceIcon = new ImageIcon(getClass().getResource("/sprite/halloween.png"));
        spaceButton = new JButton(spaceIcon);
        spaceButton.setBorderPainted(false);
        spaceButton.setContentAreaFilled(true);
        spaceButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                config.setConfig("1");
                new Launcher().launch();
            }
        });
        add(spaceButton);
        spaceButton.setBounds(260, 450, 160, 147);

        ImageIcon startbBtn = new ImageIcon(getClass().getResource("/sprite/back_new.png"));
        startButton = new JButton(startbBtn);
        startButton.setBorderPainted(false);
        startButton.setContentAreaFilled(false);
        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                new MainMenu();
            }
        });
        add(startButton);
        startButton.setBounds(250, 650, 200, 100);
        // Set the panel background to black
        buttonPanel.setBackground(Color.BLACK);

        // Add the button panel to the center of the frame
        add(buttonPanel, BorderLayout.CENTER);

        // Set the size and center the frame on the screen
        setSize(700, 800);

        // set the frame
        setLocationRelativeTo(null);
        setResizable(false);
        setUndecorated(false);


        // Set the close operation and make the frame visible
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

//        setLayout(new FlowLayout(FlowLayout.CENTER,100,10));
//        buttonPanel.setPreferredSize(new Dimension(100,300));
//        buttonPanel.setBackground(Color.GRAY);
        buttonPanel.setLayout(new FlowLayout());
    }
}
