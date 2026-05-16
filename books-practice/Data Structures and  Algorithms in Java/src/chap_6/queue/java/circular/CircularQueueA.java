package chap_6.queue.java.circular;

import chap_3.circular_linked_list.ds.java.CirularLL;

public class CircularQueueA<E> implements CircularQueue<E> {
  private CirularLL<E> list = new CirularLL<>();

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
    return (E) this.list.first();
  }

  @Override
  public E dequeue() {
    return (E) this.list.removeFirst();
  }

  @Override
  public void rotate() {
    this.list.rotate();
  }

}
