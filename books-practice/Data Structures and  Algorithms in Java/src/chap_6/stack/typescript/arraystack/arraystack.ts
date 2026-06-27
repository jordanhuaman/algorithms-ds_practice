export interface Stack<E> {
  size(): number;
  isEmpty(): boolean;
  push(e: E): void;
  top(): E | undefined;
  pop(): E | undefined;
}

export class ArrayStack<E> implements Stack<E> {
  private CAPARITY: number = 10;
  private S: (E | undefined)[];
  private toppest: number = -1;

  constructor() {
    this.S = new Array(this.CAPARITY);
  }

  size(): number {
    return this.toppest + 1;
  }
  isEmpty(): boolean {
    return this.toppest === -1;
  }
  push(e: E): void {
    if (this.size() == this.S.length) {
      throw Error('Stack if full');
    }
    this.toppest++;
    this.S[this.toppest] = e;
  }

  top(): E | undefined {
    if (this.isEmpty()) undefined;
    return this.S[this.toppest];
  }
  pop(): E | undefined {
    if (this.isEmpty()) undefined;
    let r = this.S[this.toppest];
    this.S[this.toppest] = undefined;
    this.toppest--;
    return r;
  }
  loop(): void {
    for (let i = 0; i < this.S.length; i++) {
      console.log(this.S[i]);
    }
  }
}

const testcase = new ArrayStack<Number>();
testcase.push(1);
testcase.push(10);
testcase.push(10);
testcase.push(10);
testcase.pop();

console.log(testcase.loop())