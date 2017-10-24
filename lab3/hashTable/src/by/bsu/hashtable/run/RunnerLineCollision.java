package by.bsu.hashtable.run;

import by.bsu.hashtable.linearcollizion.entity.HashTable;
import by.bsu.hashtable.generate.Generator;

import java.util.Scanner;

/**
 * Created by cplus on 22.10.2017.
 */
public class RunnerLineCollision {
    public static void main(String[] args) {
        /*int size = 1000;
        long maxValue = 10000000000L;
        Generator generator = new Generator(size, maxValue);
        generator.generate();
        HashTable hashTable = new HashTable();
        int[] array = generator.getArray();
        for (int elem : array) {
            hashTable.add(elem);
        }
        System.out.println(hashTable.toString());*/
        HashTable hashTable = new HashTable();
        hashTable.add(1);
        hashTable.add(2);
        hashTable.add(114);
        hashTable.add(4);
        hashTable.add(117);
        hashTable.add(4);
        hashTable.remove(4);
        hashTable.remove(4);
        hashTable.remove(117);
        System.out.println(hashTable.toString());
        System.out.println(hashTable.find(114));
        Scanner scanner = new Scanner(System.in);
        while(true){
            hashTable.add(scanner.nextLong());
            System.out.println(hashTable.toString());
        }
    }
}
