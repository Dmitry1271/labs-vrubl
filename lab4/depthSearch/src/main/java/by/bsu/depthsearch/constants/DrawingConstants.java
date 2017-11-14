package by.bsu.depthsearch.constants;

/**
 * Created by cplus on 09.11.2017.
 */
public final class DrawingConstants {

    /**
     * Panel constants
     */
    public static final int PANEL_WIDTH = 500;
    public static final int PANEL_HEIGHT = 500;
    public static final int WIDTH_ADD = 17;
    public static final int HEIGHT_ADD = 39;
    public static final int MARGIN_TOP = 0;
    public static final int MARGIN_LEFT = 300;
    public static final int SLEEP = 0;

    /**
     * Cell constants
     */
    public static final int CELL_SIZE = 2;

    /**
     * Maze constants
     */
    public static final int COLS = PANEL_WIDTH / CELL_SIZE;
    public static final int ROWS = PANEL_HEIGHT / CELL_SIZE;


    private DrawingConstants() {
    }
}
