package by.dudko.mergeinsertionsort.sortings;

import java.util.Arrays;
import java.util.List;

/**
 * Created by cplus on 18.09.2017.
 */
public class InsertionSort {
    private int[] array;

    public InsertionSort(int[] array) {
        //this.array = array;
        this.array = Arrays.copyOf(array, array.length);
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public void doSort() {
        int x;
        int j;
        for (int i = 1; i < array.length; ++i) {
            x = array[i];
            j = i;
            while (j > 0 && array[j - 1] > x) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = x;
        }
    }

    public void doSort(int low, int high) {
        int x;
        int j;
        for (int i = low + 1; i <= high; ++i) {
            x = array[i];
            j = i;
            while (j > low && array[j - 1] > x) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = x;
        }
    }
}
