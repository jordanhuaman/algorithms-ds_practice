package chap_3.arrays;

public class GameEntry {
  private String name;
  private int score;

  public GameEntry(String n, int s) {
    name = n;
    score = s;
  }

  public String getName() {
    return this.name;
  }

  public int getScore() {
    return this.score;
  }


}