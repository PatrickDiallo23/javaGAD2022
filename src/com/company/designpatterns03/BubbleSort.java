package com.company.designpatterns03;

public class BubbleSort implements SortingStrategy{

    @Override
    public void sort(Integer[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    void displaySorted(SortingStrategy strategy, Integer[] array) {
        strategy.sort(array);
        System.out.println("Sorted array using BubbleSort: ");
        for (Integer i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
