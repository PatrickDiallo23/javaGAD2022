package com.company.designpatterns03;

public class MergeSort implements SortingStrategy{
    @Override
    public void sort(Integer[] array) {
        mergeSort(array, 0, array.length - 1);
    }

    private void mergeSort(Integer[] array, int low, int high) {
        if (low < high) {
            int middle = (low + high) / 2;
            mergeSort(array, low, middle);
            mergeSort(array, middle + 1, high);
            merge(array, low, middle, high);
        }
    }

    private void merge(Integer[] array, int low, int middle, int high) {
        int[] temp = new int[high - low + 1];
        int i = low;
        int j = middle + 1;
        int k = 0;
        while (i <= middle && j <= high) {
            if (array[i] < array[j]) {
                temp[k++] = array[i++];
            } else {
                temp[k++] = array[j++];
            }
        }
        while (i <= middle) {
            temp[k++] = array[i++];
        }
        while (j <= high) {
            temp[k++] = array[j++];
        }
        for (int l = 0; l < temp.length; l++) {
            array[low + l] = temp[l];
        }
    }

    void displaySort(SortingStrategy strategy, Integer[] array) {
        strategy.sort(array);
        System.out.println("Sorted array using MergeSort: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }


}

