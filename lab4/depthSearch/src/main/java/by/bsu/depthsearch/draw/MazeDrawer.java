package by.bsu.depthsearch.draw;

import by.bsu.depthsearch.algorithm.DepthSearch;
import by.bsu.depthsearch.entity.Maze;
import by.bsu.depthsearch.generate.MazeGenerator;

import javax.swing.*;
import java.awt.*;

import static by.bsu.depthsearch.constants.DrawingConstants.*;

/**
 * Created by cplus on 07.11.2017.
 */
public class MazeDrawer extends JPanel {

    private JFrame frame = new JFrame();
    private DrawHelper drawHelper;
    private MazeGenerator mazeGenerator;
    private DepthSearch depthSearch;
    /*private boolean flag;
    private int one = 0;*/

    {
        drawHelper = new DrawHelper();
        //flag = true;
    }

    public MazeDrawer() {
        mazeGenerator = new MazeGenerator(ROWS, COLS);
        mazeGenerator.generateMaze();
        depthSearch = new DepthSearch(mazeGenerator.getMaze());
    }

    public void draw() {
        frame.setLocation(MARGIN_LEFT, MARGIN_TOP);
        frame.setSize(PANEL_WIDTH + WIDTH_ADD, PANEL_HEIGHT + HEIGHT_ADD);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.getContentPane().add(this);
        frame.setVisible(true);
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        drawHelper.setGraphics(graphics);
        super.paintComponent(graphics);

        try {
            Thread.sleep(SLEEP);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       /* if (!mazeGenerator.isGenerated() || flag) {
            flag = false;
            mazeGenerator.generateMaze();
        }*/

        drawHelper.drawMaze(mazeGenerator.getMaze());
       // drawHelper.drawCurrent(mazeGenerator.getCurrent());

       /* if (mazeGenerator.isGenerated()) {
            if (one++ == 0)*/
                //depthSearch = new DepthSearch(mazeGenerator.getMaze());
            drawHelper.drawCurrent(depthSearch.getCurrent());
            if (!depthSearch.isEnd()) {
                depthSearch.doSearching();
            } else {
                drawHelper.drawPath(depthSearch.getVisitedCells());
            }
        //}

        repaint();
    }

}
