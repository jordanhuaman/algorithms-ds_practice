/**
 * {@link GameEntry} class to store high score entry
 * @param score high score of a user
 * @param name name of the user
 */
export class GameEntry {
  private score: number;
  private name: string;

  constructor(score: number, name: string) {
    this.score = score;
    this.name = name;
  }

  public getScore() {
    return this.score;
  }

  public getName() {
    return this.name;
  }

  public setScore(newScore: number) {
    this.score = newScore;
  }
}

export class ScoreBoard {
  private numEntries: number;
  private arr: Array<GameEntry>;

  constructor(capatity: number) {
    this.arr = new Array(capatity);
    this.numEntries = 0;
  }

  public getTotal(): number {
    return this.arr.length;
  }


  public getByIndex(index: number): GameEntry {
    return this.arr[index];
  }

  public add(entry: GameEntry): void {
    let newEntry = entry.getScore();

    if(this.numEntries < this.arr.length || newEntry > this.arr[this.numEntries-1].getScore()){
      
    }

  }

  public add2(entry: GameEntry): void {

    if (this.numEntries === this.arr.length && entry.getScore() <= this.arr[this.numEntries - 1].getScore()) {
      return;
    }

    let j = 0;
    let pointer = entry;

    while (j < this.arr.length) {
      if (this.arr[j].getScore() < pointer.getScore()) {
        this.arr[j] = pointer;
        pointer = this.arr[j + 1];
      }
      j++;
    }
    this.numEntries++;
  }

  public deletedByIndex(index: number) {
    let j = index;


    while (j < this.numEntries) {

      if (this.arr[j + 1] == null) {
        continue;
      }
      this.arr[j] = this.arr[j + 1];
      j++;
    }
  }
}


const test = new ScoreBoard(5);
const gameEntry1 = new GameEntry(12, "jordan");
const gameEntry2 = new GameEntry(40, "jordan2");
const gameEntry3 = new GameEntry(30, "jordan3");
const gameEntry4 = new GameEntry(100, "jordan3www");


test.add(gameEntry1);
test.add(gameEntry2);
test.add(gameEntry3);
test.add(gameEntry4)

console.log(test.getByIndex(0).getName());
console.log(test.getByIndex(0).getName());
console.log(test.getByIndex(0).getName());
console.log(test.getByIndex(0).getName());