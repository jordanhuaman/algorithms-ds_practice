package chap_5.problems.digitssum;

public class SumDig {
  public static void main(String[] args) {
    System.out.println(2%10);
    System.out.println(run(22));
  }

public static int run(int digit) {

    int rest = digit % 10;
    int forwardiv = digit / 10;

    if (forwardiv == 0) {
      return rest;
    }

    return rest + run(forwardiv);
  }
}
