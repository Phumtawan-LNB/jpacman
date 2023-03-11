package nl.tudelft.jpacman.main.ui;

import javax.swing.*;
import nl.tudelft.jpacman.Launcher;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameVictory extends JFrame {
    private static final int MENU_WIDTH = 700;
    private static final int MENU_HEIGHT = 800;
    private static final Color BACKGROUND_COLOR = new Color(0, 0, 0);
    private static final Font TITLE_FONT = new Font("Press Start 2P", Font.BOLD, 30);
    private static final Font BUTTON_FONT = new Font("Press Start 2P", Font.BOLD, 20);

    public GameVictory() {
        // Set the title and size of the frame
        setTitle("Game Victory");
        setSize(MENU_WIDTH, MENU_HEIGHT);
        setResizable(false);

        // Set the bounds of the frame
        //setBounds(100, 100, MENU_WIDTH, MENU_HEIGHT);

        // Set the background color
        getContentPane().setBackground(BACKGROUND_COLOR);

        ImageIcon pacmanIcon1 = new ImageIcon("src/main/resources/sprite/victory_pic.png");
        JLabel pacmanImage1 = new JLabel(pacmanIcon1);
        pacmanImage1.setHorizontalAlignment(JLabel.CENTER);
        getContentPane().add(pacmanImage1, BorderLayout.NORTH);

        // Add Pacman Game Over image
        ImageIcon gameVictoryIcon = new ImageIcon("src/main/resources/sprite/gamevictory.gif");
        JLabel gameVictoryImage = new JLabel(gameVictoryIcon);
        gameVictoryImage.setHorizontalAlignment(JLabel.CENTER);
        getContentPane().add(gameVictoryImage, BorderLayout.CENTER);

        // Add "Restart" and "Exit" buttons panel
        JPanel buttonsPanel = new JPanel(new GridLayout(1, 2, 30, 0));
        buttonsPanel.setOpaque(false);
        getContentPane().add(buttonsPanel, BorderLayout.SOUTH);

        // Create a new game button
        JButton restartButton = new JButton(new ImageIcon("src/main/resources/sprite/restart.png"));
        restartButton.setBorderPainted(false);
        restartButton.setContentAreaFilled(false);
        restartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Code for restart button
                dispose();
                new Launcher().launch();
            }
        });
// Add the new game button to the buttons panel
        buttonsPanel.add(restartButton);


        // Add "Exit" button
        JButton  exitButton = new JButton(new ImageIcon("src/main/resources/sprite/exit.png"));
        exitButton.setBorderPainted(false);
        exitButton.setContentAreaFilled(false);
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Code for exit button
                dispose();
                System.exit(0);
            }
        });
        buttonsPanel.add(exitButton);

        // Add message
        /*JLabel messageLabel = new JLabel("YOU WIN.");
        messageLabel.setFont(TITLE_FONT);
        messageLabel.setForeground(Color.YELLOW);
        messageLabel.setHorizontalAlignment(JLabel.CENTER);
        getContentPane().add(messageLabel, BorderLayout.NORTH);*/

        // Center the frame on the screen
        setLocationRelativeTo(null);

        // Make the frame visible
        setVisible(true);
    }

    public static void main(String[] args) {
        // Create a new instance of GameOver
        new GameVictory();
    }

}
