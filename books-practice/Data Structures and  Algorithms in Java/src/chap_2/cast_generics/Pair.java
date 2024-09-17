package chap_2.cast_generics;

public class Pair<A, B> {
  A first;
  B second;

  public Pair(A a, B b) {
    first = a;
    second = b;
  }

  // TODO similar to typescript
  @SuppressWarnings({ "unused", "unchecked" })
  public static void main(String[] args) {
    Object obj1 = new Pair<String, Number>("Qweqwe", 1);
    Pair<String, Double>[] holdings;
    holdings = new Pair[25];
    holdings[0] = new Pair<>("ORCL", 231.2);
    System.out.println(holdings[0].second);
  }
}
