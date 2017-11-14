package by.bsu.algorithmdijkstra.algorithm;

import by.bsu.algorithmdijkstra.entity.Graph;
import by.bsu.algorithmdijkstra.entity.Point;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by cplus on 14.11.2017.
 */
public class AlgorithmDijkstra {
    private Graph graph;
    private Map<Integer, Point> vertexWeight = new HashMap<>();
    private int[][] matrix;
    private int size;

    public AlgorithmDijkstra() {
    }

    public AlgorithmDijkstra(Graph graph, int vertex) {
        this.graph = graph;
        size = graph.getMatrix().length;
        matrix = graph.getMatrix();
        setVertexWeight();
        vertexWeight.get(vertex).setWeight(0);
    }

    public void getMinPath() {
        int weight = -10;
        int w = -10;
        while (!allIsVisited()) {

            w = getMinPosition();
            for (int i = 0; i < size; ++i) {
                weight = matrix[w - 1][i];
                if (weight > 0 && weight < Integer.MAX_VALUE) {
                    if (vertexWeight.get(i + 1).getWeight() > weight + vertexWeight.get(w).getWeight()) {
                        vertexWeight.get(i + 1).setWeight(weight + vertexWeight.get(w).getWeight());
                    }
                }
            }

            vertexWeight.get(w).setVisited(true);

        }
    }


    public Map<Integer, Point> getVertexWeight() {
        return vertexWeight;
    }

    private int getMinPosition() {
        int min = Integer.MAX_VALUE;
        int minPosition = -1;

        for (Integer key : vertexWeight.keySet()) {
            if (!vertexWeight.get(key).isVisited()) {
                min = vertexWeight.get(key).getWeight();
                minPosition = key;
                break;
            }
        }

        for (Integer key : vertexWeight.keySet()) {
            if (vertexWeight.get(key).getWeight() < min && !vertexWeight.get(key).isVisited()) {
                min = vertexWeight.get(key).getWeight();
                minPosition = key;
            }
        }
        return minPosition;
    }

    private boolean allIsVisited() {
        int count = 0;
        for (Integer key : vertexWeight.keySet()) {
            if (!vertexWeight.get(key).isVisited()) {
                count++;
            }
        }
        return count == 0;
    }

    private void setVertexWeight() {
        for (int i = 1; i <= size; i++) {
            vertexWeight.put(i, graph.getPoints()[i - 1]);
        }
    }
}
