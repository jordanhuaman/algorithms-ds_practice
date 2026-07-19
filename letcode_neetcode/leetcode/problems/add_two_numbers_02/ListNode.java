package letcode.problems.add_two_numbers_02;

public class ListNode {
  public int value;
  public ListNode next;

  public ListNode(int value) {
    this.value = value;
    this.next = null;
  }

  public Integer getValue(){
    return value;
  }
  public static void main(String[] args) {
    ListNode l1 = new ListNode(4);
    ListNode l2 = new ListNode(8);
    ListNode l3 = new ListNode(15);
    l1.next = l2;
    l2.next = l3;

    ListNode ptr = l1;
    while (ptr!=null) {
      System.out.println(ptr.value);
      ptr=ptr.next;
    }
    System.out.println(32/10 + " /"); //? return -> 3
    System.out.println(25%10 + " /"); //? return -> 5
  }
}
