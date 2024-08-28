package chap_3.arrays.algorithms;

// TODO Class for sorting arrays -> 3.1.2
public class Sorting {
  public static void insertionSort(char[] data) {
    int n = data.length;
    for (int k = 1; k < n; k++) {
      char cur = data[k];
      int j = k;
      while (j > 0 && data[j - 1] > cur) {
        data[j] = data[j - 1];
        j--;
      }
      data[j] = cur;
    }
  }

  // ? 5,2,3,1,6
  // ? 1⁰
  // 5>2 -> data[1] -> 5 => j = k(1) -> 5 5 3 1 6 
  // 5>2 -> data[0] -> null => j = 0 -> null 5 3 1 6
  // 5>2 -> data[0] -> 2 => j = k(1) -1 -> 2 5 3 1 6
  public static void main(String[] args) {
    Sorting chartArrays = new Sorting();
    chartArrays.insertionSort(null);
  }
}
