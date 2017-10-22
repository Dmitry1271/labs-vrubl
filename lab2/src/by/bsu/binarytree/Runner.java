package by.bsu.binarytree;

import by.bsu.binarytree.entity.BinaryTree;
import by.bsu.binarytree.generate.Generator;
import by.bsu.binarytree.searches.BinarySearch;
import by.bsu.binarytree.searches.InterpolationSearch;
import by.bsu.binarytree.sorting.InsertionSorting;
import by.bsu.binarytree.sorting.MixSorting;

import java.util.Arrays;

/**
 * Created by cplus on 03.10.2017.
 */
public class Runner {
    public static void main(String[] args) {
        /*final int MULTIPLICATION_BIRTHDAY = 21 * 1 * 1998; // 41958
        int size = 1000000;
        int maxValue = 10000000;
        int array[];

        Generator generator = new Generator(size, maxValue);
        generator.generateArray();
        array = generator.getArray();

        MixSorting sorting = new MixSorting(array);
        sorting.sortMix();

        BinarySearch binarySearch = new BinarySearch(array, MULTIPLICATION_BIRTHDAY);
        InterpolationSearch interpolationSearch = new InterpolationSearch(array, MULTIPLICATION_BIRTHDAY);
        System.out.println("BINpos: " + binarySearch.searchPosition() + " BINiter: " + binarySearch.getIteration());
        System.out.println("INTRPpos: " + interpolationSearch.searchPosition() + " INTRPiter: " + interpolationSearch.getIteration());*/
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.add(4);
        binaryTree.add(5);
        binaryTree.add(2);
        binaryTree.add(7);
        binaryTree.add(8);
        binaryTree.add(3);
        binaryTree.add(4);
        binaryTree.add(6);
        binaryTree.add(100);
        binaryTree.add(50);
        binaryTree.add(65);
        binaryTree.add(120);
        binaryTree.add(130);
        System.out.println(binaryTree.getDepth());
        System.out.println(binaryTree.toString());
    }
}
