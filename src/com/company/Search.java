package com.company;

public class Search {
    public int linearSearch(int array[], int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value)
                return i;
        }
        return -1;
    }

    public int binarySearch(int array[], int value) {
        int first = 0;
        int last = array.length - 1;

        while (!(first > last)) {
            int middle = (first + last) / 2;

            if (array[middle] == value)
                return middle;
            else if (array[middle] < value)
                first = middle + 1;
            else
                last = middle - 1;
        }
        return  -1;
    }
}
