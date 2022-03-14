package oop;

interface Printable {
  void print(String s);
  default void msg(){System.out.println("default method");}  
}

interface Showable {
  void print(String s);
}

class TestInterface3 implements Printable, Showable {
  public void print(String s) {
    System.out.println(s);
  }

}

public class InterfaceClass {
  public static void main(String args[]) {
    TestInterface3 obj = new TestInterface3();
    obj.print("hello");
    obj.msg();
  }
}
