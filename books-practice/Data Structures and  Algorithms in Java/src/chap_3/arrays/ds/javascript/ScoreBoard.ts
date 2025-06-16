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

    // 0 < 1
    if (this.numEntries == 0) {
      console.log("passign here first")
      this.arr[0] = entry;
      this.numEntries++;
      return;
    }

    // -> [10,4,2,1]
    // -> 5

    let j = 0;
    // 1. 5
    let next = entry;

    // 0 > 5
    while (j < this.numEntries) {
      console.log(j)
      console.log("passign here first2")
      // j=0 -> pass
      // j=1 -> do
      // j=2 -> do 


      //1. 10 < 5 -> pass
      //2. 4 < 5 -> do 
      //3. 2 < 4 -> do
      if (this.arr[j].getScore() < next.getScore()) {

        //2. 4
        //3. 2
        next = this.arr[j];

        // 2. 5
        // 3. 4
        this.arr[j] = entry;
        j = j + 1;
      }
    }

  }
}


const test = new ScoreBoard(5);
const gameEntry1 = new GameEntry(12, "jordan");
const gameEntry2 = new GameEntry(20, "jordan2");
const gameEntry3 = new GameEntry(30, "jordan3");


test.add(gameEntry1);
test.add(gameEntry2);
test.add(gameEntry3);

console.log(test.getByIndex(0).getName());
console.log(test.getByIndex(0).getName());
console.log(test.getByIndex(0).getName());
console.log(test.getByIndex(0).getName());