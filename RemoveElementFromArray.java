package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveElementFromArray {


  public static void main(String[] args) {

    Scanner scanner = new Scanner(
        System.in); //добавялем Scanner, чтобы взаимодействовать с программой
    //из консоли;

    int[] array = new int[10]; //задаем изначальную длину массива;

    for (int i = 0; i < 10; i++) {//перебор
      array[i] = ((int) (Math.random() * (10 - 1 + 1) + 1));//генерация массива с случайными
      //числами;
    }
    Arrays.sort(array); //обыкновенная сортировка;

    System.out.println("Первоначальный вид массива: " + Arrays.toString(array));
    System.out.print("Введите число, которое необходимо удалить: ");

    int element1 = scanner.nextInt(); //вызов ввода числа, которое нужно удалить;

    System.out.println(
        "Массив после удаления числа" + Arrays.toString(removeElement(array, element1)));
    //переход на новую строку просто для того, чтобы не превышало допустимое колиство символов в
    //строке;
  }

  public static int[] removeElement(int[] array, int element) { //массив и число, которое нужно
    //удалить;

    int offset = 0; //переменная в которую будет записано количество позиций, которые нужно
    //компенсировать, чтобы после удаления не остались 0-и;

    for (int i = 0; i < array.length; i++) {
      if (array[i] == element) { //проверка на равенство с element;
        offset++;
      } else {
        array[i - offset] = array[i]; //перезапись элементов, если числа не равны element, который
        //нужно удалить;
      }
    }
    return Arrays.copyOf(array, array.length - offset); //Перезапись в новый массив с
    //новой длиной;
  }
}


