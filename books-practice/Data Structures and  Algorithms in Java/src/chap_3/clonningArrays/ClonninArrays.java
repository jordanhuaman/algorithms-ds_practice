package chap_3.clonningArrays;

import java.util.Arrays;

public class ClonninArrays<T> {

  public void simplyCopy() {
    int[] data = { 1, 2, 3, 4, 4 };
    @SuppressWarnings("unused")
    int[] backup = data; // ! not a copy -> any change in data also change in backup
  }

  public void betterWay() {
    int[] data = { 1, 2, 3, 4, 4 };
    int[] backup = data.clone();
    int[] irData = data;
    data[1] = 1000;

    System.out.println(Arrays.equals(data, backup));
    System.out.println(Arrays.equals(data, irData));
  }

  public static int[][] deepClone(int[][] original) {
    int[][] backup = new int[original.length][];
    for (int k = 0; k < original.length; k++) {
      backup[k] = original[k].clone();
    }
    return backup;
  }

  public static void main(String[] args) {
    ClonninArrays<String> ca = new ClonninArrays<>();

    ca.betterWay();
  }
}
