package by.dudko.mergeinsertionsort.fileHelper;

import java.io.*;
import java.util.Formatter;

/**
 * Created by cplus on 24.09.2017.
 */
public class ArrayFileWriter {
    private int[][] array;
    private Formatter file;

    public ArrayFileWriter(int[][] array) {
        this.array = array;
    }

    public void write(String path) {
        try {
            file = new Formatter(path);
            for (int i = 0; i < array.length; ++i) {
                for (int j = 0; j < array[0].length; ++j) {
                    file.format("%s ", array[i][j]);
                }
            }
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        } finally {
            file.close();
        }
    }
}
