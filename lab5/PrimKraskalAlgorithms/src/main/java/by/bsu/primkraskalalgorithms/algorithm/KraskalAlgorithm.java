package by.bsu.primkraskalalgorithms.algorithm;

import by.bsu.primkraskalalgorithms.entity.Edge;
import by.bsu.primkraskalalgorithms.entity.Graph;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cplus on 14.11.2017.
 */
public class KraskalAlgorithm {
    private List<Edge> result = new ArrayList<>();
    private List<Integer> resultVertexes = new ArrayList<>();
    private int[][] matrix;
    private int size;
    private boolean flag = false;

    public KraskalAlgorithm() {
    }

    public KraskalAlgorithm(Graph graph) {
        matrix = graph.getMatrix();
        size = matrix.length;
    }

    public List<Edge> getResult() {
        return result;
    }

    public List<Integer> getResultVertexes() {
        return resultVertexes;
    }

    public void doAlgorithm() {

    }


}
