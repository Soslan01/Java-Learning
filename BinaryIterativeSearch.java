package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class BinaryIterativeSearch {

  static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {

    System.out.println("Введите длину массива: ");
    int num = scanner.nextInt();
    int[] array = new int[num];

    for (int i = 0; i < num; i++) {
      array[i] = ((int) (Math.random() * (num - 1 + 1) + 1));
    }
    Arrays.sort(array);
    System.out.println("Первоначальный вид массива: " + Arrays.toString(array));

    int length = array.length;
    length = removeDublication(array, length); //Удаляем дубликаты с помощью метода, который
    //написан ниже;
    int[] newArray = new int[length]; //Создаем новый массив, чтобы записать в него числа после
    //удаления дубликатов;
    int j = 0; //Временный индекс для нового массива, в который будут записываться числа;
    for (int i = 0; i<length; i++) { //Перенос чисел;
      newArray[j++] = array[i];
    }
    System.out.println("Массив после сортировки и удаления дубликатов: "
        + Arrays.toString(newArray));

    System.out.println("Введите число, чью позицию нужно найти: ");
    int element = scanner.nextInt();

    int pos = iterativeSearch(newArray, element);
    System.out.println("Позиция данного числа: " + pos);
  }

  //Метод для удаления дубликатов в массиве;
  public static int removeDublication(int[] array, int n) {

    if (n == 0 || n == 1) { //Чтобы не было ошибки, если длина массива или 1;
      return n;
    }

    int[] temp = new int[n]; //Создаем временный массив, в который будем записывать числа без
    //дубликатов;
    int tempI = 0; //Временный индекс для нового массива;

    for (int i = 0; i < n - 1; i++) { //Нужно записать именно n-1, так на последнем элементе массива
      //он добавит 1 и будет искать индекс, которого не сущетсвует;
      if (array[i] != array[i + 1]) {
        temp[tempI++] = array[i];
      }
    }
    temp[tempI++] = array[n - 1];
    for (int i = 0; i < tempI; i++) {
      array[i] = temp[i];
    }
    return tempI;
  }

  //Метод для двоичного поиска;
  public static int iterativeSearch(int[] array, int element) {
    int minIndex = 0; //Минимальный индекс для поиска;
    int maxIndex = array.length - 1; //Максимальный индекс для поиска;

    int elementPos = -1; //По умолчанию -1 означает, что элемент не был найден;

    while (minIndex <= maxIndex) { //Цикл в котором вводятся индексы - диапазон в котором нужно
      //искать число;

      int midIndex = (minIndex + maxIndex) / 2; //Вычисление среднего арифметического;

      if (element == array[midIndex]) { //Если число равно среднему арифметическому, значит мы нашли
        //его позицию;
        elementPos = midIndex;
        break;//Метод после этого сразу останавливается;
        //В этих двух условиях отсекается сразу левая или правая половина массива для поиска;
      } else if (element < array[midIndex]) {
        maxIndex = midIndex - 1;
      } else if (element > array[midIndex]) {
        minIndex = midIndex + 1;
      }
    }
    return elementPos; //Возвращается позиция числа;
  }
}



