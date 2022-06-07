package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class main {

    public static void main(String[] args) {

        int[] array = new int[10];
                for (int i = 0; i < array.length; i++){
                    array[i] = ((int)(Math.random()*(10-1+1)+1));
                } /*Создание массива с случайными числами
        в промежутке от 1 до 10 по формуле (int)((Math.random() * (b-a+1) + a), которая актуальна
        для целых чисел.*/

        Arrays.sort(array);//Обыкновенная сортировка массива с числами по возрастанию;

        int maxNum = array[array.length - 1];//После сорт. записываем макс. число в конце массива;
        int minNum = array[0];//Также после сорт. записываем первое - мин. число в конце массива

        double average = 0;//Эта переменная примет значение средней арифметической для массива
        if (array.length > 0){
          int sum = 0;
          for (int i = 0; i < array.length; i++){
            sum += array[i];//Здесь суммируются все числа в массиве, перебирая каждый индекс.
          }
          average = (double) sum/array.length;/*Здесь вычисляется среднее значение массива.
          Сигнатура (double) нужна для того, чтобы итоговое число не округлялось.*/

        }

        System.out.println("Отсортированный массив: " + Arrays.toString(array));
        System.out.println("Максимальное число в массиве = " + maxNum);
        System.out.println("Минмальное числов в массиве = " + minNum);
        System.out.println("Среднее значение = " + average);

    }
}