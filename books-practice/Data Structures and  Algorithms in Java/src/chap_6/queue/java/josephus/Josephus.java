package chap_6.queue.java.josephus;

import chap_6.queue.java.circular.CircularQueue;
import chap_6.queue.java.circular.CircularQueueA;

/**
 * The Josephus problem is a theoretical problem related to a certain counting-out game.
 * People are standing in a circle waiting to be executed. After a fixed number of passes,
 * a person is removed from the circle, and the counting continues until only one person remains.
 */
public class Josephus {
  public static <E> E Josephus(CircularQueue<E> queue, int k) {
    if (queue.isEmpty())
      return null;
    while (queue.size() > 1) {
      for (int i = 0; i < k - 1; i++) {
        queue.rotate();
      }
      E e = queue.dequeue();
      System.out.println("Removed: " + e);
    }
    return queue.dequeue();
  }

  public static <E> CircularQueue<E> createCircularQueue(E[] elements) {
    CircularQueue<E> queue = new CircularQueueA<>();
    for (E element : elements) {
      queue.enqueue(element);
    }
    return queue;
  }
}
