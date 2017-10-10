package by.dudko.mergeinsertionsort.sortings;

        import by.dudko.mergeinsertionsort.Constants;
        import java.util.Arrays;

/**
 * Created by cplus on 18.09.2017.
 */
public class MergeMixSort {
    private int[] array;
    private int[] helper;
    private InsertionSort is;

    public MergeMixSort(int[] array) {
        //this.array = array;
        this.array = Arrays.copyOf(array,array.length);
        helper = new int[array.length];
    }

    private void sortMerge(int low, int high) {
        if (low < high) {
            int middle = (low + high) / 2;
            sortMerge(low, middle);
            sortMerge(middle + 1, high);

            merge(low, middle, high);
        }
    }

    private void sortMix(int low, int high) {
        if (low < high) {
            int middle = (low + high) / 2;
            if (high - low >= Constants.NUMBER) {
                sortMix(low, middle);
                sortMix(middle + 1, high);
            } else {
                is = new InsertionSort(array);
                is.doSort(low, high);
                array = is.getArray();
            }
            merge(low, middle, high);
        }
    }

    private void merge(int low, int middle, int high) {
        for (int i = low; i <= high; ++i) {
            helper[i] = array[i];
        }

        int i = low;
        int j = middle + 1;
        int k = low;

        while (i <= middle && j <= high) {
            if (helper[i] <= helper[j]) {
                array[k++] = helper[i++];
            } else {
                array[k++] = helper[j++];
            }
        }

        while (i <= middle) {
            array[k++] = helper[i++];
        }
    }

    public void doSortMix() {
        sortMix(0, array.length - 1);
    }

    public void doSortMerge() {
        sortMerge(0, array.length - 1);
    }
}
