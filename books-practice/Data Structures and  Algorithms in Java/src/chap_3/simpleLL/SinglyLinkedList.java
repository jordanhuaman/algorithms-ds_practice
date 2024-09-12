package chap_3.simpleLL;

public class SinglyLinkedList<E> implements Cloneable {

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

    for (int i = 0; i < size() - 2; i++) {
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

  // TODO 3.5.2 Equivalence Testing with Linked Lists
  public boolean equals(Object o) {
    if (o == null)
      return false;
    if (getClass() != o.getClass())
      return false;

    SinglyLinkedList other = (SinglyLinkedList) o;

    if (size != other.size)
      return false;

    Node walkA = head;
    Node walkB = other.head;

    while (walkA != null) {
      if (!walkA.getElement().equals(walkB.getElement()))
        return false;
      walkA = walkA.getNext();
      walkB = walkB.getNext();
    }
    return true;
  }

  public SinglyLinkedList<E> clone() throws CloneNotSupportedException {
    @SuppressWarnings("unchecked")
    SinglyLinkedList<E> other = (SinglyLinkedList<E>) super.clone();

    if (size > 0) {
      other.head = new Node<>(head.getElement(), null);
      Node<E> walk = head.getNext();
      Node<E> otherTail = other.head;

      while (walk != null) {
        Node<E> newest = new Node<>(walk.getElement(), null);
        otherTail.setNext(newest);
        otherTail = newest;
        walk = walk.getNext();
      }
    }
    return other;
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