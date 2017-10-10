package by.dudko.mergeinsertionsort.sortings;

/**
 * Created by cplus on 18.09.2017.
 */
public class QuickSort {
    private int[] array;

    public QuickSort(int[] array) {
        this.array = array;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    private void sort(int low, int high) {
        int i = low, j = high;
        int pivot = array[(high + low) / 2];
        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                swap(i++, j--);
            }
            if (low < j) {
                sort(low, j);
            }
            if (i < high) {
                sort(i, high);
            }
        }
    }

    private void swap(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public void doSort() {
        sort(0, array.length - 1);
    }
}
