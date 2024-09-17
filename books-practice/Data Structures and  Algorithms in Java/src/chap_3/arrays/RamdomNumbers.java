package chap_3.arrays;

import java.util.Arrays;
import java.util.Random;

public class RamdomNumbers {
  public static void main(String[] args) {
    int data[] = new int[10];
    Random rand = new Random();
    rand.setSeed(System.currentTimeMillis());

    for (int i = 0; i < data.length; i++) {
      data[i] = rand.nextInt(100);
    }
    int[] origin = Arrays.copyOf(data, data.length);
    System.out.println("arrays equals before sort: " + Arrays.equals(data, origin));
    Arrays.sort(data);
    System.out.println("arrays equals after sort: " + Arrays.equals(data, origin));
    System.out.println("orig: " + Arrays.toString(origin));
    System.out.println("data: " + Arrays.toString(data));
  }
}
