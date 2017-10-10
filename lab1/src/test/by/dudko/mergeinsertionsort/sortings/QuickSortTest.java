package test.by.dudko.mergeinsertionsort.sortings;

import by.dudko.mergeinsertionsort.sortings.MergeMixSort;
import by.dudko.mergeinsertionsort.sortings.QuickSort;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by cplus on 25.09.2017.
 */
public class QuickSortTest {
    @Test
    public void doSortTest() {
        int[] actual = {4, 8, 1, -7, 3, 0, 15, 9, 4, 10, -1, 3, 4};
        int[] expected = {-7, -1, 0, 1, 3, 3, 4, 4, 4, 8, 9, 10, 15};
        QuickSort qs = new QuickSort(actual);
        qs.doSort();
        Assert.assertArrayEquals(expected, actual);
    }
}
