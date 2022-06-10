package com.company;


import java.util.ArrayList;
import java.util.Arrays;

public class PrimeNumbers {

  public static void main(String[] args) {

    int[] array = new int[99]; //создаем выделенный массив с 99 элементами для диапазона от 2 до 100. (100-2+1 = 99).
    ArrayList<Integer> arrayList = new ArrayList<>(); //Создаем пустой список, в который потом отдельно запишем списо всех простых чисел.

    for (int i = 0; i < array.length; i++) {
      array[i] = i + 2; //массив заполняется числа от 2 до 100.
    }

    for (int i = 2; i <= 100; i++) {
      boolean isPrime = true; //перебор по массиву и изначальное условие "Простое число = верно".

      for (int j = 2; j < i; j++) {
        if (i % j == 0) { //Если при делении остаток равен 0, то это число натуральное.
          isPrime = false; 
          break; 
        }
      }

      if (isPrime) {
        arrayList.add(i); // Если число является простым то оно записывает сразу в конец списка arrayList.
      }
    }
    System.out.println("Массив из чисел в промежутке от 2 до 100: " + Arrays.toString(array));
    System.out.println("Отдельный массив,состоящий только из простых чисел: " + arrayList);
  }
}
