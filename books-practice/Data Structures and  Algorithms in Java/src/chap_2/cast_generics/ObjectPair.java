package src.chap_2.cast_generics;

// TODO if we want to create a class can accept any object without specificing
public class ObjectPair {
  Object first;
  Object second;

  public ObjectPair(Object a, Object b) {
    first = a;
    second = b;
  }

  public Object getAnyValue() {
    return first;
  }

  public static void main(String[] args) {
    Object obj1 = new ObjectPair("qwe", 2);
  }
}
