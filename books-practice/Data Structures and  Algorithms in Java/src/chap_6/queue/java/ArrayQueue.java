package chap_6.queue.java;

/**
 * Array-Circularly based implementation of the Queue interface.
 * The queue has a fixed capacity, which is specified at the time of creation.
 */
public class ArrayQueue<E> implements Queue<E> {
  private static final int CAPACITY = 1000;
  private int f = 0;
  private E[] data;
  private int size = 0;

  @Override
  public int size() {
    return size;
  }

  @Override
  public boolean isEmpty() {
    return size == 0;
  }

  /**
   * It acts like a pointer to remenber the index of the first element in the
   * queue. When we enqueue an element, we calculate the index of the next
   * available slot using the formula (f + size) % data.length. This allows us to
   * wrap around to the beginning of the array when we reach the end, effectively
   * creating a circular buffer.
   * [null,null,1,2,3] -> in this case the enqueue save the referent to add the next value in this case it is a [0]
   */
  @Override
  public void enqueue(E o) {
    if (size == data.length) {
      throw new IllegalStateException("Queue is full");
    }
    int avail = (f + size) % data.length;
    data[avail] = o;
    size++;
  }

  @Override
  public E first() {
    if (isEmpty()) {
      throw new IllegalStateException("Queue is empty");
    }
    return data[f];
  }

  /**
   * When we dequeue an element, we retrieve the element at the front of the queue
   * (data[f]), set that position to null to help with garbage collection, and
   * then update the front index (f) to point to the next element in the queue
   * using the formula (f + 1) % data.length. This allows us to maintain the
   * circular nature of the queue and ensures that we can efficiently manage the
   * elements without needing to shift them around in the array.
   * [null,null,1,2,3] -> in this case the dequeue or f saves a reference in the
   * next position to remove, in this case it is a [2]
   */
  @Override
  public E dequeue() {
    if (isEmpty()) {
      throw new IllegalStateException("Queue is empty");
    }
    E answer = data[f];
    data[f] = null;
    f = (f + 1) % data.length;
    size--;
    return answer;
  }

}
