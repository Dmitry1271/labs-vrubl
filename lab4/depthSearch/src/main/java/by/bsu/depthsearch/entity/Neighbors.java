package by.bsu.depthsearch.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by cplus on 07.11.2017.
 */
public class Neighbors {
    private boolean isSearching;
    private Cell[][] cells;
    private Cell top;
    private Cell right;
    private Cell bottom;
    private Cell left;
    private List<Cell> neighbors = new ArrayList<>();

    public Neighbors() {
    }

    public Neighbors(Maze maze) {
        cells = maze.getCells();
    }

    public void setSearching(boolean searching) {
        isSearching = searching;
    }

    private void initNeighborCells(Cell cell) {
        int j = cell.getJ();
        int i = cell.getI();
        int rows = cells.length;
        int cols = cells[0].length;

        if (!isSearching) {
            if (isValidNeighbors(j - 1, i, rows, cols)) {
                top = cells[j - 1][i];
            }
            if (isValidNeighbors(j, i + 1, rows, cols)) {
                right = cells[j][i + 1];
            }
            if (isValidNeighbors(j + 1, i, rows, cols)) {
                bottom = cells[j + 1][i];
            }
            if (isValidNeighbors(j, i - 1, rows, cols)) {
                left = cells[j][i - 1];
            }
        } else {
            if (isValidNeighbors(j - 1, i, rows, cols) && !cell.getWalls()[0]) {
                top = cells[j - 1][i];
            }
            if (isValidNeighbors(j, i + 1, rows, cols) && !cell.getWalls()[1]) {
                right = cells[j][i + 1];
            }
            if (isValidNeighbors(j + 1, i, rows, cols) && !cell.getWalls()[2]) {
                bottom = cells[j + 1][i];
            }
            if (isValidNeighbors(j, i - 1, rows, cols) && !cell.getWalls()[3]) {
                left = cells[j][i - 1];
            }
        }
    }

    public Cell check(Cell cell) {
        initNeighborCells(cell);

        addNeighbor(top);
        addNeighbor(right);
        addNeighbor(bottom);
        addNeighbor(left);

        int size = neighbors.size();
        if (size > 0) {
            int r = new Random().nextInt(size);
            return neighbors.get(r);
        } else {
            return null;
        }
    }

    private boolean isValidNeighbors(int j, int i, int rows, int cols) {
        return !(i < 0 || j < 0 || i > cols - 1 || j > rows - 1);
    }

    private void addNeighbor(Cell cell) {
        if (cell != null && !cell.isVisited()) {
            neighbors.add(cell);
        }
    }
}
