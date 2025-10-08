class CustomNode<T> {
  private element: T
  private next: CustomNode<T>;

  constructor(e: T, n: CustomNode<T> ) {
    this.element = e;
    this.next = n;
  }

  public getElement(): T {
    return this.element;
  }

  public getNext(): CustomNode<T> {
    return this.next;
  }

  public setNext(n: CustomNode<T>) {
    this.next = n;
  }
}

class SinglyLinkedList<T> {
  private head: CustomNode<T>;
  private tail: CustomNode<T>;
  private size: number;

  public isEmpty(): boolean {
    return this.size == 0;
  }

  public first(): T {
    return this.head.getElement();
  }

  public last(): T {
    return this.tail.getElement();
  }

  public addFirst(node: T) {
    this.head = new CustomNode(node, this.head);
    if(this.size==0){
      this.tail = this.head;
    }
    this.size++;
  }
}