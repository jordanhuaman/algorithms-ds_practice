package src;

public class Test {

  // ? Enums
  public enum Day {
    MON, TUE, WED, THU, FRI, SAT, SUN
  }

  String[] dates = new String[2];
  Day today = Day.MON;

  public Test(){
    
  }

  private final Counter defectValue = new Counter();

  public Counter multipleReturnValues() {
    return this.defectValue;
  }

  public int acceptingReferences(Counter data) {
    return data.getCount();
  }

  public boolean showInfo() {
    System.err.println(today); // ? MON
    return false;
  }

  public static void main(String[] args) {
    Test a = new Test();
    System.out.println(a.showInfo());
  }
}
