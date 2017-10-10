package test.by.dudko.mergeinsertionsort.sortings;

import by.dudko.mergeinsertionsort.sortings.InsertionSort;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by cplus on 25.09.2017.
 */
public class InsertionSortTest {
    @Test
    public void doSortTest() {
        int[] actual = {4, 8, 1, -7, 3, 0, 9, 4, -1, 3, 4};
        int[] expected = {-7, -1, 0, 1, 3, 3, 4, 4, 4, 8, 9};
        InsertionSort is = new InsertionSort(actual);
        is.doSort();
        Assert.assertArrayEquals(expected, actual);
    }
}
