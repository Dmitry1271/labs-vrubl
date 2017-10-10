package by.dudko.mergeinsertionsort.action;

import by.dudko.mergeinsertionsort.generation.ArrayGenerator;
import by.dudko.mergeinsertionsort.sortings.InsertionSort;
import by.dudko.mergeinsertionsort.sortings.MergeMixSort;

import java.util.Arrays;

/**
 * Created by cplus on 25.09.2017.
 */
public class NumberFounder {
    private InsertionSort is;
    private MergeMixSort mms;
    private ArrayGenerator generator;

    public int found(){
        int size = 2;
        int maxValue = 300;
        long timeIns = 0;
        long timeMerge = 1;

        while (timeMerge > timeIns) {

            generator = new ArrayGenerator(size, maxValue);
            generator.generateArray();
            int[] arr1 = Arrays.copyOf(generator.getArray(), generator.getSize());
            int[] arr2 = Arrays.copyOf(generator.getArray(), generator.getSize());

            long start1 = System.currentTimeMillis();
            for (int i = 0; i < 50000; ++i) {
                InsertionSort is = new InsertionSort(arr1);
                is.doSort();
            }
            long finish1 = System.currentTimeMillis();

            long start2 = System.currentTimeMillis();
            for (int i = 0; i < 50000; ++i) {
                MergeMixSort mms = new MergeMixSort(arr2);
                mms.doSortMerge();
            }
            long finish2 = System.currentTimeMillis();

            timeIns = finish1 - start1;
            timeMerge = finish2 - start2;
            size++;
        }
        return size;
    }

}
