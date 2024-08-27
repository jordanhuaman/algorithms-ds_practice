// package src;

public class Counter {
  private int count;

  public Counter() {
  }

  public Counter(int initial) {
    count = initial;
  }

  public int getCount() {
    return count;
  }

  public void increment() {
    count++;
  }

  public void increment(int delta) {
    count += delta;
  }

  public void reset() {
    count = 0;
  }

  public static void SeeInfo() {
    System.out.println("sin instancias");
  }
};
