package entity;

import java.util.Arrays;

/**
 * Created by Dasha on 12.11.2017.
 */
public class Graph {
        private int[][] matrix;

        public Graph() {
        }

        public Graph(int[][] matrix) {
            this.matrix = matrix;
        }

        public int[][] getMatrix() {
            return matrix;
        }

        public void setMatrix(int[][] matrix) {
            this.matrix = matrix;
        }

        @Override
        public String toString() {
            return "Graph{" +
                    "matrix=" + Arrays.toString(matrix) +
                    '}';
        }
}
