package by.bsu.depthsearch.algorithm;

import by.bsu.depthsearch.entity.Cell;
import by.bsu.depthsearch.entity.Maze;
import by.bsu.depthsearch.entity.Neighbors;

import java.util.Stack;

/**
 * Created by cplus on 07.11.2017.
 */
public class DepthSearch {
    private Maze maze;
    private Stack<Cell> visitedCells = new Stack<>();
    private Cell current;
    private Neighbors neighbors;

    public DepthSearch() {
    }

    public DepthSearch(Maze maze) {
        this.maze = maze;
        doVisitedFalse();
        current = maze.getCells()[0][0];
        neighbors = new Neighbors(maze);
        neighbors.setSearching(true);
    }

    public Cell getCurrent() {
        return current;
    }

    public Stack<Cell> getVisitedCells() {
        return visitedCells;
    }

    public void doSearching() {
        current.setVisited(true);
        Cell next = neighbors.check(current);

        if (next != null) {
            visitedCells.push(current);
            next.setVisited(true);
            current = next;
        } else {
            current = visitedCells.pop();
        }

        neighbors = new Neighbors(maze);
        neighbors.setSearching(true);
    }

    public boolean isEnd() {
        return current.getI() == maze.getCells()[0].length - 1 && current.getJ() == maze.getCells().length - 1;
    }

    private void doVisitedFalse() {
        Cell[][] cells = maze.getCells();
        int rows = cells.length;
        int cols = cells[0].length;

        for (int j = 0; j < rows; ++j) {
            for (int i = 0; i < cols; ++i) {
                cells[j][i].setVisited(false);
            }
        }
    }

}
