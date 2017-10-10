package by.bsu.binarytree.searches;

/**
 * Created by cplus on 03.10.2017.
 */
public class BinarySearch {
    private int[] array;
    private int wantedNumber;
    private int position;

    public BinarySearch() {
    }

    public BinarySearch(int[] array, int wantedNumber) {
        this.array = array;
        this.wantedNumber = wantedNumber;
    }

    private void findPositionWantedNumber(int low, int high) {
        if (high - low > 1) {
            int middle = low + (high - low) / 2;
            if (wantedNumber > array[middle]) {
                findPositionWantedNumber(middle + 1, high);
            } else {
                findPositionWantedNumber(low, middle);
            }
        } else {
            if (array[high] == wantedNumber) {
                position = high;
            } else if (array[low] == wantedNumber) {
                position = low;
            } else position = -1;
        }
    }

    public int searchPosition() {
        findPositionWantedNumber(0, array.length - 1);
        return position;
    }
}
