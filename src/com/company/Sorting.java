package com.company;

public class Sorting {

    public void selectionSort(int array[]) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int min = array[minIndex];
            array[minIndex] = array[i];
            array[i] = min;
        }
    }

    public void bubbleSort(int array[]) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j + 1] < array[j]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }

        }
    }

    public void insertionSort(int array[]) {
        for (int i = 1; i < array.length; i++) {
            int j = i - 1;
            int value = array[i];

            while (j > -1 && array[j] > value) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = value;
        }
    }


    public void print(int array[]) {
        for (int i : array) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

}
