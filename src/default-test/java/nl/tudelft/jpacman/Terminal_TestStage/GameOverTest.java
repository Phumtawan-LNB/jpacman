package nl.tudelft.jpacman.Terminal_TestStage;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.testng.AssertJUnit.assertEquals;
import org.junit.jupiter.api.Test;
import nl.tudelft.jpacman.main.ui.GameOver;
import javax.swing.*;

public class GameOverTest {
    @Test
    public void TestGameOver(){
        GameOver gameover = new GameOver();

        // Check the title of the frame
        assertEquals("Game over", gameover.getTitle());

        // Check the size of the frame
        assertEquals(700, gameover.getWidth());
        assertEquals(700, gameover.getHeight());


        assertEquals(true, gameover.isVisible());

        assertNotNull(gameover.backButton);
        ImageIcon bkBtnIcon = (ImageIcon) gameover.backButton.getIcon();
        assertEquals("file:/C:/Users/kunat/OneDrive%20-%20Khon%20Kaen%20University/Desktop/Jp/Project_pacman/build/resources/main/sprite/back_new.png", bkBtnIcon.getDescription());


        assertNotNull(gameover.exitButton);
        ImageIcon exitBtnIcon = (ImageIcon) gameover.exitButton.getIcon();
        assertEquals("file:/C:/Users/kunat/OneDrive%20-%20Khon%20Kaen%20University/Desktop/Jp/Project_pacman/build/resources/main/sprite/exit_new.png", exitBtnIcon.getDescription());


        assertNotNull(gameover.pacWalk);
        ImageIcon imgBtnIcon = (ImageIcon) gameover.pacWalk.getIcon();
        assertEquals("file:/C:/Users/kunat/OneDrive%20-%20Khon%20Kaen%20University/Desktop/Jp/Project_pacman/build/resources/main/sprite/over.png", imgBtnIcon.getDescription());


    }

}
