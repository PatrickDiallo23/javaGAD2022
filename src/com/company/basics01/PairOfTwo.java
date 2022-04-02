package com.company.basics01;

public class PairOfTwo {
    static int chkPair(int A[], int size, int x) {
        int counter = 0;
        for (int i = 0; i < (size - 1); i++) {
            for (int j = (i + 1); j < size; j++) {
                if (A[i] + A[j] == x) {
                    System.out.println("Pair with a given sum " + x +
                            " is (" + A[i] + ", " + A[j] + ")");
                    counter++;
                    break;


                }
            }
        }

        return counter;
    }

    public static void main(String [] args) {

        int A[] = {5, 9, -5, 7, -5};
        int x = 0;
        int size = A.length;

        System.out.println("Total pairs with a given sum " + x + " are " + chkPair(A, size, x));
    }

}
