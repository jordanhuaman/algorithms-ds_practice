package singlyllstack;

import arraystack.Stack;
import chap_3.simpleLL.ds.java.SinglyLinkedList;

/**
 * Adapter pattern implementation of a stack using a singly linked list.
 * Time complexity for push, pop, and top operations is O(1).
 * Space complexity is O(n) where n is the number of elements in the stack.
 */
public class LinkedStack<E> implements Stack<E>{

  private SinglyLinkedList<E> list = new SinglyLinkedList<>();

  @Override
  public int size() {
    return this.list.size();
  }

  @Override
  public boolean isEmpty() {
    return this.list.isEmpty();
  }

  @Override
  public void push(E e) {
    this.list.addFirst(e);
  }

  @Override
  public E top() {
    return this.list.first();
  }

  @Override
  public E pop() {
    return this.list.removeFirst();
  }
  
}
