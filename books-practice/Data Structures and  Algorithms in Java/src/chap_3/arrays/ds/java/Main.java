package chap_3.arrays.ds.java;

public class Main {
  public static void main(String[] args) {

    int capacity = 4;

    ScoreBoard scoreBoard = new ScoreBoard(capacity);
    GameEntry ga1 = new GameEntry("jordan", 12);
    GameEntry ga2 = new GameEntry("jordan2", 1);
    GameEntry ga3 = new GameEntry("jordan2", 30);
    GameEntry ga4 = new GameEntry("jordan2", 20);

    GameEntry test = new GameEntry("jordan211", 21);


    scoreBoard.add(ga1);
    scoreBoard.add(ga2);
    scoreBoard.add(ga3);
    scoreBoard.add(ga4);
    scoreBoard.add(test);

    for (var i = 0; i < capacity; i++) {
      System.out.println(scoreBoard.getByIndex(i).getScore());
    }

    // System.out.println(" ----------- ");
    // scoreBoard.deleteByIndex(10);

    // for (var i = 0; i < capacity; i++) {
    //   System.out.println(scoreBoard.getByIndex(i).getScore());
    // }

  }
}
