package com.company;

import com.company.Animal.Cat;

//Тестовый класс для проверки методов Cat;
public class AnimalTest {

  public static void main(String[] args) {

    Cat cat = new Cat(false, "milk", 4 , "black");

    System.out.println("Cat is vegetaring? " + cat.isVegetarian());
    System.out.println("Cat eats " + cat.getEats());
    System.out.println("Cat has " + cat.getNumOfLegs() + " legs");
    System.out.println("Cat color is " + cat.getColor());
  }
}
