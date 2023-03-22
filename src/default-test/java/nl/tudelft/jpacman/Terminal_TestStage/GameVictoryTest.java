package nl.tudelft.jpacman.Terminal_TestStage;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.testng.AssertJUnit.assertEquals;

import nl.tudelft.jpacman.main.ui.GameVictory;
import org.junit.jupiter.api.Test;
import javax.swing.*;

public class GameVictoryTest {
    @Test
    public void TestGameVictory(){
        GameVictory gamevictory = new GameVictory();

        // Check the title of the frame
        assertEquals("Game victory", gamevictory.getTitle());

        // Check the size of the frame
        assertEquals(700, gamevictory.getWidth());
        assertEquals(700, gamevictory.getHeight());


        assertEquals(true, gamevictory.isVisible());


        assertNotNull(gamevictory.backButton);
        ImageIcon bkBtnIcon = (ImageIcon) gamevictory.backButton.getIcon();
        assertEquals("file:/C:/Users/kunat/OneDrive%20-%20Khon%20Kaen%20University/Desktop/Jp/Project_pacman/build/resources/main/sprite/back_new.png", bkBtnIcon.getDescription());


        assertNotNull(gamevictory.exitButton);
        ImageIcon exitBtnIcon = (ImageIcon) gamevictory.exitButton.getIcon();
        assertEquals("file:/C:/Users/kunat/OneDrive%20-%20Khon%20Kaen%20University/Desktop/Jp/Project_pacman/build/resources/main/sprite/exit_new.png", exitBtnIcon.getDescription());


        assertNotNull(gamevictory.pacWalk);
        ImageIcon imgBtnIcon = (ImageIcon) gamevictory.pacWalk.getIcon();
        assertEquals("file:/C:/Users/kunat/OneDrive%20-%20Khon%20Kaen%20University/Desktop/Jp/Project_pacman/build/resources/main/sprite/victory.png", imgBtnIcon.getDescription());


    }

}
