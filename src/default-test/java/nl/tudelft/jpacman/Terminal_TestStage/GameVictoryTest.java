package nl.tudelft.jpacman.Terminal_TestStage;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.testng.AssertJUnit.assertEquals;

import nl.tudelft.jpacman.main.ui.GameOver;
import nl.tudelft.jpacman.main.ui.GameVictory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import javax.swing.*;

public class GameVictoryTest {
    public GameVictory gameVictory;
    @BeforeEach
    public void setUpGameOverTest(){
        gameVictory = new GameVictory();
    }
    @AfterEach
    public void setDownGameOverTest() throws InterruptedException {
        Thread.sleep(1000);
        gameVictory.dispose();
    }
    @Test
    public void gameVictoryTitleTest(){
        // Check the title of the frame
        assertEquals("Game victory", gameVictory.getTitle());
    }
    @Test
    public void gameVictoryFrameTest(){
        // Check the size of the frame
        assertEquals(700, gameVictory.getWidth());
        assertEquals(700, gameVictory.getHeight());
        assertEquals(true, gameVictory.isVisible());
    }
    @Test
    public void backButtonTest() throws InterruptedException {
        assertNotNull(gameVictory.backButton);
        int x = gameVictory.backButton.getX();
        int y = gameVictory.backButton.getY();
        int w = gameVictory.backButton.getWidth();
        int h = gameVictory.backButton.getHeight();

        assertEquals(250,x);
        assertEquals(450,y);
        assertEquals(200,w);
        assertEquals(100,h);

        assertNotNull(gameVictory.backButton);
        Thread.sleep(1000);
        gameVictory.backButton.doClick();
        Thread.sleep(1000);
    }
    @Test
    public void exitButtonTest() throws InterruptedException {
        assertNotNull(gameVictory.exitButton);
        int x = gameVictory.exitButton.getX();
        int y = gameVictory.exitButton.getY();
        int w = gameVictory.exitButton.getWidth();
        int h = gameVictory.exitButton.getHeight();

        assertEquals(250,x);
        assertEquals(550,y);
        assertEquals(200,w);
        assertEquals(100,h);

        assertNotNull(gameVictory.exitButton);
        Thread.sleep(1000);
        //gameOver.exitButton.doClick();
        Thread.sleep(1000);
    }
    @Test
    public void gameVictoryIconTest(){
        int x = gameVictory.pacWalk.getX();
        int y = gameVictory.pacWalk.getY();
        assertEquals(-1,x);
        assertEquals(5,y);

        int w = gameVictory.pacWalk.getWidth();
        int h = gameVictory.pacWalk.getHeight();
        assertEquals(686,w);
        assertEquals(445,h);

    }

}
