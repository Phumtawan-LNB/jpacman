package nl.tudelft.jpacman.Terminal_TestStage;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.testng.AssertJUnit.assertEquals;

import nl.tudelft.jpacman.main.ui.MainMenu;
import nl.tudelft.jpacman.main.ui.ThemeUI;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.*;

public class ThemeUITest {
    private JLabel pacLogo, pacWalk;
    private JButton  christmasButton, olympicButton, halloweenButton, candyButton, spaceButton;
    private JButton nameIconbutton,nameIconbutton2,nameIconbutton3,nameIconbutton4,nameIconbutton5;
    private JTextField textField1;
    private JButton startButton;

    private JButton imageButton;

    public void TestThemeUI(){
        ThemeUI themeUI = new ThemeUI();

        //check frame and panel
        assertEquals("Pacman Theme Menu", themeUI.getTitle());
        assertEquals(700, themeUI.getWidth());
        assertEquals(800, themeUI.getHeight());
        assertEquals(true, themeUI.isValid());

        //check image button is not null
        assertNotNull(themeUI.imageButton);
        assertNotNull(themeUI.nameIconbutton);
        assertNotNull(themeUI.nameIconbutton2);
        assertNotNull(themeUI.nameIconbutton3);
        assertNotNull(themeUI.nameIconbutton4);
        assertNotNull(themeUI.nameIconbutton5);
        assertNotNull(themeUI.olympicButton);
        assertNotNull(themeUI.halloweenButton);
        assertNotNull(themeUI.christmasButton);
        assertNotNull(themeUI.candyButton);
        assertNotNull(themeUI.spaceButton);
        assertNotNull(themeUI.startButton);


    }
}
