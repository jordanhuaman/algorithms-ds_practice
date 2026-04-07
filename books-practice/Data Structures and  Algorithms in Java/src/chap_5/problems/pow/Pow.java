package chap_5.problems.pow;

public class Pow {
  public static void main(String[] args) {
    int result = pow(5, 3);
    System.out.println(result);
  }

  public static int pow(int n, int p) {

    if (p == 1) {
      return n;
    }

    return n * pow(n, p - 1);
  }
}
