package chap_3.arrays.ds.java;

/**
 * {@link ScoreBoard} store new entries
 */
public class ScoreBoard {
  // 0
  private int numEntries;
  private GameEntry[] board;

  public ScoreBoard(int capacity) {
    this.board = new GameEntry[capacity];
  }

  public void add(GameEntry e) {
    // new entry score
    int newScore = e.getScore();

    // validate if the board is full AND check if the latest added is lowest o not to add a new entry
    if (numEntries < board.length || newScore > board[numEntries - 1].getScore()) {
      if (numEntries < board.length) {
        numEntries++;
        int j = numEntries - 1;

        while (j > 0 && board[j - 1].getScore() < newScore) {
          board[j] = board[j - 1];
          j--;
        }
        board[j] = e;
      }
    }
  }
}
