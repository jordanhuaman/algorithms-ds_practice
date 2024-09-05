package chap_3.circular_linked_list;

public class Node<T> {
  private T element;
  private Node<T> next;

  public Node(T e, Node<T> n) {
    this.element = e;
    this.next = n;
  }

  public T getElemt() {
    return this.element;
  }

  public Node<T> getNext() {
    return this.next;
  }

  public void setNext(Node<T> n) {
    this.next = n;
  }
}
