package oop;

class Shape {
  void draw() {
    System.out.println("drawing...");
  }
}

class Rectangle extends Shape {
  void draw() {
    System.out.println("drawing rectangle...");
  }
}

class MyCircle extends Shape {
  void draw() {
    System.out.println("drawing circle...");
  }
}

class Triangle extends Shape {
  void draw() {
    System.out.println("drawing triangle...");
  }
}

public class Polymor {
  public static void main(String[] args) {
    Shape s;
    s = new Rectangle();
    s.draw();
    s = new MyCircle();
    s.draw();
    s = new Triangle();
    s.draw();
  }
}
