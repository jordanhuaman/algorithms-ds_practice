package chap_5.invertstring;

public class StringInvest {
  public static void main(String[] args) {
    System.out.println(run("null1"));
  }

   public static String run(String s) {

    int length = s.length();

    if (length == 1) {
      return s;
    }

    return s.charAt(length - 1) + run(s.substring(0, length - 1));
  }
}
