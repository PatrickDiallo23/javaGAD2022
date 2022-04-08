package com.company.designpatterns03;

import java.util.Arrays;

public class ArraySorting {

    public static void main(String[] args) {

        Integer[] array = new Integer[]{3,8,4,-1,4,9,1,10,7};
        Integer[] copyArray1 = Arrays.copyOf(array, array.length);
        Integer[] copyArray2 = Arrays.copyOf(array, array.length);

        SortingStrategy bubbleSort = new BubbleSort();
        ((BubbleSort) bubbleSort).displaySorted(bubbleSort, copyArray1);

        SortingStrategy mergeSort = new MergeSort();
        ((MergeSort) mergeSort).displaySort(mergeSort, copyArray2);

    }



}
