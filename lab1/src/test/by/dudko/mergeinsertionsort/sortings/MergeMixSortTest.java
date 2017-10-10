package test.by.dudko.mergeinsertionsort.sortings;

import by.dudko.mergeinsertionsort.sortings.InsertionSort;
import by.dudko.mergeinsertionsort.sortings.MergeMixSort;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by cplus on 25.09.2017.
 */
public class MergeMixSortTest {
    @Test
    public void doSortMergeTest() {
        int[] actual = {4, 8, 1, -7, 3, 0, 9, 4, -1, 3, 4};
        int[] expected = {-7, -1, 0, 1, 3, 3, 4, 4, 4, 8, 9};
        MergeMixSort mms = new MergeMixSort(actual);
        mms.doSortMerge();
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void doSortMixTest() {
        int[] actual = {4, 8, 1, -7, 3, 0, 9, 4, -1, 3, 4};
        int[] expected = {-7, -1, 0, 1, 3, 3, 4, 4, 4, 8, 9};
        MergeMixSort mms = new MergeMixSort(actual);
        mms.doSortMix();
        Assert.assertArrayEquals(expected, actual);
    }
}
