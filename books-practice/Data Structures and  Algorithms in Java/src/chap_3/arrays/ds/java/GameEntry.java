package chap_3.arrays.ds.java;

/**
 * {@link GameEntry} a representation of a  player who play the game
 * <p></p>
 */
public class GameEntry {
  private String name;
  private Integer score;

  public GameEntry(String name, Integer score) {
    this.name = name;
    this.score = score;
  }

  public int getScore() {
    return this.score;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return getName() + " :: " +  getScore();
  }
}