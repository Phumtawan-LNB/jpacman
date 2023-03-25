package nl.tudelft.jpacman.Terminal_TestStage;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.testng.AssertJUnit.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import nl.tudelft.jpacman.main.ui.GameOver;
import javax.swing.*;

public class GameOverTest {
    public GameOver gameOver;
    @BeforeEach
    public void setUpGameOverTest(){
        gameOver = new GameOver();
    }
    @AfterEach
    public void setDownGameOverTest() throws InterruptedException {
        Thread.sleep(1000);
        gameOver.dispose();
    }
    @Test
    public void gameOverTitleTest(){
        // Check the title of the frame
        assertEquals("Game over", gameOver.getTitle());
    }
    @Test
    public void gameOverFrameTest(){
        // Check the size of the frame
        assertEquals(700, gameOver.getWidth());
        assertEquals(700, gameOver.getHeight());
        assertEquals(true, gameOver.isVisible());
    }
    @Test
    public void backButtonTest() throws InterruptedException {
        assertNotNull(gameOver.backButton);
        int x = gameOver.backButton.getX();
        int y = gameOver.backButton.getY();
        int w = gameOver.backButton.getWidth();
        int h = gameOver.backButton.getHeight();

        assertEquals(250,x);
        assertEquals(450,y);
        assertEquals(200,w);
        assertEquals(100,h);

        assertNotNull(gameOver.backButton);
        Thread.sleep(1000);
        gameOver.backButton.doClick();
        Thread.sleep(1000);
    }
    @Test
    public void exitButtonTest() throws InterruptedException {
        assertNotNull(gameOver.exitButton);
        int x = gameOver.exitButton.getX();
        int y = gameOver.exitButton.getY();
        int w = gameOver.exitButton.getWidth();
        int h = gameOver.exitButton.getHeight();

        assertEquals(250,x);
        assertEquals(550,y);
        assertEquals(200,w);
        assertEquals(100,h);

        assertNotNull(gameOver.exitButton);
        Thread.sleep(1000);
        //gameOver.exitButton.doClick();
        Thread.sleep(1000);
    }
    @Test
    public void gameOverIconTest(){
        int x = gameOver.pacWalk.getX();
        int y = gameOver.pacWalk.getY();
        assertEquals(-1,x);
        assertEquals(5,y);

        int w = gameOver.pacWalk.getWidth();
        int h = gameOver.pacWalk.getHeight();
        assertEquals(686,w);
        assertEquals(445,h);

    }

}
