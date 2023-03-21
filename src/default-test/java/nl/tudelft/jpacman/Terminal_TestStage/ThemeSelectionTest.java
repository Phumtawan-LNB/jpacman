package nl.tudelft.jpacman.Terminal_TestStage;

import nl.tudelft.jpacman.Launcher;
import nl.tudelft.jpacman.game.Game;
import nl.tudelft.jpacman.main.ui.ThemeUI;
import nl.tudelft.jpacman.ui.ThemeConfig;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.*;

import static org.assertj.core.api.Assertions.assertThat;

public class ThemeSelectionTest {
    private Launcher launcher;
    private ThemeUI themeUI;
    @Test
    void setUpPacman() throws InterruptedException {
        themeUI = new ThemeUI();
        Thread.sleep(2000);
        themeUI.dispose();
        launcher = new Launcher();
        ThemeConfig config = new ThemeConfig();
        config.setConfig("0");
        launcher.launch();
        Thread.sleep(5000);
        launcher.dispose();

    }

    @Test
    void setUpPacman2() throws InterruptedException {
        themeUI = new ThemeUI();
        Thread.sleep(2000);
        themeUI.dispose();
        launcher = new Launcher();
        ThemeConfig config = new ThemeConfig();
        config.setConfig("1");
        launcher.launch();
        Thread.sleep(5000);
        launcher.dispose();

    }
    @Test
    void setUpPacman3() throws InterruptedException {
        themeUI = new ThemeUI();
        Thread.sleep(2000);
        themeUI.dispose();
        launcher = new Launcher();
        ThemeConfig config = new ThemeConfig();
        config.setConfig("2");
        launcher.launch();
        Thread.sleep(5000);
        launcher.dispose();
    }
}
