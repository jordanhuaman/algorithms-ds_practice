class NodeDLL<T> {
  private element?: T;
  private next?: NodeDLL<T>;
  private prev?: NodeDLL<T>;

  constructor(element: T | null, next: NodeDLL<T> | null, prev: NodeDLL<T> | null) {
    this.element = element === null ? undefined : element;
    this.next = next === null ? undefined : next;
    this.prev = prev === null ? undefined : prev;
  }
  public getElement(): T | null {
    return this.element && this.element !== undefined ? this.element : null;
  }
  public getNext(): NodeDLL<T> | null {
    return this.next && this.next !== undefined ? this.next : null;
  }
  public getPrev(): NodeDLL<T> | null {
    return this.prev && this.prev !== undefined ? this.prev : null;
  }
  public setPrev(prev: NodeDLL<T>): void {
    this.prev = prev;
  }
  public setNext(next: NodeDLL<T>): void {
    this.next = next;
  }
}