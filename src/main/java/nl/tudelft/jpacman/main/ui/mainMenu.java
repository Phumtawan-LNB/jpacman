package nl.tudelft.jpacman.main.ui;

import nl.tudelft.jpacman.Launcher;
import nl.tudelft.jpacman.sprite.PacManSprites;
import nl.tudelft.jpacman.ui.ThemeConfig;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainMenu extends JFrame {
    private static final int MENU_WIDTH = 800;
    private static final int MENU_HEIGHT = 600;
    private static final Color BACKGROUND_COLOR = new Color(0, 0, 0);
    private static final Font TITLE_FONT = new Font(Font.SANS_SERIF, Font.BOLD, 50);
    private static final Font BUTTON_FONT = new Font(Font.SANS_SERIF, Font.BOLD, 30);
    private static int theme;

    public mainMenu() {
        // Set the title and size of the frame
        setTitle("Pacman Game Menu");
        setSize(MENU_WIDTH, MENU_HEIGHT);
        setResizable(false);
        //set theme class
        ThemeConfig config = new ThemeConfig();

        // Set the bounds of the frame
        setBounds(100, 100, MENU_WIDTH, MENU_HEIGHT); // set x, y, width, height

        // Set the background color
        getContentPane().setBackground(BACKGROUND_COLOR);

        // Add Pacman title label
        JLabel pacmanLabel = new JLabel("PACMAN");
        pacmanLabel.setFont(TITLE_FONT);
        pacmanLabel.setForeground(Color.YELLOW);
        pacmanLabel.setHorizontalAlignment(JLabel.CENTER);
        getContentPane().add(pacmanLabel, BorderLayout.NORTH);

        // Add Pacman image
        ImageIcon pacmanIcon = new ImageIcon("src/main/resources/sprite/pacmanwalk.gif");
        JLabel pacmanImage = new JLabel(pacmanIcon);
        pacmanImage.setHorizontalAlignment(JLabel.CENTER);
        getContentPane().add(pacmanImage, BorderLayout.CENTER);

        // Add buttons panel
        JPanel buttonsPanel = new JPanel(new GridLayout(3, 1, 0, 30));
        buttonsPanel.setOpaque(false);
        getContentPane().add(buttonsPanel, BorderLayout.SOUTH);

        // Add "New Game" button
        JButton newGameButton = new JButton();
        newGameButton.setIcon(new ImageIcon("src/main/resources/resizepacman.png"));
        newGameButton.setBounds(0, 0, 200, 50);
        PacManSprites theme = new PacManSprites();
        newGameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Code for new game button
                config.setConfig("0");
                new Launcher().launch();
                dispose();
            }
        });
        buttonsPanel.add(newGameButton);

// Add "Options" button
        JButton optionsButton = new JButton();
        optionsButton.setIcon(new ImageIcon("src/main/resources/resizepacman.png"));
        optionsButton.setBounds(150, 50, 200, 50);
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
        JButton exitButton = new JButton();
        exitButton.setIcon(new ImageIcon("src/main/resources/resizepacman.png"));
        exitButton.setBounds(200, 50, 200, 50);
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

        // Center the frame on the screen
        setLocationRelativeTo(null);

        // Make the frame visible
        setVisible(true);
    }


    public static void main() {
        // Create a new instance of GameMenu
        new mainMenu();
    }

}
