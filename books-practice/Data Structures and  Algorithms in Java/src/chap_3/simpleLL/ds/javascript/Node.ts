class CustomNode<T> {
  private element: T
  private next: CustomNode<T> | null;

  constructor(e: T, n: CustomNode<T> | null) {
    this.element = e;
    this.next = n;
  }

  public getElement(): T {
    return this.element;
  }

  public getNext(): CustomNode<T> | null {
    return this.next;
  }

  public setNext(n: CustomNode<T>) {
    this.next = n;
  }
}

class SinglyLinkedList<T> {
  private head: CustomNode<T> | null = null;
  private tail: CustomNode<T> | null = null;
  private size: number = 0;

  public isEmpty(): boolean {
    return this.size == 0;
  }

  public first(): T | null {
    return this.head == null ? null : this.head.getElement();
  }

  public last(): T | null {
    return this.tail == null ? null : this.tail.getElement();
  }

  public addFirst(node: T) {
    this.head = new CustomNode(node, this.head);
    if (this.size == 0) {
      this.tail = this.head;
    }
    this.size++;
  }

  public addLast(node: T) {
    this.tail?.setNext(new CustomNode(node, null));
    this.size++;
  }
  public removeFirst(): T | null {

    if (this.size == 0) {
      return null;
    }

    this.size--;
    var element = this.tail == null ? null : this.tail.getElement();
    var newFirstNode = this.tail == null ? null : this.tail.getNext();
    this.tail = newFirstNode;

    return element;
  }
}