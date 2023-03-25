package nl.tudelft.jpacman.Terminal_TestStage;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.testng.AssertJUnit.assertEquals;

import nl.tudelft.jpacman.main.ui.MainMenu;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.*;

public class MainMenuTest {
    public MainMenu mainMenu;
    @BeforeEach
    public void setUpMainMenu() {
        mainMenu = new MainMenu();

    }
    @AfterEach
    public void setDownMainMenu() throws InterruptedException {
        Thread.sleep(1000);
        mainMenu.dispose();
    }

    @Test
    public void pacmanTitle(){
        // Check the title of the frame
        assertEquals("Pacman Main Menu", mainMenu.getTitle());
    }
    @Test
    public void mainMenuSizeTest(){
        // Check the size of the frame
        assertEquals(700, mainMenu.getWidth());
        assertEquals(800, mainMenu.getHeight());
        assertEquals(true, mainMenu.isVisible());
    }
    @Test
    public void startButtonTest() throws InterruptedException {
        int x = mainMenu.startButton.getX();
        int y = mainMenu.startButton.getY();
        int w = mainMenu.startButton.getWidth();
        int h = mainMenu.startButton.getHeight();

        assertEquals(250,x);
        assertEquals(525,y);
        assertEquals(200,w);
        assertEquals(100,h);

        assertNotNull(mainMenu.startButton);
        Thread.sleep(1000);
        mainMenu.startButton.doClick();
        Thread.sleep(1000);
    }

    @Test
    public void pacmanWalkPic(){
        int x = mainMenu.imageButton2.getX();
        int y = mainMenu.imageButton2.getY();
        assertEquals(100,x);
        assertEquals(250,y);

        int w = mainMenu.imageButton2.getWidth();
        int h = mainMenu.imageButton2.getHeight();
        assertEquals(492,w);
        assertEquals(280,h);
    }
    @Test
    public void pacmanLogoTest(){
        int x = mainMenu.imageButton.getX();
        int y = mainMenu.imageButton.getY();
        assertEquals(50,x);
        assertEquals(50,y);

        int w = mainMenu.imageButton.getWidth();
        int h = mainMenu.imageButton.getHeight();
        assertEquals(600,w);
        assertEquals(229,h);
    }
    @Test
    public void exitButtonTest() throws InterruptedException {
        int x = mainMenu.exitButton.getX();
        int y = mainMenu.exitButton.getY();
        int w = mainMenu.exitButton.getWidth();
        int h = mainMenu.exitButton.getHeight();

        assertEquals(250,x);
        assertEquals(600,y);
        assertEquals(200,w);
        assertEquals(100,h);

        assertNotNull(mainMenu.exitButton);
        Thread.sleep(1000);
        //mainMenu.exitButton.doClick(); // must be success 100%
        Thread.sleep(1000);
    }
}
