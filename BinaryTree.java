package com.company;

public class BinaryTree {

  //Создаем начальный узел с помощью метода Node, который описан в классе Node;
  Node root;

  private Node addNode (Node current, int value){

    //Если текущее значение равно 0-ю, то создаем новый объект(узел) и присваиваем ему значение
    //аргумента value;
    if (current == null){
      return new Node(value);
    }
    if (value < current.value){
      current.left = addNode(current.left,value);
    }else if (value > current.value) {
      current.right = addNode(current.right, value);
    }
    return current;
  }

  public void add(int value){
    root = addNode(root, value);
  }

  //Метод для создания дерева;
  private BinaryTree createBinaryTree(){
    BinaryTree bt = new BinaryTree();

    bt.add(6);
    bt.add(4);
    bt.add(8);
    bt.add(3);
    bt.add(5);
    bt.add(7);
    bt.add(9);

    return bt;
  }

  //Метод для обхода дерева;
  private boolean roundNote(Node current, int value){
    if (current == null){
      return false;
    }
    if (value == current.value){
      return true;
    }
    return value < current.value
        ? roundNote(current.left, value)
        : roundNote(current.right, value);
    //Здесь мы ищем значение, сравнивая его со значением в текущем узле
    //и затем переходим на левый или правый элемент исходя из значения;
  }

  //Вспомогательный класс, кототорый хранит значения и позволяет ссылаться на каждого потомка;
  class Node{
    int value;//Значение узла;
    Node left;//Левый и правый узел соответственно;
    Node right;

    //Метод для создания начального узла;
    Node(int value){
      this.value = value;
      right = null;
      left = null;
    }
  }

  public static void main(String[] args) {


   }
}




