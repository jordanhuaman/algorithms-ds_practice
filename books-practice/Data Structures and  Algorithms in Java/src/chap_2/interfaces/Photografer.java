package src.chap_2.interfaces;

public class Photografer implements Selleble, Transportable {
  public String description() {
    return "weqwe";
  };

  public int listPRice() {
    return 1;
  };

  public int lowstPrice() {
    return 1;
  };

  @Overrride()
  public int weight() {
    return 12;
  };

  @Overrride()
  public boolean isHazardous() {
    return false;
  };

}
