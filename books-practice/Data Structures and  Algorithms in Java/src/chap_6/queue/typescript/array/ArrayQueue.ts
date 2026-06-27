interface Queue<E> {
  size(): number;
  isEmpty(): boolean;
  enqueue(o: E): void;
  first(): E | undefined;
  dequeue(): E | undefined;
}

export class ArrayQueue<E> implements Queue<E> {
  private capacity: number = 100;
  private f: number = 0;
  private data: (E | undefined)[];
  private siz: number = 0;

  constructor() {
    this.data = [];
  }

  size(): number {
    return this.siz;
  }
  isEmpty(): boolean {
    return this.siz === 0;
  }
  enqueue(o: E): void {
    var position = (this.f + this.siz) % this.data.length;
    this.data[position] = o;
    this.siz++;
  }
  first(): E | undefined {
    return this.data[this.f];
  }
  dequeue(): E | undefined {
    var deleted = this.data[this.f];
    this.data[this.f] = undefined;
    this.siz--;
    this.f = (this.f + 1) % this.data.length;
    return deleted;
  }

}