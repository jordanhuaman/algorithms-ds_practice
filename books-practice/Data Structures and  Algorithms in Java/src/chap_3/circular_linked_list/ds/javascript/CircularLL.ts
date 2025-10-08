import NodeCLL from "./node";

class CircularLL<T> {
  private tail: NodeCLL<T> | null = null;
  private size: number = 0;

  public getLastElement(): T | null {
    if (this.tail === null) {
      return null;
    }
    return this.tail.getElement();
  }

  public getFirst(): NodeCLL<T> | null {
    if (this.size === 0) {
      return null;
    }
    return this.tail ? this.tail.getNext() : null;
  }

  public addFirst(item: T): void {
    if (this.size === 0) {
      this.tail = new NodeCLL(item, null);
      this.tail.setNext(this.tail);
      this.size++;
      return;
    }
    let newest: NodeCLL<T> = new NodeCLL(item, this.tail ? this.tail.getNext() : null);
    this.tail?.setNext(newest);
    this.size++;
    return;
  }
  public rotate(): void {
    if (this.tail != null) {
      this.tail = this.tail.getNext();
    }
  }

  public addLast(item: T): void {
    this.addFirst(item);
    this.tail = this.tail?.getNext() as NodeCLL<T>;
  }

  public removeFirst(): T | null {
    if (this.size === 0) {
      return null;
    }
    let head = this.tail?.getNext();
    if (head === this.tail) {
      this.tail = null;
      return null;
    }
    this.tail?.setNext(head?.getNext() as NodeCLL<T>);
    this.size--;
    return head?.getElement() as T;
  }
}