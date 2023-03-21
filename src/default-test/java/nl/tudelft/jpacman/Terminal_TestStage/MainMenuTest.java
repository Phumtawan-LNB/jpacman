package nl.tudelft.jpacman.Terminal_TestStage;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.testng.AssertJUnit.assertEquals;

import nl.tudelft.jpacman.main.ui.MainMenu;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.*;

public class MainMenuTest {
    @Test
    public void testMainMenu(){
        MainMenu mainMenu = new MainMenu();

        // Check the title of the frame
        assertEquals("Pacman Main Menu", mainMenu.getTitle());

        // Check the size of the frame
        assertEquals(700, mainMenu.getWidth());
        assertEquals(800, mainMenu.getHeight());

        // Check the visibility of the frame
        assertEquals(true, mainMenu.isVisible());

        // Check that the start button is not null
        assertNotNull(mainMenu.startButton);

        // Check the start button's icon
        ImageIcon startBtnIcon = (ImageIcon) mainMenu.startButton.getIcon();
        assertEquals("file:/D:/OneDrive%20-%20Khon%20Kaen%20University/Class%20material/Software%20Engineer/jpacman/build/resources/main/sprite/start_new.png", startBtnIcon.getDescription());

        // Check that the exit button is not null
        assertNotNull(mainMenu.exitButton);

        // Check the exit button's icon
        ImageIcon exitBtnIcon = (ImageIcon) mainMenu.exitButton.getIcon();
        assertEquals("file:/D:/OneDrive%20-%20Khon%20Kaen%20University/Class%20material/Software%20Engineer/jpacman/build/resources/main/sprite/exit_new.png", exitBtnIcon.getDescription());

        // Check that the image button is not null
        assertNotNull(mainMenu.imageButton);

        // Check the image Pacmanwalk.gif
        ImageIcon imgBtnIcon = (ImageIcon) mainMenu.imageButton.getIcon();
        assertEquals("file:/D:/OneDrive%20-%20Khon%20Kaen%20University/Class%20material/Software%20Engineer/jpacman/build/resources/main/sprite/logo_pacman3.png", imgBtnIcon.getDescription());

        // Check that the image button is not null
        assertNotNull(mainMenu.imageButton2);

        // Check the image Pacmanwalk.gif
        ImageIcon imgBtnIcon2 = (ImageIcon) mainMenu.imageButton2.getIcon();
        assertEquals("file:/D:/OneDrive%20-%20Khon%20Kaen%20University/Class%20material/Software%20Engineer/jpacman/build/resources/main/sprite/pacmanwalk.gif", imgBtnIcon2.getDescription());
    }
}
