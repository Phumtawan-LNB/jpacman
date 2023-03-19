package nl.tudelft.jpacman.ui;

import java.awt.*;
import java.util.Map;

import javax.swing.*;

/**
 * A panel containing a button for every registered action.
 *
 * @author Jeroen Roosen 
 */
class ButtonPanel extends JPanel {

    /**
     * Default serialisation ID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Create a new button panel with a button for every action.
     * @param buttons The map of caption - action for each button.
     * @param parent The parent frame, used to return window focus.
     */
    ButtonPanel(final Map<String, Action> buttons, final JFrame parent) {
        super();
        assert buttons != null;
        assert parent != null;



        ThemeConfig config = new ThemeConfig();
        if (config.getConfig()=="0"){
            setBackground(Color.WHITE);
        }
        else {
            setBackground(Color.BLACK);
        }

        for (final String caption : buttons.keySet()) {
            ImageIcon icon = new ImageIcon(getClass().getResource("/sprite/" + caption.toLowerCase() + "_ingame.png"));
            JButton button = new JButton(icon);
            button.addActionListener(e -> {
                buttons.get(caption).doAction();
                parent.requestFocusInWindow();
            });

            button.setBorderPainted(false);
            button.setContentAreaFilled(false);
            //button.setBackground(Color.YELLOW);
            add(button);
        }
    }
}
