package com.company;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class PrimeNumbers {

    public static void main(String[] args) {

        int [] array = new int[99];
        ArrayList<Integer> arrayList = new ArrayList<>();

            for (int i = 0; i < array.length; i++){
                array[i] = i + 2;
            }

            for(int i = 2; i<=100; i++){
                boolean isPrime = true;

                for(int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if(isPrime){
                    arrayList.add(i);
                }
            }
            System.out.println("Массив из чисел в промежутке от 2 до 100: " + Arrays.toString(array));
            System.out.println("Отдельный массив,состоящий только из простых чисел: " + arrayList);
    }
}