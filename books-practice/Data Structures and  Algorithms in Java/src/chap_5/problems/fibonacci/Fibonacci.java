package chap_5.problems.fibonacci;

public class Fibonacci {
  public static void main(String[] args) {
    System.out.println(run(8));
  }

  public static int run(int n) {

    if (n <= 0) {
      return 0;
    }
    if (n == 1) {
      return 1;
    }

    return run(n - 1) + run(n - 2);
  }
}
