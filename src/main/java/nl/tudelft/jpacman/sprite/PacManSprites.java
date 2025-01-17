package nl.tudelft.jpacman.sprite;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import nl.tudelft.jpacman.PacmanConfigurationException;
import nl.tudelft.jpacman.board.Direction;
import nl.tudelft.jpacman.npc.ghost.GhostColor;
import nl.tudelft.jpacman.ui.ThemeConfig;

/**
 * Sprite Store containing the classic Pac-Man sprites.
 *
 * @author Jeroen Roosen 
 */
public class PacManSprites extends SpriteStore {

    /**
     * The sprite files are vertically stacked series for each direction, this
     * array denotes the order.
     */
    private static final Direction[] DIRECTIONS = {
        Direction.NORTH,
        Direction.EAST,
        Direction.SOUTH,
        Direction.WEST
    };

    /**
     * The image size in pixels.
     */
    private static final int SPRITE_SIZE = 16;

    /**
     * The amount of frames in the pacman animation.
     */
    private static final int PACMAN_ANIMATION_FRAMES = 4;

    /**
     * The amount of frames in the pacman dying animation.
     */
    private static final int PACMAN_DEATH_FRAMES = 11;

    /**
     * The amount of frames in the ghost animation.
     */
    private static final int GHOST_ANIMATION_FRAMES = 2;

    /**
     * The delay between frames.
     */
    private static final int ANIMATION_DELAY = 200;

    /**
     * @return A map of animated Pac-Man sprites for all directions.
     */

    public Map<Direction, Sprite> getPacmanSprites() {
        if (config.getConfig()=="0"){
            return directionSprite("/sprite/pacman_olympic.png", PACMAN_ANIMATION_FRAMES);
        }else if (config.getConfig()=="1"){
            return directionSprite("/sprite/pacman_halloween.png", PACMAN_ANIMATION_FRAMES);
        }else if (config.getConfig()=="2"){
            return directionSprite("/sprite/pacman_crismas.png", PACMAN_ANIMATION_FRAMES);
        }else if (config.getConfig()=="3"){
            return directionSprite("/sprite/pacman_candy.png", PACMAN_ANIMATION_FRAMES);
        }else {
            return directionSprite("/sprite/pacman_space.png", PACMAN_ANIMATION_FRAMES);
        }
    }

    /**
     * @return The animation of a dying Pac-Man.
     */
    public AnimatedSprite getPacManDeathAnimation() {
        String resource = "/sprite/dead.png";

        Sprite baseImage = loadSprite(resource);
        AnimatedSprite animation = createAnimatedSprite(baseImage, PACMAN_DEATH_FRAMES,
            ANIMATION_DELAY, false);
        animation.setAnimating(false);

        return animation;
    }

    /**
     * Returns a new map with animations for all directions.
     *
     * @param resource
     *            The resource name of the sprite.
     * @param frames
     *            The number of frames in this sprite.
     * @return The animated sprite facing the given direction.
     */
    private Map<Direction, Sprite> directionSprite(String resource, int frames) {
        Map<Direction, Sprite> sprite = new HashMap<>();

        Sprite baseImage = loadSprite(resource);
        for (int i = 0; i < DIRECTIONS.length; i++) {
            Sprite directionSprite = baseImage.split(0, i * SPRITE_SIZE, frames
                * SPRITE_SIZE, SPRITE_SIZE);
            AnimatedSprite animation = createAnimatedSprite(directionSprite,
                frames, ANIMATION_DELAY, true);
            animation.setAnimating(true);
            sprite.put(DIRECTIONS[i], animation);
        }

        return sprite;
    }

    /**
     * Returns a map of animated ghost sprites for all directions.
     *
     * @param color
     *            The colour of the ghost.
     * @return The Sprite for the ghost.
     */
    public Map<Direction, Sprite> getGhostSprite(GhostColor color) {
        assert color != null;

        if (config.getConfig() == "0"){
            String resource = "/sprite/theme_olympic/ghost_" + color.name().toLowerCase()
                + ".png";
            return directionSprite(resource, GHOST_ANIMATION_FRAMES);
        }
        else if (config.getConfig() == "1"){
            String resource = "/sprite/theme_halloween/ghost_" + color.name().toLowerCase()
                + ".png";
            return directionSprite(resource, GHOST_ANIMATION_FRAMES);
        }

        else if (config.getConfig() == "2"){
            String resource = "/sprite/theme_christmas/ghost_" + color.name().toLowerCase()
                + ".png";
            return directionSprite(resource, GHOST_ANIMATION_FRAMES);
        }
        else if (config.getConfig() == "3"){
            String resource = "/sprite/theme_candy/ghost_" + color.name().toLowerCase()
                + ".png";
            return directionSprite(resource, GHOST_ANIMATION_FRAMES);
        }
        else {
            String resource = "/sprite/theme_space/ghost_" + color.name().toLowerCase()
                + ".png";
            return directionSprite(resource, GHOST_ANIMATION_FRAMES);
        }
    }

    /**
     * @return The sprite for the wall.
     */
    ThemeConfig config = new ThemeConfig();
    public Sprite getWallSprite() {
        if (config.getConfig()=="0"){
            return loadSprite("/sprite/wall_olympic.png");
        } else if (config.getConfig()=="1"){
            return loadSprite("/sprite/wall_halloween.png");
        }else if (config.getConfig()=="2"){
            return loadSprite("/sprite/wall_christmas.png");
        }else if (config.getConfig()=="3"){
            return loadSprite("/sprite/wall_candy.png");
        }else {
            return loadSprite("/sprite/wall_space.png");
        }
    }

    /**
     * @return The sprite for the ground.
     */
    public Sprite getGroundSprite() {
        if (config.getConfig()=="0"){
            return loadSprite("/sprite/floor_olympic.png");
        }else if(config.getConfig()=="1"){
            return loadSprite("/sprite/floor.png");
        }else if(config.getConfig()=="2"){
            return loadSprite("/sprite/floor.png");
        }else if(config.getConfig()=="3"){
            return loadSprite("/sprite/floor_candy.png");
        }else {
            return loadSprite("/sprite/floor_space.png");
        }
    }

    /**
     * @return The sprite for the
     */
    public Sprite getPelletSprite() {
        if (config.getConfig()=="0"){
            return loadSprite("/sprite/point_olympic.png");
        }else if (config.getConfig()=="1"){
            return loadSprite("/sprite/point_halloween.png");
        }else if (config.getConfig()=="2"){
            return loadSprite("/sprite/point_cristmas.png");
        }else if (config.getConfig()=="3"){
            return loadSprite("/sprite/pellet_candy.png");
        }else {
            return loadSprite("/sprite/point_space.png");
        }
    }

    /**
     * Overloads the default sprite loading, ignoring the exception. This class
     * assumes all sprites are provided, hence the exception will be thrown as a
     * {@link RuntimeException}.
     *
     * {@inheritDoc}
     */
    @Override
    public Sprite loadSprite(String resource) {
        try {
            return super.loadSprite(resource);
        } catch (IOException e) {
            throw new PacmanConfigurationException("Unable to load sprite: " + resource, e);
        }
    }
}
