package src.chap_2.cast_generics;

public class Pair<A, B> {
  A first;
  B second;

  public Pair(A a, B b) {
    first = a;
    second = b;
  }

  // TODO similar to typescript
  public static void main(String[] args) {
    Object obj1 = new Pair<String, Number>("Qweqwe", 1);
  }
}
