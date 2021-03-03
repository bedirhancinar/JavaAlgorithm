package com.company;

import java.util.Arrays;

public class SearchMain {

    public static void main(String[] args) {

        int[] array = {11, 22, 13, 43, 18, 12, 19, 9, 1, 55};

        Search search = new Search();
        System.out.println(Arrays.toString(array));
        System.out.println(search.linearSearch(array, 12)+"\n");

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println(search.binarySearch(array, 12));
    }
}
