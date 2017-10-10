package by.dudko.mergeinsertionsort.fileHelper;

import by.dudko.mergeinsertionsort.sortings.InsertionSort;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by cplus on 24.09.2017.
 */
public class ArrayFileReader {
    private Scanner scanner;
    private int[][] array;
    private int size;
    private int numberArrays;

    public ArrayFileReader(int size, int numberArrays) {
        this.size = size;
        this.numberArrays = numberArrays;
        this.array = new int[numberArrays][size];
    }

    public int[][] readArrays(String path) {
        try {
            int i = 0;
            int j = 0;
            scanner = new Scanner(new FileInputStream(path));
            while (scanner.hasNext()) {
                if (i < size && j < numberArrays) {
                    array[j][i++] = Integer.parseInt(scanner.next());
                } else if (j < numberArrays) {
                    j++;
                    i = 0;
                } else break;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public int[][] getArray() {
        return array;
    }
}
