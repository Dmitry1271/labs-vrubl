package by.bsu.primalgorithm.run;


import by.bsu.primalgorithm.drawer.GraphDrawer;
import by.bsu.primalgorithm.entity.Graph;

/**
 * Created by cplus on 09.11.2017.
 */
public class Runner {
    public static void main(String[] args) {
        int[][] matrix2 = new int[][]{
                {0, 3, 0, 0, 0, 5, 2},
                {3, 0, 5, 8, 0, 0, 0},
                {0, 5, 0, 1, 0, 0, 6},
                {0, 8, 1, 0, 4, 0, 0},
                {0, 0, 0, 4, 0, 1, 4},
                {5, 0, 0, 0, 1, 0, 2},
                {2, 0, 6, 0, 4, 2, 0}
        };
        int[][] superMatrix = new int[][]{
                {0, 2, 0, 0, 0, 0, 0, 0, 3, 3, 0, 1},
                {2, 0, 4, 0, 0, 0, 0, 0, 0, 0, 1, 4},
                {0, 4, 0, 2, 0, 0, 0, 0, 0, 0, 2, 0},
                {0, 0, 2, 0, 5, 0, 0, 0, 0, 0, 3, 0},
                {0, 0, 0, 5, 0, 3, 0, 1, 0, 0, 0, 0},
                {0, 0, 0, 0, 3, 0, 4, 2, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 4, 0, 1, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 2, 1, 0, 0, 4, 0, 0},
                {3, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0},
                {3, 0, 0, 0, 0, 0, 0, 4, 2, 0, 1, 0},
                {0, 1, 2, 3, 0, 0, 0, 0, 0, 1, 0, 3},
                {1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0}
        };
        int vertexStart = 4;
        Graph graph = new Graph(superMatrix);
        GraphDrawer gw = new GraphDrawer(graph,vertexStart);
        gw.draw();


    }
}
