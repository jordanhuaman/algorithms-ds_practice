package src.chap_1;

import java.util.ArrayList;

public class GameEntry {
  int[] scoreFiel = new int[3];
  ArrayList<Integer> infoTypes = new ArrayList<Integer>();

  public void addScoreField(int a, int b, int c, int d) {
    infoTypes.add(a);
    infoTypes.add(b);
    infoTypes.add(c);
    infoTypes.add(d);
    for (int i = 0; i <= scoreFiel.length -1; i++) {
      scoreFiel[i] = infoTypes.get(i);
    }
  }

  public void getTheLast() {
    System.out.println(scoreFiel[2]);
  }

  public static void main(String[] args) {
    GameEntry obje1 = new GameEntry();
    GameEntry obje2 = obje1;
    obje1.addScoreField(1, 2, 3, 4);
    obje1.getTheLast();
    obje2.getTheLast();
  }
}
