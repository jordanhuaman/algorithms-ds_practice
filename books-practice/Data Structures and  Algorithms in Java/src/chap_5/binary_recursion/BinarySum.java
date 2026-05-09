package chap_5.binary_recursion;

public class BinarySum {

  public static void main(String[] args) {
    int[] arr = { 12 };
    System.out.println(binarySum(arr, 0, arr.length - 1));
  }

  public static int binarySum(int arr[], int low, int high) {
    if (arr == null || arr.length == 0) {
      return 0;
    } else if (low == high) {
      return arr[low];
    } else {
      int middle = (low + high) / 2;
      return binarySum(arr, low, middle) + binarySum(arr, middle + 1, high);
    }
  }
}
