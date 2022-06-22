package com.company;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class ArraylistAddGet {

  static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    //Создание массива с случайными числами;
    System.out.println("Введите длину списка: ");
    int num = scanner.nextInt();
    ArrayList<Integer> list = new LinkedList<Integer>(num);

    for (int i = 0; i < num; i++) {
      list.add((int) (Math.random() * num - 1 + 1) + 1);
    }

    Collections.sort(list); //Обыкновенная сортировка;
    System.out.println(list);
    //

    //Вставка элемента в список по индексу;
    System.out.println("Введите число, которое нужно добавить в список: ");
    int element = scanner.nextInt();
    System.out.println("Введите индекс, по которому нужно вставить число в список: ");
    int ind = scanner.nextInt();

    list.add(ind, element);
    System.out.println(list);
    //

    //Получение элемента из списка по индексу;
    System.out.println("По какому индексу нужно получить значение в нем: ");
    int ind1 = scanner.nextInt();

    System.out.print("Значение: ");
    System.out.println(list.get(ind1));
    //
  }
}



