package another;

public class StringClass {
  public static void main(String[] args) {
    String s=new String("Welcome");//creates two objects and one reference variable  
    String s1 = "Welcome";
    String s2 = "Welcome";// It doesn't create a new instance

    String s3="java";//creating string by Java string literal    
    char ch[]={'s','t','r','i','n','g','s'};    
    String s4=new String(ch);//converting char array to string   
    
  }
}
