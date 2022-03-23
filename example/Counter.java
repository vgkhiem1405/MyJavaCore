package example;

class Odd implements Runnable {
  private int max;
  private Runnable even;

  public Odd(int max) {
    this.max = max;
  }

  public Runnable getEven() {
    return even;
  }

  public void setEven(Runnable even) {
    this.even = even;
  }

  public void count() throws InterruptedException {
    for (Integer i = 1; i <= max; i += 2) {
      System.out.println("Odd: " + i.toString());
      // wait();

    }
  }

  public void reCount() {
    even.notify();
  }

  @Override
  public void run() {
    try {
      count();

    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}

class Even implements Runnable {
  private int max;
  private Runnable odd;

  public Even(int max) {
    this.max = max;
  }

  public Runnable getOdd() {
    return odd;
  }

  public void setOdd(Runnable odd) {
    this.odd = odd;
  }

  public void count() throws InterruptedException {
    for (Integer i = 2; i <= max; i += 2) {
      System.out.println("Even: " + i.toString());
      // reCount();
      // odd.notify();
      wait();
    }
  }

  public void reCount() {
    odd.notify();
  }

  @Override
  public void run() {
    for (Integer i = 2; i <= max; i += 2) {
      System.out.println("Even: " + i.toString());
      // reCount();
      // odd.notify();
      try {
        wait();
      } catch (InterruptedException e) {
      }
    }
  }
}

class CounterSys {
  private int max;

  public CounterSys(int max) {
    this.max = max;
  }

  public synchronized void odd() throws InterruptedException {
    for (Integer i = 1; i <= max; i += 2) {
      System.out.println("Odd: " + i.toString());
      notify();
      wait();
    }
    notify();
  }

  public synchronized void even() throws InterruptedException {
    for (Integer i = 2; i <= max; i += 2) {
      System.out.println("Even: " + i.toString());
      notify();
      wait();
    }
    notify();
  }
}

public class Counter {
  synchronized static void counting(Thread odd, Thread even) {
    odd.start();
    even.start();
  }

  public static void main(String[] args) {
    Odd countOdd = new Odd(10);
    Even countEven = new Even(10);

    countOdd.setEven(countEven);
    countEven.setOdd(countOdd);

    Thread countOddThread = new Thread(countOdd);
    Thread countEvenhread = new Thread(countEven);

    // counting(countOddThread, countEvenhread);

    CounterSys counter2 = new CounterSys(10);

    Thread oddThread = new Thread(new Runnable() {
      public void run() {
        try {
          counter2.odd();
        } catch (InterruptedException e) {
        }
      }
    });

    // Thread t2 will call part2()
    Thread evenThread = new Thread(new Runnable() {
      public void run() {
        try {
          counter2.even();
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    });

    oddThread.start();
    evenThread.start();
  }
}
