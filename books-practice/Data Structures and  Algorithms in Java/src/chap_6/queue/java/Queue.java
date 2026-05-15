package chap_6.queue.java;

public interface Queue<E> {
  int size();
  boolean isEmpty();
  void enqueue(E o);
  E first();
  E dequeue();
}
