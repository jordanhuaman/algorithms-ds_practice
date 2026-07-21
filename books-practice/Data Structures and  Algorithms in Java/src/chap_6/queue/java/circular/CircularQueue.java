package chap_6.queue.java.circular;

import chap_6.queue.java.array.Queue;

public interface CircularQueue<E> extends Queue<E> {
  /**
   * Rotates the front element of the queue to the back of the queue.
   *  This does nothing if the queue is empty
   */
  void rotate();
}
