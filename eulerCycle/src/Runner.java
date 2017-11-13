import action.Search;
import entity.Graph;

/**
 * Created by Dasha on 12.11.2017.
 */
public class Runner {
    public static void main(String[] args) {
        int[][] matrix1 = new int[][]{{0, 1, 0, 0, 1, 1, 1},
                                      {1, 0, 1, 1, 1, 0, 0},
                                      {0, 1, 0, 1, 0, 0, 0},
                                      {0, 1, 1, 0, 1, 1, 0},
                                      {1, 1, 0, 1, 0, 1, 0},
                                      {1, 0, 0, 1, 1, 0, 1},
                                      {1, 0, 0, 0, 0, 1, 0}
        };

        Graph graph = new Graph(matrix1);
        Search search = new Search(graph);
        search.doSearch();
        System.out.println(search.getCycle());
    }
}
