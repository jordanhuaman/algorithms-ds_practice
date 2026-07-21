//  Dual-Pivot Quicksort by Vladimir Yaroslavskiy, 

import java.util.Arrays;

public class ValidAnagram02 {
  public static void main(String[] args) {

    boolean test1 = isAnagram("sas", "ass");
    System.out.println(test1);
  }

  public static boolean isAnagram(String s, String t) {

    char[] sCharacter = s.toCharArray();
    char[] toCharacter = t.toCharArray();

    Arrays.sort(sCharacter);
    Arrays.sort(toCharacter);
    return Arrays.equals(sCharacter, toCharacter);
  }
}
