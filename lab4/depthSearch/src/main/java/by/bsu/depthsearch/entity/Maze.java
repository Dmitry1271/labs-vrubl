package by.bsu.depthsearch.entity;

import java.util.Arrays;

/**
 * Created by cplus on 07.11.2017.
 */
public class Maze {
    private Cell[][] cells;

    public Maze() {
    }

    public Maze(Cell[][] cells) {
        this.cells = cells;
    }

    public Cell[][] getCells() {
        return cells;
    }

    public void setCells(Cell[][] cells) {
        this.cells = cells;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Maze maze = (Maze) o;

        return Arrays.deepEquals(cells, maze.cells);
    }

    @Override
    public int hashCode() {
        return Arrays.deepHashCode(cells);
    }

    @Override
    public String toString() {
        return "Maze{" +
                "cells=" + Arrays.toString(cells) +
                '}';
    }
}
