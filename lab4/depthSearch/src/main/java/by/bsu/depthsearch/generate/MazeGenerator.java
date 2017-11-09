package by.bsu.depthsearch.generate;

import by.bsu.depthsearch.entity.Cell;
import by.bsu.depthsearch.entity.Maze;
import by.bsu.depthsearch.entity.Neighbors;

import java.util.Stack;

/**
 * Created by cplus on 07.11.2017.
 */
public final class MazeGenerator {
    private Stack<Cell> visitedCells = new Stack<>();
    private Neighbors neighbors;
    private Maze maze;
    private Cell current;
    private int rows;
    private int cols;

    public MazeGenerator() {

    }

    public MazeGenerator(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        generateCells();
        current = maze.getCells()[0][0];
        neighbors = new Neighbors(maze);
    }

    public Maze getMaze() {
        return maze;
    }

    public Cell getCurrent() {
        return current;
    }

    public void generateMaze() {

        do {
            current.setVisited(true);
            Cell next = neighbors.check(current);

            if (next != null) {
                visitedCells.push(current);
                next.setVisited(true);
                removeWalls(current, next);
                current = next;
            } else if (!visitedCells.isEmpty()) {
                current = visitedCells.pop();
            }

            neighbors = new Neighbors(maze);
        } while (!visitedCells.isEmpty());
    }

    public boolean isGenerated() {
        return current.getI() == 0 && current.getJ() == 0;
    }

    private void generateCells() {
        Cell[][] cells = new Cell[rows][cols];
        for (int j = 0; j < rows; j++) {
            for (int i = 0; i < cols; i++) {
                cells[j][i] = new Cell(i, j, new boolean[]{true, true, true, true}, false);
            }
        }
        maze = new Maze(cells);
    }

    private void removeWalls(Cell current, Cell neighbor) {
        int x = current.getI() - neighbor.getI();

        if (x == 1) {
            current.getWalls()[3] = false;
            neighbor.getWalls()[1] = false;
            return;
        } else if (x == -1) {
            current.getWalls()[1] = false;
            neighbor.getWalls()[3] = false;
            return;
        }

        int y = current.getJ() - neighbor.getJ();
        if (y == 1) {
            current.getWalls()[0] = false;
            neighbor.getWalls()[2] = false;
        } else if (y == -1) {
            current.getWalls()[2] = false;
            neighbor.getWalls()[0] = false;
        }
    }
}
