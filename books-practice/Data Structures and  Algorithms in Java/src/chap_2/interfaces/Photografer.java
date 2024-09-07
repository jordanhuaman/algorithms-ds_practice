package chap_2.interfaces;

// ? Insurable inhering method of Sellele, Transportable
public class Photografer  implements Insurable {
  public String description() {
    return "weqwe";
  };

  public int listPRice() {
    return 1;
  };

  public int lowstPrice() {
    return 1;
  };

  public int weight() {
    return 12;
  };


  public boolean isHazardous() {
    return false;
  };


  public int insuredValue() {
    // TODO Auto-generated method stub
    return 0;
  }
}
