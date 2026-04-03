package chap_5.factorial;

public class Factorial {
  public static void main(String[] args) {
    var result = factorial(4);
    System.out.println(result);
  }


  public static int factorial(int n){
    if (n<2) {
      return 1;
    }

    return n*factorial(n-1);
  }
}
