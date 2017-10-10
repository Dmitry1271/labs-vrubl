package by.dudko.mergeinsertionsort.run;

import by.dudko.mergeinsertionsort.action.NumberFounder;
import by.dudko.mergeinsertionsort.consoleHelp.Writer;
import by.dudko.mergeinsertionsort.fileHelper.ArrayFileReader;
import by.dudko.mergeinsertionsort.fileHelper.ArrayFileWriter;
import by.dudko.mergeinsertionsort.generation.ArrayGenerator;
import by.dudko.mergeinsertionsort.sortings.InsertionSort;
import by.dudko.mergeinsertionsort.sortings.MergeMixSort;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by cplus on 18.09.2017.
 */
 public class Runner {
    public static void main(String[] args) {
        int size = 300000;
        int maxValue = 100000;
        int numberArrays = 200;
        int[][] arrays;

        ArrayGenerator generator = new ArrayGenerator(size, maxValue, numberArrays);
        generator.generateNArrays();
        ArrayFileWriter aw = new ArrayFileWriter(generator.getNArrays());
        aw.write("arrays.txt");



        ArrayFileReader arf = new ArrayFileReader(size,numberArrays);
        arf.readArrays("arrays.txt");
        arrays = arf.getArray();

        long start = System.currentTimeMillis();
        for(int[] array: arrays){
            MergeMixSort mms = new MergeMixSort(array);
            mms.doSortMerge();
        }
        long finish = System.currentTimeMillis();
        System.out.println(finish - start);


/*
        int nn = 5;
        int sum = 0;
        int elem;
        for (int i = 0; i < nn; ++i) {
            elem = new NumberFounder().found();
            System.out.println(elem);
            sum += elem;
        }
        System.out.println("END!" + sum / nn);*/
    }
}
