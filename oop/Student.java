package oop;

public class Student {
  int id;
  String name;
  static int count=0; 

  private String privatee="a";
  protected String protec="a";
  public String publicc="a";
  Student() {
    count++;
  }

  public String getPrivatee() {
    return privatee;
  }

  public void setPrivatee(String privatee) {
    this.privatee = privatee;
  }

  Student(int id, String name) {
    this(); //reuse Student() constructor
    this.id = id;
    this.name = name;
  }

  // constructor to initialize another object
  Student(Student s) {
    this();
    id = s.id;
    name = s.name;
  }

  void insertRecord(int id, String name) {
    this.id = id;
    this.name = name;
  }

  // printing members with a white space
  @Override
  public String toString() {
    return id + " " + name;
  }

}
