package oop;

public class InitializationWay {
  public static void main(String args[]) {
    // Initialization through reference
    Student s1 = new Student();
    s1.id = 1;
    s1.name = "khiem1";
    
    s1.insertRecord(111, "Karan"); // Initialization through method
    
    //Initialization through a constructor
    Student s2 = new Student(2, "khiem2");
    Student s3 = new Student(s2);

    System.out.println(s1);
    System.out.println(Student.count);
  }
}
