package chap_3.doubleLL.ds.java;
public class Node<E> {
  private E element;
  private Node<E> prev;
  private Node<E> next;

  public Node(E e, Node<E> p, Node<E> n) {
    element = e;
    prev = p;
    next = n;
  }

  public E getElement() {
    return this.element;
  }

  public Node<E> getPrev() {
    return this.prev;
  }

  public Node<E> getNext() {
    return this.next;
  }

  public void setPrev(Node<E> p) {
    this.prev = p;
  }

  public void setNext(Node<E> n) {
    this.next = n;
  }
}
