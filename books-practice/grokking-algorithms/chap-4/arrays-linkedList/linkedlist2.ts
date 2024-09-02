class Node3<T> {
  private element: T;
  private next: Node3<T> | null;

  constructor(e: T, n: Node3<T> | null) {
    this.element = e;
    this.next = n;
  }

  public getElement(): T {
    return this.element;
  }
  public getNext(): Node3<T> | null {
    return this.next;
  }
  public setNext(n: Node3<T>): void {
    this.next = n;
  }
}

class SinglyLinkedList<T> {
  private head: Node3<T> | null | undefined = null;
  private tail: Node3<T> | null = null;
  private size = 0;

  public isEmpty(): boolean {
    return this.size === 0;
  }

  public first(): T | null {
    if (this.isEmpty()) return null
    return this.tail?.getElement() as T;
  }
  public last(): T | null {
    if (this.isEmpty()) return null;
    return this.tail?.getElement() as T;
  }

  public addFirst(e: T) {
    this.head = new Node3(e, this.head);
    if (this.size === 0)
      this.tail = this.head;
    this.size++;
  }

  public addLast(e: T) {
    let newest: Node3<T> = new Node3(e, null);
    if (this.isEmpty()) {
      this.head = newest;
    } else {
      this.tail?.setNext(newest)
    }
    this.tail = newest;
    this.size++;
  }
  public removeFirst(): T | null {
    if (this.isEmpty())
      return null;
    let answer: T | undefined = this.head?.getElement();
    this.head = this.head?.getNext()
    this.size--;
    if (this.size == 0) {
      this.tail = null;
    }
    return answer as T | null;
  }
}