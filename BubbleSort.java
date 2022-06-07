package com.company;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        boolean needIteration = true; //Это будет условием для цикла, чтобы постоянно была проверка нужен ли swap;
        int array[] = {10,4,5,8,7,2,10};

        while(needIteration) {
            needIteration = false;
            for (int i = 1; i < array.length; i++) { // i должен быть равен 1, так как перебор по массиву начнется с -1 если будет 0, что выдаст ошибку;
                if (array[i] < array[i - 1]) { // array[i] и array[i-1] - это ind1 и ind2, которы записаны как условие в методе swap;
                    swap(array, i, i - 1);
                    needIteration = true;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    private static void swap(int array[], int ind1, int ind2){ //Метод для замены местами чисел в массиве в зависмости от их величины;
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }
}
