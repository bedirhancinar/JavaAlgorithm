package com.company;

import java.util.Arrays;
import java.util.Random;

public class SortingMain {

    public static void main(String[] args) {



        Sorting sorting = new Sorting();

        int[] array = randomArrayGenerate(20);
        sorting.selectionSort(array);
        System.out.println(Arrays.toString(array)+"\n\n");

        array = randomArrayGenerate(20);
        sorting.bubbleSort(array);
        System.out.println(Arrays.toString(array)+"\n\n");

        array = randomArrayGenerate(20);
        sorting.insertionSort(array);
        System.out.println(Arrays.toString(array)+"\n\n");
    }

    private static int[] randomArrayGenerate(int length) {
        Random rndm = new Random();
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = rndm.nextInt(100);
        }
        System.out.println(Arrays.toString(array));
        return array;
    }
}
