package by.bsu.hashtable.run;

import by.bsu.hashtable.generate.Generator;
import by.bsu.hashtable.openaddressingcollision.entity.HashTable;

import java.util.Scanner;

/**
 * Created by cplus on 22.10.2017.
 */
public class RunnerOpenAddressingCollision {
    public static void main(String[] args) {
        /*int size = 1002;
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
        Scanner scanner = new Scanner(System.in);
        while (true) {
            hashTable.add(scanner.nextLong());
            System.out.println(hashTable.toString());
        }
    }

}
