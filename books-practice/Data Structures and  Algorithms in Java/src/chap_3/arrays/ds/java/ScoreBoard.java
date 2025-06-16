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

  public GameEntry getByIndex(int index) {
    return board[index];
  }

  public void add(GameEntry e) {
    int newScore = e.getScore();

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

  public void add2(GameEntry e) {
    if (numEntries < board.length || e.getScore() > board[numEntries - 1].getScore()) {

      int i = numEntries - 1;

      while (i >= 0 && board[i].getScore() < e.getScore()) {
        if (i + 1 < board.length) {
          board[i + 1] = board[i];
        }
        i--;
      }

      board[i + 1] = e;

      if (numEntries < board.length) {
        numEntries++;
      }
    }
  }

  public GameEntry deleteByIndex(int index) {
    GameEntry solve = board[index];

    if (index < numEntries - 1) {
      int j = index;

      while (j < numEntries-1) {
        board[j] = board[j + 1];
        j++;
      }

      board[numEntries-1] = null;
    }

    return solve;
  }
}
