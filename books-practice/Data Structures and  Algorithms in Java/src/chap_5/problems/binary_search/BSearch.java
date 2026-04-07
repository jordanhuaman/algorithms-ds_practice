package chap_5.problems.binary_search;

public class BSearch {
  public static void main(String[] args) {
    int[] array = { 10, 11, 20, 22, 30, 50 };
    int result = run(array, 100, 0, array.length - 1);
    System.out.println(result);
  }

  public static int run(int[] arr, int n, int low, int high) {
    if (low > high) {
      return -1;
    }
    int middle = (low + high) / 2;

    if (arr[middle] == n) {
      return middle;
    }

    if (arr[middle] > n) {
      return run(arr, n, low, middle - 1);
    } else {
      return run(arr, n, middle + 1, high);
    }
  }
}
