package chap_6.deck.java;

public interface Deque<E> {
  int size();
  boolean isEmpty();
  E first();
  E last();
  /* Inserts an element at the front of the deque. */
  void addFirst(E e);
  /* Inserts an element at the back of the deque. */
  void addLast(E e);
  /* Removes and returns the first element of the deque. */
  E removeFirst();
  /* Removes and returns the last element of the deque. */
  E removeLast();
}
