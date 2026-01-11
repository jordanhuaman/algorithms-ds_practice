import { NodeDLL } from "./NodeDLL";
class DoubleLinkedList<T> {
  private header: NodeDLL<T>;
  private trailer: NodeDLL<T>;
  private size: number = 0;

  constructor() {
    this.header = new NodeDLL<T>(null, null, null);
    this.trailer = new NodeDLL<T>(null, null, this.header);
    this.header.setNext(this.trailer);
  }

  public lenght(): number {
    return this.size;
  }
  public isEmpty(): boolean {
    return this.size === 0;
  }

  public getFirst(): T | null {
    if (this.isEmpty()) return null;
    return this.header.getNext()!.getElement();
  }
  public getLast(): T | null {
    if (this.isEmpty()) return null;
    return this.trailer.getPrev()!.getElement();
  }

  public addFirst(e: T): void {
    this.addbetween(e, this.header, this.header.getNext()!)
  };

  public addLast(e: T): void {
    this.addbetween(e, this.trailer.getPrev()!, this.trailer)
  }

  //? never fails because we already have a predecssor and sucessedor initialized inside the constructor like a header and trailer
  public addbetween(e: T, predecessor: NodeDLL<T>, successor: NodeDLL<T>): void {
    var newest = new NodeDLL<T>(e, successor, predecessor);
    predecessor.setNext(newest);
    successor.setPrev(newest);
    this.size++;
  }
}