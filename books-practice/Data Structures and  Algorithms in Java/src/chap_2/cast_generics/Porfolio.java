package src.chap_2.cast_generics;

public class Porfolio<T> {
  T[] data;

  public Porfolio(int capacity) {
    // data = new T[capacity]; -> error compiler
    data = (T[]) new Object[capacity];
  }

  public T get(int index) {
    return data[index];
  }

  public void set(int index, T element) {
    data[index] = element;
  }
}
