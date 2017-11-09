package by.bsu.widewidthSearch.entity;

import by.bsu.widewidthSearch.generate.Generator;

import java.awt.*;
import java.util.Arrays;

/**
 * Created by cplus on 02.11.2017.
 */
public class Graph {
    private int[][] matrix;
    private Point[] points;

    public Graph() {
    }

    public Graph(int[][] matrix) {
        this.matrix = matrix;
        points = Generator.generatePoints(matrix.length);
    }

    public Graph(int[][] matrix, Point[] points) {
        this.matrix = matrix;
        this.points = points;
    }

    public Point[] getPoints() {
        return points;
    }

    public void setPoints(Point[] points) {
        this.points = points;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Graph graph = (Graph) o;

        return Arrays.deepEquals(matrix, graph.matrix);
    }

    @Override
    public int hashCode() {
        return Arrays.deepHashCode(matrix);
    }

    @Override
    public String toString() {
        return "Graph{" +
                "matrix=" + Arrays.toString(matrix) +
                '}';
    }
}
