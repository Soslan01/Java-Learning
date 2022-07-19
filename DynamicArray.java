package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class DynamicArray {

  Scanner scanner = new Scanner(System.in);
  int size = scanner.nextInt();

  //Создаем массив и сразу вводим его размер;
  ArrayList<Integer> list = new ArrayList<>(size);

  //
  public DynamicArray() {
  }

  //Заполнение массива случайными числами;
  public void createArray(ArrayList list) {

    for (int i = 0; i < size; i++) {
      list.add((int) (Math.random() * size - 1 + 1) + 1);
    }
    System.out.println("Первоначальный вид массива: " + list);

  }

  //Получение размера массива в новую переменную;
  public int getSize(int a) {
    a = size;
    return a;
  }

  //Обыкновенная сортировка массива;
  public void sort(ArrayList list) { //Сортировка массива;
    Collections.sort(list);
    System.out.println("Отсортированный массив: " + list);
  }

  //Удаление дубликатов посредством конвертирования в Set-коллекцию;
  public void deleteDublicates(ArrayList list1, ArrayList list2) {
    Set<Integer> newList = new LinkedHashSet<Integer>(list1);

    list2.clear();//удаляем элементы из массива, который ввели первым в аргументы (list1);
    list2.addAll(newList);//чтобы сохранить в него новую коллекцию Set без дубликатов;
    System.out.println("Массив после удаления дубликатов: " + list2);
    return;
  }

  //Добавление данных в определенную позицию;
  public void add(ArrayList list, int ind, int elem){
    list.add(ind, elem);
    System.out.println("Массив после добавления элемента: " + list);
  }

  //Удаление элемента по индексу;
  public void remove(ArrayList list, int ind){
    list.remove(ind);
    System.out.println("Массив после удаления элемента: " + list);
  }

  //Добавление элемента в конец массива;
  public void addToEnd(ArrayList list, int value){
    list.add(value);
    System.out.println("Массив после добавления элемента в конец: " + list);
  }

  //Удаление числа из конца массива;
  public void removeFromEnd(ArrayList list){
    list.remove(list.get(list.size()-1));
    System.out.println("Массив после удаления последнего элемента: " + list);
  }

  //Получение элемента по индексу;
  public void get(ArrayList list, int ind){
    System.out.println("Элемент по индексу: " + list.get(ind));
  }


  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Введите длину массива: ");
    DynamicArray Array = new DynamicArray(); //сначала создается сам объект класса;
    ArrayList<Integer> list = new ArrayList<>();

    int sizeOfArray = 0;
    sizeOfArray = Array.getSize(sizeOfArray);

    Array.createArray(list);
    Array.sort(list);
    Array.deleteDublicates(list, list);

    System.out.println("По какому индексу необходимо добавить элемент: ");
    int ind = scanner.nextInt();
    System.out.println("Какой элемент необходимо добавить: ");
    int elem = scanner.nextInt();
    Array.add(list, ind, elem);

    System.out.println("По какому индексу необходимо удалить элемент: ");
    int ind1 = scanner.nextInt();
    Array.remove(list, ind1);

    System.out.println("Какой элемент необходимо добавить в конец массива: ");
    int value = scanner.nextInt();
    Array.addToEnd(list, value);

    Array.removeFromEnd(list);

    System.out.println("По какому индексу нужно получить элемент: ");
    int ind2 = scanner.nextInt();
    Array.get(list, ind2);




  }
}




