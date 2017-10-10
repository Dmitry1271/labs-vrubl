package by.dudko.mergeinsertionsort.generation;

import java.util.Random;

/**
 * Created by cplus on 18.09.2017.
 */
public class ArrayGenerator {
    private int size;
    private int maxValue;
    private int numberArrays;
    private int[] array;
    private int[][] nArrays;
    private Random random = new Random();

    public ArrayGenerator(int size, int maxValue) {
        this.size = size;
        this.maxValue = maxValue;
        array = new int[size];
    }

    public ArrayGenerator(int size, int maxValue, int numberArrays) {
        this.size = size;
        this.maxValue = maxValue;
        this.numberArrays = numberArrays;
        array = new int[size];
        nArrays = new int[numberArrays][size];
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int[] getArray(){
        return array;
    }

    public void generateArray(){
        for(int i = 0; i < size; ++i) {
            array[i] = random.nextInt(maxValue);
        }
    }

    public void generateNArrays(){
        for(int i = 0; i < numberArrays; ++i){
            ArrayGenerator ag = new ArrayGenerator(size,maxValue);
            ag.generateArray();
            nArrays[i] = ag.getArray();
        }
    }

    public int[][] getNArrays(){
        return nArrays;
    }
}
