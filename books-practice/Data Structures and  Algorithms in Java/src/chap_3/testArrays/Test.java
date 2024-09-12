package chap_3.testArrays;

import java.util.Arrays;

public class Test<T> {
  public boolean EqualsMethod(T array1, T array2) {
    return array1.equals(array2);
  }

  public boolean DeepEquslMethod(T array1, T array2, Object o) {
    int[][] test = { { 1, 2 }, { 3, 4 } };
    if (array1.getClass() == test.getClass()) {

      // ? getClass return -> class chap_3.testArrays.Test
      // ? Thus o.getClass() sould return -> class chap_3.testArrays.Test
      // TODO so, o must be a Test object
      System.out.println(getClass());
      System.out.println(o.getClass());
      return Arrays.deepEquals((Object[]) array1, (Object[]) array2);
    }
    return false;
  }

  public static void main(String[] args) {
    Test<int[][]> result = new Test<>();
    int[][] array1 = { { 1, 2 }, { 3, 4 } };
    int[][] array2 = { { 1, 2 }, { 3, 4 } };

    System.out.println(result.EqualsMethod(array1, array2));
    System.out.println(result.DeepEquslMethod(array1, array2, result));
  }
}
