package chap_6.deck.java;

public class CircularArrayDeque<E> implements Deque<E> {

  private static final int CAPACITY = 1000;
  private int f = 0;
  private E[] data;
  private int size = 0;
  private int N = 0;

  public CircularArrayDeque() {
    this(CAPACITY);
  }

  public CircularArrayDeque(int capacity) {
    data = (E[]) new Object[capacity];
    this.N = capacity;
  }

  @Override
  public int size() {
    return size;
  }

  @Override
  public boolean isEmpty() {
    return size == 0;
  }

  @Override
  public E first() {
    if (isEmpty()) {
      throw new IllegalStateException("Queue is empty");
    }
    return data[f];
  }

  @Override
  public E last() {
    if (isEmpty()) {
      throw new IllegalStateException("Queue is empty");
    }
    return data[(f + size - 1) % N];
  }

  @Override
  public void addFirst(E e) {
    if (size == N) {
      throw new IllegalStateException("Queue if full");
    }
    f = (f - 1 + N) % N;
    data[f] = e;
    size++;
  }

  @Override
  public void addLast(E e) {
    if (size == N)
      throw new IllegalStateException("Queue is full");

    data[(f + size) % N] = e; // ✓ índice correcto, sin caso especial

    size++;
  }

  @Override
  public E removeFirst() {
    if (size == 0) {
      throw new IllegalAccessError("The array is empty");
    }

    E reference = data[f - 1];

    data[f] = null;

    f = (f + 1) % N;

    size--;

    return reference;
  }

  @Override
  public E removeLast() {
    if (isEmpty())
      throw new IllegalStateException("Queue is empty");
    int last = (f + size - 1) % N; // ✓ índice real del último

    E reference = data[last];

    data[last] = null;

    size--;
    return reference;
  }
}
