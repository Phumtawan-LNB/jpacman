package nl.tudelft.jpacman.Terminal_TestStage;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.testng.AssertJUnit.assertEquals;

import nl.tudelft.jpacman.main.ui.ThemeUI;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.*;

public class ThemeUITest {
    public ThemeUI themeUI;
    @BeforeEach
    public void setUpThemeUITest(){
        themeUI = new ThemeUI();
    }
    @AfterEach
    public void setDownThemeUITest() throws InterruptedException {
        Thread.sleep(1000);
        themeUI.dispose();
    }
    @Test
    public void themeUIFrameTitleTest(){
        //check frame and panel
        assertEquals("Pacman Theme Menu", themeUI.getTitle());
    }
    @Test
    public void themeUIFrameSizeTest(){
        assertEquals(700, themeUI.getWidth());
        assertEquals(800, themeUI.getHeight());
        assertEquals(true, themeUI.isVisible());
    }
    @Test
    public void selectThemeUIIconTest(){
        assertNotNull(themeUI.imageButton);
        int x = themeUI.imageButton.getX();
        int y = themeUI.imageButton.getY();
        assertEquals(160,x);
        assertEquals(60,y);

        int w = themeUI.imageButton.getWidth();
        int h = themeUI.imageButton.getHeight();
        assertEquals(356,w);
        assertEquals(82,h);
    }
    @Test
    public void IconNameTest(){
        assertNotNull(themeUI.nameIconbutton);
        int x = themeUI.nameIconbutton.getX();
        int y = themeUI.nameIconbutton.getY();
        assertEquals(105,x);
        assertEquals(210,y);

        int w = themeUI.nameIconbutton.getWidth();
        int h = themeUI.nameIconbutton.getHeight();
        assertEquals(117,w);
        assertEquals(47,h);
    }
    @Test
    public void IconName2Test(){
        assertNotNull(themeUI.nameIconbutton2);
        int x = themeUI.nameIconbutton2.getX();
        int y = themeUI.nameIconbutton2.getY();
        assertEquals(265,x);
        assertEquals(210,y);

        int w = themeUI.nameIconbutton2.getWidth();
        int h = themeUI.nameIconbutton2.getHeight();
        assertEquals(155,w);
        assertEquals(47,h);
    }
    @Test
    public void IconName3Test(){
        assertNotNull(themeUI.nameIconbutton3);
        int x = themeUI.nameIconbutton3.getX();
        int y = themeUI.nameIconbutton3.getY();
        assertEquals(455,x);
        assertEquals(210,y);

        int w = themeUI.nameIconbutton3.getWidth();
        int h = themeUI.nameIconbutton3.getHeight();
        assertEquals(146,w);
        assertEquals(47,h);
    }
    @Test
    public void IconName4Test(){
        assertNotNull(themeUI.nameIconbutton4);
        int x = themeUI.nameIconbutton4.getX();
        int y = themeUI.nameIconbutton4.getY();
        assertEquals(70,x);
        assertEquals(425,y);

        int w = themeUI.nameIconbutton4.getWidth();
        int h = themeUI.nameIconbutton4.getHeight();
        assertEquals(176,w);
        assertEquals(16,h);
    }
    @Test
    public void IconName5Test(){
        assertNotNull(themeUI.nameIconbutton5);
        int x = themeUI.nameIconbutton5.getX();
        int y = themeUI.nameIconbutton5.getY();
        assertEquals(250,x);
        assertEquals(425,y);

        int w = themeUI.nameIconbutton5.getWidth();
        int h = themeUI.nameIconbutton5.getHeight();
        assertEquals(176,w);
        assertEquals(16,h);
    }
    @Test
    public void olympicButtonTest() throws InterruptedException {
        assertNotNull(themeUI.olympicButton);
        int x = themeUI.olympicButton.getX();
        int y = themeUI.olympicButton.getY();
        int w = themeUI.olympicButton.getWidth();
        int h = themeUI.olympicButton.getHeight();

        assertEquals(80,x);
        assertEquals(250,y);
        assertEquals(160,w);
        assertEquals(147,h);

        assertNotNull(themeUI.olympicButton);
        Thread.sleep(1000);
        themeUI.olympicButton.doClick();
        Thread.sleep(1000);
    }
    @Test
    public void halloweenButtonTest() throws InterruptedException {
        assertNotNull(themeUI.halloweenButton);
        int x = themeUI.halloweenButton.getX();
        int y = themeUI.halloweenButton.getY();
        int w = themeUI.halloweenButton.getWidth();
        int h = themeUI.halloweenButton.getHeight();

        assertEquals(260,x);
        assertEquals(250,y);
        assertEquals(160,w);
        assertEquals(147,h);

        assertNotNull(themeUI.halloweenButton);
        Thread.sleep(1000);
        themeUI.halloweenButton.doClick();
        Thread.sleep(1000);
    }
    @Test
    public void christmasButtonTest() throws InterruptedException {
        assertNotNull(themeUI.christmasButton);
        int x = themeUI.christmasButton.getX();
        int y = themeUI.christmasButton.getY();
        int w = themeUI.christmasButton.getWidth();
        int h = themeUI.christmasButton.getHeight();

        assertEquals(445,x);
        assertEquals(250,y);
        assertEquals(160,w);
        assertEquals(147,h);

        assertNotNull(themeUI.christmasButton);
        Thread.sleep(1000);
        themeUI.christmasButton.doClick();
        Thread.sleep(1000);
    }
    @Test
    public void candyButtonTest() throws InterruptedException {
        assertNotNull(themeUI.candyButton);
        int x = themeUI.candyButton.getX();
        int y = themeUI.candyButton.getY();
        int w = themeUI.candyButton.getWidth();
        int h = themeUI.candyButton.getHeight();

        assertEquals(80,x);
        assertEquals(450,y);
        assertEquals(160,w);
        assertEquals(147,h);

        assertNotNull(themeUI.candyButton);
        Thread.sleep(1000);
        themeUI.candyButton.doClick();
        Thread.sleep(1000);
    }
    @Test
    public void spaceButtonTest() throws InterruptedException {
        assertNotNull(themeUI.spaceButton);
        int x = themeUI.spaceButton.getX();
        int y = themeUI.spaceButton.getY();
        int w = themeUI.spaceButton.getWidth();
        int h = themeUI.spaceButton.getHeight();

        assertEquals(260,x);
        assertEquals(450,y);
        assertEquals(160,w);
        assertEquals(147,h);

        assertNotNull(themeUI.spaceButton);
        Thread.sleep(1000);
        themeUI.spaceButton.doClick();
        Thread.sleep(1000);
    }
    @Test
    public void backButtonTest() throws InterruptedException {
        assertNotNull(themeUI.backButton);
        int x = themeUI.backButton.getX();
        int y = themeUI.backButton.getY();
        int w = themeUI.backButton.getWidth();
        int h = themeUI.backButton.getHeight();

        assertEquals(250,x);
        assertEquals(650,y);
        assertEquals(200,w);
        assertEquals(100,h);

        assertNotNull(themeUI.backButton);
        Thread.sleep(1000);
        themeUI.backButton.doClick();
        Thread.sleep(1000);
    }
}
