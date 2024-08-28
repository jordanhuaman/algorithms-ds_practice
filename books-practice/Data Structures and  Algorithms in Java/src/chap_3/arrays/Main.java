package chap_3.arrays;

public class Main {
  public static void main(String[] args) {
    Scoreboard board = new Scoreboard(3);
    GameEntry gamer3 = new GameEntry("jordan2", 1);
    GameEntry gamer1 = new GameEntry("jordan", 2);
    GameEntry gamer2 = new GameEntry("jordan2", 4);


    board.addEntry(gamer3);
    // board.addEntry(gamer1);
    // board.addEntry(gamer2);
    board.printPlayers();
  }
}
