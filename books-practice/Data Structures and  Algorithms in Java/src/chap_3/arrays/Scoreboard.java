package chap_3.arrays;

public class Scoreboard {
  private int numEntries = 0;
  private GameEntry[] board;

  public Scoreboard(int capacity) {
    board = new GameEntry[capacity];
  }

  public void printPlayers() {
    for (GameEntry gameEntry : board) {
      System.out.println(gameEntry.getName() + "score: " + gameEntry.getScore());
    }
  }

  public void getLenght() {
    System.out.println(board.length);
  }

  public void addEntry(GameEntry e) {
    int newScore = e.getScore();
    if (numEntries < board.length || newScore > board[numEntries - 1].getScore()) {
      if (numEntries < board.length) {
        numEntries++;
      }
      int j = numEntries - 1;
      while (j > 0 && board[j - 1].getScore() < newScore) {
        System.out.println("Aqui");
        board[j] = board[j - 1];
        j--;
      }
      board[j] = e;
    }
  }

  public GameEntry remove(int i) throws IndexOutOfBoundsException {
    if (i < 0 || i > numEntries) {
      throw new IndexOutOfBoundsException("Index invalid: " + i);
    }
    GameEntry temp = board[i];
    for (int j = i; j < numEntries - 1; j++) {
      // TODO Reasignando todo a partir del incide ingresado
      board[j] = board[j + 1];
    }
    // TODO por consecuencia, si eliminamos uno el final sera nullo
    board[numEntries - 1] = null;
    numEntries--;
    return temp;
  }
}
