package nl.tudelft.jpacman.main.ui;

import nl.tudelft.jpacman.Launcher;
import nl.tudelft.jpacman.sprite.PacManSprites;
import nl.tudelft.jpacman.ui.ThemeConfig;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainMenu extends JFrame {
    private static final int MENU_WIDTH = 700;
    private static final int MENU_HEIGHT = 800;
    private static final Color BACKGROUND_COLOR = new Color(0, 0, 0);


    public mainMenu() {
        // Disable button mnemonic display
        UIManager.put("Button.showMnemonics", Boolean.FALSE);

        // Set the title and size of the frame
        setTitle("Pacman Game Menu");
        setSize(MENU_WIDTH, MENU_HEIGHT);
        setResizable(false);
        //set theme class
        ThemeConfig config = new ThemeConfig();

        // Set the background color
        getContentPane().setBackground(BACKGROUND_COLOR);

        ImageIcon pacmanIcon1 = new ImageIcon("src/main/resources/sprite/logo_pacman.png");
        JLabel pacmanImage1 = new JLabel(pacmanIcon1);
        pacmanImage1.setHorizontalAlignment(JLabel.CENTER);
        getContentPane().add(pacmanImage1, BorderLayout.NORTH);

        ImageIcon pacmanIcon = new ImageIcon("src/main/resources/sprite/pacmanwalk.gif");
        JLabel pacmanImage = new JLabel(pacmanIcon);
        pacmanImage.setHorizontalAlignment(JLabel.CENTER);
        getContentPane().add(pacmanImage, BorderLayout.CENTER);


        // Create a panel for the buttons
        JPanel buttonsPanel = new JPanel(new GridLayout(1, 3, 20, 50));
        buttonsPanel.setOpaque(false);
        //pacmanImage.setHorizontalAlignment(JLabel.CENTER);
        getContentPane().add(buttonsPanel, BorderLayout.SOUTH);

        // Add "New Game" button
        JButton newGameButton = new JButton(new ImageIcon("src/main/resources/sprite/bte.png"));
        newGameButton.setBorderPainted(false);
        newGameButton.setContentAreaFilled(false);
        newGameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                config.setConfig("0");
                new Launcher().launch();
                dispose();
            }
        });
        buttonsPanel.add(newGameButton);

        // Add "Options" button
        JButton optionsButton = new JButton(new ImageIcon("src/main/resources/sprite/nm.png"));
        optionsButton.setBorderPainted(false);
        optionsButton.setContentAreaFilled(false);
        optionsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Code for options button
                config.setConfig("1");
                new Launcher().launch();
                dispose();
            }
        });
        buttonsPanel.add(optionsButton);

        // Add "Exit" button
        JButton  exitButton = new JButton(new ImageIcon("src/main/resources/sprite/H.png"));
        exitButton.setBorderPainted(false);
        exitButton.setContentAreaFilled(false);
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Code for exit button
                config.setConfig("2");
                new Launcher().launch();
                dispose();
            }
        });
        buttonsPanel.add(exitButton);


        // Set the preferred size of the buttons panel
        buttonsPanel.setPreferredSize(new Dimension(600, 100));

        // Center the frame on the screen
        setLocationRelativeTo(null);

        // Make the frame visible
        setVisible(true);
    }
}
