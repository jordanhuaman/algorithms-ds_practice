package src.chap_2.cast_generics;

public class ChildClass extends SuperClass {
  public static void main(String[] args) {
    // TODO Widening Conversions
    SuperClass obj1 = new ChildClass();

    // TODO Narrowing Conversion
    ChildClass obj2 = (ChildClass) obj1;
  }
}
