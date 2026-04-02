class NodeCLL<T> {
  private element: T;
  private next: NodeCLL<T> | null;

  constructor(e: T, n: NodeCLL<T> | null) {
    this.element = e;
    this.next = n;
  }

  public getElement(): T {
    return this.element;
  }

  public getNext(): NodeCLL<T> | null {
    return this.next;
  }

  public setNext(n: NodeCLL<T>) {
    this.next = n;
  }
}

export default NodeCLL;