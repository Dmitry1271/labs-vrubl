package by.bsu.binarytree;

import by.bsu.binarytree.searches.BinarySearch;
import by.bsu.binarytree.sorting.InsertionSorting;
import by.bsu.binarytree.sorting.MixSorting;

/**
 * Created by cplus on 03.10.2017.
 */
public class Runner {
    public static void main(String[] args) {
        int[] arr = {-12, -10, -9, -8, -7, -3, -2, -1, 0, 1, 2, 3, 4, 50, 65, 77, 89, 91, 120, 171, 182, 193};
            BinarySearch binarySearch = new BinarySearch(arr, -9);
            System.out.print(binarySearch.searchPosition() + " ");
    }
}
