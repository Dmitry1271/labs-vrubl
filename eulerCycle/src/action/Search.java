package action;

import entity.Graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by Dasha on 12.11.2017.
 */
public class Search {
    private Graph graph;
    private Stack<Integer> st = new Stack<>();
    private List<Integer> cycle = new ArrayList<>();
    private int[][] matrix;
    private int size;

    public Search(Graph graph){
        this.graph = graph;
        matrix = graph.getMatrix();
        size = graph.getMatrix().length;
    }

    public void searchHelper(){
        int k = 0;
        st.push(0);
        while(!st.isEmpty()){
           if(degrees(st.peek())==0){
                cycle.add(st.pop());
           } else{
               for(int i = 0; i < size; i++){
                   if(matrix[st.peek()][i] == 1){
                       k = i;
                       matrix[st.peek()][i] = 0;
                       matrix[i][st.peek()] = 0;
                       break;
                   }
               }
               st.add(k);
           }
        }
    }

    public void doSearch() {
        int k = 0;
        int k1 = 0;
        for (int i = 0; i < size; i++) {
            k = 0;
            for(int j = 0; j < size; j++){
                if(matrix[i][j] == 1){
                    k++;
                }
            }
            if(k%2 == 0){
                k1++;
            }
        }
        if(k1 == size){
            searchHelper();
        }
    }

    private int degrees(int vert) {
        int k = 0;
        for (int i = 0; i < size; i++) {
            if (matrix[vert][i] == 1) {
                k++;
            }
        }
        return k;
    }

    public List<Integer> getCycle() {
        return cycle;
    }

}
