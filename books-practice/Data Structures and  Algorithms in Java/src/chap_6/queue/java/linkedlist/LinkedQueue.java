package chap_6.queue.java.linkedlist;

import chap_3.simpleLL.ds.java.SinglyLinkedList;
import chap_6.queue.java.array.Queue;

/**
 * Array Circularly
 */
public class LinkedQueue<E> implements Queue<E> {
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
  public void enqueue(E o) {
    this.list.addLast(o);
  }

  @Override
  public E first() {
    return this.list.first();
  }

  @Override
  public E dequeue() {
    return this.list.removeFirst();
  }
  
}
