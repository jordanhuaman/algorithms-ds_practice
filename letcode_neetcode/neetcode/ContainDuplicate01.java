import java.util.HashSet;

public class ContainDuplicate01 {
  public static void main(String[] args) {

    int[] test = {1,1,3,4,5,6};
    var response = containDuplicatedValue(test, test.length);
  
    System.out.println(response);
  }

  public static boolean containDuplicatedValue(int[] arr, int size){
    HashSet<Integer> set = new HashSet<>();
    var result = true;

    for(int i = 0; i < size; i++){
      var response = set.add(arr[i]);
      if (!response) {
        result = false;
        break;
      }
    }

    return result;
  }
}
