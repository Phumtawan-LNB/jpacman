package nl.tudelft.jpacman.Terminal_TestStage;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.testng.AssertJUnit.assertEquals;

import nl.tudelft.jpacman.main.ui.ThemeUI;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.*;

public class ThemeUITest {
    @Test
    public void themeUiTest(){
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

        //check the button icon path (FixFullPath)
        ImageIcon imgBtn = (ImageIcon) themeUI.imageButton.getIcon();
        assertEquals("file:/D:/OneDrive%20-%20Khon%20Kaen%20University/Class%20material/Software%20Engineer/jpacman/build/resources/main/sprite/select_them.png", imgBtn.getDescription());
        ImageIcon nameIcon = (ImageIcon) themeUI.nameIconbutton.getIcon();
        assertEquals("file:/D:/OneDrive%20-%20Khon%20Kaen%20University/Class%20material/Software%20Engineer/jpacman/build/resources/main/sprite/olympic_name.png", nameIcon.getDescription());
        ImageIcon nameIcon2 = (ImageIcon) themeUI.nameIconbutton2.getIcon();
        assertEquals("file:/D:/OneDrive%20-%20Khon%20Kaen%20University/Class%20material/Software%20Engineer/jpacman/build/resources/main/sprite/hlw_name.png", nameIcon2.getDescription());
        ImageIcon nameIcon3 = (ImageIcon) themeUI.nameIconbutton3.getIcon();
        assertEquals("file:/D:/OneDrive%20-%20Khon%20Kaen%20University/Class%20material/Software%20Engineer/jpacman/build/resources/main/sprite/crs_name.png", nameIcon3.getDescription());
        ImageIcon nameIcon4 = (ImageIcon) themeUI.nameIconbutton4.getIcon();
        assertEquals("file:/D:/OneDrive%20-%20Khon%20Kaen%20University/Class%20material/Software%20Engineer/jpacman/build/resources/main/sprite/candy_name.png", nameIcon4.getDescription());
        ImageIcon nameIcon5 = (ImageIcon) themeUI.nameIconbutton5.getIcon();
        assertEquals("file:/D:/OneDrive%20-%20Khon%20Kaen%20University/Class%20material/Software%20Engineer/jpacman/build/resources/main/sprite/space_name.png", nameIcon5.getDescription());
        ImageIcon olympicIcon = (ImageIcon) themeUI.olympicButton.getIcon();
        assertEquals("file:/D:/OneDrive%20-%20Khon%20Kaen%20University/Class%20material/Software%20Engineer/jpacman/build/resources/main/sprite/olympic.png", olympicIcon.getDescription());
        ImageIcon halloweenIcon = (ImageIcon) themeUI.halloweenButton.getIcon();
        assertEquals("file:/D:/OneDrive%20-%20Khon%20Kaen%20University/Class%20material/Software%20Engineer/jpacman/build/resources/main/sprite/halloween.png", halloweenIcon.getDescription());
        ImageIcon christmasBtn = (ImageIcon) themeUI.christmasButton.getIcon();
        assertEquals("file:/D:/OneDrive%20-%20Khon%20Kaen%20University/Class%20material/Software%20Engineer/jpacman/build/resources/main/sprite/christmas.png", christmasBtn.getDescription());
        ImageIcon candyIcon = (ImageIcon) themeUI.candyButton.getIcon();
        assertEquals("file:/D:/OneDrive%20-%20Khon%20Kaen%20University/Class%20material/Software%20Engineer/jpacman/build/resources/main/sprite/candy.png", candyIcon.getDescription());
        ImageIcon spaceIcon = (ImageIcon) themeUI.spaceButton.getIcon();
        assertEquals("file:/D:/OneDrive%20-%20Khon%20Kaen%20University/Class%20material/Software%20Engineer/jpacman/build/resources/main/sprite/space.png", spaceIcon.getDescription());
        ImageIcon startbBtn = (ImageIcon) themeUI.startButton.getIcon();
        assertEquals("file:/D:/OneDrive%20-%20Khon%20Kaen%20University/Class%20material/Software%20Engineer/jpacman/build/resources/main/sprite/back_new.png", startbBtn.getDescription());

    }
}
