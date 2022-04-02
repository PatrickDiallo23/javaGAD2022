package com.company.basics01;

import java.util.ArrayList;
import java.util.Comparator;

public class PairOfThree {
    int find3Numbers(ArrayList<Integer> array, int arr_size, int sum)
    {
        int l, r;
        int count = 0;

        /* Sort the elements */
        array.sort(Comparator.comparingInt(a -> a));

        /* Now fix the first element one by one and find the
           other two elements */
        for (int i = 0; i < arr_size - 2; i++) {

            // To find the other two elements, start two index variables
            // from two corners of the array and move them toward each
            // other
            l = i; // index of the first element in the remaining elements
            r = arr_size - 1; // index of the last element
            while (l < r) {
                if (array.get(i) + array.get(l) + array.get(r) == sum) {
                    System.out.println("Triplet is " + array.get(i) + ", " + array.get(l) + ", " + array.get(r));
                    count++;
                    l++;
                    r--;
                    break;

                }
                else if (array.get(i) + array.get(l) + array.get(r) < sum)
                    l++;

                else // A[i] + A[l] + A[r] > sum
                    r--;
            }
        }

        // If we reach here, then no triplet was found
        return count;
    }






    // Driver program to test above functions
    public static void main(String[] args)
    {
        PairOfThree triplet = new PairOfThree();
        ArrayList<Integer> array = new ArrayList<Integer>();
        array.add(-1);
        array.add(-1);
        array.add(-1);
        array.add(2);
        int sum = 0;
        int arr_size = array.size();

        System.out.println(triplet.find3Numbers(array, arr_size, sum));
    }


}
