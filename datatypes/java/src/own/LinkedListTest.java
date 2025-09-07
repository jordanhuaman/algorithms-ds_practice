// package datatypes.java.src.own;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Similar to ArrayList
 * both implement List interface
 */
public class LinkedListTest {
  public static void main(String[] args) {
    LinkedList<Integer> cars = new LinkedList<>();
  }
  /*
   * Get item
   * Big O notation O(n)
   */
  public static <T> T getItem(LinkedList<T>data, int index){
    return data.get(index);
  }
  
  /**
   * GetFrist && GetLast && GetSize
   * Big O notation (1)
   */
}