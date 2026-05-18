package chap_6.deck.java;

public class CircularArrayDequeV2<E>  implements Deque<E>  {
  private static final int CAPACITY = 1000;
  private int f = 0;
  private E[] data;
  private int size = 0;
  private int N = 0;

  public CircularArrayDequeV2() {
    this(CAPACITY);
  }

  public CircularArrayDequeV2(int capacity) {
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
    if (isEmpty())
      throw new IllegalStateException("Queue is empty");
    return data[f];
  }

  @Override
  public E last() {
    if (isEmpty())
      throw new IllegalStateException("Queue is empty");
    return data[(f + size - 1) % N]; // ✓ considera la posición de f

  }

  @Override
  public void addFirst(E e) {
    if (size == N)
      throw new IllegalStateException("Queue is full");
    f = (f - 1 + N) % N; // ✓ mover f primero, luego insertar

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
    if (isEmpty())
      throw new IllegalStateException("Queue is empty");
    E reference = data[f]; // ✓ f apunta al primer elemento

    data[f] = null;

    f = (f + 1) % N; // ✓ avanzar f

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
