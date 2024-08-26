package src.chap_2.exceptions;

public class GreatNumbers  {
  // TODO Passing positive numbers
  public void ensurePositive(int n) throws IllegalArgumentException {
    if (n < 0) {
      throw new IllegalArgumentException("Thats's not positive");
    }
  }
  public static void main(String[] args) {
    GreatNumbers obj1 = new GreatNumbers();
    obj1.ensurePositive(2);
  }
}