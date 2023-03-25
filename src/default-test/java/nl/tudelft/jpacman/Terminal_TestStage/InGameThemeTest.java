package nl.tudelft.jpacman.Terminal_TestStage;

import nl.tudelft.jpacman.Launcher;
import nl.tudelft.jpacman.board.Direction;
import nl.tudelft.jpacman.game.Game;
import nl.tudelft.jpacman.level.Player;
import nl.tudelft.jpacman.main.ui.GameOver;
import nl.tudelft.jpacman.main.ui.GameVictory;
import nl.tudelft.jpacman.main.ui.ThemeUI;
import nl.tudelft.jpacman.ui.ThemeConfig;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class InGameThemeTest {
    private Launcher launcher;
    public ThemeConfig config;
    @BeforeEach
    public void setUpGameOlympicTest(){
        launcher = new Launcher();
        config = new ThemeConfig();
        config.setConfig("0");
        launcher.launch();
    }
    @BeforeEach
    public void setUpGameHalloweenTest(){
        launcher = new Launcher();
        config = new ThemeConfig();
        config.setConfig("1");
        launcher.launch();
    }
    @BeforeEach
    public void setUpGameChristmasTest(){
        launcher = new Launcher();
        config = new ThemeConfig();
        config.setConfig("2");
        launcher.launch();
    }
    @BeforeEach
    public void setUpGameCandyTest(){
        launcher = new Launcher();
        config = new ThemeConfig();
        config.setConfig("3");
        launcher.launch();
    }
    @BeforeEach
    public void setUpGameSpaceTest(){
        launcher = new Launcher();
        config = new ThemeConfig();
        config.setConfig("4");
        launcher.launch();
    }
    @AfterEach
    public void setDownGame() {
        launcher.dispose();
    }
    @Test
    void setPacmanGameTest() throws InterruptedException {
        Thread.sleep(3000);
        Game game = launcher.getGame();
        Player player = game.getPlayers().get(0);

        // start cleanly.
        assertThat(game.isInProgress()).isFalse();
        game.start();
        assertThat(game.isInProgress()).isTrue();
        assertThat(player.getScore()).isZero();

        // get points
        game.move(player, Direction.EAST);
        assertThat(player.getScore()).isEqualTo(10);

        // now moving back does not change the score
        game.move(player, Direction.WEST);
        assertThat(player.getScore()).isEqualTo(10);

        // try to move as far as we can
        move(game, Direction.EAST, 7);
        assertThat(player.getScore()).isEqualTo(60);

        // move towards the monsters
        move(game, Direction.NORTH, 6);
        assertThat(player.getScore()).isEqualTo(120);

        // no more points to earn here.
        move(game, Direction.WEST, 2);
        assertThat(player.getScore()).isEqualTo(120);

        move(game, Direction.NORTH, 2);

        // Sleeping in tests is generally a bad idea.
        // Here we do it just to let the monsters move.
        Thread.sleep(500l);

        // we're close to monsters, this will get us killed.
        move(game, Direction.WEST, 10);
        move(game, Direction.EAST, 10);
        assertThat(player.isAlive()).isFalse();
        System.out.println(player.isAlive()); // confirm player All theme is already dead

        game.stop();
        assertThat(game.isInProgress()).isFalse();
    }
    public static void move(Game game, Direction dir, int numSteps) {
        Player player = game.getPlayers().get(0);
        for (int i = 0; i < numSteps; i++) {
            game.move(player, dir);
        }
    }
}
