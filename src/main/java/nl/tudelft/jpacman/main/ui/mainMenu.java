package nl.tudelft.jpacman.main.ui;

import nl.tudelft.jpacman.Launcher;
import nl.tudelft.jpacman.ui.ThemeConfig;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainMenu extends JFrame {
    public mainMenu() {
        // set the title and size of the frame
        setTitle("Main Menu");
        setSize(800, 600);

        // create an ImageIcon and a JLabel to display it
        ImageIcon icon = new ImageIcon("src/main/resources/repacmanMenu.png");
        JLabel label = new JLabel(icon);

        // create a panel to hold the buttons
        JPanel buttonPanel = new JPanel(new GridLayout(1, 3, 10, 10));
        buttonPanel.setOpaque(false);
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50));
        buttonPanel.add(new JButton("Easy"));
        buttonPanel.add(new JButton("Normal"));
        buttonPanel.add(new JButton("Hard"));

        // create a panel to hold the text input field
        JPanel textFieldPanel = new JPanel(new BorderLayout());
        textFieldPanel.setOpaque(false);
        textFieldPanel.setBorder(BorderFactory.createEmptyBorder(50, 50, 0, 50));
        textFieldPanel.add(new JLabel("Enter your name:"), BorderLayout.NORTH);
        textFieldPanel.add(new JTextField(), BorderLayout.CENTER);

        // add the label, text input field panel, and button panel to the content pane of the frame
        getContentPane().add(label, BorderLayout.CENTER);
        getContentPane().add(textFieldPanel, BorderLayout.NORTH);
        getContentPane().add(buttonPanel, BorderLayout.SOUTH);

        // add ActionListener to the buttons
        JButton newGameButton = (JButton) buttonPanel.getComponent(0);
        newGameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // code for new game button
                ThemeConfig config = new ThemeConfig();
                config.setConfig(1);
                new Launcher().launch();
            }
        });

        JButton optionsButton = (JButton) buttonPanel.getComponent(1);
        optionsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // code for options button
            }
        });

        JButton exitButton = (JButton) buttonPanel.getComponent(2);
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // code for exit button
                System.exit(0);
            }
        });

        // make the frame visible
        setVisible(true);
    }

    public static void main() {
        // create a new instance of mainMenu
        new mainMenu();
    }
}
