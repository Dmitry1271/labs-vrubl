package by.bsu.primkraskalalgorithms.run;


import by.bsu.primkraskalalgorithms.algorithm.KraskalAlgorithm;
import by.bsu.primkraskalalgorithms.algorithm.PrimAlgorithm;
import by.bsu.primkraskalalgorithms.drawer.GraphDrawer;
import by.bsu.primkraskalalgorithms.entity.Graph;

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
                {0, 0, 2, 0, 4, 0, 0, 0, 0, 0, 3, 0},
                {0, 0, 0, 4, 0, 3, 0, 1, 0, 0, 0, 0},
                {0, 0, 0, 0, 3, 0, 4, 2, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 4, 0, 1, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 2, 1, 0, 0, 4, 0, 0},
                {3, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0},
                {3, 0, 0, 0, 0, 0, 0, 4, 2, 0, 1, 0},
                {0, 1, 2, 3, 0, 0, 0, 0, 0, 1, 0, 3},
                {1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0}
        };

        Graph graph = new Graph(superMatrix);
        GraphDrawer gw = new GraphDrawer(graph);
        gw.draw();

       /* KraskalAlgorithm kraskalAlgorithm = new KraskalAlgorithm(graph);
        kraskalAlgorithm.doAlgorithm();
        System.out.println("Kraskal Algorithm");
        System.out.println(kraskalAlgorithm.getResult());
        System.out.println(kraskalAlgorithm.getResultVertexes());*/


    }
}
