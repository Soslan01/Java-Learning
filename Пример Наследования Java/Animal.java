package com.company;

import javax.print.DocFlavor.READER;

public class Animal {

  private boolean vegetarian;

  private String eats;

  private int numOfLegs;

  public Animal() {
  }//Метод просто для создания объекта;

  public Animal(boolean veg, String food, int legs) {
    this.vegetarian = veg;
    this.eats = food;
    this.numOfLegs = legs;
  }

  public boolean isVegetarian() {
    return vegetarian;
  }

  public void setVegetarian(boolean vegetarian) {
    this.vegetarian = vegetarian;
  }

  public String getEats() {
    return eats;
  }

  public void setEats(String eats) {
    this.eats = eats;
  }

  public int getNumOfLegs() {
    return numOfLegs;
  }

  public void setNumOfLegs(int numOfLegs) {

  }

  //Ключевое словов extends используется для реализации наследования.
  static class Cat extends Animal {

    private String color;

    public Cat(boolean veg, String food, int legs) {
      super(veg, food, legs);
      this.color = "White";
    }

    public Cat(boolean veg, String food, int legs, String color) {
      super(veg, food, legs);
      this.color = color;
    }

    public String getColor() {
      return color;
    }


    public void setColor(String color) {
      this.color = color;
    }


  }

}





