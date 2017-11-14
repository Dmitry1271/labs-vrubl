package by.bsu.algorithmdijkstra.run;

import by.bsu.algorithmdijkstra.algorithm.AlgorithmDijkstra;
import by.bsu.algorithmdijkstra.entity.Graph;
import by.bsu.algorithmdijkstra.drawer.GraphDrawer;

/**
 * Created by cplus on 09.11.2017.
 */
public class Runner {
    public static void main(String[] args) {
        int inf = Integer.MAX_VALUE;
        int[][] matrix2 = new int[][]{
                {0  , 3  , inf, inf, inf, 5  , 2  },
                {inf, 0  , 5  , 8  , inf, inf, inf},
                {inf, inf, 0  , 1  , inf, inf, inf},
                {inf, inf, inf, 0  , inf, inf, inf},
                {inf, inf, inf, 4  , 0  , inf, 4  },
                {inf, inf, inf, inf, 1  , 0  , inf},
                {inf, inf, 6  , inf, inf, 2  , 0  }
        };

        int[][] matrix3 = new int[][]{
                {0  , 3  , inf, inf, inf, 5  , 2  },
                {3  , 0  , 5  , 8  , inf, inf, inf},
                {inf, inf, 0  , 1  , inf, inf, 6  },
                {inf, inf, inf, 0  , 4  , inf, inf},
                {inf, inf, inf, 4  , 0  , inf, 4  },
                {inf, inf, inf, inf, 1  , 0  , inf},
                {2  , inf, 6  , inf, inf, 2  , 0  }
        };

        Graph graph = new Graph(matrix2);
        GraphDrawer gw = new GraphDrawer(graph);
        gw.draw();
        AlgorithmDijkstra algorithmDijkstra = new AlgorithmDijkstra(graph, 1);
        algorithmDijkstra.getMinPath();
        System.out.println(algorithmDijkstra.getVertexWeight());

    }
}
