package chap_3.simpleLL;
public class SinglyLinkedList<E> {

  private Node<E> head = null;
  private Node<E> tail = null;
  private int size = 0;

  public SinglyLinkedList() {
  }

  public int size() {
    return size;
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public E first() {
    if (isEmpty())
      return null;
    return head.getElement();
  }

  public E last() {
    if (isEmpty())
      return null;
    return tail.getElement();
  }

  public void addFirst(E e) {
    head = new Node<>(e, head);
    if (size == 0)
      tail = head;
    size++;
  }

  public void addLast(E e) {
    Node<E> newest = new Node<>(e, null);
    if (isEmpty()) {
      head = newest;
    } else {
      tail.setNext(newest);
    }
    tail = newest;
    size++;
  }

  public E removeFirst() {
    if (isEmpty())
      return null;
    E answer = head.getElement();
    head = head.getNext();
    size--;
    if (size == 0) {
      tail = null;
    }
    return answer;
  }

  public void removeLast() {
    if (isEmpty())
      return;
    Node<E> current = head;

    for (int i = 0; i < size()-2; i++) {
      current = current.getNext();
      System.out.println(current.getElement());
    }
    current.setNext(null);
    this.size--;

  }

  public void printList() {
    Node<E> current = head;
    while (current != null) {
      System.out.print(current.getElement() + " -> ");
      current = current.getNext();
    }
    System.out.println("null");
  }

  public static void main(String[] args) {
    SinglyLinkedList<String> data = new SinglyLinkedList<>();
    data.addFirst("firsst Time");
    data.addFirst("Second time");
    data.addFirst("Thirt time");
    data.addFirst("Forthy time");
    data.removeLast();
    data.printList();
  }
}