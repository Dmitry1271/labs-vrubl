package by.bsu.algorithmdijkstra.run;

import by.bsu.algorithmdijkstra.entity.Graph;
import by.bsu.algorithmdijkstra.drawer.GraphDrawer;

/**
 * Created by cplus on 09.11.2017.
 */
public class Runner {
    public static void main(String[] args) {
        int[][] matrix1 = new int[][]{
                {0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 1, 1, 0, 0, 0, 1, 0},
                {0, 1, 0, 0, 1, 0, 0, 0, 0},
                {0, 1, 0, 0, 0, 1, 1, 0, 0},
                {0, 1, 1, 0, 0, 1, 0, 0, 0},
                {0, 0, 0, 1, 1, 0, 1, 0, 1},
                {1, 0, 0, 1, 0, 1, 0, 1, 0},
                {0, 1, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 1, 0, 0, 0}};
        int[][] matrix2 = new int[][]{
                {0, 1, 0, 0, 1},
                {1, 0, 1, 1, 0},
                {0, 1, 0, 0, 1},
                {0, 1, 0, 0, 1},
                {1, 0, 1, 1, 0}
        };

        Graph graph = new Graph(matrix2);
        GraphDrawer gw = new GraphDrawer(graph);
        gw.draw();
    }
}
