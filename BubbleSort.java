package com.company;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        boolean needIteration = true;
        int array[] = {10,4,5,8,7,2,10};

        while(needIteration) {
            needIteration = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    swap(array, i, i - 1);
                    needIteration = true;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    private static void swap(int array[], int ind1, int ind2){
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }
}