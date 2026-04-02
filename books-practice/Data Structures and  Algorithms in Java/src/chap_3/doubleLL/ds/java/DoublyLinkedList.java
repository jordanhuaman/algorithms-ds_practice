package chap_3.doubleLL.ds.java;

public class DoublyLinkedList<E> {
  private Node<E> header;
  private Node<E> trailer;
  private int size = 0;

  public DoublyLinkedList() {
    this.header = new Node<>(null, null, null);
    this.trailer = new Node<>(null, header, null);
    header.setNext(trailer);
  }

  public int size() {
    return this.size;
  }

  public boolean isEmpty() {
    return this.size == 0;
  }

  public E first() {
    if (isEmpty()) {
      return null;
    }
    return this.header.getNext().getElement();
  }

  public E last() {
    if (isEmpty()) {
      return null;
    }
    return this.trailer.getPrev().getElement();
  }

  public void addFirst(E e) {
    addBetween(e, header, header.getNext());
  }

  public void addLast(E e) {
    addBetween(e, trailer.getPrev(), trailer);
  }

  public E removeFirst() {
    if (isEmpty()) {
      return null;
    }
    return remove(this.header.getNext());
  }

  public E removeLast(){
    if (isEmpty()) {
      return null;
    }
    return remove(this.trailer.getPrev());
  }

  private void addBetween(E e, Node<E> predecessor, Node<E> succesor) {
    Node<E> newest = new Node<>(e, predecessor, succesor);
    predecessor.setNext(newest);
    succesor.setPrev(newest);
    size++;
  }

  private E remove(Node<E> node) {
    Node<E> predecessor = node.getPrev();
    Node<E> succesor = node.getNext();

    predecessor.setNext(succesor);
    succesor.setPrev(predecessor);
    size--;
    return node.getElement();
  }
}
