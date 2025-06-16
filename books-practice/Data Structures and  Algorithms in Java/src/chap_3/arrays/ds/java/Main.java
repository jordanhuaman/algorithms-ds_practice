package chap_3.arrays.ds.java;

public class Main {
  public static void main(String[] args) {
    ScoreBoard scoreBoard = new ScoreBoard(4);
    GameEntry ga1 = new GameEntry( "jordan", 12);
    GameEntry ga2 = new GameEntry( "jordan2", 1);
    GameEntry ga3 = new GameEntry( "jordan2", 30);
    GameEntry ga4 = new GameEntry( "jordan2", 20);

    scoreBoard.add2(ga1);
    scoreBoard.add2(ga2);
    scoreBoard.add2(ga3);
    scoreBoard.add2(ga4);

    System.out.println(scoreBoard.getByIndex(0).getScore());
    // System.out.println(scoreBoard.getByIndex(1).getScore());
    // System.out.println(scoreBoard.getByIndex(2).getScore());
    // System.out.println(scoreBoard.getByIndex(3).getScore());
  }
}
