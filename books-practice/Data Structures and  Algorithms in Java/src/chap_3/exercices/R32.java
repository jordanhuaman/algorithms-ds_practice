package chap_3.exercices;

import java.util.Objects;

/**
 * @apiNote Write a Java method that repeatedly selects and removes a random
 *          entry from an array until the array holds no more entries
 * @tag random selection, array manipulation
 */
public class R32<T> {
  private final T[] array;
  private int size;

  public R32(T[] array) {
    this.array = Objects.requireNonNull(array, "array must not be null");
    this.size = array.length;
  }

  public void startRemoving() {
    while (size > 0) {
      int randomPosition = (int) (Math.random() * size);

      T removedElement = array[randomPosition];
      System.out.println("Removing: " + removedElement);

      // Move last element to the removed position
      size--;
      array[randomPosition] = array[size];
      array[size] = null; // avoid loitering
    }
  }

  public boolean test(T[] array) {
    startRemoving();
    if (this.array.length == 0) {
      return true;
    } else {
      return false;
    }
  }

  public static void main(String[] args) {
    Integer[] array = { 1, 2, 3, 4, 5 };
    R32<Integer> remover = new R32<>(array);

    boolean validation = remover.test(array);
    System.out.println("Array empty: " + validation);
  }

}
