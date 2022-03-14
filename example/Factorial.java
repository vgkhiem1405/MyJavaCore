package example;

public class Factorial {
  static long factory(long n) {
    if (n == 1)
      return n;
    return n * factory(n - 1);
  }

  public static void main(String[] args) {
    long number = 5;
    System.out.println("Factorial of " + number + " is: " + factory(number));
  }
}
