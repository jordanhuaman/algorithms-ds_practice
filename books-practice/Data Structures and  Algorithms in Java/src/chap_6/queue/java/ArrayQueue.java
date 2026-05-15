package chap_6.queue.java;

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
