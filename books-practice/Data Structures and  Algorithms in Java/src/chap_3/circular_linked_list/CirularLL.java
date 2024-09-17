package chap_3.circular_linked_list;

public class CirularLL<T> {
  private Node<T> tail = null;
  private int size = 0;

  public int size() {
    return this.size;
  }

  public boolean isEmpty() {
    return this.size == 0;
  }

  public T first() {
    if (isEmpty()) {
      return null;
    }
    return tail.getNext().getElemt();
  }

  public T last() {
    if (isEmpty())
      return null;
    return tail.getElemt();
  }

  public void rotate() {
    if (tail != null)
      tail = tail.getNext();
  }

  public void addFirst(T e) {
    if (size == 0) {
      tail = new Node<>(e, null);
      tail.setNext(tail);
    } else {
      Node<T> newest = new Node<>(e, tail.getNext());
      tail.setNext(newest);
    }
    size++;
  }

  public void addLast(T e) {
    addFirst(e);
    tail = tail.getNext();
  }

  public T removeFirst() {
    if (isEmpty()) {
      return null;
    }
    Node<T> head = tail.getNext();
    if (head == tail) {
      tail = null;
    } else {
      tail.setNext(head.getNext());
    }
    size--;
    return head.getElemt();
  }

  // TODO bucle infinito porque es una lista circular
  public void printElement() {
    if (isEmpty()) {
      System.out.println("is empthy");
    } else {
      Node<T> current = tail.getNext();
      System.out.println(current.getNext().getElemt());
    }
  }

  public static void main(String[] args) {
    CirularLL<String> cll = new CirularLL<>();
    cll.addFirst("first-element");
    cll.printElement();
  }
}
