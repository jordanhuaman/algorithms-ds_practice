package chap_2.cast_generics;

public class Porfolio<T> {
  T[] data;

  @SuppressWarnings("unchecked")
  public Porfolio(int capacity) {
    // data = new T[capacity]; -> error compiler
    data = (T[]) new Object[capacity];
  }

  // TODO El T nos sirve para saber que tipo de dato es data.value
  public static <T> void asigmentValues(T[] data) {
    int initial = 0, lastest = data.length - 1;
    while (initial <= lastest) {
      T temp = data[initial];
      System.out.println(temp);
      initial++;
    }
  }

  public T get(int index) {
    return data[index];
  }

  public void set(int index, T element) {
    data[index] = element;
  }

  public void printElements() {
    for (T t : data) {
      System.out.println(t);
    }
  }

  public static void main(String[] args) {
    Porfolio<String> obj1 = new Porfolio<>(11);

    obj1.set(0, "1");
    obj1.set(1, "2");
    // obj1.set(10, "2");
    obj1.printElements();

    // //
    String[] strings = { "Hola", "Mundo" };
    Integer[] integers = {1, 2, 3};
    asigmentValues(strings);
    asigmentValues(integers);
  }
}
