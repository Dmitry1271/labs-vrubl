package by.bsu.depthsearch.entity;

import java.util.Arrays;

/**
 * Created by cplus on 07.11.2017.
 */
public class Cell {
    private int i;
    private int j;
    private boolean[] walls;
    private boolean visited;

    public Cell() {
    }

    public Cell(int i, int j) {
        this.i = i;
        this.j = j;
    }

    public Cell(int i, int j, boolean[] walls, boolean visited) {
        this.i = i;
        this.j = j;
        this.walls = walls;
        this.visited = visited;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public boolean[] getWalls() {
        return walls;
    }

    public void setWalls(boolean[] walls) {
        this.walls = walls;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cell cell = (Cell) o;

        if (i != cell.i) return false;
        if (j != cell.j) return false;
        if (visited != cell.visited) return false;
        return Arrays.equals(walls, cell.walls);
    }

    @Override
    public int hashCode() {
        int result = i;
        result = 31 * result + j;
        result = 31 * result + Arrays.hashCode(walls);
        result = 31 * result + (visited ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Cell{" +
                "i=" + i +
                ", j=" + j +
                ", walls=" + Arrays.toString(walls) +
                ", visited=" + visited +
                '}';
    }
}
