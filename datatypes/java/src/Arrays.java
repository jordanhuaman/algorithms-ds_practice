package datatypes.java.src;

import java.util.ArrayList;
import java.util.Random;
import java.util.function.Supplier;

public class Arrays {
  private static final Random random = new Random();

  public static void main(String[] args) {
    ArrayList<Integer> sample = addArrayList(2, () -> random.nextInt(4));
    loopArrayList(sample);

    // ? add to final
    System.out.println(addToFinal(sample, 2000));
    // ? add to first
    System.out.println(addToFirst(sample, 1000));
  }

  public static <T> ArrayList<T> addArrayList(int quantity, Supplier<T> supplier) {
    ArrayList<T> sample = new ArrayList<>();
    for (int i = 0; i < quantity; i++) {
      sample.add(supplier.get());
    }
    return sample;
  }

  public static <T> void loopArrayList(ArrayList<T> data) {
    for (T item : data) {
      System.out.println(item);
    }

    data.forEach((T e) -> {
      System.out.println(e);
    });

  }

  /*
   * Get item
   * Big O notation O(1)
   */
  public static <T> T getItem(ArrayList<T> data, int index) {
    return data.get(index);
  }

  /*
   * Add to final
   * Big O notation O(1)
   */
  public static <T> ArrayList<T> addToFinal(ArrayList<T> data, T item) {
    data.add(item);
    return data;
  }

  /*
   * Add to first
   * Big O notation O(1)
   */
  public static <T> ArrayList<T> addToFirst(ArrayList<T> data, T item) {
    data.add(0, item);
    return data;
  }

}
