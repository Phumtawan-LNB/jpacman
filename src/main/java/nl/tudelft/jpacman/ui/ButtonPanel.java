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

    public static String imagePath = "";

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
            setBackground(new Color(95, 158, 160));
            imagePath = "_ingame_op.png";
        }
        else if (config.getConfig()=="1"){
            setBackground(Color.decode("#4c4c4c"));
            imagePath = "_ingame_hw.png";
        }
        else if (config.getConfig()=="2"){
            setBackground(Color.WHITE);
            imagePath = "_ingame_cm.png";
        }
        else if (config.getConfig()=="3"){
            setBackground(Color.decode("#FFE4E1"));
            imagePath = "_ingame_cd.png";
        }
        else if (config.getConfig()=="4"){
            setBackground(Color.decode("#000033"));
            imagePath = "_ingame_sp.png";
        }

        for (final String caption : buttons.keySet()) {
            ImageIcon icon = new ImageIcon(getClass().getResource("/sprite/theme_button/" + caption.toLowerCase() + imagePath));
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
