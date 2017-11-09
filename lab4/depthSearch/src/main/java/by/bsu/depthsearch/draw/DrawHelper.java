package by.bsu.depthsearch.draw;

import by.bsu.depthsearch.entity.Cell;
import by.bsu.depthsearch.entity.Maze;

import java.awt.*;
import java.util.Stack;

import static by.bsu.depthsearch.constants.DrawingConstants.CELL_SIZE;

/**
 * Created by cplus on 07.11.2017.
 */
public final class DrawHelper {
    private final Color LINE_COLOR = Color.BLACK;
    private final Color MAZE_COLOR = Color.ORANGE;
    private final Color CURRENT_COLOR = Color.blue;

    private final int TOP_LINE = 0;
    private final int RIGHT_LINE = 1;
    private final int BOTTOM_LINE = 2;
    private final int LEFT_LINE = 3;

    private Graphics graphics;

    public DrawHelper() {
    }

    public DrawHelper(Graphics graphics) {
        this.graphics = graphics;
    }

    public Graphics getGraphics() {
        return graphics;
    }

    public void setGraphics(Graphics graphics) {
        this.graphics = graphics;
    }

    public void drawMaze(Maze maze) {
        int rows = maze.getCells().length;
        int cols = maze.getCells()[0].length;
        Cell[][] cells = maze.getCells();

        for (int j = 0; j < rows; ++j) {
            for (int i = 0; i < cols; ++i) {
                drawCell(cells[j][i], MAZE_COLOR);
            }
        }

    }

    public void drawCurrent(Cell cell) {
        int x = cell.getI() * CELL_SIZE;
        int y = cell.getJ() * CELL_SIZE;

        graphics.setColor(CURRENT_COLOR);
        graphics.fillRect(x + 1, y + 1, CELL_SIZE - 1, CELL_SIZE - 1);
    }

    public void drawPath(Stack<Cell> cells) {
        for (Cell cell : cells) {
            drawCell(cell, Color.green);
        }
    }

    private void drawCell(Cell cell, Color color) {

        int x = cell.getI() * CELL_SIZE;
        int y = cell.getJ() * CELL_SIZE;

        if (cell.isVisited()) {
            graphics.setColor(color);
            graphics.fillRect(x, y, CELL_SIZE, CELL_SIZE);
        }

        graphics.setColor(LINE_COLOR);

        if (cell.getWalls()[TOP_LINE]) {
            graphics.drawLine(x, y, x + CELL_SIZE, y);
        }
        if (cell.getWalls()[RIGHT_LINE]) {
            graphics.drawLine(x + CELL_SIZE, y, x + CELL_SIZE, y + CELL_SIZE);
        }
        if (cell.getWalls()[BOTTOM_LINE]) {
            graphics.drawLine(x, y + CELL_SIZE, x + CELL_SIZE, y + CELL_SIZE);
        }
        if (cell.getWalls()[LEFT_LINE]) {
            graphics.drawLine(x, y, x, y + CELL_SIZE);
        }

    }
}
