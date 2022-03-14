package oop;

class Vehicle {
  void run() {
    System.out.println("Vehicle is running");
  }
}

// Creating a child class
class Bike extends Vehicle {
  void run() {
    System.out.println("Bike is running safely");
  }
}

public class Overriding {
  public static void main(String args[]) {
    // creating an instance of child class
    Bike obj = new Bike();
    // calling the method with child class instance
    obj.run();
  }
}
